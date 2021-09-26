package te.app.notta.pages.settings;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;

import javax.inject.Inject;

import te.app.notta.R;
import te.app.notta.base.BaseFragment;
import te.app.notta.base.IApplicationComponent;
import te.app.notta.base.MyApplication;
import te.app.notta.databinding.FragmentMoreBinding;
import te.app.notta.pages.settings.viewModels.SettingsViewModel;

public class MoreFragment extends BaseFragment {
    FragmentMoreBinding moreBinding;
    @Inject
    SettingsViewModel viewModel;

    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        moreBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_more, container, false);
        IApplicationComponent component = ((MyApplication) requireActivity().getApplicationContext()).getApplicationComponent();
        component.inject(this);
        moreBinding.setViewmodel(viewModel);
        viewModel.setupMore();
        return moreBinding.getRoot();
    }

}
