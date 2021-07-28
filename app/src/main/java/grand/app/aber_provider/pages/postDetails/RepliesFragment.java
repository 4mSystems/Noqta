package grand.app.aber_provider.pages.postDetails;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.activity.OnBackPressedCallback;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.gson.Gson;

import org.jetbrains.annotations.NotNull;

import java.io.File;

import javax.inject.Inject;

import grand.app.aber_provider.BR;
import grand.app.aber_provider.PassingObject;
import grand.app.aber_provider.R;
import grand.app.aber_provider.base.BaseFragment;
import grand.app.aber_provider.base.IApplicationComponent;
import grand.app.aber_provider.base.MyApplication;
import grand.app.aber_provider.base.ParentActivity;
import grand.app.aber_provider.connection.FileObject;
import grand.app.aber_provider.databinding.FragmentRepliesBinding;
import grand.app.aber_provider.model.base.Mutable;
import grand.app.aber_provider.pages.home.models.commentsAndReplies.CommentResponse;
import grand.app.aber_provider.pages.postDetails.models.CreateCommentRequest;
import grand.app.aber_provider.pages.postDetails.models.RepliesResponse;
import grand.app.aber_provider.pages.postDetails.viewModels.RepliesViewModel;
import grand.app.aber_provider.pages.myOrders.MyServicesOrdersFragment;
import grand.app.aber_provider.utils.Constants;
import grand.app.aber_provider.utils.helper.AppHelper;
import grand.app.aber_provider.utils.helper.LauncherHelper;
import grand.app.aber_provider.utils.helper.MovementHelper;
import grand.app.aber_provider.utils.upload.FileOperations;


public class RepliesFragment extends BaseFragment {
    FragmentRepliesBinding binding;
    @Inject
    RepliesViewModel viewModel;

    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_replies, container, false);
        IApplicationComponent component = ((MyApplication) requireContext().getApplicationContext()).getApplicationComponent();
        component.inject(this);
        binding.setViewModel(viewModel);
        Bundle bundle = this.getArguments();
        if (bundle != null) {
            String passingObject = bundle.getString(Constants.BUNDLE);
            viewModel.setPassingObject(new Gson().fromJson(passingObject, PassingObject.class));
            viewModel.replies(1, true);
//            viewModel.setMainComment(new Gson().fromJson(String.valueOf(viewModel.getPassingObject().getObjectClass()), Comments.class));
        }
        setEvent();
        onBackPressed();
        return binding.getRoot();
    }

    private void onBackPressed() {
        OnBackPressedCallback callback = new OnBackPressedCallback(true) {
            @Override
            public void handleOnBackPressed() {
                viewModel.getMainComment().setReplies(String.valueOf(viewModel.getCommentsAdapter().getItemCount()));
                MovementHelper.finishWithResult(new PassingObject(viewModel.getMainComment()), requireContext(), Constants.COMMENT_REQUEST);
            }
        };
        requireActivity().getOnBackPressedDispatcher().addCallback((LifecycleOwner) requireContext(), callback);
    }

    private void setEvent() {
        viewModel.liveData.observe((LifecycleOwner) requireContext(), (Observer<Object>) o -> {
            Mutable mutable = (Mutable) o;
            handleActions(mutable);
            viewModel.setMessage(mutable.message.equals(Constants.HIDE_PROGRESS) ? mutable.message : "");
            switch (((Mutable) o).message) {
                case Constants.REPLIES:
                    viewModel.setMainComment((((RepliesResponse) (mutable).object).getComments()));
                    break;
                case Constants.ERROR_TOAST:
                    ((ParentActivity) requireContext()).toastError(getResources().getString(R.string.send_offer_warning));
                    break;
                case Constants.MAKE_COMMENT:
                    AppHelper.showKeyboard(requireContext(), binding.inputText);
                    break;
                case Constants.COMMENT:
                    AppHelper.makeActionSound(requireContext(), Constants.COMMENT);
                    viewModel.getCommentsAdapter().newComment(((CommentResponse) mutable.object).getComments());
                    if (viewModel.getCommentsAdapter().getItemCount() == 1)
                        viewModel.notifyChange(BR.commentsAdapter);
                    viewModel.getFileObject().clear();
                    viewModel.notifyChange(BR.fileObject);
                    viewModel.setCreateCommentRequest(new CreateCommentRequest());
                    break;
                case Constants.EDIT_COMMENT:
                    AppHelper.makeActionSound(requireContext(), Constants.COMMENT);
                    viewModel.getCommentsAdapter().updateComment(((CommentResponse) mutable.object).getComments());
                    viewModel.getFileObject().clear();
                    viewModel.notifyChange(BR.fileObject);
                    viewModel.setCreateCommentRequest(new CreateCommentRequest());
                    break;
                case Constants.DELETE_COMMENT:
                    viewModel.getCommentsAdapter().removeComment();
                    if (viewModel.getCommentsAdapter().getItemCount() == 0)
                        viewModel.notifyChange(BR.postsAdapter);
                    break;
                case Constants.IMAGE:
                    LauncherHelper.execute(LauncherHelper.storage);
                    break;
                case Constants.PROFILE:
                    MovementHelper.startActivityWithBundle(requireContext(), new PassingObject(viewModel.getMainComment().getUser().getId()), null, MyServicesOrdersFragment.class.getName(), null);
                    break;

            }
        });

        baseActivity().backActionBarView.layoutActionBarBackBinding.imgActionBarCancel.setOnClickListener(v -> {
            viewModel.getMainComment().setReplies(String.valueOf(viewModel.getCommentsAdapter().getItemCount()));
            MovementHelper.finishWithResult(new PassingObject(viewModel.getMainComment()), requireContext(), Constants.COMMENT_REQUEST);
        });
        viewModel.getCommentsAdapter().liveData.observe((LifecycleOwner) requireContext(), o -> {
            if (o.equals(Constants.DELETE)) {
                viewModel.deleteComment();
            } else if (o.equals(Constants.EDIT)) {
                viewModel.setEditedDataToInput();
            }
        });
        binding.rcComments.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(@NonNull RecyclerView recyclerView, int newState) {
                super.onScrollStateChanged(recyclerView, newState);
            }

            @Override
            public void onScrolled(@NonNull RecyclerView recyclerView, int dx, int dy) {
                super.onScrolled(recyclerView, dx, dy);
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
                if (!viewModel.searchProgressVisible.get() && !TextUtils.isEmpty(viewModel.getMainComment().getCommentsPaginate().getLinks().getNext())) {
                    if (linearLayoutManager != null && linearLayoutManager.findLastCompletelyVisibleItemPosition() == viewModel.getCommentsAdapter().getCommentsList().size() - 1) {
                        viewModel.searchProgressVisible.set(true);
                        viewModel.replies((viewModel.getMainComment().getCommentsPaginate().getMeta().getCurrentPage() + 1), false);
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
        LauncherHelper.checkPermission(this, 9, (request, result) -> {
            if (result)
                pickImageDialogSelect();
        });
    }

    @Override
    public void launchActivityResult(int request, int resultCode, Intent result) {
        super.launchActivityResult(request, resultCode, result);
        if (request == Constants.FILE_TYPE_IMAGE) {
            LauncherHelper.launcherRequest = Constants.COMMENT_REQUEST;
            FileObject fileObject = FileOperations.getFileObject(getActivity(), result, Constants.IMAGE, Constants.FILE_TYPE_IMAGE);
            binding.commentImg.setImageURI(Uri.fromFile(new File(fileObject.getFilePath())));
            viewModel.getFileObject().add(fileObject);
            viewModel.notifyChange(BR.fileObject);
        }
    }
}
