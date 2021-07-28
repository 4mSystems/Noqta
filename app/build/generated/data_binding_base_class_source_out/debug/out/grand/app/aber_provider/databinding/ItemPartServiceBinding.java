// Generated by data binding compiler. Do not edit!
package grand.app.aber_provider.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatRatingBar;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import grand.app.aber_provider.R;
import grand.app.aber_provider.customViews.views.CustomTextViewMedium;
import grand.app.aber_provider.pages.profile.viewModels.ItemPeopleViewModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ItemPartServiceBinding extends ViewDataBinding {
  @NonNull
  public final AppCompatImageView icPartsImage;

  @NonNull
  public final CustomTextViewMedium tvPartsName;

  @NonNull
  public final CustomTextViewMedium tvPartsPrice;

  @NonNull
  public final AppCompatImageView ucFavorite;

  @NonNull
  public final AppCompatRatingBar userItemCode;

  @Bindable
  protected ItemPeopleViewModel mItemViewModel;

  protected ItemPartServiceBinding(Object _bindingComponent, View _root, int _localFieldCount,
      AppCompatImageView icPartsImage, CustomTextViewMedium tvPartsName,
      CustomTextViewMedium tvPartsPrice, AppCompatImageView ucFavorite,
      AppCompatRatingBar userItemCode) {
    super(_bindingComponent, _root, _localFieldCount);
    this.icPartsImage = icPartsImage;
    this.tvPartsName = tvPartsName;
    this.tvPartsPrice = tvPartsPrice;
    this.ucFavorite = ucFavorite;
    this.userItemCode = userItemCode;
  }

  public abstract void setItemViewModel(@Nullable ItemPeopleViewModel itemViewModel);

  @Nullable
  public ItemPeopleViewModel getItemViewModel() {
    return mItemViewModel;
  }

  @NonNull
  public static ItemPartServiceBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_part_service, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ItemPartServiceBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ItemPartServiceBinding>inflateInternal(inflater, R.layout.item_part_service, root, attachToRoot, component);
  }

  @NonNull
  public static ItemPartServiceBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_part_service, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ItemPartServiceBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ItemPartServiceBinding>inflateInternal(inflater, R.layout.item_part_service, null, false, component);
  }

  public static ItemPartServiceBinding bind(@NonNull View view) {
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
  public static ItemPartServiceBinding bind(@NonNull View view, @Nullable Object component) {
    return (ItemPartServiceBinding)bind(component, view, R.layout.item_part_service);
  }
}