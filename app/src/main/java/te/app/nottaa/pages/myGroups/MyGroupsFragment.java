package te.app.nottaa.pages.myGroups;

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

import com.google.android.material.bottomsheet.BottomSheetDialog;

import javax.inject.Inject;

import te.app.nottaa.PassingObject;
import te.app.nottaa.R;
import te.app.nottaa.base.BaseFragment;
import te.app.nottaa.base.IApplicationComponent;
import te.app.nottaa.base.MyApplication;
import te.app.nottaa.databinding.DeleteSheetBinding;
import te.app.nottaa.databinding.FragmentMyGroupsBinding;
import te.app.nottaa.model.base.Mutable;
import te.app.nottaa.pages.home.models.HomeResponse;
import te.app.nottaa.pages.myGroups.viewModels.MyGroupsViewModel;
import te.app.nottaa.utils.Constants;

public class MyGroupsFragment extends BaseFragment {
    FragmentMyGroupsBinding fragmentSplashBinding;
    @Inject
    MyGroupsViewModel viewModel;

    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        fragmentSplashBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_my_groups, container, false);
        IApplicationComponent component = ((MyApplication) requireActivity().getApplicationContext()).getApplicationComponent();
        component.inject(this);
        fragmentSplashBinding.setViewmodel(viewModel);
        if (viewModel.userData.getType().equals("2"))
            viewModel.home(1, true);
        else
            viewModel.studentTasks(1, true);
        setEvent();
        return fragmentSplashBinding.getRoot();
    }

    private void setEvent() {
        viewModel.liveData.observe(requireActivity(), (Observer<Object>) o -> {
            Mutable mutable = (Mutable) o;
            handleActions(mutable);
            switch (((Mutable) o).message) {
                case Constants.HOME:
                    viewModel.setHomeData(((HomeResponse) mutable.object).getData());
                    break;
                case Constants.DELETE_GROUP:
                case Constants.LEAVE_GROUP:
                    viewModel.getGroupsAdapter().removeItem();
                    break;

            }
        });
        viewModel.getGroupsAdapter().liveData.observeForever(this::showDeleteDialog);
        fragmentSplashBinding.rcGroups.addOnScrollListener(new RecyclerView.OnScrollListener() {
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

    private void showDeleteDialog(PassingObject passingObject) {
        DeleteSheetBinding sortBinding = DataBindingUtil.inflate(LayoutInflater.from(requireActivity()), R.layout.delete_sheet, null, false);
        BottomSheetDialog sheetDialog = new BottomSheetDialog(requireActivity(), R.style.BottomSheetDialogStyle);
        sheetDialog.setContentView(sortBinding.getRoot());
        if (passingObject.getObject().equals(Constants.DIALOG_SHOW_LEAVE)) {
            sortBinding.tvHeader.setText(getString(R.string.leave_group_successfully));
            sortBinding.tvDesc.setText(getString(R.string.leave_group_body_successfully));
        }
        sortBinding.btnClose.setOnClickListener(v -> sheetDialog.dismiss());
        sortBinding.btnYes.setOnClickListener(v -> {
            if (passingObject.getObject().equals(Constants.DELETE_GROUP))
                viewModel.removeGroup(passingObject.getId());
            else
                viewModel.leaveGroup(passingObject.getId());
            sheetDialog.dismiss();
        });
        sheetDialog.show();
    }

    @Override
    public void onResume() {
        super.onResume();
        viewModel.getRepository().setLiveData(viewModel.liveData);
    }
}
