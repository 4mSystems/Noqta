package te.app.nottaa.pages.home;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import javax.inject.Inject;

import te.app.nottaa.PassingObject;
import te.app.nottaa.R;
import te.app.nottaa.base.BaseFragment;
import te.app.nottaa.base.IApplicationComponent;
import te.app.nottaa.base.MyApplication;
import te.app.nottaa.databinding.FragmentTasksBinding;
import te.app.nottaa.model.base.Mutable;
import te.app.nottaa.model.base.StatusMessage;
import te.app.nottaa.pages.home.models.HomeResponse;
import te.app.nottaa.pages.home.viewModels.HomeViewModel;
import te.app.nottaa.pages.notifications.NotificationsFragment;
import te.app.nottaa.pages.teacher.AddGroupFragment;
import te.app.nottaa.utils.Constants;
import te.app.nottaa.utils.helper.MovementHelper;

public class TasksFragment extends BaseFragment {
    FragmentTasksBinding tasksBinding;
    @Inject
    HomeViewModel viewModel;

    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        tasksBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_tasks, container, false);
        IApplicationComponent component = ((MyApplication) requireActivity().getApplicationContext()).getApplicationComponent();
        component.inject(this);
        tasksBinding.setViewmodel(viewModel);
        if (viewModel.userData.getType().equals("2"))
            viewModel.home(1, true);
        else
            viewModel.studentTasks(1, true);
        setEvent();
        return tasksBinding.getRoot();
    }

    private void setEvent() {
        viewModel.liveData.observe(requireActivity(), (Observer<Object>) o -> {
            Mutable mutable = (Mutable) o;
            handleActions(mutable);
            switch (((Mutable) o).message) {
                case Constants.HOME:
                    viewModel.setHomeData(((HomeResponse) mutable.object).getData());
                    break;
                case Constants.ADD_GROUP:
                    MovementHelper.startActivityForResultWithBundle(requireActivity(), new PassingObject(), null, AddGroupFragment.class.getName(), Constants.ADD_GROUP_REQUEST);
                    break;
                case Constants.JOIN_REQUEST:
                    toastMessage(((StatusMessage) mutable.object).mMessage);
                    viewModel.getGroupsAdapter().updateItemJoinRequest();
                    break;
                case Constants.NOTIFICATIONS:
                    MovementHelper.startActivity(requireActivity(), NotificationsFragment.class.getName(), null, null);
                    break;

            }
        });
        viewModel.getGroupsAdapter().liveData.observeForever(groupId -> viewModel.studentJoinRequest(groupId));
        tasksBinding.rcGroups.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(@NonNull RecyclerView recyclerView, int newState) {
                super.onScrollStateChanged(recyclerView, newState);
            }

            @Override
            public void onScrolled(@NonNull RecyclerView recyclerView, int dx, int dy) {
                super.onScrolled(recyclerView, dx, dy);
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
                if (!viewModel.searchProgressVisible.get() && !TextUtils.isEmpty(viewModel.getHomeData().getNextPageUrl())) {
                    if (linearLayoutManager != null && linearLayoutManager.findLastCompletelyVisibleItemPosition() == viewModel.getGroupsAdapter().getGroupItemList().size() - 1) {
                        viewModel.searchProgressVisible.set(true);
                        viewModel.home((viewModel.getHomeData().getCurrentPage() + 1), false);
                    }
                }
            }
        });
    }

    @Override
    public void onResume() {
        super.onResume();
        viewModel.getRepository().setLiveData(viewModel.liveData);
    }

    @Override
    public void launchActivityResult(int request, int resultCode, Intent result) {
        if (result != null) {
            viewModel.home(1, false);
        }
        super.launchActivityResult(request, resultCode, result);
    }

}
