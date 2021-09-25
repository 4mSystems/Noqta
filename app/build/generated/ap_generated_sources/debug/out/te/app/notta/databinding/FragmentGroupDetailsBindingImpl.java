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
        sViewsWithIds.put(R.id.board_header, 18);
        sViewsWithIds.put(R.id.tv_location, 19);
        sViewsWithIds.put(R.id.flow, 20);
        sViewsWithIds.put(R.id.br3, 21);
        sViewsWithIds.put(R.id.v_line, 22);
        sViewsWithIds.put(R.id.tv_group_desc, 23);
        sViewsWithIds.put(R.id.v_line1, 24);
        sViewsWithIds.put(R.id.tv_info, 25);
        sViewsWithIds.put(R.id.flow1, 26);
        sViewsWithIds.put(R.id.v_line2, 27);
        sViewsWithIds.put(R.id.tv_members, 28);
        sViewsWithIds.put(R.id.v_line3, 29);
        sViewsWithIds.put(R.id.tv_tasks, 30);
    }
    // views
    @NonNull
    private final androidx.coordinatorlayout.widget.CoordinatorLayout mboundView0;
    @NonNull
    private final androidx.recyclerview.widget.RecyclerView mboundView16;
    @NonNull
    private final com.google.android.material.floatingactionbutton.FloatingActionButton mboundView17;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback35;
    @Nullable
    private final android.view.View.OnClickListener mCallback36;
    @Nullable
    private final android.view.View.OnClickListener mCallback33;
    @Nullable
    private final android.view.View.OnClickListener mCallback34;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentGroupDetailsBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 31, sIncludes, sViewsWithIds));
    }
    private FragmentGroupDetailsBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (com.google.android.material.floatingactionbutton.FloatingActionButton) bindings[2]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[18]
            , (androidx.constraintlayout.widget.Barrier) bindings[21]
            , (com.google.android.material.button.MaterialButton) bindings[10]
            , (com.google.android.material.button.MaterialButton) bindings[12]
            , (com.google.android.material.button.MaterialButton) bindings[13]
            , (com.google.android.material.button.MaterialButton) bindings[11]
            , (com.google.android.material.button.MaterialButton) bindings[9]
            , (com.google.android.material.button.MaterialButton) bindings[6]
            , (androidx.constraintlayout.helper.widget.Flow) bindings[20]
            , (androidx.constraintlayout.helper.widget.Flow) bindings[26]
            , (com.makeramen.roundedimageview.RoundedImageView) bindings[3]
            , (androidx.recyclerview.widget.RecyclerView) bindings[15]
            , (te.app.notta.customViews.views.CustomTextViewRegular) bindings[7]
            , (te.app.notta.customViews.views.CustomTextViewMedium) bindings[23]
            , (te.app.notta.customViews.views.CustomTextViewRegular) bindings[8]
            , (te.app.notta.customViews.views.CustomTextViewMedium) bindings[25]
            , (te.app.notta.customViews.views.CustomTextViewRegular) bindings[19]
            , (te.app.notta.customViews.views.CustomTextViewMedium) bindings[28]
            , (te.app.notta.customViews.views.CustomTextViewMedium) bindings[1]
            , (te.app.notta.customViews.views.CustomTextViewMedium) bindings[14]
            , (te.app.notta.customViews.views.CustomTextViewMedium) bindings[30]
            , (te.app.notta.customViews.views.CustomTextViewMedium) bindings[4]
            , (te.app.notta.customViews.views.CustomTextViewRegular) bindings[5]
            , (android.view.View) bindings[22]
            , (android.view.View) bindings[24]
            , (android.view.View) bindings[27]
            , (android.view.View) bindings[29]
            );
        this.back.setTag(null);
        this.btnGroups.setTag(null);
        this.btnJoin.setTag(null);
        this.btnRemove.setTag(null);
        this.btnRequests.setTag(null);
        this.btnStudents.setTag(null);
        this.btnTechType.setTag(null);
        this.icTeacher.setTag(null);
        this.mboundView0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView16 = (androidx.recyclerview.widget.RecyclerView) bindings[16];
        this.mboundView16.setTag(null);
        this.mboundView17 = (com.google.android.material.floatingactionbutton.FloatingActionButton) bindings[17];
        this.mboundView17.setTag(null);
        this.rcMembers.setTag(null);
        this.tvDate.setTag(null);
        this.tvGroupDescValue.setTag(null);
        this.tvProfileTitle.setTag(null);
        this.tvShowAll.setTag(null);
        this.tvTeacherName.setTag(null);
        this.tvUserWork.setTag(null);
        setRootTag(root);
        // listeners
        mCallback35 = new te.app.notta.generated.callback.OnClickListener(this, 3);
        mCallback36 = new te.app.notta.generated.callback.OnClickListener(this, 4);
        mCallback33 = new te.app.notta.generated.callback.OnClickListener(this, 1);
        mCallback34 = new te.app.notta.generated.callback.OnClickListener(this, 2);
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
        int viewmodelGroupDetailsTeacherIdViewmodelUserDataIdViewVISIBLEViewGONE = 0;
        te.app.notta.pages.home.models.details.GroupDetails viewmodelGroupDetails = null;
        java.lang.String viewmodelGroupDetailsTeacherSpecialistName = null;
        java.lang.String viewmodelGroupDetailsStudentsCountConcatBtnStudentsAndroidStringStudents = null;
        java.lang.String viewmodelPassingObjectObject = null;
        int viewmodelGroupDetailsTeacherId = 0;
        java.lang.String viewmodelGroupDetailsTasksCount = null;
        te.app.notta.pages.home.adapters.GroupDetailsStudentsAdapter viewmodelGroupDetailsStudentsAdapter = null;
        java.lang.String viewmodelGroupDetailsTeacherName = null;
        boolean viewmodelGroupDetailsTeacherIdViewmodelUserDataId = false;
        java.lang.String viewmodelGroupDetailsTasksCountConcatBtnGroupsAndroidStringTasks = null;
        java.lang.String viewmodelGroupDetailsTeacherImage = null;
        java.lang.String viewmodelGroupDetailsStudentsCount = null;
        java.lang.String viewmodelGroupDetailsRequestsCountConcatBtnRequestsAndroidStringRequests = null;
        te.app.notta.pages.auth.models.UserData viewmodelGroupDetailsTeacher = null;
        java.lang.String viewmodelGroupDetailsRequestsCount = null;
        int ViewmodelGroupDetailsTeacherIdViewmodelUserDataIdViewVISIBLEViewGONE1 = 0;
        boolean ViewmodelGroupDetailsTeacherIdViewmodelUserDataId1 = false;
        te.app.notta.pages.auth.models.UserData viewmodelUserData = null;
        int viewmodelUserDataId = 0;
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
                        // read viewmodel.groupDetails.studentsCount
                        viewmodelGroupDetailsStudentsCount = viewmodelGroupDetails.getStudentsCount();
                        // read viewmodel.groupDetails.teacher
                        viewmodelGroupDetailsTeacher = viewmodelGroupDetails.getTeacher();
                        // read viewmodel.groupDetails.requestsCount
                        viewmodelGroupDetailsRequestsCount = viewmodelGroupDetails.getRequestsCount();
                    }
                    if (viewmodelUserData != null) {
                        // read viewmodel.userData.id
                        viewmodelUserDataId = viewmodelUserData.getId();
                    }


                    if (viewmodelGroupDetailsTasksCount != null) {
                        // read viewmodel.groupDetails.tasksCount.concat(@android:string/tasks)
                        viewmodelGroupDetailsTasksCountConcatBtnGroupsAndroidStringTasks = viewmodelGroupDetailsTasksCount.concat(btnGroups.getResources().getString(R.string.tasks));
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


                    // read viewmodel.groupDetails.teacher.id != viewmodel.userData.id
                    viewmodelGroupDetailsTeacherIdViewmodelUserDataId = (viewmodelGroupDetailsTeacherId) != (viewmodelUserDataId);
                    // read viewmodel.groupDetails.teacher.id == viewmodel.userData.id
                    ViewmodelGroupDetailsTeacherIdViewmodelUserDataId1 = (viewmodelGroupDetailsTeacherId) == (viewmodelUserDataId);
                if((dirtyFlags & 0x25L) != 0) {
                    if(viewmodelGroupDetailsTeacherIdViewmodelUserDataId) {
                            dirtyFlags |= 0x80L;
                    }
                    else {
                            dirtyFlags |= 0x40L;
                    }
                }
                if((dirtyFlags & 0x25L) != 0) {
                    if(ViewmodelGroupDetailsTeacherIdViewmodelUserDataId1) {
                            dirtyFlags |= 0x200L;
                    }
                    else {
                            dirtyFlags |= 0x100L;
                    }
                }


                    // read viewmodel.groupDetails.teacher.id != viewmodel.userData.id ? View.VISIBLE : View.GONE
                    viewmodelGroupDetailsTeacherIdViewmodelUserDataIdViewVISIBLEViewGONE = ((viewmodelGroupDetailsTeacherIdViewmodelUserDataId) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                    // read viewmodel.groupDetails.teacher.id == viewmodel.userData.id ? View.VISIBLE : View.GONE
                    ViewmodelGroupDetailsTeacherIdViewmodelUserDataIdViewVISIBLEViewGONE1 = ((ViewmodelGroupDetailsTeacherIdViewmodelUserDataId1) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x29L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.groupDetailsStudentsAdapter
                        viewmodelGroupDetailsStudentsAdapter = viewmodel.getGroupDetailsStudentsAdapter();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x20L) != 0) {
            // api target 1

            this.back.setOnClickListener(mCallback33);
            this.btnRemove.setOnClickListener(mCallback34);
            this.mboundView17.setOnClickListener(mCallback36);
            this.tvShowAll.setOnClickListener(mCallback35);
        }
        if ((dirtyFlags & 0x25L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.btnGroups, viewmodelGroupDetailsTasksCountConcatBtnGroupsAndroidStringTasks);
            this.btnJoin.setVisibility(viewmodelGroupDetailsTeacherIdViewmodelUserDataIdViewVISIBLEViewGONE);
            this.btnRemove.setVisibility(ViewmodelGroupDetailsTeacherIdViewmodelUserDataIdViewVISIBLEViewGONE1);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.btnRequests, viewmodelGroupDetailsRequestsCountConcatBtnRequestsAndroidStringRequests);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.btnStudents, viewmodelGroupDetailsStudentsCountConcatBtnStudentsAndroidStringStudents);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.btnTechType, viewmodelGroupDetailsTeacherSpecialistName);
            te.app.notta.base.ApplicationBinding.loadImage(this.icTeacher, viewmodelGroupDetailsTeacherImage);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvDate, viewmodelGroupDetailsCreatedAt);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvGroupDescValue, viewmodelGroupDetailsDescription);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvTeacherName, viewmodelGroupDetailsTeacherName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvUserWork, viewmodelGroupDetailsTeacherName);
        }
        if ((dirtyFlags & 0x31L) != 0) {
            // api target 1

            te.app.notta.base.ApplicationBinding.getItemsV2Binding(this.mboundView16, viewmodelTasksAdapter, "1", "1");
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
            case 3: {
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
            case 4: {
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
            case 2: {
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
        flag 6 (0x7L): viewmodel.groupDetails.teacher.id != viewmodel.userData.id ? View.VISIBLE : View.GONE
        flag 7 (0x8L): viewmodel.groupDetails.teacher.id != viewmodel.userData.id ? View.VISIBLE : View.GONE
        flag 8 (0x9L): viewmodel.groupDetails.teacher.id == viewmodel.userData.id ? View.VISIBLE : View.GONE
        flag 9 (0xaL): viewmodel.groupDetails.teacher.id == viewmodel.userData.id ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}