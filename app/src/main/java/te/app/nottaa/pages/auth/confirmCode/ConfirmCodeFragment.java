package te.app.nottaa.pages.auth.confirmCode;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;

import com.google.gson.Gson;

import java.util.Locale;
import java.util.concurrent.TimeUnit;

import javax.inject.Inject;

import te.app.nottaa.PassingObject;
import te.app.nottaa.R;
import te.app.nottaa.base.BaseFragment;
import te.app.nottaa.base.IApplicationComponent;
import te.app.nottaa.base.MyApplication;
import te.app.nottaa.databinding.FragmentConfirmCodeBinding;
import te.app.nottaa.model.base.Mutable;
import te.app.nottaa.model.base.StatusMessage;
import te.app.nottaa.pages.auth.changePassword.ChangePasswordFragment;
import te.app.nottaa.pages.auth.models.UsersResponse;
import te.app.nottaa.utils.Constants;
import te.app.nottaa.utils.helper.MovementHelper;
import te.app.nottaa.utils.session.LanguagesHelper;
import te.app.nottaa.utils.session.UserHelper;

public class ConfirmCodeFragment extends BaseFragment {
    @Inject
    ConfirmViewModel viewModel;
    FragmentConfirmCodeBinding binding;
    private CountDownTimer countDownTimer;

    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_confirm_code, container, false);
        IApplicationComponent component = ((MyApplication) requireActivity().getApplicationContext()).getApplicationComponent();
        component.inject(this);
        binding.setViewmodel(viewModel);
        Bundle bundle = this.getArguments();
        if (bundle != null) {
            String passingObject = bundle.getString(Constants.BUNDLE);
            viewModel.setPassingObject(new Gson().fromJson(passingObject, PassingObject.class));
        }
        startTimer();
        setEvent();
        return binding.getRoot();
    }

    private void startTimer() {
        countDownTimer = new CountDownTimer(30000, 1000) {
            public void onTick(long millisUntilFinished) {
                long mil = TimeUnit.MILLISECONDS.toSeconds(millisUntilFinished) - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(millisUntilFinished));
                long min = TimeUnit.MILLISECONDS.toMinutes(millisUntilFinished);
                String time = "" + String.format(new Locale(LanguagesHelper.getCurrentLanguage()), "%d : %d ",
                        LanguagesHelper.getCurrentLanguage().equals("ar") || LanguagesHelper.getCurrentLanguage().equals("ur") ? mil : min, LanguagesHelper.getCurrentLanguage().equals("ar") ? min : mil);

                binding.tvForgetTimer.setText(time);

            }

            public void onFinish() {
                binding.tvLoginForget.setEnabled(true);
            }
        }.start();
    }

    private void setEvent() {
        viewModel.liveData.observe(requireActivity(), (Observer<Object>) o -> {
            Mutable mutable = (Mutable) o;
            handleActions(mutable);
            viewModel.setMessage(mutable.message.equals(Constants.HIDE_PROGRESS) ? mutable.message : "");
            if (((Mutable) o).message.equals(Constants.CONFIRM_CODE)) {
                toastMessage(((UsersResponse) mutable.object).mMessage);
                if (viewModel.getPassingObject().getId() != Constants.CHECK_CONFIRM_NAV_REGISTER) {
                    UserHelper.getInstance(requireActivity()).addJwt(((UsersResponse) ((Mutable) o).object).getData().getAccess_token());
                    MovementHelper.startActivityWithBundle(requireActivity(), new PassingObject(((UsersResponse)mutable.object).getData().getType()),null,ChangePasswordFragment.class.getName(), null);
                }
                viewModel.goBack(requireActivity());
            } else if (((Mutable) o).message.equals(Constants.FORGET_PASSWORD)) {
                toastMessage(((StatusMessage) mutable.object).mMessage);
                binding.tvLoginForget.setEnabled(false);
                startTimer();
            }
        });
    }

    @Override
    public void onDetach() {
        super.onDetach();
        countDownTimer.cancel();
    }

    @Override
    public void onResume() {
        super.onResume();
        viewModel.repository.setLiveData(viewModel.liveData);
    }
}
