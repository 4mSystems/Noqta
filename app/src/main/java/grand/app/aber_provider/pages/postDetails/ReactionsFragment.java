package grand.app.aber_provider.pages.postDetails;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.gson.Gson;

import org.jetbrains.annotations.NotNull;


import javax.inject.Inject;

import grand.app.aber_provider.PassingObject;
import grand.app.aber_provider.R;
import grand.app.aber_provider.base.BaseFragment;
import grand.app.aber_provider.base.IApplicationComponent;
import grand.app.aber_provider.base.MyApplication;
import grand.app.aber_provider.databinding.FragmentReactionsBinding;
import grand.app.aber_provider.model.base.Mutable;
import grand.app.aber_provider.pages.postDetails.models.postReacts.PostReactsResponse;
import grand.app.aber_provider.pages.postDetails.viewModels.ReactionsViewModel;
import grand.app.aber_provider.utils.Constants;
import grand.app.aber_provider.utils.URLS;

public class ReactionsFragment extends BaseFragment {
    Context context;
    FragmentReactionsBinding binding;
    @Inject
    ReactionsViewModel viewModel;

    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_reactions, container, false);
        IApplicationComponent component = ((MyApplication) context.getApplicationContext()).getApplicationComponent();
        component.inject(this);
        binding.setViewModel(viewModel);
        Bundle bundle = this.getArguments();
        if (bundle != null) {
            String passingObject = bundle.getString(Constants.BUNDLE);
            viewModel.setPassingObject(new Gson().fromJson(passingObject, PassingObject.class));
            viewModel.reactions(1, true);
        }
        setEvent();
        return binding.getRoot();
    }

    private void setEvent() {
        viewModel.liveData.observe((LifecycleOwner) context, (Observer<Object>) o -> {
            Mutable mutable = (Mutable) o;
            handleActions(mutable);
            viewModel.setMessage(mutable.message.equals(Constants.HIDE_PROGRESS) ? mutable.message : "");
            switch (((Mutable) o).message) {
                case Constants.POST_REACTS:
                    viewModel.setFollowersResponse((((PostReactsResponse) (mutable).object)).getReactsData());
                    break;
                case Constants.FOLLOW:
                    if (!TextUtils.isEmpty(viewModel.getActionRequest().getType()))
                        viewModel.getFollowersAdapter().getUserDataList().get(viewModel.getFollowersAdapter().lastPosition).setFollowBtnText(getString(R.string.sort));
                    else
                        viewModel.getFollowersAdapter().getUserDataList().get(viewModel.getFollowersAdapter().lastPosition).setFollowBtnText(getString(R.string.ordinary_wash));
                    viewModel.getFollowersAdapter().notifyDataSetChanged();
                    break;

            }
        });
        viewModel.getFollowersAdapter().liveData.observe((LifecycleOwner) context, o -> {
            if (o.equals(Constants.FOLLOW)) {
                viewModel.changeFollowStatus(null, URLS.STORE_FOLLOW);
            } else
                viewModel.changeFollowStatus(Constants.followings, URLS.CHANGE_FOLLOW_ACTIONS);
        });
        binding.recPeople.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(@NonNull RecyclerView recyclerView, int newState) {
                super.onScrollStateChanged(recyclerView, newState);
            }

            @Override
            public void onScrolled(@NonNull RecyclerView recyclerView, int dx, int dy) {
                super.onScrolled(recyclerView, dx, dy);
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
                if (!viewModel.searchProgressVisible.get() && !TextUtils.isEmpty(viewModel.getFollowersResponse().getMainFollowersData().getLinks().getNext())) {
                    if (linearLayoutManager != null && linearLayoutManager.findLastCompletelyVisibleItemPosition() == viewModel.getFollowersResponse().getMainFollowersData().getUserDataList().size() - 1) {
                        viewModel.searchProgressVisible.set(true);
                        viewModel.reactions((viewModel.getFollowersResponse().getMainFollowersData().getMeta().getCurrentPage() + 1), false);
                    }
                }
            }
        });
    }

    @Override
    public void onResume() {
        viewModel.getPostRepository().setLiveData(viewModel.liveData);
        super.onResume();
        baseActivity().enableRefresh(false);
    }

    @Override
    public void onAttach(@NotNull Context context) {
        super.onAttach(context);
        this.context = context;
    }
}
