package te.app.notta.databinding;
import te.app.notta.R;
import te.app.notta.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemMyGroupBindingImpl extends ItemMyGroupBinding implements te.app.notta.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.br1, 11);
    }
    // views
    @NonNull
    private final androidx.cardview.widget.CardView mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback27;
    @Nullable
    private final android.view.View.OnClickListener mCallback28;
    @Nullable
    private final android.view.View.OnClickListener mCallback26;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemMyGroupBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 12, sIncludes, sViewsWithIds));
    }
    private ItemMyGroupBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.constraintlayout.widget.Barrier) bindings[11]
            , (com.google.android.material.button.MaterialButton) bindings[7]
            , (com.google.android.material.button.MaterialButton) bindings[9]
            , (com.google.android.material.button.MaterialButton) bindings[8]
            , (com.google.android.material.button.MaterialButton) bindings[6]
            , (com.google.android.material.button.MaterialButton) bindings[10]
            , (com.google.android.material.button.MaterialButton) bindings[5]
            , (com.makeramen.roundedimageview.RoundedImageView) bindings[1]
            , (te.app.notta.customViews.views.CustomTextViewMedium) bindings[2]
            , (te.app.notta.customViews.views.CustomTextViewMedium) bindings[3]
            , (te.app.notta.customViews.views.CustomTextViewRegular) bindings[4]
            );
        this.btnGroups.setTag(null);
        this.btnJoin.setTag(null);
        this.btnRequests.setTag(null);
        this.btnStudents.setTag(null);
        this.btnTask.setTag(null);
        this.btnTechType.setTag(null);
        this.icUser.setTag(null);
        this.mboundView0 = (androidx.cardview.widget.CardView) bindings[0];
        this.mboundView0.setTag(null);
        this.tvGroupName.setTag(null);
        this.tvUserName.setTag(null);
        this.tvUserWork.setTag(null);
        setRootTag(root);
        // listeners
        mCallback27 = new te.app.notta.generated.callback.OnClickListener(this, 2);
        mCallback28 = new te.app.notta.generated.callback.OnClickListener(this, 3);
        mCallback26 = new te.app.notta.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
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
        if (BR.viewModel == variableId) {
            setViewModel((te.app.notta.pages.home.viewModels.ItemHomeViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable te.app.notta.pages.home.viewModels.ItemHomeViewModel ViewModel) {
        updateRegistration(0, ViewModel);
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModel((te.app.notta.pages.home.viewModels.ItemHomeViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModel(te.app.notta.pages.home.viewModels.ItemHomeViewModel ViewModel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        else if (fieldId == BR.groupItem) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
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
        int viewModelUserDataId = 0;
        int viewModelGroupItemTeacherId = 0;
        java.lang.String viewModelGroupItemDescription = null;
        te.app.notta.pages.home.models.GroupItem viewModelGroupItem = null;
        java.lang.String viewModelGroupItemStudentsCountConcatBtnStudentsAndroidStringStudents = null;
        int viewModelGroupItemJoinSent = 0;
        java.lang.String viewModelGroupItemTasksCount = null;
        boolean viewModelGroupItemJoinSentInt1 = false;
        java.lang.String viewModelGroupItemRequestsCount = null;
        te.app.notta.pages.auth.models.UserData viewModelGroupItemTeacher = null;
        boolean viewModelGroupItemTeacherIdViewModelUserDataId = false;
        java.lang.String viewModelGroupItemStudentsCount = null;
        java.lang.String viewModelGroupItemRequestsCountConcatBtnRequestsAndroidStringRequests = null;
        int viewModelGroupItemTeacherIdViewModelUserDataIdViewVISIBLEViewGONE = 0;
        java.lang.String viewModelGroupItemName = null;
        java.lang.String viewModelGroupItemTeacherSpecialistName = null;
        int ViewModelGroupItemTeacherIdViewModelUserDataIdViewVISIBLEViewGONE1 = 0;
        java.lang.String viewModelGroupItemTeacherName = null;
        te.app.notta.pages.auth.models.UserData viewModelUserData = null;
        java.lang.String viewModelGroupItemTeacherImage = null;
        java.lang.String viewModelGroupItemTasksCountConcatBtnGroupsAndroidStringTasks = null;
        te.app.notta.pages.home.viewModels.ItemHomeViewModel viewModel = mViewModel;
        boolean ViewModelGroupItemTeacherIdViewModelUserDataId1 = false;
        android.graphics.drawable.Drawable viewModelGroupItemJoinSentInt1BtnJoinAndroidDrawableIcRequestWaitingBtnJoinAndroidDrawableIcIconAwesomeUserPlus = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (viewModel != null) {
                    // read viewModel.groupItem
                    viewModelGroupItem = viewModel.getGroupItem();
                    // read viewModel.userData
                    viewModelUserData = viewModel.userData;
                }


                if (viewModelGroupItem != null) {
                    // read viewModel.groupItem.description
                    viewModelGroupItemDescription = viewModelGroupItem.getDescription();
                    // read viewModel.groupItem.joinSent
                    viewModelGroupItemJoinSent = viewModelGroupItem.isJoinSent();
                    // read viewModel.groupItem.tasksCount
                    viewModelGroupItemTasksCount = viewModelGroupItem.getTasksCount();
                    // read viewModel.groupItem.requestsCount
                    viewModelGroupItemRequestsCount = viewModelGroupItem.getRequestsCount();
                    // read viewModel.groupItem.teacher
                    viewModelGroupItemTeacher = viewModelGroupItem.getTeacher();
                    // read viewModel.groupItem.studentsCount
                    viewModelGroupItemStudentsCount = viewModelGroupItem.getStudentsCount();
                    // read viewModel.groupItem.name
                    viewModelGroupItemName = viewModelGroupItem.getName();
                }
                if (viewModelUserData != null) {
                    // read viewModel.userData.id
                    viewModelUserDataId = viewModelUserData.getId();
                }


                // read viewModel.groupItem.joinSent == 1
                viewModelGroupItemJoinSentInt1 = (viewModelGroupItemJoinSent) == (1);
            if((dirtyFlags & 0x7L) != 0) {
                if(viewModelGroupItemJoinSentInt1) {
                        dirtyFlags |= 0x100L;
                }
                else {
                        dirtyFlags |= 0x80L;
                }
            }
                if (viewModelGroupItemTasksCount != null) {
                    // read viewModel.groupItem.tasksCount.concat(@android:string/tasks)
                    viewModelGroupItemTasksCountConcatBtnGroupsAndroidStringTasks = viewModelGroupItemTasksCount.concat(btnGroups.getResources().getString(R.string.tasks));
                }
                if (viewModelGroupItemRequestsCount != null) {
                    // read viewModel.groupItem.requestsCount.concat(@android:string/requests)
                    viewModelGroupItemRequestsCountConcatBtnRequestsAndroidStringRequests = viewModelGroupItemRequestsCount.concat(btnRequests.getResources().getString(R.string.requests));
                }
                if (viewModelGroupItemTeacher != null) {
                    // read viewModel.groupItem.teacher.id
                    viewModelGroupItemTeacherId = viewModelGroupItemTeacher.getId();
                    // read viewModel.groupItem.teacher.specialistName
                    viewModelGroupItemTeacherSpecialistName = viewModelGroupItemTeacher.getSpecialistName();
                    // read viewModel.groupItem.teacher.name
                    viewModelGroupItemTeacherName = viewModelGroupItemTeacher.getName();
                    // read viewModel.groupItem.teacher.image
                    viewModelGroupItemTeacherImage = viewModelGroupItemTeacher.getImage();
                }
                if (viewModelGroupItemStudentsCount != null) {
                    // read viewModel.groupItem.studentsCount.concat(@android:string/students)
                    viewModelGroupItemStudentsCountConcatBtnStudentsAndroidStringStudents = viewModelGroupItemStudentsCount.concat(btnStudents.getResources().getString(R.string.students));
                }


                // read viewModel.groupItem.joinSent == 1 ? @android:drawable/ic_request_waiting : @android:drawable/ic_icon_awesome_user_plus
                viewModelGroupItemJoinSentInt1BtnJoinAndroidDrawableIcRequestWaitingBtnJoinAndroidDrawableIcIconAwesomeUserPlus = ((viewModelGroupItemJoinSentInt1) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(btnJoin.getContext(), R.drawable.ic_request_waiting)) : (androidx.appcompat.content.res.AppCompatResources.getDrawable(btnJoin.getContext(), R.drawable.ic_icon_awesome_user_plus)));
                // read viewModel.groupItem.teacher.id == viewModel.userData.id
                viewModelGroupItemTeacherIdViewModelUserDataId = (viewModelGroupItemTeacherId) == (viewModelUserDataId);
                // read viewModel.groupItem.teacher.id != viewModel.userData.id
                ViewModelGroupItemTeacherIdViewModelUserDataId1 = (viewModelGroupItemTeacherId) != (viewModelUserDataId);
            if((dirtyFlags & 0x7L) != 0) {
                if(viewModelGroupItemTeacherIdViewModelUserDataId) {
                        dirtyFlags |= 0x40L;
                }
                else {
                        dirtyFlags |= 0x20L;
                }
            }
            if((dirtyFlags & 0x7L) != 0) {
                if(ViewModelGroupItemTeacherIdViewModelUserDataId1) {
                        dirtyFlags |= 0x10L;
                }
                else {
                        dirtyFlags |= 0x8L;
                }
            }


                // read viewModel.groupItem.teacher.id == viewModel.userData.id ? View.VISIBLE : View.GONE
                ViewModelGroupItemTeacherIdViewModelUserDataIdViewVISIBLEViewGONE1 = ((viewModelGroupItemTeacherIdViewModelUserDataId) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                // read viewModel.groupItem.teacher.id != viewModel.userData.id ? View.VISIBLE : View.GONE
                viewModelGroupItemTeacherIdViewModelUserDataIdViewVISIBLEViewGONE = ((ViewModelGroupItemTeacherIdViewModelUserDataId1) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.btnGroups, viewModelGroupItemTasksCountConcatBtnGroupsAndroidStringTasks);
            this.btnJoin.setVisibility(viewModelGroupItemTeacherIdViewModelUserDataIdViewVISIBLEViewGONE);
            this.btnJoin.setIcon(viewModelGroupItemJoinSentInt1BtnJoinAndroidDrawableIcRequestWaitingBtnJoinAndroidDrawableIcIconAwesomeUserPlus);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.btnRequests, viewModelGroupItemRequestsCountConcatBtnRequestsAndroidStringRequests);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.btnStudents, viewModelGroupItemStudentsCountConcatBtnStudentsAndroidStringStudents);
            this.btnTask.setVisibility(ViewModelGroupItemTeacherIdViewModelUserDataIdViewVISIBLEViewGONE1);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.btnTechType, viewModelGroupItemTeacherSpecialistName);
            te.app.notta.base.ApplicationBinding.loadImage(this.icUser, viewModelGroupItemTeacherImage);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvGroupName, viewModelGroupItemName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvUserName, viewModelGroupItemTeacherName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvUserWork, viewModelGroupItemDescription);
        }
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.btnJoin.setOnClickListener(mCallback27);
            this.btnTask.setOnClickListener(mCallback28);
            this.mboundView0.setOnClickListener(mCallback26);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 2: {
                // localize variables for thread safety
                // viewModel
                te.app.notta.pages.home.viewModels.ItemHomeViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {




                    viewModel.itemAction(te.app.notta.utils.Constants.JOIN_REQUEST);
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // viewModel
                te.app.notta.pages.home.viewModels.ItemHomeViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {




                    viewModel.itemAction(te.app.notta.utils.Constants.DELETE_GROUP);
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // viewModel
                te.app.notta.pages.home.viewModels.ItemHomeViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {




                    viewModel.itemAction(te.app.notta.utils.Constants.GROUP_DETAILS);
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel
        flag 1 (0x2L): viewModel.groupItem
        flag 2 (0x3L): null
        flag 3 (0x4L): viewModel.groupItem.teacher.id != viewModel.userData.id ? View.VISIBLE : View.GONE
        flag 4 (0x5L): viewModel.groupItem.teacher.id != viewModel.userData.id ? View.VISIBLE : View.GONE
        flag 5 (0x6L): viewModel.groupItem.teacher.id == viewModel.userData.id ? View.VISIBLE : View.GONE
        flag 6 (0x7L): viewModel.groupItem.teacher.id == viewModel.userData.id ? View.VISIBLE : View.GONE
        flag 7 (0x8L): viewModel.groupItem.joinSent == 1 ? @android:drawable/ic_request_waiting : @android:drawable/ic_icon_awesome_user_plus
        flag 8 (0x9L): viewModel.groupItem.joinSent == 1 ? @android:drawable/ic_request_waiting : @android:drawable/ic_icon_awesome_user_plus
    flag mapping end*/
    //end
}