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
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.button.MaterialButton;
import com.makeramen.roundedimageview.RoundedImageView;
import de.hdodenhof.circleimageview.CircleImageView;
import grand.app.aber_provider.R;
import grand.app.aber_provider.customViews.views.CustomTextViewMedium;
import grand.app.aber_provider.customViews.views.CustomTextViewRegular;
import grand.app.aber_provider.pages.orderDetails.viewModels.OrderDetailsViewModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentOrderDetailsBinding extends ViewDataBinding {
  @NonNull
  public final Barrier br;

  @NonNull
  public final MaterialButton btnAccept;

  @NonNull
  public final MaterialButton btnReject;

  @NonNull
  public final CustomTextViewRegular caYear;

  @NonNull
  public final CustomTextViewRegular caYearValue;

  @NonNull
  public final CustomTextViewRegular carCat;

  @NonNull
  public final CustomTextViewRegular carCatValue;

  @NonNull
  public final CustomTextViewMedium carDesc;

  @NonNull
  public final AppCompatImageView carImageDesc;

  @NonNull
  public final CustomTextViewRegular carType;

  @NonNull
  public final CustomTextViewRegular carTypeValue;

  @NonNull
  public final CardView cardBattery;

  @NonNull
  public final CardView cardCarDesc;

  @NonNull
  public final CardView cardDesc;

  @NonNull
  public final CardView cardExtraService;

  @NonNull
  public final CardView cardInvoice;

  @NonNull
  public final CardView cardMainService;

  @NonNull
  public final CardView cardOtherService;

  @NonNull
  public final RelativeLayout cardPersonalInfo;

  @NonNull
  public final CardView cardService;

  @NonNull
  public final CardView cardTime;

  @NonNull
  public final CustomTextViewMedium extraService;

  @NonNull
  public final ConstraintLayout header;

  @NonNull
  public final AppCompatImageView itemImg;

  @NonNull
  public final AppCompatImageView itemTimeWarning;

  @NonNull
  public final RoundedImageView locationImage;

  @NonNull
  public final CustomTextViewMedium otherService;

  @NonNull
  public final CustomTextViewMedium requiredServiceType;

  @NonNull
  public final ConstraintLayout searchContainer;

  @NonNull
  public final TextView textView2;

  @NonNull
  public final CustomTextViewMedium tvBattery;

  @NonNull
  public final CustomTextViewRegular tvDeliveryCost;

  @NonNull
  public final CustomTextViewRegular tvDeliveryPrice;

  @NonNull
  public final CustomTextViewRegular tvDeliveryTime;

  @NonNull
  public final CustomTextViewRegular tvEmeCost;

  @NonNull
  public final CustomTextViewRegular tvEmePrice;

  @NonNull
  public final CustomTextViewMedium tvHomeItem;

  @NonNull
  public final CustomTextViewMedium tvHomeJob;

  @NonNull
  public final CustomTextViewMedium tvPrice;

  @NonNull
  public final CustomTextViewMedium tvServiceDesc;

  @NonNull
  public final CustomTextViewMedium tvServiceDescValue;

  @NonNull
  public final CustomTextViewRegular tvServiceType;

  @NonNull
  public final CustomTextViewRegular tvServicesCost;

  @NonNull
  public final CustomTextViewRegular tvServicesExtraCost;

  @NonNull
  public final CustomTextViewRegular tvServicesExtraPrice;

  @NonNull
  public final CustomTextViewMedium tvTotal;

  @NonNull
  public final CustomTextViewRegular tvTotalPrice;

  @NonNull
  public final CustomTextViewRegular tvTotalServicesPrice;

  @NonNull
  public final CircleImageView userProfileImg;

  @NonNull
  public final View vDeliveryPrice;

  @NonNull
  public final View vEmePrice;

  @NonNull
  public final View vServicesExtraPrice;

  @NonNull
  public final View vServicesPrice;

  @Bindable
  protected OrderDetailsViewModel mViewModel;

  protected FragmentOrderDetailsBinding(Object _bindingComponent, View _root, int _localFieldCount,
      Barrier br, MaterialButton btnAccept, MaterialButton btnReject, CustomTextViewRegular caYear,
      CustomTextViewRegular caYearValue, CustomTextViewRegular carCat,
      CustomTextViewRegular carCatValue, CustomTextViewMedium carDesc,
      AppCompatImageView carImageDesc, CustomTextViewRegular carType,
      CustomTextViewRegular carTypeValue, CardView cardBattery, CardView cardCarDesc,
      CardView cardDesc, CardView cardExtraService, CardView cardInvoice, CardView cardMainService,
      CardView cardOtherService, RelativeLayout cardPersonalInfo, CardView cardService,
      CardView cardTime, CustomTextViewMedium extraService, ConstraintLayout header,
      AppCompatImageView itemImg, AppCompatImageView itemTimeWarning,
      RoundedImageView locationImage, CustomTextViewMedium otherService,
      CustomTextViewMedium requiredServiceType, ConstraintLayout searchContainer,
      TextView textView2, CustomTextViewMedium tvBattery, CustomTextViewRegular tvDeliveryCost,
      CustomTextViewRegular tvDeliveryPrice, CustomTextViewRegular tvDeliveryTime,
      CustomTextViewRegular tvEmeCost, CustomTextViewRegular tvEmePrice,
      CustomTextViewMedium tvHomeItem, CustomTextViewMedium tvHomeJob, CustomTextViewMedium tvPrice,
      CustomTextViewMedium tvServiceDesc, CustomTextViewMedium tvServiceDescValue,
      CustomTextViewRegular tvServiceType, CustomTextViewRegular tvServicesCost,
      CustomTextViewRegular tvServicesExtraCost, CustomTextViewRegular tvServicesExtraPrice,
      CustomTextViewMedium tvTotal, CustomTextViewRegular tvTotalPrice,
      CustomTextViewRegular tvTotalServicesPrice, CircleImageView userProfileImg,
      View vDeliveryPrice, View vEmePrice, View vServicesExtraPrice, View vServicesPrice) {
    super(_bindingComponent, _root, _localFieldCount);
    this.br = br;
    this.btnAccept = btnAccept;
    this.btnReject = btnReject;
    this.caYear = caYear;
    this.caYearValue = caYearValue;
    this.carCat = carCat;
    this.carCatValue = carCatValue;
    this.carDesc = carDesc;
    this.carImageDesc = carImageDesc;
    this.carType = carType;
    this.carTypeValue = carTypeValue;
    this.cardBattery = cardBattery;
    this.cardCarDesc = cardCarDesc;
    this.cardDesc = cardDesc;
    this.cardExtraService = cardExtraService;
    this.cardInvoice = cardInvoice;
    this.cardMainService = cardMainService;
    this.cardOtherService = cardOtherService;
    this.cardPersonalInfo = cardPersonalInfo;
    this.cardService = cardService;
    this.cardTime = cardTime;
    this.extraService = extraService;
    this.header = header;
    this.itemImg = itemImg;
    this.itemTimeWarning = itemTimeWarning;
    this.locationImage = locationImage;
    this.otherService = otherService;
    this.requiredServiceType = requiredServiceType;
    this.searchContainer = searchContainer;
    this.textView2 = textView2;
    this.tvBattery = tvBattery;
    this.tvDeliveryCost = tvDeliveryCost;
    this.tvDeliveryPrice = tvDeliveryPrice;
    this.tvDeliveryTime = tvDeliveryTime;
    this.tvEmeCost = tvEmeCost;
    this.tvEmePrice = tvEmePrice;
    this.tvHomeItem = tvHomeItem;
    this.tvHomeJob = tvHomeJob;
    this.tvPrice = tvPrice;
    this.tvServiceDesc = tvServiceDesc;
    this.tvServiceDescValue = tvServiceDescValue;
    this.tvServiceType = tvServiceType;
    this.tvServicesCost = tvServicesCost;
    this.tvServicesExtraCost = tvServicesExtraCost;
    this.tvServicesExtraPrice = tvServicesExtraPrice;
    this.tvTotal = tvTotal;
    this.tvTotalPrice = tvTotalPrice;
    this.tvTotalServicesPrice = tvTotalServicesPrice;
    this.userProfileImg = userProfileImg;
    this.vDeliveryPrice = vDeliveryPrice;
    this.vEmePrice = vEmePrice;
    this.vServicesExtraPrice = vServicesExtraPrice;
    this.vServicesPrice = vServicesPrice;
  }

  public abstract void setViewModel(@Nullable OrderDetailsViewModel viewModel);

  @Nullable
  public OrderDetailsViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static FragmentOrderDetailsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_order_details, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentOrderDetailsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentOrderDetailsBinding>inflateInternal(inflater, R.layout.fragment_order_details, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentOrderDetailsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_order_details, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentOrderDetailsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentOrderDetailsBinding>inflateInternal(inflater, R.layout.fragment_order_details, null, false, component);
  }

  public static FragmentOrderDetailsBinding bind(@NonNull View view) {
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
  public static FragmentOrderDetailsBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentOrderDetailsBinding)bind(component, view, R.layout.fragment_order_details);
  }
}
