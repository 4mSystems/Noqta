package grand.app.aber_provider.pages.services;

import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;

import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;

import java.util.Objects;

import javax.inject.Inject;

import grand.app.aber_provider.BR;
import grand.app.aber_provider.PassingObject;
import grand.app.aber_provider.R;
import grand.app.aber_provider.base.BaseFragment;
import grand.app.aber_provider.base.IApplicationComponent;
import grand.app.aber_provider.base.MyApplication;
import grand.app.aber_provider.databinding.FragmentConfirmOrderBinding;
import grand.app.aber_provider.databinding.OptionDialogBinding;
import grand.app.aber_provider.model.base.Mutable;
import grand.app.aber_provider.model.base.StatusMessage;
import grand.app.aber_provider.pages.favorites.FavoritesFragment;
import grand.app.aber_provider.pages.home.SearchFragment;
import grand.app.aber_provider.pages.home.models.PostsResponse;
import grand.app.aber_provider.pages.home.viewModels.HomeViewModels;
import grand.app.aber_provider.utils.Constants;
import grand.app.aber_provider.utils.helper.AppHelper;
import grand.app.aber_provider.utils.helper.MovementHelper;


public class FragmentConfirmOrder extends BaseFragment {
    @Inject
    HomeViewModels viewModel;
    FragmentConfirmOrderBinding binding;
    Dialog deleteDialog;

    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_confirm_order, container, false);
        IApplicationComponent component = ((MyApplication) requireActivity().getApplicationContext()).getApplicationComponent();
        component.inject(this);
        binding.setViewModel(viewModel);
//        viewModel.followersPosts(1, true);
        setEvent();
        return binding.getRoot();
    }

    private void setEvent() {
        viewModel.liveData.observe((LifecycleOwner) requireActivity(), (Observer<Object>) o -> {
            Mutable mutable = (Mutable) o;
            handleActions(mutable);
            switch (((Mutable) o).message) {
                case Constants.POSTS:
                    viewModel.setMainData(((PostsResponse) (mutable).object).getMainData());
                    break;
                case Constants.NEW_POST:
                    MovementHelper.startActivityForResultWithBundle(requireActivity(), new PassingObject(), null, FavoritesFragment.class.getName(), Constants.NEW_POST_REQUEST);
                    break;
                case Constants.SEARCH:
                    MovementHelper.startActivity(requireActivity(), SearchFragment.class.getName(), getString(R.string.search), null);
                    break;
                case Constants.SHARE_POST:
                    toastMessage(((StatusMessage) mutable.object).mMessage);
                    AppHelper.makeActionSound(requireActivity(), Constants.SHARE_POST);
                    break;
                case Constants.DELETE:
                    toastMessage(((StatusMessage) mutable.object).mMessage);
                    viewModel.getPostsAdapter().getPostDataList().remove(viewModel.getPostsAdapter().lastPosition);
                    viewModel.getPostsAdapter().notifyItemRangeChanged(viewModel.getPostsAdapter().lastPosition, viewModel.getPostsAdapter().getItemCount());
                    if (viewModel.getPostsAdapter().getItemCount() == 0)
                        viewModel.notifyChange(BR.postsAdapter);
                    deleteDialog.dismiss();
                    break;

            }
        });
    }

    private void showDeleteDialog() {
        deleteDialog = new Dialog(requireActivity(), R.style.PauseDialog);
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
    }

}
