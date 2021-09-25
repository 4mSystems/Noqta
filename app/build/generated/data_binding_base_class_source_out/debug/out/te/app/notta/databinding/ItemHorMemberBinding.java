// Generated by data binding compiler. Do not edit!
package te.app.notta.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.makeramen.roundedimageview.RoundedImageView;
import java.lang.Deprecated;
import java.lang.Object;
import te.app.notta.R;
import te.app.notta.pages.home.viewModels.ItemGroupStudentViewModel;

public abstract class ItemHorMemberBinding extends ViewDataBinding {
  @NonNull
  public final RoundedImageView tvMember;

  @Bindable
  protected ItemGroupStudentViewModel mViewModel;

  protected ItemHorMemberBinding(Object _bindingComponent, View _root, int _localFieldCount,
      RoundedImageView tvMember) {
    super(_bindingComponent, _root, _localFieldCount);
    this.tvMember = tvMember;
  }

  public abstract void setViewModel(@Nullable ItemGroupStudentViewModel viewModel);

  @Nullable
  public ItemGroupStudentViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static ItemHorMemberBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_hor_member, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ItemHorMemberBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ItemHorMemberBinding>inflateInternal(inflater, R.layout.item_hor_member, root, attachToRoot, component);
  }

  @NonNull
  public static ItemHorMemberBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_hor_member, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ItemHorMemberBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ItemHorMemberBinding>inflateInternal(inflater, R.layout.item_hor_member, null, false, component);
  }

  public static ItemHorMemberBinding bind(@NonNull View view) {
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
  public static ItemHorMemberBinding bind(@NonNull View view, @Nullable Object component) {
    return (ItemHorMemberBinding)bind(component, view, R.layout.item_hor_member);
  }
}
