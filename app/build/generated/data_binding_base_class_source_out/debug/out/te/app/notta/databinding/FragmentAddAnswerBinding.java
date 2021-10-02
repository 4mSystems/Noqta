// Generated by data binding compiler. Do not edit!
package te.app.notta.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.google.android.material.textfield.TextInputLayout;
import com.makeramen.roundedimageview.RoundedImageView;
import java.lang.Deprecated;
import java.lang.Object;
import te.app.notta.R;
import te.app.notta.customViews.views.CustomTextViewMedium;
import te.app.notta.customViews.views.CustomTextViewRegular;
import te.app.notta.pages.addAnswer.viewModels.AddAnswerViewModel;

public abstract class FragmentAddAnswerBinding extends ViewDataBinding {
  @NonNull
  public final MaterialCardView MaterialCardView;

  @NonNull
  public final AppCompatButton appCompatButtonNext;

  @NonNull
  public final FloatingActionButton back;

  @NonNull
  public final AppCompatImageView boardHeader;

  @NonNull
  public final Barrier br4;

  @NonNull
  public final AppCompatImageView icCloudUpload;

  @NonNull
  public final AppCompatImageView icCloudUploadVideo;

  @NonNull
  public final ConstraintLayout imagesContainer;

  @NonNull
  public final TextInputLayout inputAnswer;

  @NonNull
  public final RoundedImageView mainImage;

  @NonNull
  public final CircularProgressIndicator progress;

  @NonNull
  public final RecyclerView rcTaskMedia;

  @NonNull
  public final CustomTextViewMedium tvAnswer;

  @NonNull
  public final CustomTextViewRegular tvDate;

  @NonNull
  public final CustomTextViewMedium tvDetails;

  @NonNull
  public final CustomTextViewMedium tvImages;

  @NonNull
  public final CustomTextViewMedium tvProfileTitle;

  @NonNull
  public final CustomTextViewMedium tvTasks;

  @NonNull
  public final CustomTextViewMedium tvVideo;

  @NonNull
  public final View vLine4;

  @NonNull
  public final ConstraintLayout videoContainer;

  @Bindable
  protected AddAnswerViewModel mViewmodel;

  protected FragmentAddAnswerBinding(Object _bindingComponent, View _root, int _localFieldCount,
      MaterialCardView MaterialCardView, AppCompatButton appCompatButtonNext,
      FloatingActionButton back, AppCompatImageView boardHeader, Barrier br4,
      AppCompatImageView icCloudUpload, AppCompatImageView icCloudUploadVideo,
      ConstraintLayout imagesContainer, TextInputLayout inputAnswer, RoundedImageView mainImage,
      CircularProgressIndicator progress, RecyclerView rcTaskMedia, CustomTextViewMedium tvAnswer,
      CustomTextViewRegular tvDate, CustomTextViewMedium tvDetails, CustomTextViewMedium tvImages,
      CustomTextViewMedium tvProfileTitle, CustomTextViewMedium tvTasks,
      CustomTextViewMedium tvVideo, View vLine4, ConstraintLayout videoContainer) {
    super(_bindingComponent, _root, _localFieldCount);
    this.MaterialCardView = MaterialCardView;
    this.appCompatButtonNext = appCompatButtonNext;
    this.back = back;
    this.boardHeader = boardHeader;
    this.br4 = br4;
    this.icCloudUpload = icCloudUpload;
    this.icCloudUploadVideo = icCloudUploadVideo;
    this.imagesContainer = imagesContainer;
    this.inputAnswer = inputAnswer;
    this.mainImage = mainImage;
    this.progress = progress;
    this.rcTaskMedia = rcTaskMedia;
    this.tvAnswer = tvAnswer;
    this.tvDate = tvDate;
    this.tvDetails = tvDetails;
    this.tvImages = tvImages;
    this.tvProfileTitle = tvProfileTitle;
    this.tvTasks = tvTasks;
    this.tvVideo = tvVideo;
    this.vLine4 = vLine4;
    this.videoContainer = videoContainer;
  }

  public abstract void setViewmodel(@Nullable AddAnswerViewModel viewmodel);

  @Nullable
  public AddAnswerViewModel getViewmodel() {
    return mViewmodel;
  }

  @NonNull
  public static FragmentAddAnswerBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_add_answer, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentAddAnswerBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentAddAnswerBinding>inflateInternal(inflater, R.layout.fragment_add_answer, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentAddAnswerBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_add_answer, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentAddAnswerBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentAddAnswerBinding>inflateInternal(inflater, R.layout.fragment_add_answer, null, false, component);
  }

  public static FragmentAddAnswerBinding bind(@NonNull View view) {
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
  public static FragmentAddAnswerBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentAddAnswerBinding)bind(component, view, R.layout.fragment_add_answer);
  }
}
