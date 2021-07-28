// Generated by data binding compiler. Do not edit!
package grand.app.aber_provider.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.chaos.view.PinView;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import grand.app.aber_provider.R;
import grand.app.aber_provider.customViews.views.CustomTextViewMedium;
import grand.app.aber_provider.customViews.views.CustomTextViewRegular;
import grand.app.aber_provider.pages.auth.confirmCode.ConfirmViewModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentConfirmCodeBinding extends ViewDataBinding {
  @NonNull
  public final AppCompatButton appCompatButtonNext;

  @NonNull
  public final AppCompatImageView back;

  @NonNull
  public final AppCompatImageView boardHeader;

  @NonNull
  public final TextView curve;

  @NonNull
  public final AppCompatImageView imgLoginLogo;

  @NonNull
  public final PinView pinValidate;

  @NonNull
  public final CircularProgressIndicator progress;

  @NonNull
  public final CustomTextViewRegular tvConfirmHeaderText;

  @NonNull
  public final CustomTextViewMedium tvForgetTimer;

  @NonNull
  public final CustomTextViewMedium tvLoginForget;

  @NonNull
  public final CustomTextViewMedium tvLoginTitle;

  @Bindable
  protected ConfirmViewModel mViewmodel;

  protected FragmentConfirmCodeBinding(Object _bindingComponent, View _root, int _localFieldCount,
      AppCompatButton appCompatButtonNext, AppCompatImageView back, AppCompatImageView boardHeader,
      TextView curve, AppCompatImageView imgLoginLogo, PinView pinValidate,
      CircularProgressIndicator progress, CustomTextViewRegular tvConfirmHeaderText,
      CustomTextViewMedium tvForgetTimer, CustomTextViewMedium tvLoginForget,
      CustomTextViewMedium tvLoginTitle) {
    super(_bindingComponent, _root, _localFieldCount);
    this.appCompatButtonNext = appCompatButtonNext;
    this.back = back;
    this.boardHeader = boardHeader;
    this.curve = curve;
    this.imgLoginLogo = imgLoginLogo;
    this.pinValidate = pinValidate;
    this.progress = progress;
    this.tvConfirmHeaderText = tvConfirmHeaderText;
    this.tvForgetTimer = tvForgetTimer;
    this.tvLoginForget = tvLoginForget;
    this.tvLoginTitle = tvLoginTitle;
  }

  public abstract void setViewmodel(@Nullable ConfirmViewModel viewmodel);

  @Nullable
  public ConfirmViewModel getViewmodel() {
    return mViewmodel;
  }

  @NonNull
  public static FragmentConfirmCodeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_confirm_code, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentConfirmCodeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentConfirmCodeBinding>inflateInternal(inflater, R.layout.fragment_confirm_code, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentConfirmCodeBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_confirm_code, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentConfirmCodeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentConfirmCodeBinding>inflateInternal(inflater, R.layout.fragment_confirm_code, null, false, component);
  }

  public static FragmentConfirmCodeBinding bind(@NonNull View view) {
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
  public static FragmentConfirmCodeBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentConfirmCodeBinding)bind(component, view, R.layout.fragment_confirm_code);
  }
}
