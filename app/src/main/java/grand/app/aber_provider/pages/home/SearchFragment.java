package grand.app.aber_provider.pages.home;

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

import org.jetbrains.annotations.NotNull;

import javax.inject.Inject;

import grand.app.aber_provider.R;
import grand.app.aber_provider.base.BaseFragment;
import grand.app.aber_provider.base.IApplicationComponent;
import grand.app.aber_provider.base.MyApplication;
import grand.app.aber_provider.databinding.FragmentSearchBinding;
import grand.app.aber_provider.model.base.Mutable;
import grand.app.aber_provider.pages.home.models.PostsResponse;
import grand.app.aber_provider.pages.home.viewModels.SearchViewModels;
import grand.app.aber_provider.pages.profile.models.FollowersResponse;
import grand.app.aber_provider.utils.Constants;

public class SearchFragment extends BaseFragment {
    private Context context;
    @Inject
    SearchViewModels viewModel;
    FragmentSearchBinding binding;

    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_search, container, false);
        IApplicationComponent component = ((MyApplication) context.getApplicationContext()).getApplicationComponent();
        component.inject(this);
        binding.setViewmodel(viewModel);
        setEvent();
        return binding.getRoot();
    }

    private void setEvent() {
        viewModel.liveData.observe(((LifecycleOwner) context), (Observer<Object>) o -> {
            Mutable mutable = (Mutable) o;
            handleActions(mutable);
            if (mutable.message.equals(Constants.SEARCH)) {
                viewModel.getFollowersAdapter().getUserDataList().clear();
                viewModel.getPostsAdapter().getPostDataList().clear();
                if (viewModel.buttonsVisible.get().equals(Constants.POSTS))
                    viewModel.setMainData(((PostsResponse) (mutable).object).getMainData());
                else
                    viewModel.setMainFollowersData(((FollowersResponse) (mutable).object).getMainFollowersData());
            }
        });
        binding.recPosts.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(@NonNull RecyclerView recyclerView, int newState) {
                super.onScrollStateChanged(recyclerView, newState);
            }

            @Override
            public void onScrolled(@NonNull RecyclerView recyclerView, int dx, int dy) {
                super.onScrolled(recyclerView, dx, dy);
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
                if (!viewModel.searchProgressVisible.get() && !TextUtils.isEmpty(viewModel.getMainData().getLinks().getNext())) {
                    if (linearLayoutManager != null && linearLayoutManager.findLastCompletelyVisibleItemPosition() == viewModel.getPostsAdapter().getPostDataList().size() - 1) {
                        viewModel.searchProgressVisible.set(true);
                        viewModel.search((viewModel.getMainData().getMeta().getCurrentPage() + 1), false);
                    }
                }
            }
        });
    }


    @Override
    public void onResume() {
        super.onResume();
        viewModel.getPostRepository().setLiveData(viewModel.liveData);
    }

    @Override
    public void onAttach(@NotNull Context context) {
        super.onAttach(context);
        this.context = context;
    }

}
