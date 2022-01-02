// Generated by data binding compiler. Do not edit!
package te.app.nottaa.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.Barrier;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.checkbox.MaterialCheckBox;
import de.hdodenhof.circleimageview.CircleImageView;
import java.lang.Deprecated;
import java.lang.Object;
import te.app.nottaa.R;
import te.app.nottaa.customViews.views.CustomTextViewMedium;
import te.app.nottaa.pages.teacher.viewModels.ItemStudentInviteViewModel;

public abstract class ItemStudentInviteBinding extends ViewDataBinding {
  @NonNull
  public final Barrier br5;

  @NonNull
  public final MaterialCheckBox checkbox;

  @NonNull
  public final CircleImageView tvMember;

  @NonNull
  public final CustomTextViewMedium tvTeacherName;

  @Bindable
  protected ItemStudentInviteViewModel mViewModel;

  protected ItemStudentInviteBinding(Object _bindingComponent, View _root, int _localFieldCount,
      Barrier br5, MaterialCheckBox checkbox, CircleImageView tvMember,
      CustomTextViewMedium tvTeacherName) {
    super(_bindingComponent, _root, _localFieldCount);
    this.br5 = br5;
    this.checkbox = checkbox;
    this.tvMember = tvMember;
    this.tvTeacherName = tvTeacherName;
  }

  public abstract void setViewModel(@Nullable ItemStudentInviteViewModel viewModel);

  @Nullable
  public ItemStudentInviteViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static ItemStudentInviteBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_student_invite, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ItemStudentInviteBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ItemStudentInviteBinding>inflateInternal(inflater, R.layout.item_student_invite, root, attachToRoot, component);
  }

  @NonNull
  public static ItemStudentInviteBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_student_invite, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ItemStudentInviteBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ItemStudentInviteBinding>inflateInternal(inflater, R.layout.item_student_invite, null, false, component);
  }

  public static ItemStudentInviteBinding bind(@NonNull View view) {
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
  public static ItemStudentInviteBinding bind(@NonNull View view, @Nullable Object component) {
    return (ItemStudentInviteBinding)bind(component, view, R.layout.item_student_invite);
  }
}
