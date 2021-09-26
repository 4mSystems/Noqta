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
import te.app.notta.pages.settings.viewModels.ItemProfileViewModel;

public abstract class ItemMoreBinding extends ViewDataBinding {
  @NonNull
  public final AppCompatImageView icon;

  @NonNull
  public final CustomTextViewMedium tvSettingItem;

  @NonNull
  public final View vLine;

  @Bindable
  protected ItemProfileViewModel mViewModel;

  protected ItemMoreBinding(Object _bindingComponent, View _root, int _localFieldCount,
      AppCompatImageView icon, CustomTextViewMedium tvSettingItem, View vLine) {
    super(_bindingComponent, _root, _localFieldCount);
    this.icon = icon;
    this.tvSettingItem = tvSettingItem;
    this.vLine = vLine;
  }

  public abstract void setViewModel(@Nullable ItemProfileViewModel viewModel);

  @Nullable
  public ItemProfileViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static ItemMoreBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_more, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ItemMoreBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ItemMoreBinding>inflateInternal(inflater, R.layout.item_more, root, attachToRoot, component);
  }

  @NonNull
  public static ItemMoreBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_more, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ItemMoreBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ItemMoreBinding>inflateInternal(inflater, R.layout.item_more, null, false, component);
  }

  public static ItemMoreBinding bind(@NonNull View view) {
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
  public static ItemMoreBinding bind(@NonNull View view, @Nullable Object component) {
    return (ItemMoreBinding)bind(component, view, R.layout.item_more);
  }
}
