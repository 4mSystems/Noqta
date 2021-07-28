// Generated by data binding compiler. Do not edit!
package grand.app.aber_provider.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import grand.app.aber_provider.R;
import grand.app.aber_provider.customViews.views.CustomTextViewMedium;
import grand.app.aber_provider.pages.appWallet.viewModels.AppWalletViewModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentAppWalletBinding extends ViewDataBinding {
  @NonNull
  public final CardView cardMyWallet;

  @NonNull
  public final CardView cardPutBalance;

  @NonNull
  public final AppCompatButton chargeAppWalletBtn;

  @NonNull
  public final AppCompatImageView curve;

  @NonNull
  public final ConstraintLayout headerLayout;

  @NonNull
  public final RecyclerView rcWalletHistory;

  @NonNull
  public final CustomTextViewMedium tvWallet;

  @NonNull
  public final CustomTextViewMedium tvWalletBalance;

  @Bindable
  protected AppWalletViewModel mViewmodel;

  protected FragmentAppWalletBinding(Object _bindingComponent, View _root, int _localFieldCount,
      CardView cardMyWallet, CardView cardPutBalance, AppCompatButton chargeAppWalletBtn,
      AppCompatImageView curve, ConstraintLayout headerLayout, RecyclerView rcWalletHistory,
      CustomTextViewMedium tvWallet, CustomTextViewMedium tvWalletBalance) {
    super(_bindingComponent, _root, _localFieldCount);
    this.cardMyWallet = cardMyWallet;
    this.cardPutBalance = cardPutBalance;
    this.chargeAppWalletBtn = chargeAppWalletBtn;
    this.curve = curve;
    this.headerLayout = headerLayout;
    this.rcWalletHistory = rcWalletHistory;
    this.tvWallet = tvWallet;
    this.tvWalletBalance = tvWalletBalance;
  }

  public abstract void setViewmodel(@Nullable AppWalletViewModel viewmodel);

  @Nullable
  public AppWalletViewModel getViewmodel() {
    return mViewmodel;
  }

  @NonNull
  public static FragmentAppWalletBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_app_wallet, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentAppWalletBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentAppWalletBinding>inflateInternal(inflater, R.layout.fragment_app_wallet, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentAppWalletBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_app_wallet, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentAppWalletBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentAppWalletBinding>inflateInternal(inflater, R.layout.fragment_app_wallet, null, false, component);
  }

  public static FragmentAppWalletBinding bind(@NonNull View view) {
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
  public static FragmentAppWalletBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentAppWalletBinding)bind(component, view, R.layout.fragment_app_wallet);
  }
}
