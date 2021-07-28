// Generated by data binding compiler. Do not edit!
package grand.app.aber_provider.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import grand.app.aber_provider.R;
import grand.app.aber_provider.pages.profile.viewModels.ProfileViewModels;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentServicesOrdersBinding extends ViewDataBinding {
  @NonNull
  public final AppCompatImageView curve;

  @NonNull
  public final RecyclerView frameProfile;

  @NonNull
  public final RecyclerView rcServices;

  @Bindable
  protected ProfileViewModels mViewModel;

  protected FragmentServicesOrdersBinding(Object _bindingComponent, View _root,
      int _localFieldCount, AppCompatImageView curve, RecyclerView frameProfile,
      RecyclerView rcServices) {
    super(_bindingComponent, _root, _localFieldCount);
    this.curve = curve;
    this.frameProfile = frameProfile;
    this.rcServices = rcServices;
  }

  public abstract void setViewModel(@Nullable ProfileViewModels viewModel);

  @Nullable
  public ProfileViewModels getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static FragmentServicesOrdersBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_services_orders, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentServicesOrdersBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentServicesOrdersBinding>inflateInternal(inflater, R.layout.fragment_services_orders, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentServicesOrdersBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_services_orders, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentServicesOrdersBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentServicesOrdersBinding>inflateInternal(inflater, R.layout.fragment_services_orders, null, false, component);
  }

  public static FragmentServicesOrdersBinding bind(@NonNull View view) {
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
  public static FragmentServicesOrdersBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentServicesOrdersBinding)bind(component, view, R.layout.fragment_services_orders);
  }
}
