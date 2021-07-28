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
import grand.app.aber_provider.R;
import grand.app.aber_provider.customViews.views.CustomTextViewRegular;
import grand.app.aber_provider.pages.settings.viewModels.SettingsViewModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentTermsBinding extends ViewDataBinding {
  @NonNull
  public final AppCompatImageView curve;

  @NonNull
  public final AppCompatImageView imgRegister;

  @NonNull
  public final CustomTextViewRegular text;

  @Bindable
  protected SettingsViewModel mViewmodel;

  protected FragmentTermsBinding(Object _bindingComponent, View _root, int _localFieldCount,
      AppCompatImageView curve, AppCompatImageView imgRegister, CustomTextViewRegular text) {
    super(_bindingComponent, _root, _localFieldCount);
    this.curve = curve;
    this.imgRegister = imgRegister;
    this.text = text;
  }

  public abstract void setViewmodel(@Nullable SettingsViewModel viewmodel);

  @Nullable
  public SettingsViewModel getViewmodel() {
    return mViewmodel;
  }

  @NonNull
  public static FragmentTermsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_terms, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentTermsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentTermsBinding>inflateInternal(inflater, R.layout.fragment_terms, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentTermsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_terms, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentTermsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentTermsBinding>inflateInternal(inflater, R.layout.fragment_terms, null, false, component);
  }

  public static FragmentTermsBinding bind(@NonNull View view) {
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
  public static FragmentTermsBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentTermsBinding)bind(component, view, R.layout.fragment_terms);
  }
}