package grand.app.aber_provider.pages.packages;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;

import javax.inject.Inject;

import grand.app.aber_provider.R;
import grand.app.aber_provider.base.BaseFragment;
import grand.app.aber_provider.base.IApplicationComponent;
import grand.app.aber_provider.base.MyApplication;
import grand.app.aber_provider.databinding.FragmentPartServicesBinding;
import grand.app.aber_provider.model.base.Mutable;
import grand.app.aber_provider.pages.packages.viewModels.PartServicesViewModels;
import grand.app.aber_provider.utils.Constants;

public class PartServicesFragment extends BaseFragment {
    @Inject
    PartServicesViewModels viewModel;
    FragmentPartServicesBinding binding;

    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_part_services, container, false);
        IApplicationComponent component = ((MyApplication) requireActivity().getApplicationContext()).getApplicationComponent();
        component.inject(this);
        binding.setViewModel(viewModel);
        setEvent();
        return binding.getRoot();
    }

    private void setEvent() {
        viewModel.liveData.observe(requireActivity(), (Observer<Object>) o -> {
            Mutable mutable = (Mutable) o;
            handleActions(mutable);
            viewModel.setMessage(mutable.message.equals(Constants.HIDE_PROGRESS) ? mutable.message : "");
            switch (((Mutable) o).message) {
//                case Constants.LIVE_TIME:
//                    if (TextUtils.isEmpty(viewModel.getNewPostRequest().getTitle()))
//                        binding.title.setError(getString(R.string.new_live_title));
//                    else if (viewModel.getFileObject().size() == 0)
//                        toastErrorMessage(getString(R.string.live_promo_video));
//                    else
//                        MovementHelper.startActivityWithBundle(requireActivity(), new PassingObject(viewModel.getNewPostRequest()), getString(R.string.choose_time_title), ChooseServiceTimeFragment.class.getName(), null);
//                    break;
//                case Constants.WARNING:
//                    binding.title.setError(viewModel.getNewPostRequest().titleError.get());
//                    break;
//                case Constants.MEDIA:
//                    LauncherHelper.execute(LauncherHelper.storage);
//                    break;
            }
        });
    }

    @Override
    public void onResume() {
        super.onResume();
        viewModel.getPostRepository().setLiveData(viewModel.liveData);
    }
}
