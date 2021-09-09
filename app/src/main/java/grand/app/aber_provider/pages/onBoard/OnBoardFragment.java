package grand.app.aber_provider.pages.onBoard;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;

import org.jetbrains.annotations.NotNull;

import javax.inject.Inject;

import grand.app.aber_provider.R;
import grand.app.aber_provider.base.BaseFragment;
import grand.app.aber_provider.base.IApplicationComponent;
import grand.app.aber_provider.base.MyApplication;
import grand.app.aber_provider.databinding.FragmentOnboardBinding;
import grand.app.aber_provider.model.base.Mutable;
import grand.app.aber_provider.pages.auth.login.LoginFragment;
import grand.app.aber_provider.pages.onBoard.models.BoardResponse;
import grand.app.aber_provider.pages.splash.SplashViewModel;
import grand.app.aber_provider.utils.Constants;
import grand.app.aber_provider.utils.helper.MovementHelper;
import grand.app.aber_provider.utils.session.UserHelper;


public class OnBoardFragment extends BaseFragment {
    FragmentOnboardBinding fragmentOnboardBinding;
    @Inject
    SplashViewModel viewModel;
    private Context context;

    public OnBoardFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        fragmentOnboardBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_onboard, container, false);
        IApplicationComponent component = ((MyApplication) context.getApplicationContext()).getApplicationComponent();
        component.inject(this);
        fragmentOnboardBinding.setOnBoardViewModels(viewModel);
        viewModel.getSlider();
        liveDataListeners();
        // fill list screen
        fragmentOnboardBinding.imageSlider.setCurrentPageListener(currentPosition -> {
            if (currentPosition == viewModel.getOnBoardAdapter().pagerList.size() - 1) {
                fragmentOnboardBinding.skip.setVisibility(View.GONE);
//                fragmentOnboardBinding.appCompatFinish.setVisibility(View.VISIBLE);
//                fragmentOnboardBinding.appCompatButtonNext.setVisibility(View.GONE);
            } else {
                if (currentPosition != 0) {
                    fragmentOnboardBinding.skip.setVisibility(View.VISIBLE);
                } else
                    fragmentOnboardBinding.skip.setVisibility(View.GONE);
//                fragmentOnboardBinding.appCompatFinish.setVisibility(View.GONE);
//                fragmentOnboardBinding.appCompatButtonNext.setVisibility(View.VISIBLE);
            }
        });
        return fragmentOnboardBinding.getRoot();
    }


    private void liveDataListeners() {
        viewModel.liveData.observe((LifecycleOwner) context, (Observer<Object>) o -> {
            Mutable mutable = (Mutable) o;
            handleActions(mutable);
            switch (((Mutable) o).message) {
                case Constants.NEXT:
                    if (viewModel.getOnBoardAdapter().pagerList.size() > 0)
                        if (fragmentOnboardBinding.imageSlider.getCurrentPagePosition() == viewModel.getOnBoardAdapter().pagerList.size() - 1) {
                            UserHelper.getInstance(context).addIsFirst(false);
                            MovementHelper.startActivityBase(context, LoginFragment.class.getName(), null, null);
                        } else {
                            if (fragmentOnboardBinding.imageSlider.getCurrentPagePosition() != 0) {
                                fragmentOnboardBinding.skip.setVisibility(View.VISIBLE);
                            } else
                                fragmentOnboardBinding.skip.setVisibility(View.GONE);
                            fragmentOnboardBinding.appCompatFinish.setVisibility(View.GONE);
                            fragmentOnboardBinding.appCompatButtonNext.setVisibility(View.VISIBLE);
                            fragmentOnboardBinding.imageSlider.setCurrentPagePosition(fragmentOnboardBinding.imageSlider.getCurrentPagePosition() + 1);
                        }
                    break;
                case Constants.PREVIOUS:
                    if (fragmentOnboardBinding.imageSlider.getCurrentPagePosition() != 0) {
                        fragmentOnboardBinding.skip.setVisibility(View.VISIBLE);
                    } else
                        fragmentOnboardBinding.skip.setVisibility(View.GONE);
                    fragmentOnboardBinding.imageSlider.setCurrentPagePosition(fragmentOnboardBinding.imageSlider.getCurrentPagePosition() - 1);
                    break;
                case Constants.START_APP:
                    UserHelper.getInstance(context).addIsFirst(false);
                    MovementHelper.startActivityBase(context, LoginFragment.class.getName(), null, null);
                    break;
                case Constants.BOARD:
                    viewModel.getOnBoardAdapter().updateData(((BoardResponse) ((Mutable) o).object).getOnBoardList());
                    viewModel.setupSlider(fragmentOnboardBinding.imageSlider);
                    break;
                case Constants.LOGIN:
                    MovementHelper.startActivityBase(context, LoginFragment.class.getName(), null, null);
                    break;
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