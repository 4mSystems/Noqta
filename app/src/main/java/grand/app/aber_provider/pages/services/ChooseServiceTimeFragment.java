package grand.app.aber_provider.pages.services;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;

import javax.inject.Inject;

import grand.app.aber_provider.PassingObject;
import grand.app.aber_provider.R;
import grand.app.aber_provider.base.BaseFragment;
import grand.app.aber_provider.base.IApplicationComponent;
import grand.app.aber_provider.base.MyApplication;
import grand.app.aber_provider.databinding.FragmentChooseServiceTimeBinding;
import grand.app.aber_provider.model.base.Mutable;
import grand.app.aber_provider.pages.home.models.NewPostResponse;
import grand.app.aber_provider.pages.favorites.viewModels.FavoritesViewModels;
import grand.app.aber_provider.pages.postDetails.LiveDetailsFragment;
import grand.app.aber_provider.utils.Constants;
import grand.app.aber_provider.utils.helper.AppHelper;
import grand.app.aber_provider.utils.helper.MovementHelper;

public class ChooseServiceTimeFragment extends BaseFragment {
    @Inject
    FavoritesViewModels viewModel;
    FragmentChooseServiceTimeBinding binding;

    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_choose_service_time, container, false);
        IApplicationComponent component = ((MyApplication) requireActivity().getApplicationContext()).getApplicationComponent();
        component.inject(this);
        binding.setViewModel(viewModel);
//        Bundle bundle = this.getArguments();
//        if (bundle != null) {
//            String passingObject = bundle.getString(Constants.BUNDLE);
//            viewModel.setPassingObject(new Gson().fromJson(passingObject, PassingObject.class));
//            viewModel.setNewPostRequest(new Gson().fromJson(String.valueOf(viewModel.getPassingObject().getObjectClass()), NewPostRequest.class));
//        }

        setEvent();
        return binding.getRoot();
    }

    private void setEvent() {
        viewModel.liveData.observe(requireActivity(), (Observer<Object>) o -> {
            Mutable mutable = (Mutable) o;
            handleActions(mutable);
            viewModel.setMessage(mutable.message.equals(Constants.HIDE_PROGRESS) ? mutable.message : "");
            if (((Mutable) o).message.equals(Constants.NEW_POST)) {
                toastMessage(((NewPostResponse) mutable.object).mMessage);
                finishAllActivities();
                MovementHelper.startActivityWithBundle(requireActivity(), new PassingObject(((NewPostResponse) mutable.object).getPostData().getId()), ((NewPostResponse) mutable.object).getPostData().getTitle(), LiveDetailsFragment.class.getName(), null);
            }
        });
        binding.calendar.setMinDate(System.currentTimeMillis());
        viewModel.getNewPostRequest().date = AppHelper.selectDate(binding.calendar.getDate(), "yyyy-MM-dd");
        viewModel.getNewPostRequest().time = AppHelper.selectTime(binding.timePicker.getHour(), binding.timePicker.getMinute());
        binding.dateNumber.setText(AppHelper.getDay(binding.calendar.getDate()));
        binding.dateText.setText(AppHelper.getDayText(binding.calendar.getDate()));
        binding.calendar.setOnDateChangeListener((view, year, month, dayOfMonth) -> {
            viewModel.getNewPostRequest().date = AppHelper.selectDate(view.getDate(), "yyyy-MM-dd");
        });
        binding.timePicker.setOnTimeChangedListener((view, hourOfDay, minute) -> viewModel.getNewPostRequest().time = AppHelper.selectTime(hourOfDay, minute));
    }

    @Override
    public void onResume() {
        super.onResume();
        viewModel.getPostRepository().setLiveData(viewModel.liveData);
    }
}
