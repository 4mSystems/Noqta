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
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.google.android.material.textfield.TextInputEditText;
import java.lang.Deprecated;
import java.lang.Object;
import te.app.notta.R;
import te.app.notta.customViews.views.CustomTextViewMedium;
import te.app.notta.pages.teacher.viewModels.AddGroupViewModel;

public abstract class FragmentInviteStudentBinding extends ViewDataBinding {
  @NonNull
  public final MaterialButton btnClose;

  @NonNull
  public final AppCompatImageView dialogHeader;

  @NonNull
  public final TextInputEditText inputSearch;

  @NonNull
  public final CircularProgressIndicator progress;

  @NonNull
  public final CustomTextViewMedium rcFilter;

  @NonNull
  public final RecyclerView rcStudents;

  @Bindable
  protected AddGroupViewModel mViewModel;

  protected FragmentInviteStudentBinding(Object _bindingComponent, View _root, int _localFieldCount,
      MaterialButton btnClose, AppCompatImageView dialogHeader, TextInputEditText inputSearch,
      CircularProgressIndicator progress, CustomTextViewMedium rcFilter, RecyclerView rcStudents) {
    super(_bindingComponent, _root, _localFieldCount);
    this.btnClose = btnClose;
    this.dialogHeader = dialogHeader;
    this.inputSearch = inputSearch;
    this.progress = progress;
    this.rcFilter = rcFilter;
    this.rcStudents = rcStudents;
  }

  public abstract void setViewModel(@Nullable AddGroupViewModel viewModel);

  @Nullable
  public AddGroupViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static FragmentInviteStudentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_invite_student, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentInviteStudentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentInviteStudentBinding>inflateInternal(inflater, R.layout.fragment_invite_student, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentInviteStudentBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_invite_student, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentInviteStudentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentInviteStudentBinding>inflateInternal(inflater, R.layout.fragment_invite_student, null, false, component);
  }

  public static FragmentInviteStudentBinding bind(@NonNull View view) {
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
  public static FragmentInviteStudentBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentInviteStudentBinding)bind(component, view, R.layout.fragment_invite_student);
  }
}
