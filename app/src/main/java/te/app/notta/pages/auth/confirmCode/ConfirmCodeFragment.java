package te.app.notta.pages.auth.confirmCode;

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

import te.app.notta.PassingObject;
import te.app.notta.R;
import te.app.notta.base.BaseFragment;
import te.app.notta.base.IApplicationComponent;
import te.app.notta.base.MyApplication;
import te.app.notta.databinding.FragmentConfirmCodeBinding;
import te.app.notta.model.base.Mutable;
import te.app.notta.model.base.StatusMessage;
import te.app.notta.pages.auth.changePassword.ChangePasswordFragment;
import te.app.notta.pages.auth.models.UsersResponse;
import te.app.notta.utils.Constants;
import te.app.notta.utils.helper.MovementHelper;
import te.app.notta.utils.session.LanguagesHelper;
import te.app.notta.utils.session.UserHelper;

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
                    UserHelper.getInstance(requireActivity()).addJwt(((UsersResponse) ((Mutable) o).object).getData().getToken());
                    MovementHelper.startActivity(requireActivity(), ChangePasswordFragment.class.getName(), null, null);
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
