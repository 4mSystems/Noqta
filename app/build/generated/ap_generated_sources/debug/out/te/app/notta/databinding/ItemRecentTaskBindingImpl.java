package te.app.notta.databinding;
import te.app.notta.R;
import te.app.notta.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemRecentTaskBindingImpl extends ItemRecentTaskBinding implements te.app.notta.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.MaterialCardView, 7);
        sViewsWithIds.put(R.id.br4, 8);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    @NonNull
    private final te.app.notta.customViews.views.CustomTextViewMedium mboundView1;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback41;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemRecentTaskBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 9, sIncludes, sViewsWithIds));
    }
    private ItemRecentTaskBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (com.google.android.material.card.MaterialCardView) bindings[7]
            , (androidx.constraintlayout.widget.Barrier) bindings[8]
            , (com.google.android.material.button.MaterialButton) bindings[6]
            , (com.google.android.material.button.MaterialButton) bindings[5]
            , (com.google.android.material.button.MaterialButton) bindings[4]
            , (te.app.notta.customViews.views.CustomTextViewRegular) bindings[2]
            , (te.app.notta.customViews.views.CustomTextViewMedium) bindings[3]
            );
        this.btnRemove.setTag(null);
        this.btnTech.setTag(null);
        this.btnTechType.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (te.app.notta.customViews.views.CustomTextViewMedium) bindings[1];
        this.mboundView1.setTag(null);
        this.tvDate.setTag(null);
        this.tvDetails.setTag(null);
        setRootTag(root);
        // listeners
        mCallback41 = new te.app.notta.generated.callback.OnClickListener(this, 1);
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
            setViewModel((te.app.notta.pages.home.viewModels.ItemGroupTasksViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable te.app.notta.pages.home.viewModels.ItemGroupTasksViewModel ViewModel) {
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
                return onChangeViewModel((te.app.notta.pages.home.viewModels.ItemGroupTasksViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModel(te.app.notta.pages.home.viewModels.ItemGroupTasksViewModel ViewModel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        else if (fieldId == BR.tasksItem) {
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
        java.lang.String stringValueOfViewModelTasksItemId = null;
        te.app.notta.pages.home.models.details.TasksItem viewModelTasksItem = null;
        boolean viewModelTasksItemTechIdViewModelUserDataId = false;
        java.lang.String viewModelTasksItemDescription = null;
        int viewModelTasksItemTechIdViewModelUserDataIdViewVISIBLEViewGONE = 0;
        boolean ViewModelTasksItemTechIdViewModelUserDataId1 = false;
        java.lang.String viewModelTasksItemCreatedAt = null;
        int viewModelTasksItemTechId = 0;
        te.app.notta.pages.auth.models.UserData viewModelUserData = null;
        te.app.notta.pages.home.viewModels.ItemGroupTasksViewModel viewModel = mViewModel;
        int ViewModelTasksItemTechIdViewModelUserDataIdViewVISIBLEViewGONE1 = 0;
        int viewModelTasksItemId = 0;

        if ((dirtyFlags & 0x7L) != 0) {



                if (viewModel != null) {
                    // read viewModel.tasksItem
                    viewModelTasksItem = viewModel.getTasksItem();
                    // read viewModel.userData
                    viewModelUserData = viewModel.userData;
                }


                if (viewModelTasksItem != null) {
                    // read viewModel.tasksItem.description
                    viewModelTasksItemDescription = viewModelTasksItem.getDescription();
                    // read viewModel.tasksItem.createdAt
                    viewModelTasksItemCreatedAt = viewModelTasksItem.getCreatedAt();
                    // read viewModel.tasksItem.tech_id
                    viewModelTasksItemTechId = viewModelTasksItem.getTech_id();
                    // read viewModel.tasksItem.id
                    viewModelTasksItemId = viewModelTasksItem.getId();
                }
                if (viewModelUserData != null) {
                    // read viewModel.userData.id
                    viewModelUserDataId = viewModelUserData.getId();
                }


                // read String.valueOf(viewModel.tasksItem.id)
                stringValueOfViewModelTasksItemId = java.lang.String.valueOf(viewModelTasksItemId);
                // read viewModel.tasksItem.tech_id == viewModel.userData.id
                viewModelTasksItemTechIdViewModelUserDataId = (viewModelTasksItemTechId) == (viewModelUserDataId);
                // read viewModel.tasksItem.tech_id != viewModel.userData.id
                ViewModelTasksItemTechIdViewModelUserDataId1 = (viewModelTasksItemTechId) != (viewModelUserDataId);
            if((dirtyFlags & 0x7L) != 0) {
                if(viewModelTasksItemTechIdViewModelUserDataId) {
                        dirtyFlags |= 0x10L;
                }
                else {
                        dirtyFlags |= 0x8L;
                }
            }
            if((dirtyFlags & 0x7L) != 0) {
                if(ViewModelTasksItemTechIdViewModelUserDataId1) {
                        dirtyFlags |= 0x40L;
                }
                else {
                        dirtyFlags |= 0x20L;
                }
            }


                // read viewModel.tasksItem.tech_id == viewModel.userData.id ? View.VISIBLE : View.GONE
                viewModelTasksItemTechIdViewModelUserDataIdViewVISIBLEViewGONE = ((viewModelTasksItemTechIdViewModelUserDataId) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                // read viewModel.tasksItem.tech_id != viewModel.userData.id ? View.VISIBLE : View.GONE
                ViewModelTasksItemTechIdViewModelUserDataIdViewVISIBLEViewGONE1 = ((ViewModelTasksItemTechIdViewModelUserDataId1) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.btnRemove.setOnClickListener(mCallback41);
        }
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            this.btnRemove.setVisibility(viewModelTasksItemTechIdViewModelUserDataIdViewVISIBLEViewGONE);
            this.btnTech.setVisibility(ViewModelTasksItemTechIdViewModelUserDataIdViewVISIBLEViewGONE1);
            this.btnTechType.setVisibility(ViewModelTasksItemTechIdViewModelUserDataIdViewVISIBLEViewGONE1);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView1, stringValueOfViewModelTasksItemId);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvDate, viewModelTasksItemCreatedAt);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvDetails, viewModelTasksItemDescription);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // viewModel
        te.app.notta.pages.home.viewModels.ItemGroupTasksViewModel viewModel = mViewModel;
        // viewModel != null
        boolean viewModelJavaLangObjectNull = false;



        viewModelJavaLangObjectNull = (viewModel) != (null);
        if (viewModelJavaLangObjectNull) {




            viewModel.itemAction(te.app.notta.utils.Constants.DELETE_TASK);
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel
        flag 1 (0x2L): viewModel.tasksItem
        flag 2 (0x3L): null
        flag 3 (0x4L): viewModel.tasksItem.tech_id == viewModel.userData.id ? View.VISIBLE : View.GONE
        flag 4 (0x5L): viewModel.tasksItem.tech_id == viewModel.userData.id ? View.VISIBLE : View.GONE
        flag 5 (0x6L): viewModel.tasksItem.tech_id != viewModel.userData.id ? View.VISIBLE : View.GONE
        flag 6 (0x7L): viewModel.tasksItem.tech_id != viewModel.userData.id ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}