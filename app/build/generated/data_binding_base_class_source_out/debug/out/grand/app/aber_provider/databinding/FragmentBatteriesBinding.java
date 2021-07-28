// Generated by data binding compiler. Do not edit!
package grand.app.aber_provider.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.checkbox.MaterialCheckBox;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.google.android.material.textfield.TextInputLayout;
import grand.app.aber_provider.R;
import grand.app.aber_provider.customViews.views.CustomTextViewMedium;
import grand.app.aber_provider.pages.services.viewModels.ServicesViewModels;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentBatteriesBinding extends ViewDataBinding {
  @NonNull
  public final AppCompatButton btnPhone;

  @NonNull
  public final MaterialCheckBox checkbox;

  @NonNull
  public final ConstraintLayout imgContainer;

  @NonNull
  public final CardView infoCard;

  @NonNull
  public final TextInputLayout inputBatterySize;

  @NonNull
  public final TextInputLayout inputBatteryType;

  @NonNull
  public final TextInputLayout inputCarCategories;

  @NonNull
  public final TextInputLayout inputCarModels;

  @NonNull
  public final TextInputLayout inputCarTypes;

  @NonNull
  public final TextInputLayout inputMessage;

  @NonNull
  public final MaterialButton picTime;

  @NonNull
  public final CircularProgressIndicator progress;

  @NonNull
  public final RecyclerView rcPosts;

  @NonNull
  public final ConstraintLayout searchContainer;

  @NonNull
  public final MaterialButton searchLocation;

  @NonNull
  public final CustomTextViewMedium tvUpload;

  @Bindable
  protected ServicesViewModels mViewModel;

  protected FragmentBatteriesBinding(Object _bindingComponent, View _root, int _localFieldCount,
      AppCompatButton btnPhone, MaterialCheckBox checkbox, ConstraintLayout imgContainer,
      CardView infoCard, TextInputLayout inputBatterySize, TextInputLayout inputBatteryType,
      TextInputLayout inputCarCategories, TextInputLayout inputCarModels,
      TextInputLayout inputCarTypes, TextInputLayout inputMessage, MaterialButton picTime,
      CircularProgressIndicator progress, RecyclerView rcPosts, ConstraintLayout searchContainer,
      MaterialButton searchLocation, CustomTextViewMedium tvUpload) {
    super(_bindingComponent, _root, _localFieldCount);
    this.btnPhone = btnPhone;
    this.checkbox = checkbox;
    this.imgContainer = imgContainer;
    this.infoCard = infoCard;
    this.inputBatterySize = inputBatterySize;
    this.inputBatteryType = inputBatteryType;
    this.inputCarCategories = inputCarCategories;
    this.inputCarModels = inputCarModels;
    this.inputCarTypes = inputCarTypes;
    this.inputMessage = inputMessage;
    this.picTime = picTime;
    this.progress = progress;
    this.rcPosts = rcPosts;
    this.searchContainer = searchContainer;
    this.searchLocation = searchLocation;
    this.tvUpload = tvUpload;
  }

  public abstract void setViewModel(@Nullable ServicesViewModels viewModel);

  @Nullable
  public ServicesViewModels getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static FragmentBatteriesBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_batteries, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentBatteriesBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentBatteriesBinding>inflateInternal(inflater, R.layout.fragment_batteries, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentBatteriesBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_batteries, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentBatteriesBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentBatteriesBinding>inflateInternal(inflater, R.layout.fragment_batteries, null, false, component);
  }

  public static FragmentBatteriesBinding bind(@NonNull View view) {
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
  public static FragmentBatteriesBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentBatteriesBinding)bind(component, view, R.layout.fragment_batteries);
  }
}
