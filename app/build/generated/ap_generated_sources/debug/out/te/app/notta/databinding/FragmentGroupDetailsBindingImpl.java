package te.app.notta.databinding;
import te.app.notta.R;
import te.app.notta.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentGroupDetailsBindingImpl extends FragmentGroupDetailsBinding implements te.app.notta.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.board_header, 21);
        sViewsWithIds.put(R.id.tv_location, 22);
        sViewsWithIds.put(R.id.flow, 23);
        sViewsWithIds.put(R.id.br3, 24);
        sViewsWithIds.put(R.id.v_line, 25);
        sViewsWithIds.put(R.id.tv_group_desc, 26);
        sViewsWithIds.put(R.id.v_line1, 27);
        sViewsWithIds.put(R.id.tv_info, 28);
        sViewsWithIds.put(R.id.flow1, 29);
        sViewsWithIds.put(R.id.v_line2, 30);
        sViewsWithIds.put(R.id.tv_members, 31);
    }
    // views
    @NonNull
    private final androidx.coordinatorlayout.widget.CoordinatorLayout mboundView0;
    @NonNull
    private final androidx.recyclerview.widget.RecyclerView mboundView19;
    @NonNull
    private final com.google.android.material.floatingactionbutton.FloatingActionButton mboundView20;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback55;
    @Nullable
    private final android.view.View.OnClickListener mCallback50;
    @Nullable
    private final android.view.View.OnClickListener mCallback48;
    @Nullable
    private final android.view.View.OnClickListener mCallback51;
    @Nullable
    private final android.view.View.OnClickListener mCallback49;
    @Nullable
    private final android.view.View.OnClickListener mCallback52;
    @Nullable
    private final android.view.View.OnClickListener mCallback54;
    @Nullable
    private final android.view.View.OnClickListener mCallback53;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentGroupDetailsBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 32, sIncludes, sViewsWithIds));
    }
    private FragmentGroupDetailsBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (com.google.android.material.floatingactionbutton.FloatingActionButton) bindings[2]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[21]
            , (androidx.constraintlayout.widget.Barrier) bindings[24]
            , (com.google.android.material.button.MaterialButton) bindings[10]
            , (com.google.android.material.button.MaterialButton) bindings[12]
            , (com.google.android.material.button.MaterialButton) bindings[13]
            , (com.google.android.material.button.MaterialButton) bindings[14]
            , (com.google.android.material.button.MaterialButton) bindings[11]
            , (com.google.android.material.button.MaterialButton) bindings[9]
            , (com.google.android.material.button.MaterialButton) bindings[6]
            , (androidx.constraintlayout.helper.widget.Flow) bindings[23]
            , (androidx.constraintlayout.helper.widget.Flow) bindings[29]
            , (com.makeramen.roundedimageview.RoundedImageView) bindings[3]
            , (androidx.recyclerview.widget.RecyclerView) bindings[16]
            , (te.app.notta.customViews.views.CustomTextViewRegular) bindings[7]
            , (te.app.notta.customViews.views.CustomTextViewMedium) bindings[26]
            , (te.app.notta.customViews.views.CustomTextViewRegular) bindings[8]
            , (te.app.notta.customViews.views.CustomTextViewMedium) bindings[28]
            , (te.app.notta.customViews.views.CustomTextViewRegular) bindings[22]
            , (te.app.notta.customViews.views.CustomTextViewMedium) bindings[31]
            , (te.app.notta.customViews.views.CustomTextViewMedium) bindings[1]
            , (te.app.notta.customViews.views.CustomTextViewMedium) bindings[15]
            , (te.app.notta.customViews.views.CustomTextViewMedium) bindings[18]
            , (te.app.notta.customViews.views.CustomTextViewMedium) bindings[4]
            , (te.app.notta.customViews.views.CustomTextViewRegular) bindings[5]
            , (android.view.View) bindings[25]
            , (android.view.View) bindings[27]
            , (android.view.View) bindings[30]
            , (android.view.View) bindings[17]
            );
        this.back.setTag(null);
        this.btnGroups.setTag(null);
        this.btnJoin.setTag(null);
        this.btnLeave.setTag(null);
        this.btnRemove.setTag(null);
        this.btnRequests.setTag(null);
        this.btnStudents.setTag(null);
        this.btnTechType.setTag(null);
        this.icTeacher.setTag(null);
        this.mboundView0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView19 = (androidx.recyclerview.widget.RecyclerView) bindings[19];
        this.mboundView19.setTag(null);
        this.mboundView20 = (com.google.android.material.floatingactionbutton.FloatingActionButton) bindings[20];
        this.mboundView20.setTag(null);
        this.rcMembers.setTag(null);
        this.tvDate.setTag(null);
        this.tvGroupDescValue.setTag(null);
        this.tvProfileTitle.setTag(null);
        this.tvShowAll.setTag(null);
        this.tvTasks.setTag(null);
        this.tvTeacherName.setTag(null);
        this.tvUserWork.setTag(null);
        this.vLine3.setTag(null);
        setRootTag(root);
        // listeners
        mCallback55 = new te.app.notta.generated.callback.OnClickListener(this, 8);
        mCallback50 = new te.app.notta.generated.callback.OnClickListener(this, 3);
        mCallback48 = new te.app.notta.generated.callback.OnClickListener(this, 1);
        mCallback51 = new te.app.notta.generated.callback.OnClickListener(this, 4);
        mCallback49 = new te.app.notta.generated.callback.OnClickListener(this, 2);
        mCallback52 = new te.app.notta.generated.callback.OnClickListener(this, 5);
        mCallback54 = new te.app.notta.generated.callback.OnClickListener(this, 7);
        mCallback53 = new te.app.notta.generated.callback.OnClickListener(this, 6);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x20L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.viewmodel == variableId) {
            setViewmodel((te.app.notta.pages.home.viewModels.GroupDetailsViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewmodel(@Nullable te.app.notta.pages.home.viewModels.GroupDetailsViewModel Viewmodel) {
        updateRegistration(0, Viewmodel);
        this.mViewmodel = Viewmodel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.viewmodel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewmodel((te.app.notta.pages.home.viewModels.GroupDetailsViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewmodel(te.app.notta.pages.home.viewModels.GroupDetailsViewModel Viewmodel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        else if (fieldId == BR.passingObject) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        else if (fieldId == BR.groupDetails) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        else if (fieldId == BR.groupDetailsStudentsAdapter) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        else if (fieldId == BR.tasksAdapter) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.lang.String viewmodelGroupDetailsCreatedAt = null;
        te.app.notta.pages.home.adapters.GroupTasksAdapter viewmodelTasksAdapter = null;
        te.app.notta.PassingObject viewmodelPassingObject = null;
        java.lang.String viewmodelGroupDetailsDescription = null;
        int viewmodelGroupDetailsTeacherIdViewmodelUserDataIdViewGONEViewINVISIBLE = 0;
        boolean viewmodelGroupDetailsMemberInt0 = false;
        boolean viewmodelGroupDetailsJoinSentInt1 = false;
        te.app.notta.pages.home.models.details.GroupDetails viewmodelGroupDetails = null;
        int viewmodelGroupDetailsTeacherIdViewmodelUserDataIdBooleanTrueViewmodelGroupDetailsMemberInt1ViewVISIBLEViewGONE = 0;
        android.graphics.drawable.Drawable viewmodelGroupDetailsJoinSentInt1BtnJoinAndroidDrawableIcRequestWaitingBtnJoinAndroidDrawableIcIconAwesomeUserPlus = null;
        java.lang.String viewmodelGroupDetailsTeacherSpecialistName = null;
        java.lang.String viewmodelGroupDetailsStudentsCountConcatBtnStudentsAndroidStringStudents = null;
        java.lang.String viewmodelPassingObjectObject = null;
        int viewmodelGroupDetailsTeacherId = 0;
        java.lang.String viewmodelGroupDetailsTasksCount = null;
        int viewmodelGroupDetailsMember = 0;
        te.app.notta.pages.home.adapters.GroupDetailsStudentsAdapter viewmodelGroupDetailsStudentsAdapter = null;
        java.lang.String viewmodelGroupDetailsTeacherName = null;
        boolean viewmodelGroupDetailsTeacherIdViewmodelUserDataId = false;
        int viewmodelGroupDetailsTeacherIdViewmodelUserDataIdViewmodelGroupDetailsMemberInt0BooleanFalseViewVISIBLEViewGONE = 0;
        java.lang.String viewmodelGroupDetailsTasksCountConcatBtnGroupsAndroidStringTasks = null;
        java.lang.String viewmodelGroupDetailsTeacherImage = null;
        boolean viewmodelGroupDetailsMemberInt1 = false;
        java.lang.String viewmodelGroupDetailsStudentsCount = null;
        java.lang.String viewmodelGroupDetailsRequestsCountConcatBtnRequestsAndroidStringRequests = null;
        te.app.notta.pages.auth.models.UserData viewmodelGroupDetailsTeacher = null;
        java.lang.String viewmodelGroupDetailsRequestsCount = null;
        int viewmodelGroupDetailsTeacherIdViewmodelUserDataIdViewVISIBLEViewGONE = 0;
        int viewmodelGroupDetailsJoinSent = 0;
        int viewmodelGroupDetailsMemberInt1ViewVISIBLEViewmodelGroupDetailsTeacherIdViewmodelUserDataIdViewGONEViewINVISIBLE = 0;
        boolean viewmodelGroupDetailsTeacherIdViewmodelUserDataIdViewmodelGroupDetailsMemberInt0BooleanFalse = false;
        boolean ViewmodelGroupDetailsTeacherIdViewmodelUserDataId1 = false;
        te.app.notta.pages.auth.models.UserData viewmodelUserData = null;
        int viewmodelUserDataId = 0;
        boolean viewmodelGroupDetailsTeacherIdViewmodelUserDataIdBooleanTrueViewmodelGroupDetailsMemberInt1 = false;
        te.app.notta.pages.home.viewModels.GroupDetailsViewModel viewmodel = mViewmodel;

        if ((dirtyFlags & 0x3fL) != 0) {


            if ((dirtyFlags & 0x31L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.tasksAdapter
                        viewmodelTasksAdapter = viewmodel.getTasksAdapter();
                    }
            }
            if ((dirtyFlags & 0x23L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.passingObject
                        viewmodelPassingObject = viewmodel.getPassingObject();
                    }


                    if (viewmodelPassingObject != null) {
                        // read viewmodel.passingObject.object
                        viewmodelPassingObjectObject = viewmodelPassingObject.getObject();
                    }
            }
            if ((dirtyFlags & 0x25L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.groupDetails
                        viewmodelGroupDetails = viewmodel.getGroupDetails();
                        // read viewmodel.userData
                        viewmodelUserData = viewmodel.userData;
                    }


                    if (viewmodelGroupDetails != null) {
                        // read viewmodel.groupDetails.createdAt
                        viewmodelGroupDetailsCreatedAt = viewmodelGroupDetails.getCreatedAt();
                        // read viewmodel.groupDetails.description
                        viewmodelGroupDetailsDescription = viewmodelGroupDetails.getDescription();
                        // read viewmodel.groupDetails.tasksCount
                        viewmodelGroupDetailsTasksCount = viewmodelGroupDetails.getTasksCount();
                        // read viewmodel.groupDetails.member
                        viewmodelGroupDetailsMember = viewmodelGroupDetails.getMember();
                        // read viewmodel.groupDetails.studentsCount
                        viewmodelGroupDetailsStudentsCount = viewmodelGroupDetails.getStudentsCount();
                        // read viewmodel.groupDetails.teacher
                        viewmodelGroupDetailsTeacher = viewmodelGroupDetails.getTeacher();
                        // read viewmodel.groupDetails.requestsCount
                        viewmodelGroupDetailsRequestsCount = viewmodelGroupDetails.getRequestsCount();
                        // read viewmodel.groupDetails.joinSent
                        viewmodelGroupDetailsJoinSent = viewmodelGroupDetails.isJoinSent();
                    }
                    if (viewmodelUserData != null) {
                        // read viewmodel.userData.id
                        viewmodelUserDataId = viewmodelUserData.getId();
                    }


                    if (viewmodelGroupDetailsTasksCount != null) {
                        // read viewmodel.groupDetails.tasksCount.concat(@android:string/tasks)
                        viewmodelGroupDetailsTasksCountConcatBtnGroupsAndroidStringTasks = viewmodelGroupDetailsTasksCount.concat(btnGroups.getResources().getString(R.string.tasks));
                    }
                    // read viewmodel.groupDetails.member == 1
                    viewmodelGroupDetailsMemberInt1 = (viewmodelGroupDetailsMember) == (1);
                    // read viewmodel.groupDetails.joinSent == 1
                    viewmodelGroupDetailsJoinSentInt1 = (viewmodelGroupDetailsJoinSent) == (1);
                if((dirtyFlags & 0x25L) != 0) {
                    if(viewmodelGroupDetailsMemberInt1) {
                            dirtyFlags |= 0x20000L;
                    }
                    else {
                            dirtyFlags |= 0x10000L;
                    }
                }
                if((dirtyFlags & 0x25L) != 0) {
                    if(viewmodelGroupDetailsJoinSentInt1) {
                            dirtyFlags |= 0x800L;
                    }
                    else {
                            dirtyFlags |= 0x400L;
                    }
                }
                    if (viewmodelGroupDetailsStudentsCount != null) {
                        // read viewmodel.groupDetails.studentsCount.concat(@android:string/students)
                        viewmodelGroupDetailsStudentsCountConcatBtnStudentsAndroidStringStudents = viewmodelGroupDetailsStudentsCount.concat(btnStudents.getResources().getString(R.string.students));
                    }
                    if (viewmodelGroupDetailsTeacher != null) {
                        // read viewmodel.groupDetails.teacher.specialistName
                        viewmodelGroupDetailsTeacherSpecialistName = viewmodelGroupDetailsTeacher.getSpecialistName();
                        // read viewmodel.groupDetails.teacher.id
                        viewmodelGroupDetailsTeacherId = viewmodelGroupDetailsTeacher.getId();
                        // read viewmodel.groupDetails.teacher.name
                        viewmodelGroupDetailsTeacherName = viewmodelGroupDetailsTeacher.getName();
                        // read viewmodel.groupDetails.teacher.image
                        viewmodelGroupDetailsTeacherImage = viewmodelGroupDetailsTeacher.getImage();
                    }
                    if (viewmodelGroupDetailsRequestsCount != null) {
                        // read viewmodel.groupDetails.requestsCount.concat(@android:string/requests)
                        viewmodelGroupDetailsRequestsCountConcatBtnRequestsAndroidStringRequests = viewmodelGroupDetailsRequestsCount.concat(btnRequests.getResources().getString(R.string.requests));
                    }


                    // read viewmodel.groupDetails.joinSent == 1 ? @android:drawable/ic_request_waiting : @android:drawable/ic_icon_awesome_user_plus
                    viewmodelGroupDetailsJoinSentInt1BtnJoinAndroidDrawableIcRequestWaitingBtnJoinAndroidDrawableIcIconAwesomeUserPlus = ((viewmodelGroupDetailsJoinSentInt1) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(btnJoin.getContext(), R.drawable.ic_request_waiting)) : (androidx.appcompat.content.res.AppCompatResources.getDrawable(btnJoin.getContext(), R.drawable.ic_icon_awesome_user_plus)));
                    // read viewmodel.groupDetails.teacher.id != viewmodel.userData.id
                    viewmodelGroupDetailsTeacherIdViewmodelUserDataId = (viewmodelGroupDetailsTeacherId) != (viewmodelUserDataId);
                    // read viewmodel.groupDetails.teacher.id == viewmodel.userData.id
                    ViewmodelGroupDetailsTeacherIdViewmodelUserDataId1 = (viewmodelGroupDetailsTeacherId) == (viewmodelUserDataId);
                if((dirtyFlags & 0x25L) != 0) {
                    if(viewmodelGroupDetailsTeacherIdViewmodelUserDataId) {
                            dirtyFlags |= 0x80000L;
                    }
                    else {
                            dirtyFlags |= 0x40000L;
                    }
                }
                if((dirtyFlags & 0x10000L) != 0) {
                    if(ViewmodelGroupDetailsTeacherIdViewmodelUserDataId1) {
                            dirtyFlags |= 0x80L;
                    }
                    else {
                            dirtyFlags |= 0x40L;
                    }
                }
                if((dirtyFlags & 0x25L) != 0) {
                    if(ViewmodelGroupDetailsTeacherIdViewmodelUserDataId1) {
                            dirtyFlags |= 0x8000L;
                            dirtyFlags |= 0x200000L;
                    }
                    else {
                            dirtyFlags |= 0x4000L;
                            dirtyFlags |= 0x100000L;
                    }
                }


                    // read viewmodel.groupDetails.teacher.id == viewmodel.userData.id ? View.VISIBLE : View.GONE
                    viewmodelGroupDetailsTeacherIdViewmodelUserDataIdViewVISIBLEViewGONE = ((ViewmodelGroupDetailsTeacherIdViewmodelUserDataId1) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x29L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.groupDetailsStudentsAdapter
                        viewmodelGroupDetailsStudentsAdapter = viewmodel.getGroupDetailsStudentsAdapter();
                    }
            }
        }
        // batch finished

        if ((dirtyFlags & 0x10000L) != 0) {

                // read viewmodel.groupDetails.teacher.id == viewmodel.userData.id ? View.GONE : View.INVISIBLE
                viewmodelGroupDetailsTeacherIdViewmodelUserDataIdViewGONEViewINVISIBLE = ((ViewmodelGroupDetailsTeacherIdViewmodelUserDataId1) ? (android.view.View.GONE) : (android.view.View.INVISIBLE));
        }
        if ((dirtyFlags & 0x80000L) != 0) {

                // read viewmodel.groupDetails.member == 0
                viewmodelGroupDetailsMemberInt0 = (viewmodelGroupDetailsMember) == (0);
        }
        if ((dirtyFlags & 0x25L) != 0) {

                // read viewmodel.groupDetails.teacher.id == viewmodel.userData.id ? true : viewmodel.groupDetails.member == 1
                viewmodelGroupDetailsTeacherIdViewmodelUserDataIdBooleanTrueViewmodelGroupDetailsMemberInt1 = ((ViewmodelGroupDetailsTeacherIdViewmodelUserDataId1) ? (true) : (viewmodelGroupDetailsMemberInt1));
            if((dirtyFlags & 0x25L) != 0) {
                if(viewmodelGroupDetailsTeacherIdViewmodelUserDataIdBooleanTrueViewmodelGroupDetailsMemberInt1) {
                        dirtyFlags |= 0x200L;
                }
                else {
                        dirtyFlags |= 0x100L;
                }
            }


                // read viewmodel.groupDetails.teacher.id == viewmodel.userData.id ? true : viewmodel.groupDetails.member == 1 ? View.VISIBLE : View.GONE
                viewmodelGroupDetailsTeacherIdViewmodelUserDataIdBooleanTrueViewmodelGroupDetailsMemberInt1ViewVISIBLEViewGONE = ((viewmodelGroupDetailsTeacherIdViewmodelUserDataIdBooleanTrueViewmodelGroupDetailsMemberInt1) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }

        if ((dirtyFlags & 0x25L) != 0) {

                // read viewmodel.groupDetails.member == 1 ? View.VISIBLE : viewmodel.groupDetails.teacher.id == viewmodel.userData.id ? View.GONE : View.INVISIBLE
                viewmodelGroupDetailsMemberInt1ViewVISIBLEViewmodelGroupDetailsTeacherIdViewmodelUserDataIdViewGONEViewINVISIBLE = ((viewmodelGroupDetailsMemberInt1) ? (android.view.View.VISIBLE) : (viewmodelGroupDetailsTeacherIdViewmodelUserDataIdViewGONEViewINVISIBLE));
                // read viewmodel.groupDetails.teacher.id != viewmodel.userData.id ? viewmodel.groupDetails.member == 0 : false
                viewmodelGroupDetailsTeacherIdViewmodelUserDataIdViewmodelGroupDetailsMemberInt0BooleanFalse = ((viewmodelGroupDetailsTeacherIdViewmodelUserDataId) ? (viewmodelGroupDetailsMemberInt0) : (false));
            if((dirtyFlags & 0x25L) != 0) {
                if(viewmodelGroupDetailsTeacherIdViewmodelUserDataIdViewmodelGroupDetailsMemberInt0BooleanFalse) {
                        dirtyFlags |= 0x2000L;
                }
                else {
                        dirtyFlags |= 0x1000L;
                }
            }


                // read viewmodel.groupDetails.teacher.id != viewmodel.userData.id ? viewmodel.groupDetails.member == 0 : false ? View.VISIBLE : View.GONE
                viewmodelGroupDetailsTeacherIdViewmodelUserDataIdViewmodelGroupDetailsMemberInt0BooleanFalseViewVISIBLEViewGONE = ((viewmodelGroupDetailsTeacherIdViewmodelUserDataIdViewmodelGroupDetailsMemberInt0BooleanFalse) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished
        if ((dirtyFlags & 0x20L) != 0) {
            // api target 1

            this.back.setOnClickListener(mCallback48);
            this.btnJoin.setOnClickListener(mCallback51);
            this.btnLeave.setOnClickListener(mCallback52);
            this.btnRemove.setOnClickListener(mCallback53);
            this.btnRequests.setOnClickListener(mCallback50);
            this.btnStudents.setOnClickListener(mCallback49);
            this.mboundView20.setOnClickListener(mCallback55);
            this.tvShowAll.setOnClickListener(mCallback54);
        }
        if ((dirtyFlags & 0x25L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.btnGroups, viewmodelGroupDetailsTasksCountConcatBtnGroupsAndroidStringTasks);
            this.btnJoin.setVisibility(viewmodelGroupDetailsTeacherIdViewmodelUserDataIdViewmodelGroupDetailsMemberInt0BooleanFalseViewVISIBLEViewGONE);
            this.btnJoin.setIcon(viewmodelGroupDetailsJoinSentInt1BtnJoinAndroidDrawableIcRequestWaitingBtnJoinAndroidDrawableIcIconAwesomeUserPlus);
            this.btnLeave.setVisibility(viewmodelGroupDetailsMemberInt1ViewVISIBLEViewmodelGroupDetailsTeacherIdViewmodelUserDataIdViewGONEViewINVISIBLE);
            this.btnRemove.setVisibility(viewmodelGroupDetailsTeacherIdViewmodelUserDataIdViewVISIBLEViewGONE);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.btnRequests, viewmodelGroupDetailsRequestsCountConcatBtnRequestsAndroidStringRequests);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.btnStudents, viewmodelGroupDetailsStudentsCountConcatBtnStudentsAndroidStringStudents);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.btnTechType, viewmodelGroupDetailsTeacherSpecialistName);
            te.app.notta.base.ApplicationBinding.loadFullImage(this.icTeacher, viewmodelGroupDetailsTeacherImage);
            this.mboundView19.setVisibility(viewmodelGroupDetailsTeacherIdViewmodelUserDataIdBooleanTrueViewmodelGroupDetailsMemberInt1ViewVISIBLEViewGONE);
            this.mboundView20.setVisibility(viewmodelGroupDetailsTeacherIdViewmodelUserDataIdViewVISIBLEViewGONE);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvDate, viewmodelGroupDetailsCreatedAt);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvGroupDescValue, viewmodelGroupDetailsDescription);
            this.tvTasks.setVisibility(viewmodelGroupDetailsTeacherIdViewmodelUserDataIdBooleanTrueViewmodelGroupDetailsMemberInt1ViewVISIBLEViewGONE);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvTeacherName, viewmodelGroupDetailsTeacherName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvUserWork, viewmodelGroupDetailsTeacherName);
            this.vLine3.setVisibility(viewmodelGroupDetailsTeacherIdViewmodelUserDataIdBooleanTrueViewmodelGroupDetailsMemberInt1ViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x31L) != 0) {
            // api target 1

            te.app.notta.base.ApplicationBinding.getItemsV2Binding(this.mboundView19, viewmodelTasksAdapter, "1", "1");
        }
        if ((dirtyFlags & 0x29L) != 0) {
            // api target 1

            te.app.notta.base.ApplicationBinding.getItemsV2Binding(this.rcMembers, viewmodelGroupDetailsStudentsAdapter, "1", "2");
        }
        if ((dirtyFlags & 0x23L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvProfileTitle, viewmodelPassingObjectObject);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 8: {
                // localize variables for thread safety
                // viewmodel != null
                boolean viewmodelJavaLangObjectNull = false;
                // viewmodel
                te.app.notta.pages.home.viewModels.GroupDetailsViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {




                    viewmodel.action(te.app.notta.utils.Constants.ADD_TASK);
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // viewmodel != null
                boolean viewmodelJavaLangObjectNull = false;
                // viewmodel
                te.app.notta.pages.home.viewModels.GroupDetailsViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {




                    viewmodel.action(te.app.notta.utils.Constants.STUDENT_REQUESTS);
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // viewmodel != null
                boolean viewmodelJavaLangObjectNull = false;
                // viewmodel
                te.app.notta.pages.home.viewModels.GroupDetailsViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {



                    viewmodel.goBack(getRoot().getContext());
                }
                break;
            }
            case 4: {
                // localize variables for thread safety
                // viewmodel != null
                boolean viewmodelJavaLangObjectNull = false;
                // viewmodel
                te.app.notta.pages.home.viewModels.GroupDetailsViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {


                    viewmodel.studentJoinRequest();
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // viewmodel != null
                boolean viewmodelJavaLangObjectNull = false;
                // viewmodel
                te.app.notta.pages.home.viewModels.GroupDetailsViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {




                    viewmodel.action(te.app.notta.utils.Constants.STUDENT);
                }
                break;
            }
            case 5: {
                // localize variables for thread safety
                // viewmodel != null
                boolean viewmodelJavaLangObjectNull = false;
                // viewmodel
                te.app.notta.pages.home.viewModels.GroupDetailsViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {




                    viewmodel.action(te.app.notta.utils.Constants.DIALOG_SHOW_LEAVE);
                }
                break;
            }
            case 7: {
                // localize variables for thread safety
                // viewmodel != null
                boolean viewmodelJavaLangObjectNull = false;
                // viewmodel
                te.app.notta.pages.home.viewModels.GroupDetailsViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {




                    viewmodel.action(te.app.notta.utils.Constants.STUDENT);
                }
                break;
            }
            case 6: {
                // localize variables for thread safety
                // viewmodel != null
                boolean viewmodelJavaLangObjectNull = false;
                // viewmodel
                te.app.notta.pages.home.viewModels.GroupDetailsViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {




                    viewmodel.action(te.app.notta.utils.Constants.DIALOG_SHOW);
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewmodel
        flag 1 (0x2L): viewmodel.passingObject
        flag 2 (0x3L): viewmodel.groupDetails
        flag 3 (0x4L): viewmodel.groupDetailsStudentsAdapter
        flag 4 (0x5L): viewmodel.tasksAdapter
        flag 5 (0x6L): null
        flag 6 (0x7L): viewmodel.groupDetails.teacher.id == viewmodel.userData.id ? View.GONE : View.INVISIBLE
        flag 7 (0x8L): viewmodel.groupDetails.teacher.id == viewmodel.userData.id ? View.GONE : View.INVISIBLE
        flag 8 (0x9L): viewmodel.groupDetails.teacher.id == viewmodel.userData.id ? true : viewmodel.groupDetails.member == 1 ? View.VISIBLE : View.GONE
        flag 9 (0xaL): viewmodel.groupDetails.teacher.id == viewmodel.userData.id ? true : viewmodel.groupDetails.member == 1 ? View.VISIBLE : View.GONE
        flag 10 (0xbL): viewmodel.groupDetails.joinSent == 1 ? @android:drawable/ic_request_waiting : @android:drawable/ic_icon_awesome_user_plus
        flag 11 (0xcL): viewmodel.groupDetails.joinSent == 1 ? @android:drawable/ic_request_waiting : @android:drawable/ic_icon_awesome_user_plus
        flag 12 (0xdL): viewmodel.groupDetails.teacher.id != viewmodel.userData.id ? viewmodel.groupDetails.member == 0 : false ? View.VISIBLE : View.GONE
        flag 13 (0xeL): viewmodel.groupDetails.teacher.id != viewmodel.userData.id ? viewmodel.groupDetails.member == 0 : false ? View.VISIBLE : View.GONE
        flag 14 (0xfL): viewmodel.groupDetails.teacher.id == viewmodel.userData.id ? View.VISIBLE : View.GONE
        flag 15 (0x10L): viewmodel.groupDetails.teacher.id == viewmodel.userData.id ? View.VISIBLE : View.GONE
        flag 16 (0x11L): viewmodel.groupDetails.member == 1 ? View.VISIBLE : viewmodel.groupDetails.teacher.id == viewmodel.userData.id ? View.GONE : View.INVISIBLE
        flag 17 (0x12L): viewmodel.groupDetails.member == 1 ? View.VISIBLE : viewmodel.groupDetails.teacher.id == viewmodel.userData.id ? View.GONE : View.INVISIBLE
        flag 18 (0x13L): viewmodel.groupDetails.teacher.id != viewmodel.userData.id ? viewmodel.groupDetails.member == 0 : false
        flag 19 (0x14L): viewmodel.groupDetails.teacher.id != viewmodel.userData.id ? viewmodel.groupDetails.member == 0 : false
        flag 20 (0x15L): viewmodel.groupDetails.teacher.id == viewmodel.userData.id ? true : viewmodel.groupDetails.member == 1
        flag 21 (0x16L): viewmodel.groupDetails.teacher.id == viewmodel.userData.id ? true : viewmodel.groupDetails.member == 1
    flag mapping end*/
    //end
}