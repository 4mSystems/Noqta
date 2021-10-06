// Generated by data binding compiler. Do not edit!
package te.app.notta.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.helper.widget.Flow;
import androidx.constraintlayout.widget.Barrier;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.makeramen.roundedimageview.RoundedImageView;
import java.lang.Deprecated;
import java.lang.Object;
import te.app.notta.R;
import te.app.notta.customViews.views.CustomTextViewMedium;
import te.app.notta.customViews.views.CustomTextViewRegular;
import te.app.notta.pages.groupDetails.viewModels.GroupDetailsViewModel;

public abstract class FragmentGroupDetailsBinding extends ViewDataBinding {
  @NonNull
  public final FloatingActionButton back;

  @NonNull
  public final AppCompatImageView boardHeader;

  @NonNull
  public final Barrier br3;

  @NonNull
  public final MaterialButton btnGroups;

  @NonNull
  public final MaterialButton btnJoin;

  @NonNull
  public final MaterialButton btnLeave;

  @NonNull
  public final MaterialButton btnRemove;

  @NonNull
  public final MaterialButton btnRequests;

  @NonNull
  public final MaterialButton btnStudents;

  @NonNull
  public final MaterialButton btnTechType;

  @NonNull
  public final Flow flow;

  @NonNull
  public final Flow flow1;

  @NonNull
  public final RoundedImageView icTeacher;

  @NonNull
  public final RecyclerView rcMembers;

  @NonNull
  public final CustomTextViewRegular tvDate;

  @NonNull
  public final CustomTextViewMedium tvGroupDesc;

  @NonNull
  public final CustomTextViewRegular tvGroupDescValue;

  @NonNull
  public final CustomTextViewMedium tvInfo;

  @NonNull
  public final CustomTextViewRegular tvLocation;

  @NonNull
  public final CustomTextViewMedium tvMembers;

  @NonNull
  public final CustomTextViewMedium tvProfileTitle;

  @NonNull
  public final CustomTextViewMedium tvShowAll;

  @NonNull
  public final CustomTextViewMedium tvTasks;

  @NonNull
  public final CustomTextViewMedium tvTeacherName;

  @NonNull
  public final CustomTextViewRegular tvUserWork;

  @NonNull
  public final View vLine;

  @NonNull
  public final View vLine1;

  @NonNull
  public final View vLine2;

  @NonNull
  public final View vLine3;

  @Bindable
  protected GroupDetailsViewModel mViewmodel;

  protected FragmentGroupDetailsBinding(Object _bindingComponent, View _root, int _localFieldCount,
      FloatingActionButton back, AppCompatImageView boardHeader, Barrier br3,
      MaterialButton btnGroups, MaterialButton btnJoin, MaterialButton btnLeave,
      MaterialButton btnRemove, MaterialButton btnRequests, MaterialButton btnStudents,
      MaterialButton btnTechType, Flow flow, Flow flow1, RoundedImageView icTeacher,
      RecyclerView rcMembers, CustomTextViewRegular tvDate, CustomTextViewMedium tvGroupDesc,
      CustomTextViewRegular tvGroupDescValue, CustomTextViewMedium tvInfo,
      CustomTextViewRegular tvLocation, CustomTextViewMedium tvMembers,
      CustomTextViewMedium tvProfileTitle, CustomTextViewMedium tvShowAll,
      CustomTextViewMedium tvTasks, CustomTextViewMedium tvTeacherName,
      CustomTextViewRegular tvUserWork, View vLine, View vLine1, View vLine2, View vLine3) {
    super(_bindingComponent, _root, _localFieldCount);
    this.back = back;
    this.boardHeader = boardHeader;
    this.br3 = br3;
    this.btnGroups = btnGroups;
    this.btnJoin = btnJoin;
    this.btnLeave = btnLeave;
    this.btnRemove = btnRemove;
    this.btnRequests = btnRequests;
    this.btnStudents = btnStudents;
    this.btnTechType = btnTechType;
    this.flow = flow;
    this.flow1 = flow1;
    this.icTeacher = icTeacher;
    this.rcMembers = rcMembers;
    this.tvDate = tvDate;
    this.tvGroupDesc = tvGroupDesc;
    this.tvGroupDescValue = tvGroupDescValue;
    this.tvInfo = tvInfo;
    this.tvLocation = tvLocation;
    this.tvMembers = tvMembers;
    this.tvProfileTitle = tvProfileTitle;
    this.tvShowAll = tvShowAll;
    this.tvTasks = tvTasks;
    this.tvTeacherName = tvTeacherName;
    this.tvUserWork = tvUserWork;
    this.vLine = vLine;
    this.vLine1 = vLine1;
    this.vLine2 = vLine2;
    this.vLine3 = vLine3;
  }

  public abstract void setViewmodel(@Nullable GroupDetailsViewModel viewmodel);

  @Nullable
  public GroupDetailsViewModel getViewmodel() {
    return mViewmodel;
  }

  @NonNull
  public static FragmentGroupDetailsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_group_details, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentGroupDetailsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentGroupDetailsBinding>inflateInternal(inflater, R.layout.fragment_group_details, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentGroupDetailsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_group_details, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentGroupDetailsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentGroupDetailsBinding>inflateInternal(inflater, R.layout.fragment_group_details, null, false, component);
  }

  public static FragmentGroupDetailsBinding bind(@NonNull View view) {
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
  public static FragmentGroupDetailsBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentGroupDetailsBinding)bind(component, view, R.layout.fragment_group_details);
  }
}