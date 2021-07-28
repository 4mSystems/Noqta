package grand.app.aber_provider.pages.postDetails;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;

import androidx.activity.OnBackPressedCallback;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;

import com.google.gson.Gson;

import org.jetbrains.annotations.NotNull;

import java.util.Objects;

import javax.inject.Inject;

import grand.app.aber_provider.PassingObject;
import grand.app.aber_provider.R;
import grand.app.aber_provider.base.BaseFragment;
import grand.app.aber_provider.base.IApplicationComponent;
import grand.app.aber_provider.base.MyApplication;
import grand.app.aber_provider.databinding.FragmentLiveDetailsBinding;
import grand.app.aber_provider.databinding.OptionDialogBinding;
import grand.app.aber_provider.model.base.Mutable;
import grand.app.aber_provider.model.base.StatusMessage;
import grand.app.aber_provider.pages.myOrders.MyServicesOrdersFragment;
import grand.app.aber_provider.pages.postDetails.models.PostDetailsResponse;
import grand.app.aber_provider.pages.postDetails.viewModels.PostDetailsViewModel;
import grand.app.aber_provider.utils.Constants;
import grand.app.aber_provider.utils.helper.MovementHelper;


public class LiveDetailsFragment extends BaseFragment {
    Context context;
    FragmentLiveDetailsBinding binding;
    @Inject
    PostDetailsViewModel viewModel;

    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_live_details, container, false);
        IApplicationComponent component = ((MyApplication) context.getApplicationContext()).getApplicationComponent();
        component.inject(this);
        binding.setViewModel(viewModel);
        Bundle bundle = this.getArguments();
        if (bundle != null) {
            String passingObject = bundle.getString(Constants.BUNDLE);
            viewModel.setPassingObject(new Gson().fromJson(passingObject, PassingObject.class));
            viewModel.liveDetails();
        }
        onBackPressed();
        setEvent();
        return binding.getRoot();
    }

    private void setEvent() {
        viewModel.liveData.observe((LifecycleOwner) context, (Observer<Object>) o -> {
            Mutable mutable = (Mutable) o;
            handleActions(mutable);
            switch (((Mutable) o).message) {
                case Constants.POST_DETAILS:
                    viewModel.setPostData((((PostDetailsResponse) (mutable).object).getPostData()));
                    break;
                case Constants.OPTIONS:
                    showDeleteDialog();
                    break;
                case Constants.DELETE:
                    toastMessage(((StatusMessage) mutable.object).mMessage);
                    baseActivity().backActionBarView.flag = 0;
                    if (baseActivity().isTaskRoot()) {
                        // This activity is at root of task, so launch main activity
                        MovementHelper.startActivityMain(context);
                    } else {
                        viewModel.getPostData().setDeleted(true);
                        MovementHelper.finishWithResult(new PassingObject(viewModel.getPostData()), context, Constants.NEW_POST_REQUEST);
                    }

                    break;

            }
        });
        baseActivity().backActionBarView.layoutActionBarBackBinding.imgActionBarCancel.setOnClickListener(v -> {
            if (baseActivity().backActionBarView.flag == 1) {
                baseActivity().backActionBarView.flag = 0;
                if (baseActivity().isTaskRoot()) {
                    // This activity is at root of task, so launch main activity
                    MovementHelper.startActivityMain(context);
                } else {
                    if (viewModel.getPostData().getUser() != null)
                        MovementHelper.finishWithResult(new PassingObject(viewModel.getPostData()), context, Constants.POST_DETAILS_REQUEST);
                    else
                        finishActivity();
                }
            }
        });
    }

    private void showDeleteDialog() {
        Dialog deleteDialog = new Dialog(context, R.style.PauseDialog);
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

    private void onBackPressed() {
        OnBackPressedCallback callback = new OnBackPressedCallback(true) {
            @Override
            public void handleOnBackPressed() {
                if (baseActivity().backActionBarView.flag == 1) {
                    baseActivity().backActionBarView.flag = 0;
                    if (baseActivity().isTaskRoot()) {
                        // This activity is at root of task, so launch main activity
                        MovementHelper.startActivityMain(context);
                    } else {
                        if (viewModel.getPostData().getUser() != null)
                            MovementHelper.finishWithResult(new PassingObject(viewModel.getPostData()), context, Constants.POST_DETAILS_REQUEST);
                        else
                            finishActivity();
                    }
                }
            }
        };
        requireActivity().getOnBackPressedDispatcher().addCallback((LifecycleOwner) context, callback);
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
