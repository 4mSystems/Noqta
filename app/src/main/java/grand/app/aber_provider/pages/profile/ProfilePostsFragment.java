package grand.app.aber_provider.pages.profile;

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
import grand.app.aber_provider.databinding.FragmentProfilePostsBinding;
import grand.app.aber_provider.databinding.OptionDialogBinding;
import grand.app.aber_provider.model.base.Mutable;
import grand.app.aber_provider.model.base.StatusMessage;
import grand.app.aber_provider.pages.favorites.FavoritesFragment;
import grand.app.aber_provider.pages.home.models.MainData;
import grand.app.aber_provider.pages.home.models.PostData;
import grand.app.aber_provider.pages.home.models.PostsResponse;
import grand.app.aber_provider.pages.profile.viewModels.ProfilePostsViewModels;
import grand.app.aber_provider.utils.Constants;
import grand.app.aber_provider.utils.helper.AppHelper;
import grand.app.aber_provider.utils.helper.MovementHelper;

public class ProfilePostsFragment extends BaseFragment {
    Context context;
    FragmentProfilePostsBinding binding;
    @Inject
    ProfilePostsViewModels viewModel;
    Dialog deleteDialog;

    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_profile_posts, container, false);
        IApplicationComponent component = ((MyApplication) context.getApplicationContext()).getApplicationComponent();
        component.inject(this);
        binding.setViewModel(viewModel);
        Bundle bundle = this.getArguments();
        if (bundle != null) {
            String passingObject = bundle.getString(Constants.BUNDLE);
            viewModel.setPassingObject(new Gson().fromJson(passingObject, PassingObject.class));
            if (viewModel.getPassingObject().getObjectClass() == null)
                viewModel.profilePosts(1, true);
            else {
                viewModel.setMainData(new Gson().fromJson(String.valueOf(viewModel.getPassingObject().getObjectClass()), MainData.class));
            }
        }
        setEvent();
        return binding.getRoot();
    }

    private void setEvent() {
        viewModel.liveData.observe((LifecycleOwner) context, (Observer<Object>) o -> {
            Mutable mutable = (Mutable) o;
            handleActions(mutable);
            switch (((Mutable) o).message) {
                case Constants.PROFILE_POSTS:
                    viewModel.setMainData(((PostsResponse) (mutable).object).getMainData());
                    break;
                case Constants.NEW_POST:
                    MovementHelper.startActivityForResultWithBundle(context, new PassingObject(), null, FavoritesFragment.class.getName(), Constants.NEW_POST_REQUEST);
                    break;
                case Constants.SHARE_POST:
                    toastMessage(((StatusMessage) mutable.object).mMessage);
                    AppHelper.makeActionSound(context, Constants.SHARE_POST);
                    break;
                case Constants.DELETE:
                    toastMessage(((StatusMessage) mutable.object).mMessage);
                    if (viewModel.getPostsAdapter().getItemCount() > 0) {
                        viewModel.getPostsAdapter().getPostDataList().remove(viewModel.getPostsAdapter().lastPosition);
                        viewModel.getPostsAdapter().notifyDataSetChanged();
                        if (viewModel.getPostsAdapter().getItemCount() == 0)
                            viewModel.notifyChange(BR.postsAdapter);
                    } else {
                        viewModel.getQuestionedPostsAdapter().getPostDataList().remove(viewModel.getQuestionedPostsAdapter().lastPosition);
                        viewModel.getQuestionedPostsAdapter().notifyDataSetChanged();
                        if (viewModel.getQuestionedPostsAdapter().getItemCount() == 0)
                            viewModel.notifyChange(BR.questionedPostsAdapter);
                    }
                    break;

            }
        });
        viewModel.getPostsAdapter().liveData.observe((LifecycleOwner) context, o -> {
            if (o.equals(Constants.DELETE))
                showDeleteDialog(viewModel.getPostsAdapter().lastSelected);
            else if (o.equals(Constants.LIKE))
                viewModel.reactPost(viewModel.getPostsAdapter().getPostDataList().get(viewModel.getPostsAdapter().lastPosition).isLiked() ? null : "like");
            else if (o.equals(Constants.DIS_LIKE))
                viewModel.reactPost(viewModel.getPostsAdapter().getPostDataList().get(viewModel.getPostsAdapter().lastPosition).isDisLiked() ? null : "dislike");
            else if (o.equals(Constants.SHARE_POST))
                viewModel.sharePost();
            else if (o.equals(Constants.HIDE_POST))
                viewModel.hidePost(viewModel.getPostsAdapter().lastSelected);
        });
        viewModel.getQuestionedPostsAdapter().liveData.observe((LifecycleOwner) context, o -> {
            if (o.equals(Constants.DELETE))
                showDeleteDialog(viewModel.getQuestionedPostsAdapter().lastSelected);
            else if (o.equals(Constants.HIDE_POST))
                viewModel.hidePost(viewModel.getQuestionedPostsAdapter().lastSelected);
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
                        viewModel.profilePosts((viewModel.getMainData().getMeta().getCurrentPage() + 1), false);
                    }
                }
            }
        });
        binding.rcQPosts.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(@NonNull RecyclerView recyclerView, int newState) {
                super.onScrollStateChanged(recyclerView, newState);
            }

            @Override
            public void onScrolled(@NonNull RecyclerView recyclerView, int dx, int dy) {
                super.onScrolled(recyclerView, dx, dy);
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
                if (!viewModel.searchProgressVisible.get() && !TextUtils.isEmpty(viewModel.getMainData().getLinks().getNext())) {
                    if (linearLayoutManager != null && linearLayoutManager.findLastCompletelyVisibleItemPosition() == viewModel.getQuestionedPostsAdapter().getPostDataList().size() - 1) {
                        viewModel.searchProgressVisible.set(true);
                        viewModel.profilePosts((viewModel.getMainData().getMeta().getCurrentPage() + 1), false);
                    }
                }
            }
        });

    }

    private void showDeleteDialog(int postId) {
        deleteDialog = new Dialog(context, R.style.PauseDialog);
        deleteDialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        Objects.requireNonNull(deleteDialog.getWindow()).getAttributes().windowAnimations = R.style.PauseDialogAnimation;
        deleteDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        OptionDialogBinding binding = DataBindingUtil.inflate(LayoutInflater.from(deleteDialog.getContext()), R.layout.option_dialog, null, false);
        deleteDialog.setContentView(binding.getRoot());
        binding.optionCancel.setOnClickListener(v -> deleteDialog.dismiss());
        binding.optionDone.setOnClickListener(v -> {
            deleteDialog.dismiss();
            viewModel.deletePost(postId);
        });
        deleteDialog.show();
    }

    @Override
    public void onResume() {
        super.onResume();
        viewModel.getPostRepository().setLiveData(viewModel.liveData);
        baseActivity().enableRefresh(false);

    }

    @Override
    public void onAttach(@NotNull Context context) {
        super.onAttach(context);
        this.context = context;
    }


    @Override
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        if (data != null) {
            if (requestCode == Constants.NEW_POST_REQUEST || requestCode == Constants.POST_DETAILS_REQUEST) {
                Bundle bundle = data.getBundleExtra(Constants.BUNDLE);
                if (bundle != null && bundle.containsKey(Constants.BUNDLE)) {
                    PassingObject passingObject = (PassingObject) bundle.getSerializable(Constants.BUNDLE);
                    PostData postData = new Gson().fromJson(String.valueOf(passingObject.getObjectClass()), PostData.class);
                    if (postData.isDeleted()) {
                        viewModel.getPostsAdapter().getPostDataList().remove(viewModel.getPostsAdapter().lastPosition);
                        viewModel.getPostsAdapter().notifyDataSetChanged();
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
        super.onActivityResult(requestCode, resultCode, data);
        closeKeyboard();
    }

}
