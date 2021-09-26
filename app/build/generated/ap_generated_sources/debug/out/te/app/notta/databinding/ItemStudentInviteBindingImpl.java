package te.app.notta.databinding;
import te.app.notta.R;
import te.app.notta.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemStudentInviteBindingImpl extends ItemStudentInviteBinding implements te.app.notta.generated.callback.OnCheckedChangeListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.br5, 4);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    @Nullable
    private final android.widget.CompoundButton.OnCheckedChangeListener mCallback51;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemStudentInviteBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private ItemStudentInviteBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.constraintlayout.widget.Barrier) bindings[4]
            , (com.google.android.material.checkbox.MaterialCheckBox) bindings[3]
            , (de.hdodenhof.circleimageview.CircleImageView) bindings[1]
            , (te.app.notta.customViews.views.CustomTextViewMedium) bindings[2]
            );
        this.checkbox.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.tvMember.setTag(null);
        this.tvTeacherName.setTag(null);
        setRootTag(root);
        // listeners
        mCallback51 = new te.app.notta.generated.callback.OnCheckedChangeListener(this, 1);
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
            setViewModel((te.app.notta.pages.teacher.viewModels.ItemStudentInviteViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable te.app.notta.pages.teacher.viewModels.ItemStudentInviteViewModel ViewModel) {
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
                return onChangeViewModel((te.app.notta.pages.teacher.viewModels.ItemStudentInviteViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModel(te.app.notta.pages.teacher.viewModels.ItemStudentInviteViewModel ViewModel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        else if (fieldId == BR.student) {
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
        te.app.notta.pages.auth.models.UserData viewModelStudent = null;
        java.lang.String viewModelStudentImage = null;
        java.lang.String viewModelStudentName = null;
        te.app.notta.pages.teacher.viewModels.ItemStudentInviteViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0x7L) != 0) {



                if (viewModel != null) {
                    // read viewModel.student
                    viewModelStudent = viewModel.getStudent();
                }


                if (viewModelStudent != null) {
                    // read viewModel.student.image
                    viewModelStudentImage = viewModelStudent.getImage();
                    // read viewModel.student.name
                    viewModelStudentName = viewModelStudent.getName();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            androidx.databinding.adapters.CompoundButtonBindingAdapter.setListeners(this.checkbox, mCallback51, (androidx.databinding.InverseBindingListener)null);
        }
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            te.app.notta.base.ApplicationBinding.loadImage(this.tvMember, viewModelStudentImage);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvTeacherName, viewModelStudentName);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnCheckedChanged(int sourceId , android.widget.CompoundButton callbackArg_0, boolean callbackArg_1) {
        // localize variables for thread safety
        // viewModel
        te.app.notta.pages.teacher.viewModels.ItemStudentInviteViewModel viewModel = mViewModel;
        // viewModel != null
        boolean viewModelJavaLangObjectNull = false;



        viewModelJavaLangObjectNull = (viewModel) != (null);
        if (viewModelJavaLangObjectNull) {




            viewModel.onCheckedChange(callbackArg_0, callbackArg_1);
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel
        flag 1 (0x2L): viewModel.student
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}