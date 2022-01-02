package te.app.nottaa.pages.onBoard;

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

import te.app.nottaa.R;
import te.app.nottaa.base.BaseFragment;
import te.app.nottaa.base.IApplicationComponent;
import te.app.nottaa.base.MyApplication;
import te.app.nottaa.databinding.FragmentOnboardBinding;
import te.app.nottaa.model.base.Mutable;
import te.app.nottaa.pages.auth.login.LoginFragment;
import te.app.nottaa.pages.onBoard.models.BoardResponse;
import te.app.nottaa.pages.splash.SplashViewModel;
import te.app.nottaa.utils.Constants;
import te.app.nottaa.utils.helper.MovementHelper;
import te.app.nottaa.utils.session.UserHelper;


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
            } else {
                fragmentOnboardBinding.skip.setVisibility(View.VISIBLE);
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
                    if (fragmentOnboardBinding.imageSlider.getCurrentPagePosition()!= viewModel.getOnBoardAdapter().pagerList.size() - 1)
                        fragmentOnboardBinding.imageSlider.setCurrentPagePosition(fragmentOnboardBinding.imageSlider.getCurrentPagePosition() + 1);
                    else {
                        UserHelper.getInstance(context).addIsFirst(false);
                        MovementHelper.startActivityBase(context, LoginFragment.class.getName(), null, null);
                    }
                    break;
                case Constants.BOARD:
                    viewModel.getOnBoardAdapter().updateData(((BoardResponse) ((Mutable) o).object).getOnBoardList());
                    viewModel.setupSlider(fragmentOnboardBinding.imageSlider);
                    break;
                case Constants.LOGIN:
                    UserHelper.getInstance(context).addIsFirst(false);
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