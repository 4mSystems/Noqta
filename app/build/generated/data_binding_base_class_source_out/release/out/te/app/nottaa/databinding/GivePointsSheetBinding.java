// Generated by data binding compiler. Do not edit!
package te.app.nottaa.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.Deprecated;
import java.lang.Object;
import te.app.nottaa.R;
import te.app.nottaa.customViews.views.CustomTextViewMedium;
import te.app.nottaa.customViews.views.CustomTextViewRegular;
import te.app.nottaa.customViews.views.IncrementalView;
import te.app.nottaa.pages.addAnswer.viewModels.AddAnswerViewModel;

public abstract class GivePointsSheetBinding extends ViewDataBinding {
  @NonNull
  public final MaterialButton btnClose;

  @NonNull
  public final IncrementalView incrementalViewStudentCount;

  @NonNull
  public final TextInputLayout inputPoints;

  @NonNull
  public final TextInputEditText noOfStudents;

  @NonNull
  public final CircularProgressIndicator progress;

  @NonNull
  public final CustomTextViewRegular tvDesc;

  @NonNull
  public final CustomTextViewMedium tvHeader;

  @Bindable
  protected AddAnswerViewModel mViewModel;

  protected GivePointsSheetBinding(Object _bindingComponent, View _root, int _localFieldCount,
      MaterialButton btnClose, IncrementalView incrementalViewStudentCount,
      TextInputLayout inputPoints, TextInputEditText noOfStudents,
      CircularProgressIndicator progress, CustomTextViewRegular tvDesc,
      CustomTextViewMedium tvHeader) {
    super(_bindingComponent, _root, _localFieldCount);
    this.btnClose = btnClose;
    this.incrementalViewStudentCount = incrementalViewStudentCount;
    this.inputPoints = inputPoints;
    this.noOfStudents = noOfStudents;
    this.progress = progress;
    this.tvDesc = tvDesc;
    this.tvHeader = tvHeader;
  }

  public abstract void setViewModel(@Nullable AddAnswerViewModel viewModel);

  @Nullable
  public AddAnswerViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static GivePointsSheetBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.give_points_sheet, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static GivePointsSheetBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<GivePointsSheetBinding>inflateInternal(inflater, R.layout.give_points_sheet, root, attachToRoot, component);
  }

  @NonNull
  public static GivePointsSheetBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.give_points_sheet, null, false, component)
   */
  @NonNull
  @Deprecated
  public static GivePointsSheetBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<GivePointsSheetBinding>inflateInternal(inflater, R.layout.give_points_sheet, null, false, component);
  }

  public static GivePointsSheetBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static GivePointsSheetBinding bind(@NonNull View view, @Nullable Object component) {
    return (GivePointsSheetBinding)bind(component, view, R.layout.give_points_sheet);
  }
}
