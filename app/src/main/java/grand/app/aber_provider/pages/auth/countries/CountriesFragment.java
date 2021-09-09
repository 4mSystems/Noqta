package grand.app.aber_provider.pages.auth.countries;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;

import javax.inject.Inject;

import grand.app.aber_provider.BR;
import grand.app.aber_provider.R;
import grand.app.aber_provider.base.BaseFragment;
import grand.app.aber_provider.base.IApplicationComponent;
import grand.app.aber_provider.base.MyApplication;
import grand.app.aber_provider.databinding.FragmentCountriesBinding;
import grand.app.aber_provider.model.base.Mutable;
import grand.app.aber_provider.pages.auth.countries.models.CountriesResponse;
import grand.app.aber_provider.pages.auth.countries.viewModels.CountriesViewModel;
import grand.app.aber_provider.utils.Constants;
import grand.app.aber_provider.utils.helper.MovementHelper;
import grand.app.aber_provider.utils.session.UserHelper;


public class CountriesFragment extends BaseFragment {
    FragmentCountriesBinding binding;
    @Inject
    CountriesViewModel viewModel;

    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_countries, container, false);
        IApplicationComponent component = ((MyApplication) requireActivity().getApplicationContext()).getApplicationComponent();
        component.inject(this);
        binding.setViewmodel(viewModel);
        viewModel.getCountries();
        setEvent();
        return binding.getRoot();
    }

    private void setEvent() {
        viewModel.liveData.observe(requireActivity(), (Observer<Object>) o -> {
            Mutable mutable = (Mutable) o;
            handleActions(mutable);
            if (mutable.message.equals(Constants.COUNTRIES)) {
                viewModel.getCountriesAdapter().updateData(((CountriesResponse) mutable.object).getCountriesDataList());
                viewModel.notifyChange(BR.countriesAdapter);
            } else if (mutable.message.equals(Constants.CITIES)) {
                UserHelper.getInstance(requireActivity()).userCountry(viewModel.getCountriesAdapter().countriesDataList.get(viewModel.getCountriesAdapter().lastPosition));
                MovementHelper.startActivity(requireActivity(), CitiesFragment.class.getName(), getString(R.string.register_city_hint), null);
            }
        });
    }

    @Override
    public void onResume() {
        super.onResume();
        viewModel.getRepository().setLiveData(viewModel.liveData);
    }


}
