// Generated by data binding compiler. Do not edit!
package te.app.notta.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.Barrier;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.makeramen.roundedimageview.RoundedImageView;
import java.lang.Deprecated;
import java.lang.Object;
import te.app.notta.R;
import te.app.notta.customViews.views.CustomTextViewMedium;
import te.app.notta.customViews.views.CustomTextViewRegular;
import te.app.notta.pages.points.viewModels.ItemPointsViewModel;

public abstract class ItemPointsBinding extends ViewDataBinding {
  @NonNull
  public final Barrier br2;

  @NonNull
  public final AppCompatImageView icDelete;

  @NonNull
  public final RoundedImageView icUser;

  @NonNull
  public final CustomTextViewRegular tvDescPoint;

  @NonNull
  public final CustomTextViewMedium tvGroupName;

  @NonNull
  public final CustomTextViewRegular tvPoints;

  @Bindable
  protected ItemPointsViewModel mViewModel;

  protected ItemPointsBinding(Object _bindingComponent, View _root, int _localFieldCount,
      Barrier br2, AppCompatImageView icDelete, RoundedImageView icUser,
      CustomTextViewRegular tvDescPoint, CustomTextViewMedium tvGroupName,
      CustomTextViewRegular tvPoints) {
    super(_bindingComponent, _root, _localFieldCount);
    this.br2 = br2;
    this.icDelete = icDelete;
    this.icUser = icUser;
    this.tvDescPoint = tvDescPoint;
    this.tvGroupName = tvGroupName;
    this.tvPoints = tvPoints;
  }

  public abstract void setViewModel(@Nullable ItemPointsViewModel viewModel);

  @Nullable
  public ItemPointsViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static ItemPointsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_points, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ItemPointsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ItemPointsBinding>inflateInternal(inflater, R.layout.item_points, root, attachToRoot, component);
  }

  @NonNull
  public static ItemPointsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_points, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ItemPointsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ItemPointsBinding>inflateInternal(inflater, R.layout.item_points, null, false, component);
  }

  public static ItemPointsBinding bind(@NonNull View view) {
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
  public static ItemPointsBinding bind(@NonNull View view, @Nullable Object component) {
    return (ItemPointsBinding)bind(component, view, R.layout.item_points);
  }
}
