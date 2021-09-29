package te.app.notta.databinding;
import te.app.notta.R;
import te.app.notta.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemStudentRequestBindingImpl extends ItemStudentRequestBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.user_reject, 4);
        sViewsWithIds.put(R.id.user_accept, 5);
        sViewsWithIds.put(R.id.br5, 6);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
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
            , (te.app.notta.customViews.views.CustomTextViewMedium) bindings[2]
            , (te.app.notta.customViews.views.CustomTextViewRegular) bindings[3]
            , (com.google.android.material.button.MaterialButton) bindings[5]
            , (com.google.android.material.button.MaterialButton) bindings[4]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.tvMember.setTag(null);
        this.tvTeacherName.setTag(null);
        this.tvUserWork.setTag(null);
        setRootTag(root);
        // listeners
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
            setViewModel((te.app.notta.pages.home.viewModels.ItemGroupStudentViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable te.app.notta.pages.home.viewModels.ItemGroupStudentViewModel ViewModel) {
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
                return onChangeViewModel((te.app.notta.pages.home.viewModels.ItemGroupStudentViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModel(te.app.notta.pages.home.viewModels.ItemGroupStudentViewModel ViewModel, int fieldId) {
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
        java.lang.String viewModelStudentsItemGroupId = null;
        te.app.notta.pages.home.models.details.StudentsItem viewModelStudentsItem = null;
        te.app.notta.pages.home.viewModels.ItemGroupStudentViewModel viewModel = mViewModel;
        java.lang.String viewModelStudentsItemStudentImage = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (viewModel != null) {
                    // read viewModel.studentsItem
                    viewModelStudentsItem = viewModel.getStudentsItem();
                }


                if (viewModelStudentsItem != null) {
                    // read viewModel.studentsItem.studentName
                    viewModelStudentsItemStudentName = viewModelStudentsItem.getStudentName();
                    // read viewModel.studentsItem.groupId
                    viewModelStudentsItemGroupId = viewModelStudentsItem.getGroupId();
                    // read viewModel.studentsItem.studentImage
                    viewModelStudentsItemStudentImage = viewModelStudentsItem.getStudentImage();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            te.app.notta.base.ApplicationBinding.loadImage(this.tvMember, viewModelStudentsItemStudentImage);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvTeacherName, viewModelStudentsItemStudentName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvUserWork, viewModelStudentsItemGroupId);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel
        flag 1 (0x2L): viewModel.studentsItem
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}