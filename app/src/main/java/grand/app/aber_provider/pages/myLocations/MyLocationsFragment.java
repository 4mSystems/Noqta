package grand.app.aber_provider.pages.myLocations;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;

import org.jetbrains.annotations.NotNull;

import javax.inject.Inject;

import grand.app.aber_provider.R;
import grand.app.aber_provider.base.BaseFragment;
import grand.app.aber_provider.base.IApplicationComponent;
import grand.app.aber_provider.base.MyApplication;
import grand.app.aber_provider.databinding.FragmentMyLocationBinding;
import grand.app.aber_provider.model.base.Mutable;
import grand.app.aber_provider.pages.myLocations.viewModels.MyLocationsViewModel;

public class MyLocationsFragment extends BaseFragment {
    FragmentMyLocationBinding binding;
    private Context context;
    @Inject
    MyLocationsViewModel viewModel;

    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_my_location, container, false);
        IApplicationComponent component = ((MyApplication) context.getApplicationContext()).getApplicationComponent();
        component.inject(this);
        binding.setViewmodel(viewModel);
        viewModel.locations();
        setEvent();
        return binding.getRoot();
    }

    private void setEvent() {
        viewModel.liveData.observe((LifecycleOwner) context, (Observer<Object>) o -> {
            Mutable mutable = (Mutable) o;
            handleActions(mutable);
//            if (Constants.MEMBERS.equals(((Mutable) o).message)) {
//                viewModel.getLocationsAdapters().updateData(((LocationsResponse) (mutable).object).getData());
//                viewModel.notifyChange(BR.locationsAdapters);
//            } else if (Constants.ADD_PLACE.equals(((Mutable) o).message)) {
//                MovementHelper.startActivityForResultWithBundle(context, new PassingObject(), getString(R.string.add_place), AddPlaceFragment.class.getName(), null);
//            } else if (Constants.DELETE.equals(((Mutable) o).message)) {
//                if (viewModel.getLocationsAdapters().locationsDataMutableLiveData.getValue().getId() == UserHelper.getInstance(context).getSaveLastKnownLocation().getId())
//                    UserHelper.getInstance(context).saveLastKnownLocation(null);
//                viewModel.getLocationsAdapters().locationsDataList.remove(viewModel.getLocationsAdapters().position);
//                viewModel.getLocationsAdapters().notifyDataSetChanged();
//                viewModel.notifyChange(BR.locationsAdapters);
//            }
        });
        viewModel.getLocationsAdapters().locationsDataMutableLiveData.observe((LifecycleOwner) context, locationsData -> showAlertCancel(locationsData.getId()));
    }

    public void showAlertCancel(int locationId) {
//        AlertDialog.Builder builder = new AlertDialog.Builder(context);
//        builder
//                .setMessage(getString(R.string.delete_title))
//                .setCancelable(false)
//                .setNegativeButton(getString(R.string.cancel), (dialog, which) -> dialog.cancel())
//                .setPositiveButton(getString(R.string.send), (dialog, id) -> viewModel.deleteLocation(locationId));
//        final AlertDialog alertDialog = builder.create();
//        alertDialog.show();
    }

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
//        if (data != null)
//            if (requestCode == Constants.RESULT_CODE) {
//                viewModel.locations();
//            }
    }

    @Override
    public void onResume() {
        super.onResume();
        viewModel.getRepository().setLiveData(viewModel.liveData);
    }

    @Override
    public void onAttach(@NotNull Context context) {
        super.onAttach(context);
        this.context = context;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
//        if (UserHelper.getInstance(context).getSaveLastKnownLocation() != null)
//            viewModel.updateMain(UserHelper.getInstance(context).getSaveLastKnownLocation().getId());
    }
}