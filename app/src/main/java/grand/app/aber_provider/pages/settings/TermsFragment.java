package grand.app.aber_provider.pages.settings;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.text.Html;
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

import grand.app.aber_provider.PassingObject;
import grand.app.aber_provider.R;
import grand.app.aber_provider.base.BaseFragment;
import grand.app.aber_provider.base.IApplicationComponent;
import grand.app.aber_provider.base.MyApplication;
import grand.app.aber_provider.databinding.FragmentTermsBinding;
import grand.app.aber_provider.model.base.Mutable;
import grand.app.aber_provider.pages.settings.models.AboutResponse;
import grand.app.aber_provider.pages.settings.viewModels.SettingsViewModel;
import grand.app.aber_provider.utils.Constants;

public class TermsFragment extends BaseFragment {
    private Context context;
    @Inject
    SettingsViewModel viewModel;
    FragmentTermsBinding binding;

    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_terms, container, false);
        IApplicationComponent component = ((MyApplication) context.getApplicationContext()).getApplicationComponent();
        component.inject(this);
        binding.setViewmodel(viewModel);
        setEvent();
        Bundle bundle = this.getArguments();
        if (bundle != null) {
            String passingObject = bundle.getString(Constants.BUNDLE);
            viewModel.setPassingObject(new Gson().fromJson(passingObject, PassingObject.class));
            viewModel.terms();
        }
        return binding.getRoot();
    }

    private void setEvent() {
        viewModel.liveData.observe((LifecycleOwner) context, (Observer<Object>) o -> {
            Mutable mutable = (Mutable) o;
            handleActions(mutable);
            if (((Mutable) o).message.equals(Constants.TERMS)) {
                viewModel.setAboutData(((AboutResponse) ((Mutable) o).object).getAboutData());
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                    binding.text.setText(Html.fromHtml(viewModel.getAboutData().getBody(), Html.FROM_HTML_MODE_COMPACT));
                } else {
                    binding.text.setText(Html.fromHtml(viewModel.getAboutData().getBody()));
                }
            }
        });

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


}
