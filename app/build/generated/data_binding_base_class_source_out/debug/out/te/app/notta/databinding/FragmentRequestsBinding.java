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
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.lang.Deprecated;
import java.lang.Object;
import te.app.notta.R;
import te.app.notta.customViews.views.CustomTextViewMedium;
import te.app.notta.pages.groupDetails.viewModels.GroupDetailsViewModel;

public abstract class FragmentRequestsBinding extends ViewDataBinding {
  @NonNull
  public final FloatingActionButton back;

  @NonNull
  public final AppCompatImageView boardHeader;

  @NonNull
  public final RecyclerView rcMembers;

  @NonNull
  public final CustomTextViewMedium tvProfileTitle;

  @Bindable
  protected GroupDetailsViewModel mViewmodel;

  protected FragmentRequestsBinding(Object _bindingComponent, View _root, int _localFieldCount,
      FloatingActionButton back, AppCompatImageView boardHeader, RecyclerView rcMembers,
      CustomTextViewMedium tvProfileTitle) {
    super(_bindingComponent, _root, _localFieldCount);
    this.back = back;
    this.boardHeader = boardHeader;
    this.rcMembers = rcMembers;
    this.tvProfileTitle = tvProfileTitle;
  }

  public abstract void setViewmodel(@Nullable GroupDetailsViewModel viewmodel);

  @Nullable
  public GroupDetailsViewModel getViewmodel() {
    return mViewmodel;
  }

  @NonNull
  public static FragmentRequestsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_requests, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentRequestsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentRequestsBinding>inflateInternal(inflater, R.layout.fragment_requests, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentRequestsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_requests, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentRequestsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentRequestsBinding>inflateInternal(inflater, R.layout.fragment_requests, null, false, component);
  }

  public static FragmentRequestsBinding bind(@NonNull View view) {
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
  public static FragmentRequestsBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentRequestsBinding)bind(component, view, R.layout.fragment_requests);
  }
}
