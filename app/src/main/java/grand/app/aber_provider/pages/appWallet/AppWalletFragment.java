package grand.app.aber_provider.pages.appWallet;

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
import grand.app.aber_provider.databinding.FragmentAppWalletBinding;
import grand.app.aber_provider.model.base.Mutable;
import grand.app.aber_provider.pages.appWallet.models.WalletHistoryResponse;
import grand.app.aber_provider.pages.appWallet.viewModels.AppWalletViewModel;
import grand.app.aber_provider.utils.Constants;

public class AppWalletFragment extends BaseFragment {
    FragmentAppWalletBinding binding;
    @Inject
    AppWalletViewModel viewModel;

    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_app_wallet, container, false);
        IApplicationComponent component = ((MyApplication) requireActivity().getApplicationContext()).getApplicationComponent();
        component.inject(this);
        binding.setViewmodel(viewModel);
        viewModel.walletHistory();
        setEvent();
        return binding.getRoot();
    }

    private void setEvent() {
        viewModel.liveData.observe(requireActivity(), (Observer<Object>) o -> {
            Mutable mutable = (Mutable) o;
            handleActions(mutable);
            if (Constants.WALLET.equals(mutable.message)) {
                viewModel.setHistoryWalletData(((WalletHistoryResponse) mutable.object).getData());
            }
        });
    }

    @Override
    public void onResume() {
        super.onResume();
    }

}
