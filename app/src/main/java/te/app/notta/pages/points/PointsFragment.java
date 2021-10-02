package te.app.notta.pages.points;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.bottomsheet.BottomSheetDialog;

import javax.inject.Inject;

import te.app.notta.BR;
import te.app.notta.PassingObject;
import te.app.notta.R;
import te.app.notta.base.BaseFragment;
import te.app.notta.base.IApplicationComponent;
import te.app.notta.base.MyApplication;
import te.app.notta.databinding.DeleteSheetBinding;
import te.app.notta.databinding.FragmentPointsBinding;
import te.app.notta.model.base.Mutable;
import te.app.notta.model.base.StatusMessage;
import te.app.notta.pages.points.models.PointsResponse;
import te.app.notta.pages.points.models.students.StudentPointsResponse;
import te.app.notta.pages.points.viewModels.PointsViewModel;
import te.app.notta.pages.teacher.AddGiftFragment;
import te.app.notta.utils.Constants;
import te.app.notta.utils.helper.MovementHelper;

public class PointsFragment extends BaseFragment {
    FragmentPointsBinding tasksBinding;
    @Inject
    PointsViewModel viewModel;

    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        tasksBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_points, container, false);
        IApplicationComponent component = ((MyApplication) requireActivity().getApplicationContext()).getApplicationComponent();
        component.inject(this);
        tasksBinding.setViewmodel(viewModel);
        viewModel.getPoints(1, true);
        setEvent();
        return tasksBinding.getRoot();
    }

    private void setEvent() {
        viewModel.liveData.observe(requireActivity(), (Observer<Object>) o -> {
            Mutable mutable = (Mutable) o;
            handleActions(mutable);
            if (mutable.message.equals(Constants.MENU_GIFTS)) {
                viewModel.setTeacherPointsMain(((PointsResponse) mutable.object).getTeacherPointsMain());
            } else if (((Mutable) o).message.equals(Constants.ADD_GIFT)) {
                MovementHelper.startActivityForResultWithBundle(requireActivity(), new PassingObject(), null, AddGiftFragment.class.getName(), Constants.ADD_GIFT_REQUEST);
            } else if (mutable.message.equals(Constants.DELETE_GIFT)) {
                viewModel.getPointsAdapter().getPointsDataList().remove(viewModel.getPointsAdapter().lastPosition);
                viewModel.getPointsAdapter().notifyDataSetChanged();
                viewModel.notifyChange(BR.pointsAdapter);
            } else if (mutable.message.equals(Constants.STUDENT_GIFTS)) {
                viewModel.setStudentMainPoints(((StudentPointsResponse) mutable.object).getStudentMainPoints());
            } else if (mutable.message.equals(Constants.GET_GIFT)) {
                viewModel.updatePoints();
                toastMessage(((StatusMessage) mutable.object).mMessage);
            }
        });
        viewModel.getPointsAdapter().liveData.observeForever(o -> {
            if (o.equals(Constants.GET_GIFT))
                viewModel.getGift();
            else
                showDeleteDialog();
        });
        tasksBinding.rcPoints.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(@NonNull RecyclerView recyclerView, int newState) {
                super.onScrollStateChanged(recyclerView, newState);
            }

            @Override
            public void onScrolled(@NonNull RecyclerView recyclerView, int dx, int dy) {
                super.onScrolled(recyclerView, dx, dy);
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
                if (viewModel.userData.getType().equals("2")) {
                    if (!viewModel.searchProgressVisible.get() && !TextUtils.isEmpty(viewModel.getTeacherPointsMain().getNextPageUrl())) {
                        if (linearLayoutManager != null && linearLayoutManager.findLastCompletelyVisibleItemPosition() == viewModel.getPointsAdapter().getPointsDataList().size() - 1) {
                            viewModel.searchProgressVisible.set(true);
                            viewModel.getPoints((viewModel.getTeacherPointsMain().getCurrentPage() + 1), false);
                        }
                    }
                } else {
                    if (!viewModel.searchProgressVisible.get() && !TextUtils.isEmpty(viewModel.getStudentMainPoints().getGiftsPaginate().getNextPageUrl())) {
                        if (linearLayoutManager != null && linearLayoutManager.findLastCompletelyVisibleItemPosition() == viewModel.getPointsAdapter().getPointsDataList().size() - 1) {
                            viewModel.searchProgressVisible.set(true);
                            viewModel.getPoints((viewModel.getStudentMainPoints().getGiftsPaginate().getCurrentPage() + 1), false);
                        }
                    }
                }
            }
        });

    }

    private void showDeleteDialog() {
        DeleteSheetBinding sortBinding = DataBindingUtil.inflate(LayoutInflater.from(requireActivity()), R.layout.delete_sheet, null, false);
        BottomSheetDialog sheetDialog = new BottomSheetDialog(requireActivity(), R.style.BottomSheetDialogStyle);
        sheetDialog.setContentView(sortBinding.getRoot());
        sortBinding.tvHeader.setText(getString(R.string.gift_deleted_successfully));
        sortBinding.tvDesc.setText(getString(R.string.gift_body_deleted_successfully));
        sortBinding.btnClose.setOnClickListener(v -> sheetDialog.dismiss());
        sortBinding.btnYes.setOnClickListener(v -> {
            viewModel.deleteGift();
            sheetDialog.dismiss();
        });
        sheetDialog.show();
    }

    @Override
    public void onResume() {
        super.onResume();
        viewModel.getRepository().setLiveData(viewModel.liveData);
    }

    @Override
    public void launchActivityResult(int request, int resultCode, Intent result) {
        if (result != null)
            viewModel.getPoints(1, true);
        super.launchActivityResult(request, resultCode, result);
    }
}
