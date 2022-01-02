package te.app.nottaa.databinding;
import te.app.nottaa.R;
import te.app.nottaa.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemMemberBindingImpl extends ItemMemberBinding implements te.app.nottaa.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.btn, 6);
        sViewsWithIds.put(R.id.br6, 7);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    @NonNull
    private final te.app.nottaa.customViews.views.CustomTextViewRegular mboundView2;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback3;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemMemberBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds));
    }
    private ItemMemberBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.constraintlayout.widget.Barrier) bindings[7]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[6]
            , (com.google.android.material.button.MaterialButton) bindings[5]
            , (com.makeramen.roundedimageview.RoundedImageView) bindings[1]
            , (te.app.nottaa.customViews.views.CustomTextViewMedium) bindings[3]
            , (te.app.nottaa.customViews.views.CustomTextViewRegular) bindings[4]
            );
        this.btnShowAnswers.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView2 = (te.app.nottaa.customViews.views.CustomTextViewRegular) bindings[2];
        this.mboundView2.setTag(null);
        this.tvMember.setTag(null);
        this.tvTeacherName.setTag(null);
        this.tvUserWork.setTag(null);
        setRootTag(root);
        // listeners
        mCallback3 = new te.app.nottaa.generated.callback.OnClickListener(this, 1);
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
            setViewModel((te.app.nottaa.pages.groupDetails.viewModels.ItemGroupStudentViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable te.app.nottaa.pages.groupDetails.viewModels.ItemGroupStudentViewModel ViewModel) {
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
                return onChangeViewModel((te.app.nottaa.pages.groupDetails.viewModels.ItemGroupStudentViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModel(te.app.nottaa.pages.groupDetails.viewModels.ItemGroupStudentViewModel ViewModel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        else if (fieldId == BR.studentsItem) {
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
        java.lang.String viewModelUserDataType = null;
        int viewModelUserDataTypeEqualsJavaLangString2ViewVISIBLEViewGONE = 0;
        java.lang.String viewModelStudentsItemStudentPoints = null;
        java.lang.String viewModelStudentsItemStudentName = null;
        te.app.nottaa.pages.groupDetails.models.details.StudentsItem viewModelStudentsItem = null;
        boolean viewModelUserDataTypeEqualsJavaLangString2 = false;
        te.app.nottaa.pages.auth.models.UserData viewModelUserData = null;
        te.app.nottaa.pages.groupDetails.viewModels.ItemGroupStudentViewModel viewModel = mViewModel;
        java.lang.String viewModelStudentsItemStudentImage = null;
        java.lang.String viewModelStudentsItemGroupName = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (viewModel != null) {
                    // read viewModel.studentsItem
                    viewModelStudentsItem = viewModel.getStudentsItem();
                }


                if (viewModelStudentsItem != null) {
                    // read viewModel.studentsItem.studentPoints
                    viewModelStudentsItemStudentPoints = viewModelStudentsItem.getStudentPoints();
                    // read viewModel.studentsItem.studentName
                    viewModelStudentsItemStudentName = viewModelStudentsItem.getStudentName();
                    // read viewModel.studentsItem.studentImage
                    viewModelStudentsItemStudentImage = viewModelStudentsItem.getStudentImage();
                    // read viewModel.studentsItem.group_name
                    viewModelStudentsItemGroupName = viewModelStudentsItem.getGroup_name();
                }
            if ((dirtyFlags & 0x5L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.userData
                        viewModelUserData = viewModel.userData;
                    }


                    if (viewModelUserData != null) {
                        // read viewModel.userData.type
                        viewModelUserDataType = viewModelUserData.getType();
                    }


                    if (viewModelUserDataType != null) {
                        // read viewModel.userData.type.equals("2")
                        viewModelUserDataTypeEqualsJavaLangString2 = viewModelUserDataType.equals("2");
                    }
                if((dirtyFlags & 0x5L) != 0) {
                    if(viewModelUserDataTypeEqualsJavaLangString2) {
                            dirtyFlags |= 0x10L;
                    }
                    else {
                            dirtyFlags |= 0x8L;
                    }
                }


                    // read viewModel.userData.type.equals("2") ? View.VISIBLE : View.GONE
                    viewModelUserDataTypeEqualsJavaLangString2ViewVISIBLEViewGONE = ((viewModelUserDataTypeEqualsJavaLangString2) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
        }
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.btnShowAnswers.setOnClickListener(mCallback3);
        }
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            this.btnShowAnswers.setVisibility(viewModelUserDataTypeEqualsJavaLangString2ViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, viewModelStudentsItemStudentPoints);
            te.app.nottaa.base.ApplicationBinding.loadFullImage(this.tvMember, viewModelStudentsItemStudentImage);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvTeacherName, viewModelStudentsItemStudentName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvUserWork, viewModelStudentsItemGroupName);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // viewModel
        te.app.nottaa.pages.groupDetails.viewModels.ItemGroupStudentViewModel viewModel = mViewModel;
        // viewModel != null
        boolean viewModelJavaLangObjectNull = false;



        viewModelJavaLangObjectNull = (viewModel) != (null);
        if (viewModelJavaLangObjectNull) {




            viewModel.itemAction(te.app.nottaa.utils.Constants.SHOW_ANSWERS);
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel
        flag 1 (0x2L): viewModel.studentsItem
        flag 2 (0x3L): null
        flag 3 (0x4L): viewModel.userData.type.equals("2") ? View.VISIBLE : View.GONE
        flag 4 (0x5L): viewModel.userData.type.equals("2") ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}