// Generated by data binding compiler. Do not edit!
package te.app.nottaa.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.Deprecated;
import java.lang.Object;
import te.app.nottaa.R;
import te.app.nottaa.customViews.views.CustomTextViewMedium;
import te.app.nottaa.pages.auth.login.LoginViewModel;

public abstract class FragmentLoginBinding extends ViewDataBinding {
  @NonNull
  public final AppCompatImageView boardHeader;

  @NonNull
  public final AppCompatButton btnPhone;

  @NonNull
  public final TextInputLayout inputPhone;

  @NonNull
  public final TextInputLayout inputRegisterPassword;

  @NonNull
  public final CustomTextViewMedium login;

  @NonNull
  public final CustomTextViewMedium loginHeader;

  @NonNull
  public final CustomTextViewMedium loginNoAccount;

  @NonNull
  public final CustomTextViewMedium loginNoAccountBold;

  @NonNull
  public final CircularProgressIndicator progress;

  @NonNull
  public final CustomTextViewMedium tvLoginForget;

  @Bindable
  protected LoginViewModel mViewmodel;

  protected FragmentLoginBinding(Object _bindingComponent, View _root, int _localFieldCount,
      AppCompatImageView boardHeader, AppCompatButton btnPhone, TextInputLayout inputPhone,
      TextInputLayout inputRegisterPassword, CustomTextViewMedium login,
      CustomTextViewMedium loginHeader, CustomTextViewMedium loginNoAccount,
      CustomTextViewMedium loginNoAccountBold, CircularProgressIndicator progress,
      CustomTextViewMedium tvLoginForget) {
    super(_bindingComponent, _root, _localFieldCount);
    this.boardHeader = boardHeader;
    this.btnPhone = btnPhone;
    this.inputPhone = inputPhone;
    this.inputRegisterPassword = inputRegisterPassword;
    this.login = login;
    this.loginHeader = loginHeader;
    this.loginNoAccount = loginNoAccount;
    this.loginNoAccountBold = loginNoAccountBold;
    this.progress = progress;
    this.tvLoginForget = tvLoginForget;
  }

  public abstract void setViewmodel(@Nullable LoginViewModel viewmodel);

  @Nullable
  public LoginViewModel getViewmodel() {
    return mViewmodel;
  }

  @NonNull
  public static FragmentLoginBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_login, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentLoginBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentLoginBinding>inflateInternal(inflater, R.layout.fragment_login, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentLoginBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_login, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentLoginBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentLoginBinding>inflateInternal(inflater, R.layout.fragment_login, null, false, component);
  }

  public static FragmentLoginBinding bind(@NonNull View view) {
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
  public static FragmentLoginBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentLoginBinding)bind(component, view, R.layout.fragment_login);
  }
}
