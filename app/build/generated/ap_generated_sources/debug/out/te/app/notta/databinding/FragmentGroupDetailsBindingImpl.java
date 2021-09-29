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
        sViewsWithIds.put(R.id.board_header, 20);
        sViewsWithIds.put(R.id.tv_location, 21);
        sViewsWithIds.put(R.id.flow, 22);
        sViewsWithIds.put(R.id.br3, 23);
        sViewsWithIds.put(R.id.v_line, 24);
        sViewsWithIds.put(R.id.tv_group_desc, 25);
        sViewsWithIds.put(R.id.v_line1, 26);
        sViewsWithIds.put(R.id.tv_info, 27);
        sViewsWithIds.put(R.id.flow1, 28);
        sViewsWithIds.put(R.id.v_line2, 29);
        sViewsWithIds.put(R.id.tv_members, 30);
    }
    // views
    @NonNull
    private final androidx.coordinatorlayout.widget.CoordinatorLayout mboundView0;
    @NonNull
    private final androidx.recyclerview.widget.RecyclerView mboundView18;
    @NonNull
    private final com.google.android.material.floatingactionbutton.FloatingActionButton mboundView19;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback43;
    @Nullable
    private final android.view.View.OnClickListener mCallback42;
    @Nullable
    private final android.view.View.OnClickListener mCallback44;
    @Nullable
    private final android.view.View.OnClickListener mCallback45;
    @Nullable
    private final android.view.View.OnClickListener mCallback46;
    @Nullable
    private final android.view.View.OnClickListener mCallback41;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentGroupDetailsBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 31, sIncludes, sViewsWithIds));
    }
    private FragmentGroupDetailsBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (com.google.android.material.floatingactionbutton.FloatingActionButton) bindings[2]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[20]
            , (androidx.constraintlayout.widget.Barrier) bindings[23]
            , (com.google.android.material.button.MaterialButton) bindings[10]
            , (com.google.android.material.button.MaterialButton) bindings[12]
            , (com.google.android.material.button.MaterialButton) bindings[13]
            , (com.google.android.material.button.MaterialButton) bindings[11]
            , (com.google.android.material.button.MaterialButton) bindings[9]
            , (com.google.android.material.button.MaterialButton) bindings[6]
            , (androidx.constraintlayout.helper.widget.Flow) bindings[22]
            , (androidx.constraintlayout.helper.widget.Flow) bindings[28]
            , (com.makeramen.roundedimageview.RoundedImageView) bindings[3]
            , (androidx.recyclerview.widget.RecyclerView) bindings[15]
            , (te.app.notta.customViews.views.CustomTextViewRegular) bindings[7]
            , (te.app.notta.customViews.views.CustomTextViewMedium) bindings[25]
            , (te.app.notta.customViews.views.CustomTextViewRegular) bindings[8]
            , (te.app.notta.customViews.views.CustomTextViewMedium) bindings[27]
            , (te.app.notta.customViews.views.CustomTextViewRegular) bindings[21]
            , (te.app.notta.customViews.views.CustomTextViewMedium) bindings[30]
            , (te.app.notta.customViews.views.CustomTextViewMedium) bindings[1]
            , (te.app.notta.customViews.views.CustomTextViewMedium) bindings[14]
            , (te.app.notta.customViews.views.CustomTextViewMedium) bindings[17]
            , (te.app.notta.customViews.views.CustomTextViewMedium) bindings[4]
            , (te.app.notta.customViews.views.CustomTextViewRegular) bindings[5]
            , (android.view.View) bindings[24]
            , (android.view.View) bindings[26]
            , (android.view.View) bindings[29]
            , (android.view.View) bindings[16]
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
        this.mboundView18 = (androidx.recyclerview.widget.RecyclerView) bindings[18];
        this.mboundView18.setTag(null);
        this.mboundView19 = (com.google.android.material.floatingactionbutton.FloatingActionButton) bindings[19];
        this.mboundView19.setTag(null);
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
        mCallback43 = new te.app.notta.generated.callback.OnClickListener(this, 3);
        mCallback42 = new te.app.notta.generated.callback.OnClickListener(this, 2);
        mCallback44 = new te.app.notta.generated.callback.OnClickListener(this, 4);
        mCallback45 = new te.app.notta.generated.callback.OnClickListener(this, 5);
        mCallback46 = new te.app.notta.generated.callback.OnClickListener(this, 6);
        mCallback41 = new te.app.notta.generated.callback.OnClickListener(this, 1);
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
        te.app.notta.pages.home.models.details.GroupDetails viewmodelGroupDetails = null;
        int viewmodelGroupDetailsTeacherIdViewmodelUserDataIdBooleanTrueViewmodelGroupDetailsMemberInt1ViewVISIBLEViewGONE = 0;
        java.lang.String viewmodelGroupDetailsTeacherSpecialistName = null;
        java.lang.String viewmodelGroupDetailsStudentsCountConcatBtnStudentsAndroidStringStudents = null;
        java.lang.String viewmodelPassingObjectObject = null;
        int viewmodelGroupDetailsTeacherId = 0;
        java.lang.String viewmodelGroupDetailsTasksCount = null;
        int viewmodelGroupDetailsMember = 0;
        te.app.notta.pages.home.adapters.GroupDetailsStudentsAdapter viewmodelGroupDetailsStudentsAdapter = null;
        java.lang.String viewmodelGroupDetailsTeacherName = null;
        java.lang.String viewmodelGroupDetailsTasksCountConcatBtnGroupsAndroidStringTasks = null;
        java.lang.String viewmodelGroupDetailsTeacherImage = null;
        boolean viewmodelGroupDetailsMemberInt1 = false;
        java.lang.String viewmodelGroupDetailsStudentsCount = null;
        java.lang.String viewmodelGroupDetailsRequestsCountConcatBtnRequestsAndroidStringRequests = null;
        te.app.notta.pages.auth.models.UserData viewmodelGroupDetailsTeacher = null;
        java.lang.String viewmodelGroupDetailsRequestsCount = null;
        int viewmodelGroupDetailsTeacherIdViewmodelUserDataIdViewVISIBLEViewGONE = 0;
        int viewmodelGroupDetailsMemberInt1ViewVISIBLEViewmodelGroupDetailsTeacherIdViewmodelUserDataIdViewGONEViewINVISIBLE = 0;
        boolean viewmodelGroupDetailsTeacherIdViewmodelUserDataId = false;
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
                if((dirtyFlags & 0x25L) != 0) {
                    if(viewmodelGroupDetailsMemberInt1) {
                            dirtyFlags |= 0x2000L;
                    }
                    else {
                            dirtyFlags |= 0x1000L;
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


                    // read viewmodel.groupDetails.teacher.id == viewmodel.userData.id
                    viewmodelGroupDetailsTeacherIdViewmodelUserDataId = (viewmodelGroupDetailsTeacherId) == (viewmodelUserDataId);
                if((dirtyFlags & 0x1000L) != 0) {
                    if(viewmodelGroupDetailsTeacherIdViewmodelUserDataId) {
                            dirtyFlags |= 0x80L;
                    }
                    else {
                            dirtyFlags |= 0x40L;
                    }
                }
                if((dirtyFlags & 0x25L) != 0) {
                    if(viewmodelGroupDetailsTeacherIdViewmodelUserDataId) {
                            dirtyFlags |= 0x800L;
                            dirtyFlags |= 0x8000L;
                    }
                    else {
                            dirtyFlags |= 0x400L;
                            dirtyFlags |= 0x4000L;
                    }
                }


                    // read viewmodel.groupDetails.teacher.id == viewmodel.userData.id ? View.VISIBLE : View.GONE
                    viewmodelGroupDetailsTeacherIdViewmodelUserDataIdViewVISIBLEViewGONE = ((viewmodelGroupDetailsTeacherIdViewmodelUserDataId) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x29L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.groupDetailsStudentsAdapter
                        viewmodelGroupDetailsStudentsAdapter = viewmodel.getGroupDetailsStudentsAdapter();
                    }
            }
        }
        // batch finished

        if ((dirtyFlags & 0x1000L) != 0) {

                // read viewmodel.groupDetails.teacher.id == viewmodel.userData.id ? View.GONE : View.INVISIBLE
                viewmodelGroupDetailsTeacherIdViewmodelUserDataIdViewGONEViewINVISIBLE = ((viewmodelGroupDetailsTeacherIdViewmodelUserDataId) ? (android.view.View.GONE) : (android.view.View.INVISIBLE));
        }
        if ((dirtyFlags & 0x25L) != 0) {

                // read viewmodel.groupDetails.teacher.id == viewmodel.userData.id ? true : viewmodel.groupDetails.member == 1
                viewmodelGroupDetailsTeacherIdViewmodelUserDataIdBooleanTrueViewmodelGroupDetailsMemberInt1 = ((viewmodelGroupDetailsTeacherIdViewmodelUserDataId) ? (true) : (viewmodelGroupDetailsMemberInt1));
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
        }
        // batch finished
        if ((dirtyFlags & 0x20L) != 0) {
            // api target 1

            this.back.setOnClickListener(mCallback41);
            this.btnRemove.setOnClickListener(mCallback44);
            this.btnRequests.setOnClickListener(mCallback43);
            this.btnStudents.setOnClickListener(mCallback42);
            this.mboundView19.setOnClickListener(mCallback46);
            this.tvShowAll.setOnClickListener(mCallback45);
        }
        if ((dirtyFlags & 0x25L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.btnGroups, viewmodelGroupDetailsTasksCountConcatBtnGroupsAndroidStringTasks);
            this.btnJoin.setVisibility(viewmodelGroupDetailsMemberInt1ViewVISIBLEViewmodelGroupDetailsTeacherIdViewmodelUserDataIdViewGONEViewINVISIBLE);
            this.btnRemove.setVisibility(viewmodelGroupDetailsTeacherIdViewmodelUserDataIdViewVISIBLEViewGONE);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.btnRequests, viewmodelGroupDetailsRequestsCountConcatBtnRequestsAndroidStringRequests);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.btnStudents, viewmodelGroupDetailsStudentsCountConcatBtnStudentsAndroidStringStudents);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.btnTechType, viewmodelGroupDetailsTeacherSpecialistName);
            te.app.notta.base.ApplicationBinding.loadImage(this.icTeacher, viewmodelGroupDetailsTeacherImage);
            this.mboundView18.setVisibility(viewmodelGroupDetailsTeacherIdViewmodelUserDataIdBooleanTrueViewmodelGroupDetailsMemberInt1ViewVISIBLEViewGONE);
            this.mboundView19.setVisibility(viewmodelGroupDetailsTeacherIdViewmodelUserDataIdViewVISIBLEViewGONE);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvDate, viewmodelGroupDetailsCreatedAt);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvGroupDescValue, viewmodelGroupDetailsDescription);
            this.tvTasks.setVisibility(viewmodelGroupDetailsTeacherIdViewmodelUserDataIdBooleanTrueViewmodelGroupDetailsMemberInt1ViewVISIBLEViewGONE);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvTeacherName, viewmodelGroupDetailsTeacherName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvUserWork, viewmodelGroupDetailsTeacherName);
            this.vLine3.setVisibility(viewmodelGroupDetailsTeacherIdViewmodelUserDataIdBooleanTrueViewmodelGroupDetailsMemberInt1ViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x31L) != 0) {
            // api target 1

            te.app.notta.base.ApplicationBinding.getItemsV2Binding(this.mboundView18, viewmodelTasksAdapter, "1", "1");
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




                    viewmodel.action(te.app.notta.utils.Constants.STUDENT_REQUESTS);
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
            case 4: {
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
            case 5: {
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
        flag 10 (0xbL): viewmodel.groupDetails.teacher.id == viewmodel.userData.id ? View.VISIBLE : View.GONE
        flag 11 (0xcL): viewmodel.groupDetails.teacher.id == viewmodel.userData.id ? View.VISIBLE : View.GONE
        flag 12 (0xdL): viewmodel.groupDetails.member == 1 ? View.VISIBLE : viewmodel.groupDetails.teacher.id == viewmodel.userData.id ? View.GONE : View.INVISIBLE
        flag 13 (0xeL): viewmodel.groupDetails.member == 1 ? View.VISIBLE : viewmodel.groupDetails.teacher.id == viewmodel.userData.id ? View.GONE : View.INVISIBLE
        flag 14 (0xfL): viewmodel.groupDetails.teacher.id == viewmodel.userData.id ? true : viewmodel.groupDetails.member == 1
        flag 15 (0x10L): viewmodel.groupDetails.teacher.id == viewmodel.userData.id ? true : viewmodel.groupDetails.member == 1
    flag mapping end*/
    //end
}