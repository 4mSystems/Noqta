package grand.app.aber_provider.pages.myLocations;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;

import javax.inject.Inject;

import grand.app.aber_provider.R;
import grand.app.aber_provider.base.BaseFragment;
import grand.app.aber_provider.base.IApplicationComponent;
import grand.app.aber_provider.base.MyApplication;
import grand.app.aber_provider.databinding.FragmentAddPlaceBinding;
import grand.app.aber_provider.model.base.Mutable;
import grand.app.aber_provider.pages.myLocations.viewModels.MyLocationsViewModel;


public class AddPlaceFragment extends BaseFragment {
    FragmentAddPlaceBinding binding;
    @Inject
    MyLocationsViewModel viewModel;

    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_add_place, container, false);
        IApplicationComponent component = ((MyApplication) requireActivity().getApplicationContext()).getApplicationComponent();
        component.inject(this);
        binding.setViewModel(viewModel);
        Bundle bundle = this.getArguments();
//        if (bundle != null) {
//            String passingObject = bundle.getString(Constants.BUNDLE);
//            viewModel.setPassingObject(new Gson().fromJson(passingObject, PassingObject.class));
//            if (viewModel.getPassingObject().getObjectClass() != null) {
//                viewModel.setLocationsData(new Gson().fromJson(String.valueOf(viewModel.getPassingObject().getObjectClass()), LocationsData.class));
//                binding.region.setText(viewModel.getLocationsData().getRegionName());
//                binding.city.setText(viewModel.getLocationsData().getCityName());
//            }
//        }
        setEvent();
        return binding.getRoot();
    }

    private void setEvent() {
        viewModel.liveData.observe(requireActivity(), (Observer<Object>) o -> {
            Mutable mutable = (Mutable) o;
            handleActions(mutable);
//            if (Constants.CITIES.equals(((Mutable) o).message)) {
//                viewModel.cityDataList = ((CitiesResponse) (mutable).object).getData();
//            } else if (Constants.SHOW_CITY.equals(((Mutable) o).message)) {
//                showCities();
//            } else if (Constants.SHOW_REGION.equals(((Mutable) o).message)) {
//                showRegion();
//            } else if (Constants.PICK_UP_LOCATIONS.equals(((Mutable) o).message)) {
//                MovementHelper.startMapActivityForResultWithBundle(context, new PassingObject(), Constants.LOCATION_SERVICE_ID);
//            } else if (Constants.ADD_PLACE.equals(((Mutable) o).message)) {
//                toastMessage(((StatusMessage) mutable.object).mMessage);
//                MovementHelper.finishWithResult(new PassingObject(), context);
//            }
        });
    }


    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
//        if (data != null)
//            if (requestCode == Constants.LOCATION_SERVICE_ID) {
//                viewModel.getAddLocationRequest().setLat(String.valueOf(data.getDoubleExtra(Constants.LAT, 0.0)));
//                viewModel.getAddLocationRequest().setLng(String.valueOf(data.getDoubleExtra(Constants.LNG, 0.0)));
//                binding.location.setText(getString(R.string.location_picked));
//            }
    }

    @Override
    public void onResume() {
        super.onResume();
        viewModel.getRepository().setLiveData(viewModel.liveData);
    }


}