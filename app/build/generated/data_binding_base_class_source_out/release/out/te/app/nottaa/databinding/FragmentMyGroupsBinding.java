// Generated by data binding compiler. Do not edit!
package te.app.nottaa.databinding;

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
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import java.lang.Deprecated;
import java.lang.Object;
import te.app.nottaa.R;
import te.app.nottaa.customViews.views.CustomTextViewMedium;
import te.app.nottaa.pages.myGroups.viewModels.MyGroupsViewModel;

public abstract class FragmentMyGroupsBinding extends ViewDataBinding {
  @NonNull
  public final FloatingActionButton back;

  @NonNull
  public final AppCompatImageView boardHeader;

  @NonNull
  public final CircularProgressIndicator progress;

  @NonNull
  public final RecyclerView rcGroups;

  @NonNull
  public final CustomTextViewMedium tvProfileTitle;

  @Bindable
  protected MyGroupsViewModel mViewmodel;

  protected FragmentMyGroupsBinding(Object _bindingComponent, View _root, int _localFieldCount,
      FloatingActionButton back, AppCompatImageView boardHeader, CircularProgressIndicator progress,
      RecyclerView rcGroups, CustomTextViewMedium tvProfileTitle) {
    super(_bindingComponent, _root, _localFieldCount);
    this.back = back;
    this.boardHeader = boardHeader;
    this.progress = progress;
    this.rcGroups = rcGroups;
    this.tvProfileTitle = tvProfileTitle;
  }

  public abstract void setViewmodel(@Nullable MyGroupsViewModel viewmodel);

  @Nullable
  public MyGroupsViewModel getViewmodel() {
    return mViewmodel;
  }

  @NonNull
  public static FragmentMyGroupsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_my_groups, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentMyGroupsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentMyGroupsBinding>inflateInternal(inflater, R.layout.fragment_my_groups, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentMyGroupsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_my_groups, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentMyGroupsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentMyGroupsBinding>inflateInternal(inflater, R.layout.fragment_my_groups, null, false, component);
  }

  public static FragmentMyGroupsBinding bind(@NonNull View view) {
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
  public static FragmentMyGroupsBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentMyGroupsBinding)bind(component, view, R.layout.fragment_my_groups);
  }
}