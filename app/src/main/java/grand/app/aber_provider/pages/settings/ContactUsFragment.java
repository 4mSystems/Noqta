package grand.app.aber_provider.pages.settings;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;

import com.google.gson.Gson;

import org.jetbrains.annotations.NotNull;

import javax.inject.Inject;

import grand.app.aber_provider.BR;
import grand.app.aber_provider.PassingObject;
import grand.app.aber_provider.R;
import grand.app.aber_provider.activity.BaseActivity;
import grand.app.aber_provider.base.BaseFragment;
import grand.app.aber_provider.base.IApplicationComponent;
import grand.app.aber_provider.base.MyApplication;
import grand.app.aber_provider.databinding.FragmentContactBinding;
import grand.app.aber_provider.model.base.Mutable;
import grand.app.aber_provider.model.base.StatusMessage;
import grand.app.aber_provider.pages.settings.models.ContactResponse;
import grand.app.aber_provider.pages.settings.viewModels.SettingsViewModel;
import grand.app.aber_provider.utils.Constants;

public class ContactUsFragment extends BaseFragment {

    private Context context;
    FragmentContactBinding binding;
    @Inject
    SettingsViewModel viewModel;

    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_contact, container, false);
        IApplicationComponent component = ((MyApplication) context.getApplicationContext()).getApplicationComponent();
        component.inject(this);
        binding.setViewmodel(viewModel);
        Bundle bundle = this.getArguments();
        if (bundle != null) {
            String passingObject = bundle.getString(Constants.BUNDLE);
            viewModel.setPassingObject(new Gson().fromJson(passingObject, PassingObject.class));
            if (!TextUtils.isEmpty(viewModel.getPassingObject().getObject()) && viewModel.getPassingObject().getObject().equals(Constants.CONTACT))
                viewModel.getContact();
        }
        setEvent();
        return binding.getRoot();
    }

    private void setEvent() {
        viewModel.liveData.observe((LifecycleOwner) context, (Observer<Object>) o -> {
            Mutable mutable = (Mutable) o;
            handleActions(mutable);
            viewModel.setMessage(mutable.message.equals(Constants.HIDE_PROGRESS) ? mutable.message : "");
            switch (((Mutable) o).message) {
                case Constants.CONTACT:
                    toastMessage(((StatusMessage) ((Mutable) o).object).mMessage);
                    finishActivity();
                    break;
                case Constants.ERROR_TOAST:
                    showError(getResources().getString(R.string.empty_warning));
                    break;
//                case Constants.SOCIAL:
//                    viewModel.getSocialAdapter().update(((SocialResponse) mutable.object).getMediaDataList());
//                    viewModel.notifyChange(BR.socialAdapter);
//                    break;
                case Constants.GET_CONTACT:
                    viewModel.getContactsAdapter().update(((ContactResponse) mutable.object).getContactList());
                    viewModel.notifyChange(BR.contactsAdapter);
                    break;

            }
        });
    }

    @Override
    public void onResume() {
        super.onResume();
        ((BaseActivity) context).enableRefresh(false);
        viewModel.getRepository().setLiveData(viewModel.liveData);
    }

    @Override
    public void onAttach(@NotNull Context context) {
        super.onAttach(context);
        this.context = context;
    }
}
