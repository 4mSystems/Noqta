package te.app.notta.databinding;
import te.app.notta.R;
import te.app.notta.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemTaskMediaBindingImpl extends ItemTaskMediaBinding implements te.app.notta.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    @NonNull
    private final androidx.appcompat.widget.AppCompatImageView mboundView2;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback98;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemTaskMediaBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 3, sIncludes, sViewsWithIds));
    }
    private ItemTaskMediaBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (com.makeramen.roundedimageview.RoundedImageView) bindings[1]
            );
        this.icUser.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView2 = (androidx.appcompat.widget.AppCompatImageView) bindings[2];
        this.mboundView2.setTag(null);
        setRootTag(root);
        // listeners
        mCallback98 = new te.app.notta.generated.callback.OnClickListener(this, 1);
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
            setViewModel((te.app.notta.pages.addAnswer.viewModels.ItemTaskMediaViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable te.app.notta.pages.addAnswer.viewModels.ItemTaskMediaViewModel ViewModel) {
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
                return onChangeViewModel((te.app.notta.pages.addAnswer.viewModels.ItemTaskMediaViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModel(te.app.notta.pages.addAnswer.viewModels.ItemTaskMediaViewModel ViewModel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        else if (fieldId == BR.taskFilesItem) {
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
        int viewModelTaskFilesItemTypeInt1ViewVISIBLEViewGONE = 0;
        boolean viewModelTaskFilesItemTypeInt1 = false;
        java.lang.String viewModelTaskFilesItemFile = null;
        te.app.notta.pages.addAnswer.models.TaskFilesItem viewModelTaskFilesItem = null;
        te.app.notta.pages.addAnswer.viewModels.ItemTaskMediaViewModel viewModel = mViewModel;
        int viewModelTaskFilesItemType = 0;

        if ((dirtyFlags & 0x7L) != 0) {



                if (viewModel != null) {
                    // read viewModel.taskFilesItem
                    viewModelTaskFilesItem = viewModel.getTaskFilesItem();
                }


                if (viewModelTaskFilesItem != null) {
                    // read viewModel.taskFilesItem.file
                    viewModelTaskFilesItemFile = viewModelTaskFilesItem.getFile();
                    // read viewModel.taskFilesItem.type
                    viewModelTaskFilesItemType = viewModelTaskFilesItem.getType();
                }


                // read viewModel.taskFilesItem.type == 1
                viewModelTaskFilesItemTypeInt1 = (viewModelTaskFilesItemType) == (1);
            if((dirtyFlags & 0x7L) != 0) {
                if(viewModelTaskFilesItemTypeInt1) {
                        dirtyFlags |= 0x10L;
                }
                else {
                        dirtyFlags |= 0x8L;
                }
            }


                // read viewModel.taskFilesItem.type == 1 ? View.VISIBLE : View.GONE
                viewModelTaskFilesItemTypeInt1ViewVISIBLEViewGONE = ((viewModelTaskFilesItemTypeInt1) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            te.app.notta.base.ApplicationBinding.loadFullImage(this.icUser, viewModelTaskFilesItemFile);
            this.mboundView2.setVisibility(viewModelTaskFilesItemTypeInt1ViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.mboundView2.setOnClickListener(mCallback98);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // viewModel
        te.app.notta.pages.addAnswer.viewModels.ItemTaskMediaViewModel viewModel = mViewModel;
        // viewModel != null
        boolean viewModelJavaLangObjectNull = false;



        viewModelJavaLangObjectNull = (viewModel) != (null);
        if (viewModelJavaLangObjectNull) {


            viewModel.itemAction();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel
        flag 1 (0x2L): viewModel.taskFilesItem
        flag 2 (0x3L): null
        flag 3 (0x4L): viewModel.taskFilesItem.type == 1 ? View.VISIBLE : View.GONE
        flag 4 (0x5L): viewModel.taskFilesItem.type == 1 ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}