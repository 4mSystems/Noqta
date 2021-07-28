// Generated by data binding compiler. Do not edit!
package grand.app.aber_provider.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import grand.app.aber_provider.R;
import grand.app.aber_provider.customViews.views.CustomTextViewRegular;
import grand.app.aber_provider.pages.postDetails.viewModels.ItemCommentsViewModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ItemRequiredServiceBinding extends ViewDataBinding {
  @NonNull
  public final CustomTextViewRegular tvName;

  @NonNull
  public final View vChoosenOrder;

  @Bindable
  protected ItemCommentsViewModel mItemViewModel;

  protected ItemRequiredServiceBinding(Object _bindingComponent, View _root, int _localFieldCount,
      CustomTextViewRegular tvName, View vChoosenOrder) {
    super(_bindingComponent, _root, _localFieldCount);
    this.tvName = tvName;
    this.vChoosenOrder = vChoosenOrder;
  }

  public abstract void setItemViewModel(@Nullable ItemCommentsViewModel itemViewModel);

  @Nullable
  public ItemCommentsViewModel getItemViewModel() {
    return mItemViewModel;
  }

  @NonNull
  public static ItemRequiredServiceBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_required_service, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ItemRequiredServiceBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ItemRequiredServiceBinding>inflateInternal(inflater, R.layout.item_required_service, root, attachToRoot, component);
  }

  @NonNull
  public static ItemRequiredServiceBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_required_service, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ItemRequiredServiceBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ItemRequiredServiceBinding>inflateInternal(inflater, R.layout.item_required_service, null, false, component);
  }

  public static ItemRequiredServiceBinding bind(@NonNull View view) {
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
  public static ItemRequiredServiceBinding bind(@NonNull View view, @Nullable Object component) {
    return (ItemRequiredServiceBinding)bind(component, view, R.layout.item_required_service);
  }
}