// Generated by data binding compiler. Do not edit!
package grand.app.aber_provider.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import grand.app.aber_provider.R;
import grand.app.aber_provider.customViews.views.CustomTextViewMedium;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ChangeDialogBinding extends ViewDataBinding {
  @NonNull
  public final AppCompatImageView dialogHeader;

  @NonNull
  public final AppCompatButton optionCancel;

  @NonNull
  public final AppCompatButton optionDone;

  @NonNull
  public final CustomTextViewMedium rcFilter;

  protected ChangeDialogBinding(Object _bindingComponent, View _root, int _localFieldCount,
      AppCompatImageView dialogHeader, AppCompatButton optionCancel, AppCompatButton optionDone,
      CustomTextViewMedium rcFilter) {
    super(_bindingComponent, _root, _localFieldCount);
    this.dialogHeader = dialogHeader;
    this.optionCancel = optionCancel;
    this.optionDone = optionDone;
    this.rcFilter = rcFilter;
  }

  @NonNull
  public static ChangeDialogBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.change_dialog, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ChangeDialogBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ChangeDialogBinding>inflateInternal(inflater, R.layout.change_dialog, root, attachToRoot, component);
  }

  @NonNull
  public static ChangeDialogBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.change_dialog, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ChangeDialogBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ChangeDialogBinding>inflateInternal(inflater, R.layout.change_dialog, null, false, component);
  }

  public static ChangeDialogBinding bind(@NonNull View view) {
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
  public static ChangeDialogBinding bind(@NonNull View view, @Nullable Object component) {
    return (ChangeDialogBinding)bind(component, view, R.layout.change_dialog);
  }
}
