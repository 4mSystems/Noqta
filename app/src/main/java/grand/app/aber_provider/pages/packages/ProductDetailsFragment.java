package grand.app.aber_provider.pages.packages;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.google.gson.Gson;
import javax.inject.Inject;
import grand.app.aber_provider.PassingObject;
import grand.app.aber_provider.R;
import grand.app.aber_provider.base.BaseFragment;
import grand.app.aber_provider.base.IApplicationComponent;
import grand.app.aber_provider.base.MyApplication;
import grand.app.aber_provider.base.ParentActivity;
import grand.app.aber_provider.databinding.FragmentProductDetailsBinding;
import grand.app.aber_provider.model.base.Mutable;
import grand.app.aber_provider.pages.postDetails.models.PostDetailsResponse;
import grand.app.aber_provider.pages.postDetails.viewModels.PostDetailsViewModel;
import grand.app.aber_provider.utils.Constants;


public class ProductDetailsFragment extends BaseFragment {
    FragmentProductDetailsBinding binding;
    @Inject
    PostDetailsViewModel viewModel;

    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_product_details, container, false);
        IApplicationComponent component = ((MyApplication) requireContext().getApplicationContext()).getApplicationComponent();
        component.inject(this);
        binding.setViewModel(viewModel);
        Bundle bundle = this.getArguments();
        if (bundle != null) {
            String passingObject = bundle.getString(Constants.BUNDLE);
            viewModel.setPassingObject(new Gson().fromJson(passingObject, PassingObject.class));
            viewModel.postDetails(1, true);
        }
        setEvent();
        return binding.getRoot();
    }


    private void setEvent() {
        viewModel.liveData.observe((LifecycleOwner) requireContext(), (Observer<Object>) o -> {
            Mutable mutable = (Mutable) o;
            handleActions(mutable);
            viewModel.setMessage(mutable.message.equals(Constants.HIDE_PROGRESS) ? mutable.message : "");
            switch (((Mutable) o).message) {
                case Constants.POST_DETAILS:
                    viewModel.setPostData((((PostDetailsResponse) (mutable).object).getPostData()));
                    baseActivity().backActionBarView.setTitle(viewModel.getPostData().getTitle());
                    break;
                case Constants.ERROR_TOAST:
                    ((ParentActivity) requireContext()).toastError(getResources().getString(R.string.send_offer_warning));
                    break;

            }
        });

    }

    @Override
    public void onResume() {
        viewModel.getPostRepository().setLiveData(viewModel.liveData);
        super.onResume();
    }
}
