// Generated by data binding compiler. Do not edit!
package te.app.nottaa.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.button.MaterialButton;
import java.lang.Deprecated;
import java.lang.Object;
import te.app.nottaa.R;
import te.app.nottaa.customViews.views.CustomTextViewMedium;
import te.app.nottaa.customViews.views.CustomTextViewRegular;

public abstract class SuccessSheetBinding extends ViewDataBinding {
  @NonNull
  public final MaterialButton btnClose;

  @NonNull
  public final AppCompatImageView dialogHeader;

  @NonNull
  public final CustomTextViewRegular tvDesc;

  @NonNull
  public final CustomTextViewMedium tvHeader;

  protected SuccessSheetBinding(Object _bindingComponent, View _root, int _localFieldCount,
      MaterialButton btnClose, AppCompatImageView dialogHeader, CustomTextViewRegular tvDesc,
      CustomTextViewMedium tvHeader) {
    super(_bindingComponent, _root, _localFieldCount);
    this.btnClose = btnClose;
    this.dialogHeader = dialogHeader;
    this.tvDesc = tvDesc;
    this.tvHeader = tvHeader;
  }

  @NonNull
  public static SuccessSheetBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.success_sheet, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static SuccessSheetBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<SuccessSheetBinding>inflateInternal(inflater, R.layout.success_sheet, root, attachToRoot, component);
  }

  @NonNull
  public static SuccessSheetBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.success_sheet, null, false, component)
   */
  @NonNull
  @Deprecated
  public static SuccessSheetBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<SuccessSheetBinding>inflateInternal(inflater, R.layout.success_sheet, null, false, component);
  }

  public static SuccessSheetBinding bind(@NonNull View view) {
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
  public static SuccessSheetBinding bind(@NonNull View view, @Nullable Object component) {
    return (SuccessSheetBinding)bind(component, view, R.layout.success_sheet);
  }
}
