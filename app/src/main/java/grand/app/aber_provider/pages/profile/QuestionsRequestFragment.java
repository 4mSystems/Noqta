package grand.app.aber_provider.pages.profile;

import android.app.Dialog;
import android.content.Context;
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
import grand.app.aber_provider.databinding.FragmentQuestionsPostsBinding;
import grand.app.aber_provider.databinding.OptionDialogBinding;
import grand.app.aber_provider.model.base.Mutable;
import grand.app.aber_provider.model.base.StatusMessage;
import grand.app.aber_provider.pages.home.models.PostsResponse;
import grand.app.aber_provider.pages.profile.viewModels.QuestionsPostsViewModels;
import grand.app.aber_provider.utils.Constants;

public class QuestionsRequestFragment extends BaseFragment {
    Context context;
    FragmentQuestionsPostsBinding binding;
    @Inject
    QuestionsPostsViewModels viewModel;
    Dialog deleteDialog;

    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_questions_posts, container, false);
        IApplicationComponent component = ((MyApplication) context.getApplicationContext()).getApplicationComponent();
        component.inject(this);
        binding.setViewModel(viewModel);
        Bundle bundle = this.getArguments();
        if (bundle != null) {
            String passingObject = bundle.getString(Constants.BUNDLE);
            viewModel.setPassingObject(new Gson().fromJson(passingObject, PassingObject.class));
            viewModel.profilePosts(1, true);
        }
        setEvent();
        return binding.getRoot();
    }

    private void setEvent() {
        viewModel.liveData.observe((LifecycleOwner) context, (Observer<Object>) o -> {
            Mutable mutable = (Mutable) o;
            handleActions(mutable);
            if (Constants.PROFILE_POSTS.equals(((Mutable) o).message)) {
                viewModel.setMainData(((PostsResponse) (mutable).object).getMainData());
            } else if (Constants.DELETE.equals(((Mutable) o).message)) {
                toastMessage(((StatusMessage) mutable.object).mMessage);
                viewModel.getQuestionedPostsAdapter().getPostDataList().remove(viewModel.getQuestionedPostsAdapter().lastPosition);
                viewModel.getQuestionedPostsAdapter().notifyDataSetChanged();
                viewModel.notifyChange(BR.postsAdapter);
                deleteDialog.dismiss();
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
        viewModel.getQuestionedPostsAdapter().liveData.observe((LifecycleOwner) context, o -> showDeleteDialog());
    }

    private void showDeleteDialog() {
        deleteDialog = new Dialog(context, R.style.PauseDialog);
        deleteDialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        Objects.requireNonNull(deleteDialog.getWindow()).getAttributes().windowAnimations = R.style.PauseDialogAnimation;
        deleteDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        OptionDialogBinding binding = DataBindingUtil.inflate(LayoutInflater.from(deleteDialog.getContext()), R.layout.option_dialog, null, false);
        deleteDialog.setContentView(binding.getRoot());
        binding.optionCancel.setOnClickListener(v -> deleteDialog.dismiss());
        binding.optionDone.setOnClickListener(v -> viewModel.deletePost());
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

}
