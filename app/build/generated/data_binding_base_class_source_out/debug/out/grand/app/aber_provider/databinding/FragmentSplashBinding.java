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
import grand.app.aber_provider.pages.splash.SplashViewModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentSplashBinding extends ViewDataBinding {
  @Bindable
  protected SplashViewModel mViewmodel;

  protected FragmentSplashBinding(Object _bindingComponent, View _root, int _localFieldCount) {
    super(_bindingComponent, _root, _localFieldCount);
  }

  public abstract void setViewmodel(@Nullable SplashViewModel viewmodel);

  @Nullable
  public SplashViewModel getViewmodel() {
    return mViewmodel;
  }

  @NonNull
  public static FragmentSplashBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_splash, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentSplashBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentSplashBinding>inflateInternal(inflater, R.layout.fragment_splash, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentSplashBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_splash, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentSplashBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentSplashBinding>inflateInternal(inflater, R.layout.fragment_splash, null, false, component);
  }

  public static FragmentSplashBinding bind(@NonNull View view) {
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
  public static FragmentSplashBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentSplashBinding)bind(component, view, R.layout.fragment_splash);
  }
}