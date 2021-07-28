// Generated by data binding compiler. Do not edit!
package grand.app.aber_provider.databinding;

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
import com.google.android.material.button.MaterialButton;
import grand.app.aber_provider.R;
import grand.app.aber_provider.customViews.views.CustomTextViewMedium;
import grand.app.aber_provider.pages.profile.viewModels.ItemPeopleViewModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ItemOrderDetailBinding extends ViewDataBinding {
  @NonNull
  public final Barrier br;

  @NonNull
  public final MaterialButton btnCount;

  @NonNull
  public final AppCompatImageView icPartsImage;

  @NonNull
  public final CustomTextViewMedium tvPartsName;

  @NonNull
  public final CustomTextViewMedium tvPartsPrice;

  @Bindable
  protected ItemPeopleViewModel mItemViewModel;

  protected ItemOrderDetailBinding(Object _bindingComponent, View _root, int _localFieldCount,
      Barrier br, MaterialButton btnCount, AppCompatImageView icPartsImage,
      CustomTextViewMedium tvPartsName, CustomTextViewMedium tvPartsPrice) {
    super(_bindingComponent, _root, _localFieldCount);
    this.br = br;
    this.btnCount = btnCount;
    this.icPartsImage = icPartsImage;
    this.tvPartsName = tvPartsName;
    this.tvPartsPrice = tvPartsPrice;
  }

  public abstract void setItemViewModel(@Nullable ItemPeopleViewModel itemViewModel);

  @Nullable
  public ItemPeopleViewModel getItemViewModel() {
    return mItemViewModel;
  }

  @NonNull
  public static ItemOrderDetailBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_order_detail, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ItemOrderDetailBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ItemOrderDetailBinding>inflateInternal(inflater, R.layout.item_order_detail, root, attachToRoot, component);
  }

  @NonNull
  public static ItemOrderDetailBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_order_detail, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ItemOrderDetailBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ItemOrderDetailBinding>inflateInternal(inflater, R.layout.item_order_detail, null, false, component);
  }

  public static ItemOrderDetailBinding bind(@NonNull View view) {
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
  public static ItemOrderDetailBinding bind(@NonNull View view, @Nullable Object component) {
    return (ItemOrderDetailBinding)bind(component, view, R.layout.item_order_detail);
  }
}