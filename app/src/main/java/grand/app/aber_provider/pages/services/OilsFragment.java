package grand.app.aber_provider.pages.services;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;

import javax.inject.Inject;

import grand.app.aber_provider.BR;
import grand.app.aber_provider.PassingObject;
import grand.app.aber_provider.R;
import grand.app.aber_provider.base.BaseFragment;
import grand.app.aber_provider.base.IApplicationComponent;
import grand.app.aber_provider.base.MyApplication;
import grand.app.aber_provider.databinding.FragmentOilBinding;
import grand.app.aber_provider.model.base.Mutable;
import grand.app.aber_provider.model.base.StatusMessage;
import grand.app.aber_provider.pages.home.SearchFragment;
import grand.app.aber_provider.pages.home.models.PostsResponse;
import grand.app.aber_provider.pages.packages.PackagesFragment;
import grand.app.aber_provider.pages.services.viewModels.ServicesViewModels;
import grand.app.aber_provider.utils.Constants;
import grand.app.aber_provider.utils.helper.AppHelper;
import grand.app.aber_provider.utils.helper.MovementHelper;


public class OilsFragment extends BaseFragment {
    @Inject
    ServicesViewModels viewModel;
    FragmentOilBinding binding;

    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_oil, container, false);
        IApplicationComponent component = ((MyApplication) requireActivity().getApplicationContext()).getApplicationComponent();
        component.inject(this);
        binding.setViewModel(viewModel);
        binding.searchLocation.setIconTint(null);
        binding.picTime.setIconTint(null);
//        viewModel.getLivesStreams(1, true);
        setEvent();
        return binding.getRoot();
    }

    private void setEvent() {
        viewModel.liveData.observe(requireActivity(), (Observer<Object>) o -> {
            Mutable mutable = (Mutable) o;
            handleActions(mutable);
            switch (((Mutable) o).message) {
                case Constants.POSTS:
                    viewModel.setMainData(((PostsResponse) (mutable).object).getMainData());
                    break;
                case Constants.NEW_POST:
                    MovementHelper.startActivityForResultWithBundle(requireActivity(), new PassingObject(), getResources().getString(R.string.menuFavorite), PackagesFragment.class.getName(), Constants.NEW_POST_REQUEST);
                    break;
                case Constants.SEARCH:
                    MovementHelper.startActivity(requireActivity(), SearchFragment.class.getName(), getString(R.string.search), null);
                    break;
                case Constants.SHARE_POST:
                    toastMessage(((StatusMessage) mutable.object).mMessage);
                    AppHelper.makeActionSound(requireActivity(), Constants.SHARE_POST);
                    break;
                case Constants.DELETE:
                    toastMessage(((StatusMessage) mutable.object).mMessage);
                    viewModel.getPostsAdapter().getPostDataList().remove(viewModel.getPostsAdapter().lastPosition);
                    viewModel.getPostsAdapter().notifyDataSetChanged();
                    if (viewModel.getPostsAdapter().getItemCount() == 0)
                        viewModel.notifyChange(BR.postsAdapter);
                    break;

            }
        });

    }

    @Override
    public void onResume() {
        super.onResume();
        viewModel.getPostRepository().setLiveData(viewModel.liveData);
    }
}