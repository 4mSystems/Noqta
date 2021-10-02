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
import te.app.notta.pages.addAnswer.viewModels.ItemTaskMediaViewModel;

public abstract class ItemTaskMediaBinding extends ViewDataBinding {
  @NonNull
  public final RoundedImageView icUser;

  @Bindable
  protected ItemTaskMediaViewModel mViewModel;

  protected ItemTaskMediaBinding(Object _bindingComponent, View _root, int _localFieldCount,
      RoundedImageView icUser) {
    super(_bindingComponent, _root, _localFieldCount);
    this.icUser = icUser;
  }

  public abstract void setViewModel(@Nullable ItemTaskMediaViewModel viewModel);

  @Nullable
  public ItemTaskMediaViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static ItemTaskMediaBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_task_media, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ItemTaskMediaBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ItemTaskMediaBinding>inflateInternal(inflater, R.layout.item_task_media, root, attachToRoot, component);
  }

  @NonNull
  public static ItemTaskMediaBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_task_media, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ItemTaskMediaBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ItemTaskMediaBinding>inflateInternal(inflater, R.layout.item_task_media, null, false, component);
  }

  public static ItemTaskMediaBinding bind(@NonNull View view) {
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
  public static ItemTaskMediaBinding bind(@NonNull View view, @Nullable Object component) {
    return (ItemTaskMediaBinding)bind(component, view, R.layout.item_task_media);
  }
}
