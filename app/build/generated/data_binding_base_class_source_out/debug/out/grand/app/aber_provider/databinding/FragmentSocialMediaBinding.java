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
import grand.app.aber_provider.pages.settings.viewModels.MyAccountSettingsViewModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentSocialMediaBinding extends ViewDataBinding {
  @NonNull
  public final AppCompatImageView curve;

  @NonNull
  public final AppCompatImageView imgRegister;

  @Bindable
  protected MyAccountSettingsViewModel mViewmodel;

  protected FragmentSocialMediaBinding(Object _bindingComponent, View _root, int _localFieldCount,
      AppCompatImageView curve, AppCompatImageView imgRegister) {
    super(_bindingComponent, _root, _localFieldCount);
    this.curve = curve;
    this.imgRegister = imgRegister;
  }

  public abstract void setViewmodel(@Nullable MyAccountSettingsViewModel viewmodel);

  @Nullable
  public MyAccountSettingsViewModel getViewmodel() {
    return mViewmodel;
  }

  @NonNull
  public static FragmentSocialMediaBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_social_media, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentSocialMediaBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentSocialMediaBinding>inflateInternal(inflater, R.layout.fragment_social_media, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentSocialMediaBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_social_media, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentSocialMediaBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentSocialMediaBinding>inflateInternal(inflater, R.layout.fragment_social_media, null, false, component);
  }

  public static FragmentSocialMediaBinding bind(@NonNull View view) {
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
  public static FragmentSocialMediaBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentSocialMediaBinding)bind(component, view, R.layout.fragment_social_media);
  }
}
