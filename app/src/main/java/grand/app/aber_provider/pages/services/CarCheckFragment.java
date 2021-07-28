package grand.app.aber_provider.pages.services;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;

import javax.inject.Inject;
import grand.app.aber_provider.R;
import grand.app.aber_provider.base.BaseFragment;
import grand.app.aber_provider.base.IApplicationComponent;
import grand.app.aber_provider.base.MyApplication;
import grand.app.aber_provider.databinding.FragmentCarCheckBinding;
import grand.app.aber_provider.model.base.Mutable;
import grand.app.aber_provider.model.base.StatusMessage;
import grand.app.aber_provider.pages.home.models.commentsAndReplies.CommentResponse;
import grand.app.aber_provider.pages.services.viewModels.ServicesViewModels;
import grand.app.aber_provider.utils.Constants;
import grand.app.aber_provider.utils.helper.LauncherHelper;

public class CarCheckFragment extends BaseFragment {
    @Inject
    ServicesViewModels viewModel;
    FragmentCarCheckBinding binding;

    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_car_check, container, false);
        IApplicationComponent component = ((MyApplication) requireContext().getApplicationContext()).getApplicationComponent();
        component.inject(this);
        binding.setViewModel(viewModel);

        setEvent();
        return binding.getRoot();
    }

    private void setEvent() {
        viewModel.liveData.observe((LifecycleOwner) requireContext(), (Observer<Object>) o -> {
            Mutable mutable = (Mutable) o;
            handleActions(mutable);
            viewModel.setMessage(mutable.message.equals(Constants.HIDE_PROGRESS) ? mutable.message : "");
            switch (((Mutable) o).message) {
                case Constants.COMMENT:
                    toastMessage(((CommentResponse) mutable.object).mMessage);
                    finishAllActivities();
                    break;
                case Constants.NEW_POST:
                    toastMessage(((StatusMessage) mutable.object).mMessage);
                    finishActivity();
                    break;
                case Constants.IMAGE:
                    pickImageDialogSelect();
                    break;
                case Constants.MEDIA:
                    LauncherHelper.execute(LauncherHelper.storage);
                    break;

            }
        });
    }

    @Override
    public void onResume() {
        super.onResume();
        viewModel.getPostRepository().setLiveData(viewModel.liveData);
    }
}
