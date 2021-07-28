// Generated by data binding compiler. Do not edit!
package grand.app.aber_provider.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import grand.app.aber_provider.R;
import grand.app.aber_provider.customViews.views.CustomTextViewMedium;
import grand.app.aber_provider.customViews.views.CustomTextViewRegular;
import grand.app.aber_provider.pages.myLocations.viewModels.LocationsItemViewModels;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ItemMyLocationBinding extends ViewDataBinding {
  @NonNull
  public final CustomTextViewRegular icDelete;

  @NonNull
  public final CustomTextViewRegular icEdit;

  @NonNull
  public final RadioButton radio;

  @NonNull
  public final ConstraintLayout sliderContainer;

  @NonNull
  public final CustomTextViewMedium tvFirstLocation;

  @NonNull
  public final CustomTextViewRegular tvYourLocation;

  @NonNull
  public final View v23;

  @NonNull
  public final CustomTextViewRegular yourLocation;

  @Bindable
  protected LocationsItemViewModels mItemViewModel;

  protected ItemMyLocationBinding(Object _bindingComponent, View _root, int _localFieldCount,
      CustomTextViewRegular icDelete, CustomTextViewRegular icEdit, RadioButton radio,
      ConstraintLayout sliderContainer, CustomTextViewMedium tvFirstLocation,
      CustomTextViewRegular tvYourLocation, View v23, CustomTextViewRegular yourLocation) {
    super(_bindingComponent, _root, _localFieldCount);
    this.icDelete = icDelete;
    this.icEdit = icEdit;
    this.radio = radio;
    this.sliderContainer = sliderContainer;
    this.tvFirstLocation = tvFirstLocation;
    this.tvYourLocation = tvYourLocation;
    this.v23 = v23;
    this.yourLocation = yourLocation;
  }

  public abstract void setItemViewModel(@Nullable LocationsItemViewModels itemViewModel);

  @Nullable
  public LocationsItemViewModels getItemViewModel() {
    return mItemViewModel;
  }

  @NonNull
  public static ItemMyLocationBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_my_location, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ItemMyLocationBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ItemMyLocationBinding>inflateInternal(inflater, R.layout.item_my_location, root, attachToRoot, component);
  }

  @NonNull
  public static ItemMyLocationBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_my_location, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ItemMyLocationBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ItemMyLocationBinding>inflateInternal(inflater, R.layout.item_my_location, null, false, component);
  }

  public static ItemMyLocationBinding bind(@NonNull View view) {
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
  public static ItemMyLocationBinding bind(@NonNull View view, @Nullable Object component) {
    return (ItemMyLocationBinding)bind(component, view, R.layout.item_my_location);
  }
}
