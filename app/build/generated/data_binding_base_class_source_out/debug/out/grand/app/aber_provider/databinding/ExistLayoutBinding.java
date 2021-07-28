// Generated by data binding compiler. Do not edit!
package grand.app.aber_provider.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import de.hdodenhof.circleimageview.CircleImageView;
import grand.app.aber_provider.R;
import grand.app.aber_provider.customViews.views.CustomTextViewMedium;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ExistLayoutBinding extends ViewDataBinding {
  @NonNull
  public final CustomTextViewMedium agree;

  @NonNull
  public final CustomTextViewMedium decline;

  @NonNull
  public final CircleImageView ivLogoutDialogIcon;

  @NonNull
  public final CustomTextViewMedium logoutTxt;

  protected ExistLayoutBinding(Object _bindingComponent, View _root, int _localFieldCount,
      CustomTextViewMedium agree, CustomTextViewMedium decline, CircleImageView ivLogoutDialogIcon,
      CustomTextViewMedium logoutTxt) {
    super(_bindingComponent, _root, _localFieldCount);
    this.agree = agree;
    this.decline = decline;
    this.ivLogoutDialogIcon = ivLogoutDialogIcon;
    this.logoutTxt = logoutTxt;
  }

  @NonNull
  public static ExistLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.exist_layout, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ExistLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ExistLayoutBinding>inflateInternal(inflater, R.layout.exist_layout, root, attachToRoot, component);
  }

  @NonNull
  public static ExistLayoutBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.exist_layout, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ExistLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ExistLayoutBinding>inflateInternal(inflater, R.layout.exist_layout, null, false, component);
  }

  public static ExistLayoutBinding bind(@NonNull View view) {
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
  public static ExistLayoutBinding bind(@NonNull View view, @Nullable Object component) {
    return (ExistLayoutBinding)bind(component, view, R.layout.exist_layout);
  }
}