// Generated by data binding compiler. Do not edit!
package te.app.notta.databinding;

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
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import de.hdodenhof.circleimageview.CircleImageView;
import java.lang.Deprecated;
import java.lang.Object;
import te.app.notta.R;
import te.app.notta.customViews.views.CustomTextViewMedium;
import te.app.notta.pages.auth.register.RegisterViewModel;

public abstract class FragmentEditProfileBinding extends ViewDataBinding {
  @NonNull
  public final AppCompatButton appCompatButtonNext;

  @NonNull
  public final TextInputEditText auto;

  @NonNull
  public final AppCompatImageView boardHeader;

  @NonNull
  public final TextInputLayout inputEmail;

  @NonNull
  public final TextInputLayout inputName;

  @NonNull
  public final TextInputLayout inputPassword;

  @NonNull
  public final CircleImageView memberProfile;

  @NonNull
  public final CircularProgressIndicator progress;

  @NonNull
  public final CustomTextViewMedium tvProfileTitle;

  @Bindable
  protected RegisterViewModel mViewmodel;

  protected FragmentEditProfileBinding(Object _bindingComponent, View _root, int _localFieldCount,
      AppCompatButton appCompatButtonNext, TextInputEditText auto, AppCompatImageView boardHeader,
      TextInputLayout inputEmail, TextInputLayout inputName, TextInputLayout inputPassword,
      CircleImageView memberProfile, CircularProgressIndicator progress,
      CustomTextViewMedium tvProfileTitle) {
    super(_bindingComponent, _root, _localFieldCount);
    this.appCompatButtonNext = appCompatButtonNext;
    this.auto = auto;
    this.boardHeader = boardHeader;
    this.inputEmail = inputEmail;
    this.inputName = inputName;
    this.inputPassword = inputPassword;
    this.memberProfile = memberProfile;
    this.progress = progress;
    this.tvProfileTitle = tvProfileTitle;
  }

  public abstract void setViewmodel(@Nullable RegisterViewModel viewmodel);

  @Nullable
  public RegisterViewModel getViewmodel() {
    return mViewmodel;
  }

  @NonNull
  public static FragmentEditProfileBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_edit_profile, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentEditProfileBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentEditProfileBinding>inflateInternal(inflater, R.layout.fragment_edit_profile, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentEditProfileBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_edit_profile, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentEditProfileBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentEditProfileBinding>inflateInternal(inflater, R.layout.fragment_edit_profile, null, false, component);
  }

  public static FragmentEditProfileBinding bind(@NonNull View view) {
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
  public static FragmentEditProfileBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentEditProfileBinding)bind(component, view, R.layout.fragment_edit_profile);
  }
}