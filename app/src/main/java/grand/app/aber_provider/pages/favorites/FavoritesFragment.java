package grand.app.aber_provider.pages.favorites;

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
import grand.app.aber_provider.databinding.FragmentFavoritesBinding;
import grand.app.aber_provider.model.base.Mutable;
import grand.app.aber_provider.pages.home.models.NewPostResponse;
import grand.app.aber_provider.pages.home.models.PostData;
import grand.app.aber_provider.pages.favorites.viewModels.FavoritesViewModels;
import grand.app.aber_provider.utils.Constants;
import grand.app.aber_provider.utils.helper.LauncherHelper;
import grand.app.aber_provider.utils.helper.MovementHelper;


public class FavoritesFragment extends BaseFragment {
    @Inject
    FavoritesViewModels viewModel;
    FragmentFavoritesBinding binding;

    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_favorites, container, false);
        IApplicationComponent component = ((MyApplication) requireContext().getApplicationContext()).getApplicationComponent();
        component.inject(this);
        binding.setViewModel(viewModel);
        Bundle bundle = this.getArguments();
        if (bundle != null) {
            String passingObject = bundle.getString(Constants.BUNDLE);
            viewModel.setPassingObject(new Gson().fromJson(passingObject, PassingObject.class));
            viewModel.setPostData(new Gson().fromJson(String.valueOf(viewModel.getPassingObject().getObjectClass()), PostData.class));
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
                case Constants.NEW_POST:
                    toastMessage(((NewPostResponse) mutable.object).mMessage);
                    MovementHelper.finishWithResult(new PassingObject(((NewPostResponse) mutable.object).getPostData()), requireContext(), Constants.NEW_POST_REQUEST);
                    break;
               case Constants.IMAGE:
                    LauncherHelper.execute(LauncherHelper.storage);
                    break;
            }
        });
    }

    @Override
    public void onResume() {
        super.onResume();
        viewModel.getPostRepository().setLiveData(viewModel.liveData);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LauncherHelper.checkPermission(this, 9, (request, result) -> {
            if (result)
                pickPostMedia(requireContext());
        });

    }
}
