// Generated by data binding compiler. Do not edit!
package grand.app.aber_provider.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import grand.app.aber_provider.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class LayoutGrandBinding extends ViewDataBinding {
  @NonNull
  public final AppCompatImageView imgGrandClose;

  @NonNull
  public final RelativeLayout rlGrandCall;

  @NonNull
  public final RelativeLayout rlGrandWhats;

  @NonNull
  public final TextView tvGrandPhone;

  @NonNull
  public final TextView tvGrandUrl;

  protected LayoutGrandBinding(Object _bindingComponent, View _root, int _localFieldCount,
      AppCompatImageView imgGrandClose, RelativeLayout rlGrandCall, RelativeLayout rlGrandWhats,
      TextView tvGrandPhone, TextView tvGrandUrl) {
    super(_bindingComponent, _root, _localFieldCount);
    this.imgGrandClose = imgGrandClose;
    this.rlGrandCall = rlGrandCall;
    this.rlGrandWhats = rlGrandWhats;
    this.tvGrandPhone = tvGrandPhone;
    this.tvGrandUrl = tvGrandUrl;
  }

  @NonNull
  public static LayoutGrandBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.layout_grand, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static LayoutGrandBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<LayoutGrandBinding>inflateInternal(inflater, R.layout.layout_grand, root, attachToRoot, component);
  }

  @NonNull
  public static LayoutGrandBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.layout_grand, null, false, component)
   */
  @NonNull
  @Deprecated
  public static LayoutGrandBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<LayoutGrandBinding>inflateInternal(inflater, R.layout.layout_grand, null, false, component);
  }

  public static LayoutGrandBinding bind(@NonNull View view) {
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
  public static LayoutGrandBinding bind(@NonNull View view, @Nullable Object component) {
    return (LayoutGrandBinding)bind(component, view, R.layout.layout_grand);
  }
}