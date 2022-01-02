package te.app.nottaa.databinding;
import te.app.nottaa.R;
import te.app.nottaa.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemStudentRequestBindingImpl extends ItemStudentRequestBinding implements te.app.nottaa.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.br5, 6);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback7;
    @Nullable
    private final android.view.View.OnClickListener mCallback6;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemStudentRequestBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds));
    }
    private ItemStudentRequestBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.constraintlayout.widget.Barrier) bindings[6]
            , (com.makeramen.roundedimageview.RoundedImageView) bindings[1]
            , (te.app.nottaa.customViews.views.CustomTextViewMedium) bindings[2]
            , (te.app.nottaa.customViews.views.CustomTextViewRegular) bindings[3]
            , (com.google.android.material.button.MaterialButton) bindings[5]
            , (com.google.android.material.button.MaterialButton) bindings[4]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.tvMember.setTag(null);
        this.tvTeacherName.setTag(null);
        this.tvUserWork.setTag(null);
        this.userAccept.setTag(null);
        this.userReject.setTag(null);
        setRootTag(root);
        // listeners
        mCallback7 = new te.app.nottaa.generated.callback.OnClickListener(this, 2);
        mCallback6 = new te.app.nottaa.generated.callback.OnClickListener(this, 1);
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
        java.lang.String viewModelStudentsItemStudentName = null;
        te.app.nottaa.pages.groupDetails.models.details.StudentsItem viewModelStudentsItem = null;
        te.app.nottaa.pages.groupDetails.viewModels.ItemGroupStudentViewModel viewModel = mViewModel;
        java.lang.String viewModelStudentsItemStudentImage = null;
        java.lang.String viewModelStudentsItemGroupName = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (viewModel != null) {
                    // read viewModel.studentsItem
                    viewModelStudentsItem = viewModel.getStudentsItem();
                }


                if (viewModelStudentsItem != null) {
                    // read viewModel.studentsItem.studentName
                    viewModelStudentsItemStudentName = viewModelStudentsItem.getStudentName();
                    // read viewModel.studentsItem.studentImage
                    viewModelStudentsItemStudentImage = viewModelStudentsItem.getStudentImage();
                    // read viewModel.studentsItem.group_name
                    viewModelStudentsItemGroupName = viewModelStudentsItem.getGroup_name();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            te.app.nottaa.base.ApplicationBinding.loadImage(this.tvMember, viewModelStudentsItemStudentImage);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvTeacherName, viewModelStudentsItemStudentName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvUserWork, viewModelStudentsItemGroupName);
        }
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.userAccept.setOnClickListener(mCallback7);
            this.userReject.setOnClickListener(mCallback6);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 2: {
                // localize variables for thread safety
                // viewModel
                te.app.nottaa.pages.groupDetails.viewModels.ItemGroupStudentViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {




                    viewModel.itemAction(te.app.nottaa.utils.Constants.ACCEPT);
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // viewModel
                te.app.nottaa.pages.groupDetails.viewModels.ItemGroupStudentViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {




                    viewModel.itemAction(te.app.nottaa.utils.Constants.REJECT);
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel
        flag 1 (0x2L): viewModel.studentsItem
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}