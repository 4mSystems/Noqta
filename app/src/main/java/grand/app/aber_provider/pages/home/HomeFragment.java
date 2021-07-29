package grand.app.aber_provider.pages.home;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.gson.Gson;

import org.jetbrains.annotations.NotNull;

import java.util.Objects;

import javax.inject.Inject;

import grand.app.aber_provider.BR;
import grand.app.aber_provider.PassingObject;
import grand.app.aber_provider.R;
import grand.app.aber_provider.base.BaseFragment;
import grand.app.aber_provider.base.IApplicationComponent;
import grand.app.aber_provider.base.MyApplication;
import grand.app.aber_provider.databinding.FragmentHomeBinding;
import grand.app.aber_provider.databinding.OptionDialogBinding;
import grand.app.aber_provider.model.base.Mutable;
import grand.app.aber_provider.pages.home.models.PostData;
import grand.app.aber_provider.pages.home.models.PostsResponse;
import grand.app.aber_provider.pages.home.viewModels.HomeViewModels;
import grand.app.aber_provider.utils.Constants;

public class HomeFragment extends BaseFragment {
    @Inject
    HomeViewModels viewModel;
    FragmentHomeBinding binding;

    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_home, container, false);
        IApplicationComponent component = ((MyApplication) requireContext().getApplicationContext()).getApplicationComponent();
        component.inject(this);
        binding.setViewModel(viewModel);

        viewModel.posts(1, true);
        setEvent();
        return binding.getRoot();
    }

    private void setEvent() {
        viewModel.liveData.observe((LifecycleOwner) requireContext(), (Observer<Object>) o -> {
            Mutable mutable = (Mutable) o;
            handleActions(mutable);
            switch (((Mutable) o).message) {
                case Constants.POSTS:
                    viewModel.setMainData(((PostsResponse) (mutable).object).getMainData());
                    break;

            }
        });
        viewModel.getPostsAdapter().liveData.observe((LifecycleOwner) requireContext(), o -> {
            if (o.equals(Constants.DELETE))
                showDeleteDialog();
            else if (o.equals(Constants.LIKE))
                viewModel.reactPost(viewModel.getPostsAdapter().getPostDataList().get(viewModel.getPostsAdapter().lastPosition).isLiked() ? null : "like");
            else if (o.equals(Constants.DIS_LIKE))
                viewModel.reactPost(viewModel.getPostsAdapter().getPostDataList().get(viewModel.getPostsAdapter().lastPosition).isDisLiked() ? null : "dislike");
            else if (o.equals(Constants.SHARE_POST))
                viewModel.sharePost();
            else if (o.equals(Constants.HIDE_POST))
                viewModel.hidePost();

        });
        binding.rcPosts.addOnScrollListener(new RecyclerView.OnScrollListener() {
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
                        viewModel.posts((viewModel.getMainData().getMeta().getCurrentPage() + 1), false);
                    }
                }
            }
        });
    }

    private void showDeleteDialog() {
        Dialog deleteDialog = new Dialog(requireContext(), R.style.PauseDialog);
        deleteDialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        Objects.requireNonNull(deleteDialog.getWindow()).getAttributes().windowAnimations = R.style.PauseDialogAnimation;
        deleteDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        OptionDialogBinding binding = DataBindingUtil.inflate(LayoutInflater.from(deleteDialog.getContext()), R.layout.option_dialog, null, false);
        deleteDialog.setContentView(binding.getRoot());
        binding.optionCancel.setOnClickListener(v -> deleteDialog.dismiss());
        binding.optionDone.setOnClickListener(v -> {
            deleteDialog.dismiss();
            viewModel.deletePost();
        });
        deleteDialog.show();
    }

    @Override
    public void onResume() {
        super.onResume();
        viewModel.getPostRepository().setLiveData(viewModel.liveData);
        mainActivity().enableRefresh(false);
    }

    @Override
    public void onAttach(@NotNull Context context) {
        super.onAttach(context);
    }

    @Override
    public void launchActivityResult(int request, int resultCode, Intent result) {
        super.launchActivityResult(request, resultCode, result);
        if (request == Constants.NEW_POST_REQUEST || request == Constants.POST_DETAILS_REQUEST) {
            Bundle bundle = result.getBundleExtra(Constants.BUNDLE);
            if (bundle != null && bundle.containsKey(Constants.BUNDLE)) {
                PassingObject passingObject = (PassingObject) bundle.getSerializable(Constants.BUNDLE);
                PostData postData = new Gson().fromJson(String.valueOf(passingObject.getObjectClass()), PostData.class);
                if (postData.isDeleted()) {
                    viewModel.getPostsAdapter().getPostDataList().remove(viewModel.getPostsAdapter().lastPosition);
                    viewModel.getPostsAdapter().notifyDataSetChanged();
                    viewModel.notifyChange(BR.postsAdapter);
                } else {
                    if (viewModel.getPostsAdapter().lastPosition == -1) {
                        viewModel.getPostsAdapter().getPostDataList().add(0, postData);
                        viewModel.getPostsAdapter().notifyDataSetChanged();
                        viewModel.notifyChange(BR.postsAdapter);
                        binding.rcPosts.scrollToPosition(0);
                    } else {
                        viewModel.getPostsAdapter().getPostDataList().set(viewModel.getPostsAdapter().lastPosition, postData);
                        viewModel.getPostsAdapter().notifyItemChanged(viewModel.getPostsAdapter().lastPosition);
                        binding.rcPosts.scrollToPosition(viewModel.getPostsAdapter().lastPosition);
                    }
                }
                viewModel.getPostsAdapter().lastPosition = -1;
            }
        }
    }

}
