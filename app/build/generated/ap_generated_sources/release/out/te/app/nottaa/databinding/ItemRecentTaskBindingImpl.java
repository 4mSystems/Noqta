package te.app.nottaa.databinding;
import te.app.nottaa.R;
import te.app.nottaa.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemRecentTaskBindingImpl extends ItemRecentTaskBinding implements te.app.nottaa.generated.callback.OnClickListener.Listener {

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
    private final te.app.nottaa.customViews.views.CustomTextViewMedium mboundView1;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback25;
    @Nullable
    private final android.view.View.OnClickListener mCallback23;
    @Nullable
    private final android.view.View.OnClickListener mCallback26;
    @Nullable
    private final android.view.View.OnClickListener mCallback24;
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
            , (te.app.nottaa.customViews.views.CustomTextViewRegular) bindings[2]
            , (te.app.nottaa.customViews.views.CustomTextViewMedium) bindings[3]
            );
        this.btnRemove.setTag(null);
        this.btnTech.setTag(null);
        this.btnTechType.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (te.app.nottaa.customViews.views.CustomTextViewMedium) bindings[1];
        this.mboundView1.setTag(null);
        this.tvDate.setTag(null);
        this.tvDetails.setTag(null);
        setRootTag(root);
        // listeners
        mCallback25 = new te.app.nottaa.generated.callback.OnClickListener(this, 3);
        mCallback23 = new te.app.nottaa.generated.callback.OnClickListener(this, 1);
        mCallback26 = new te.app.nottaa.generated.callback.OnClickListener(this, 4);
        mCallback24 = new te.app.nottaa.generated.callback.OnClickListener(this, 2);
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
            setViewModel((te.app.nottaa.pages.groupDetails.viewModels.ItemGroupTasksViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable te.app.nottaa.pages.groupDetails.viewModels.ItemGroupTasksViewModel ViewModel) {
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
                return onChangeViewModel((te.app.nottaa.pages.groupDetails.viewModels.ItemGroupTasksViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModel(te.app.nottaa.pages.groupDetails.viewModels.ItemGroupTasksViewModel ViewModel, int fieldId) {
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
        boolean viewModelTasksItemTechIdInt0ViewModelTasksItemTechIdViewModelUserDataIdBooleanFalse = false;
        boolean viewModelTasksItemTechIdInt0ViewModelTasksItemTechIdViewModelUserDataIdBooleanFalseViewModelTasksItemAnsweredInt0BooleanFalse = false;
        te.app.nottaa.pages.groupDetails.models.details.TasksItem viewModelTasksItem = null;
        int viewModelTasksItemAnswered = 0;
        boolean viewModelTasksItemTechIdViewModelUserDataId = false;
        int viewModelTasksItemTechIdInt0ViewModelTasksItemTechIdViewModelUserDataIdBooleanFalseViewVISIBLEViewGONE = 0;
        java.lang.String viewModelTasksItemDescription = null;
        int viewModelTasksItemTechIdInt0ViewModelTasksItemTechIdViewModelUserDataIdBooleanFalseViewModelTasksItemAnsweredInt0BooleanFalseViewVISIBLEViewGONE = 0;
        boolean ViewModelTasksItemTechIdViewModelUserDataId1 = false;
        java.lang.String viewModelTasksItemCreatedAt = null;
        int viewModelTasksItemTechId = 0;
        te.app.nottaa.pages.auth.models.UserData viewModelUserData = null;
        boolean viewModelTasksItemTechIdInt0 = false;
        boolean viewModelTasksItemAnsweredInt0 = false;
        te.app.nottaa.pages.groupDetails.viewModels.ItemGroupTasksViewModel viewModel = mViewModel;
        boolean ViewModelTasksItemTechIdInt0ViewModelTasksItemTechIdViewModelUserDataIdBooleanFalse1 = false;
        int viewModelTasksItemId = 0;

        if ((dirtyFlags & 0x7L) != 0) {



                if (viewModel != null) {
                    // read viewModel.tasksItem
                    viewModelTasksItem = viewModel.getTasksItem();
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


                // read viewModel.tasksItem.tech_id != 0
                viewModelTasksItemTechIdInt0 = (viewModelTasksItemTechId) != (0);
                // read String.valueOf(viewModel.tasksItem.id)
                stringValueOfViewModelTasksItemId = java.lang.String.valueOf(viewModelTasksItemId);
            if((dirtyFlags & 0x7L) != 0) {
                if(viewModelTasksItemTechIdInt0) {
                        dirtyFlags |= 0x10L;
                        dirtyFlags |= 0x1000L;
                }
                else {
                        dirtyFlags |= 0x8L;
                        dirtyFlags |= 0x800L;
                }
            }
        }
        // batch finished

        if ((dirtyFlags & 0x1010L) != 0) {

                if (viewModel != null) {
                    // read viewModel.userData
                    viewModelUserData = viewModel.userData;
                }


                if (viewModelUserData != null) {
                    // read viewModel.userData.id
                    viewModelUserDataId = viewModelUserData.getId();
                }

            if ((dirtyFlags & 0x1000L) != 0) {

                    // read viewModel.tasksItem.tech_id == viewModel.userData.id
                    viewModelTasksItemTechIdViewModelUserDataId = (viewModelTasksItemTechId) == (viewModelUserDataId);
            }
            if ((dirtyFlags & 0x10L) != 0) {

                    // read viewModel.tasksItem.tech_id != viewModel.userData.id
                    ViewModelTasksItemTechIdViewModelUserDataId1 = (viewModelTasksItemTechId) != (viewModelUserDataId);
            }
        }

        if ((dirtyFlags & 0x7L) != 0) {

                // read viewModel.tasksItem.tech_id != 0 ? viewModel.tasksItem.tech_id != viewModel.userData.id : false
                viewModelTasksItemTechIdInt0ViewModelTasksItemTechIdViewModelUserDataIdBooleanFalse = ((viewModelTasksItemTechIdInt0) ? (ViewModelTasksItemTechIdViewModelUserDataId1) : (false));
                // read viewModel.tasksItem.tech_id != 0 ? viewModel.tasksItem.tech_id == viewModel.userData.id : false
                ViewModelTasksItemTechIdInt0ViewModelTasksItemTechIdViewModelUserDataIdBooleanFalse1 = ((viewModelTasksItemTechIdInt0) ? (viewModelTasksItemTechIdViewModelUserDataId) : (false));
            if((dirtyFlags & 0x7L) != 0) {
                if(viewModelTasksItemTechIdInt0ViewModelTasksItemTechIdViewModelUserDataIdBooleanFalse) {
                        dirtyFlags |= 0x40L;
                }
                else {
                        dirtyFlags |= 0x20L;
                }
            }
            if((dirtyFlags & 0x7L) != 0) {
                if(ViewModelTasksItemTechIdInt0ViewModelTasksItemTechIdViewModelUserDataIdBooleanFalse1) {
                        dirtyFlags |= 0x100L;
                }
                else {
                        dirtyFlags |= 0x80L;
                }
            }


                // read viewModel.tasksItem.tech_id != 0 ? viewModel.tasksItem.tech_id == viewModel.userData.id : false ? View.VISIBLE : View.GONE
                viewModelTasksItemTechIdInt0ViewModelTasksItemTechIdViewModelUserDataIdBooleanFalseViewVISIBLEViewGONE = ((ViewModelTasksItemTechIdInt0ViewModelTasksItemTechIdViewModelUserDataIdBooleanFalse1) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished

        if ((dirtyFlags & 0x40L) != 0) {

                if (viewModelTasksItem != null) {
                    // read viewModel.tasksItem.answered
                    viewModelTasksItemAnswered = viewModelTasksItem.getAnswered();
                }


                // read viewModel.tasksItem.answered == 0
                viewModelTasksItemAnsweredInt0 = (viewModelTasksItemAnswered) == (0);
        }

        if ((dirtyFlags & 0x7L) != 0) {

                // read viewModel.tasksItem.tech_id != 0 ? viewModel.tasksItem.tech_id != viewModel.userData.id : false ? viewModel.tasksItem.answered == 0 : false
                viewModelTasksItemTechIdInt0ViewModelTasksItemTechIdViewModelUserDataIdBooleanFalseViewModelTasksItemAnsweredInt0BooleanFalse = ((viewModelTasksItemTechIdInt0ViewModelTasksItemTechIdViewModelUserDataIdBooleanFalse) ? (viewModelTasksItemAnsweredInt0) : (false));
            if((dirtyFlags & 0x7L) != 0) {
                if(viewModelTasksItemTechIdInt0ViewModelTasksItemTechIdViewModelUserDataIdBooleanFalseViewModelTasksItemAnsweredInt0BooleanFalse) {
                        dirtyFlags |= 0x400L;
                }
                else {
                        dirtyFlags |= 0x200L;
                }
            }


                // read viewModel.tasksItem.tech_id != 0 ? viewModel.tasksItem.tech_id != viewModel.userData.id : false ? viewModel.tasksItem.answered == 0 : false ? View.VISIBLE : View.GONE
                viewModelTasksItemTechIdInt0ViewModelTasksItemTechIdViewModelUserDataIdBooleanFalseViewModelTasksItemAnsweredInt0BooleanFalseViewVISIBLEViewGONE = ((viewModelTasksItemTechIdInt0ViewModelTasksItemTechIdViewModelUserDataIdBooleanFalseViewModelTasksItemAnsweredInt0BooleanFalse) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.btnRemove.setOnClickListener(mCallback26);
            this.btnTech.setOnClickListener(mCallback25);
            this.btnTechType.setOnClickListener(mCallback24);
            this.mboundView0.setOnClickListener(mCallback23);
        }
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            this.btnRemove.setVisibility(viewModelTasksItemTechIdInt0ViewModelTasksItemTechIdViewModelUserDataIdBooleanFalseViewVISIBLEViewGONE);
            this.btnTech.setVisibility(viewModelTasksItemTechIdInt0ViewModelTasksItemTechIdViewModelUserDataIdBooleanFalseViewModelTasksItemAnsweredInt0BooleanFalseViewVISIBLEViewGONE);
            this.btnTechType.setVisibility(viewModelTasksItemTechIdInt0ViewModelTasksItemTechIdViewModelUserDataIdBooleanFalseViewModelTasksItemAnsweredInt0BooleanFalseViewVISIBLEViewGONE);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView1, stringValueOfViewModelTasksItemId);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvDate, viewModelTasksItemCreatedAt);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvDetails, viewModelTasksItemDescription);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 3: {
                // localize variables for thread safety
                // viewModel
                te.app.nottaa.pages.groupDetails.viewModels.ItemGroupTasksViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {




                    viewModel.itemAction(te.app.nottaa.utils.Constants.TAKE_CHANCE);
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // viewModel
                te.app.nottaa.pages.groupDetails.viewModels.ItemGroupTasksViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {




                    viewModel.itemAction(te.app.nottaa.utils.Constants.SHOW_ANSWERS);
                }
                break;
            }
            case 4: {
                // localize variables for thread safety
                // viewModel
                te.app.nottaa.pages.groupDetails.viewModels.ItemGroupTasksViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {




                    viewModel.itemAction(te.app.nottaa.utils.Constants.DELETE_TASK);
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // viewModel
                te.app.nottaa.pages.groupDetails.viewModels.ItemGroupTasksViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {




                    viewModel.itemAction(te.app.nottaa.utils.Constants.Add_ANSWER);
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel
        flag 1 (0x2L): viewModel.tasksItem
        flag 2 (0x3L): null
        flag 3 (0x4L): viewModel.tasksItem.tech_id != 0 ? viewModel.tasksItem.tech_id != viewModel.userData.id : false
        flag 4 (0x5L): viewModel.tasksItem.tech_id != 0 ? viewModel.tasksItem.tech_id != viewModel.userData.id : false
        flag 5 (0x6L): viewModel.tasksItem.tech_id != 0 ? viewModel.tasksItem.tech_id != viewModel.userData.id : false ? viewModel.tasksItem.answered == 0 : false
        flag 6 (0x7L): viewModel.tasksItem.tech_id != 0 ? viewModel.tasksItem.tech_id != viewModel.userData.id : false ? viewModel.tasksItem.answered == 0 : false
        flag 7 (0x8L): viewModel.tasksItem.tech_id != 0 ? viewModel.tasksItem.tech_id == viewModel.userData.id : false ? View.VISIBLE : View.GONE
        flag 8 (0x9L): viewModel.tasksItem.tech_id != 0 ? viewModel.tasksItem.tech_id == viewModel.userData.id : false ? View.VISIBLE : View.GONE
        flag 9 (0xaL): viewModel.tasksItem.tech_id != 0 ? viewModel.tasksItem.tech_id != viewModel.userData.id : false ? viewModel.tasksItem.answered == 0 : false ? View.VISIBLE : View.GONE
        flag 10 (0xbL): viewModel.tasksItem.tech_id != 0 ? viewModel.tasksItem.tech_id != viewModel.userData.id : false ? viewModel.tasksItem.answered == 0 : false ? View.VISIBLE : View.GONE
        flag 11 (0xcL): viewModel.tasksItem.tech_id != 0 ? viewModel.tasksItem.tech_id == viewModel.userData.id : false
        flag 12 (0xdL): viewModel.tasksItem.tech_id != 0 ? viewModel.tasksItem.tech_id == viewModel.userData.id : false
    flag mapping end*/
    //end
}