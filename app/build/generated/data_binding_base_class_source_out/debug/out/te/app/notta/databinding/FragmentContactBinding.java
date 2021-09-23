// Generated by data binding compiler. Do not edit!
package te.app.notta.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.cardview.widget.CardView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.Deprecated;
import java.lang.Object;
import te.app.notta.R;
import te.app.notta.customViews.views.CustomTextViewMedium;
import te.app.notta.pages.settings.viewModels.SettingsViewModel;

public abstract class FragmentContactBinding extends ViewDataBinding {
  @NonNull
  public final AppCompatButton appCompatButtonNext;

  @NonNull
  public final AppCompatImageView icLogo;

  @NonNull
  public final AppCompatImageView imgLoginHeader;

  @NonNull
  public final TextInputLayout inputContactMessage;

  @NonNull
  public final TextInputLayout inputName;

  @NonNull
  public final TextInputLayout inputRegisterEmail;

  @NonNull
  public final TextInputLayout inputRegisterPhone;

  @NonNull
  public final CardView loginContainer;

  @NonNull
  public final CustomTextViewMedium tvAboutTitle;

  @Bindable
  protected SettingsViewModel mViewmodel;

  protected FragmentContactBinding(Object _bindingComponent, View _root, int _localFieldCount,
      AppCompatButton appCompatButtonNext, AppCompatImageView icLogo,
      AppCompatImageView imgLoginHeader, TextInputLayout inputContactMessage,
      TextInputLayout inputName, TextInputLayout inputRegisterEmail,
      TextInputLayout inputRegisterPhone, CardView loginContainer,
      CustomTextViewMedium tvAboutTitle) {
    super(_bindingComponent, _root, _localFieldCount);
    this.appCompatButtonNext = appCompatButtonNext;
    this.icLogo = icLogo;
    this.imgLoginHeader = imgLoginHeader;
    this.inputContactMessage = inputContactMessage;
    this.inputName = inputName;
    this.inputRegisterEmail = inputRegisterEmail;
    this.inputRegisterPhone = inputRegisterPhone;
    this.loginContainer = loginContainer;
    this.tvAboutTitle = tvAboutTitle;
  }

  public abstract void setViewmodel(@Nullable SettingsViewModel viewmodel);

  @Nullable
  public SettingsViewModel getViewmodel() {
    return mViewmodel;
  }

  @NonNull
  public static FragmentContactBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_contact, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentContactBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentContactBinding>inflateInternal(inflater, R.layout.fragment_contact, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentContactBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_contact, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentContactBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentContactBinding>inflateInternal(inflater, R.layout.fragment_contact, null, false, component);
  }

  public static FragmentContactBinding bind(@NonNull View view) {
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
  public static FragmentContactBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentContactBinding)bind(component, view, R.layout.fragment_contact);
  }
}
