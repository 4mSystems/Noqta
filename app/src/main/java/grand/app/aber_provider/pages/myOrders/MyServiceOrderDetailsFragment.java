package grand.app.aber_provider.pages.myOrders;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import com.google.gson.Gson;
import javax.inject.Inject;
import grand.app.aber_provider.PassingObject;
import grand.app.aber_provider.R;
import grand.app.aber_provider.base.BaseFragment;
import grand.app.aber_provider.base.IApplicationComponent;
import grand.app.aber_provider.base.MyApplication;
import grand.app.aber_provider.databinding.FragmentOrderServiceDetailsBinding;
import grand.app.aber_provider.model.base.Mutable;
import grand.app.aber_provider.pages.profile.viewModels.ProfileFollowersViewModels;
import grand.app.aber_provider.utils.Constants;

public class MyServiceOrderDetailsFragment extends BaseFragment {
    @Inject
    ProfileFollowersViewModels viewModel;
    FragmentOrderServiceDetailsBinding binding;

    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_order_service_details, container, false);
        IApplicationComponent component = ((MyApplication) requireActivity().getApplicationContext()).getApplicationComponent();
        component.inject(this);
        binding.setViewmodel(viewModel);
        Bundle bundle = this.getArguments();
        if (bundle != null) {
            String passingObject = bundle.getString(Constants.BUNDLE);
            viewModel.setPassingObject(new Gson().fromJson(passingObject, PassingObject.class));
//            viewModel.userFollowers(1, true);
        }
        setEvent();
        return binding.getRoot();
    }

    private void setEvent() {
        viewModel.liveData.observe(requireActivity(), (Observer<Object>) o -> {
            Mutable mutable = (Mutable) o;
            handleActions(mutable);

        });

    }

    @Override
    public void onResume() {
        super.onResume();
        baseActivity().enableRefresh(false);

    }

}
