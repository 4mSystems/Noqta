// Generated by data binding compiler. Do not edit!
package te.app.notta.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import java.lang.Deprecated;
import java.lang.Object;
import te.app.notta.R;
import te.app.notta.customViews.views.CustomTextViewMedium;
import te.app.notta.pages.home.viewModels.ItemHomeViewModel;

public abstract class ItemProfileBinding extends ViewDataBinding {
  @NonNull
  public final AppCompatImageView icUser;

  @NonNull
  public final CustomTextViewMedium tvGroupName;

  @Bindable
  protected ItemHomeViewModel mViewModel;

  protected ItemProfileBinding(Object _bindingComponent, View _root, int _localFieldCount,
      AppCompatImageView icUser, CustomTextViewMedium tvGroupName) {
    super(_bindingComponent, _root, _localFieldCount);
    this.icUser = icUser;
    this.tvGroupName = tvGroupName;
  }

  public abstract void setViewModel(@Nullable ItemHomeViewModel viewModel);

  @Nullable
  public ItemHomeViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static ItemProfileBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_profile, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ItemProfileBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ItemProfileBinding>inflateInternal(inflater, R.layout.item_profile, root, attachToRoot, component);
  }

  @NonNull
  public static ItemProfileBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_profile, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ItemProfileBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ItemProfileBinding>inflateInternal(inflater, R.layout.item_profile, null, false, component);
  }

  public static ItemProfileBinding bind(@NonNull View view) {
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
  public static ItemProfileBinding bind(@NonNull View view, @Nullable Object component) {
    return (ItemProfileBinding)bind(component, view, R.layout.item_profile);
  }
}
