package te.app.notta.databinding;
import te.app.notta.R;
import te.app.notta.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemPointsBindingImpl extends ItemPointsBinding implements te.app.notta.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.br2, 7);
    }
    // views
    @NonNull
    private final androidx.cardview.widget.CardView mboundView0;
    @NonNull
    private final android.view.View mboundView5;
    @NonNull
    private final androidx.appcompat.widget.AppCompatButton mboundView6;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback34;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemPointsBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds));
    }
    private ItemPointsBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.constraintlayout.widget.Barrier) bindings[7]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[3]
            , (com.makeramen.roundedimageview.RoundedImageView) bindings[1]
            , (te.app.notta.customViews.views.CustomTextViewMedium) bindings[4]
            , (te.app.notta.customViews.views.CustomTextViewMedium) bindings[2]
            );
        this.icDelete.setTag(null);
        this.icUser.setTag(null);
        this.mboundView0 = (androidx.cardview.widget.CardView) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView5 = (android.view.View) bindings[5];
        this.mboundView5.setTag(null);
        this.mboundView6 = (androidx.appcompat.widget.AppCompatButton) bindings[6];
        this.mboundView6.setTag(null);
        this.tvDescPoint.setTag(null);
        this.tvGroupName.setTag(null);
        setRootTag(root);
        // listeners
        mCallback34 = new te.app.notta.generated.callback.OnClickListener(this, 1);
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
            setViewModel((te.app.notta.pages.home.viewModels.ItemPointsViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable te.app.notta.pages.home.viewModels.ItemPointsViewModel ViewModel) {
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
                return onChangeViewModel((te.app.notta.pages.home.viewModels.ItemPointsViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModel(te.app.notta.pages.home.viewModels.ItemPointsViewModel ViewModel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        else if (fieldId == BR.pointsData) {
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
        java.lang.String viewModelPointsDataImage = null;
        te.app.notta.pages.home.models.points.PointsData viewModelPointsData = null;
        boolean viewModelUserDataTypeEqualsJavaLangString2 = false;
        te.app.notta.pages.auth.models.UserData viewModelUserData = null;
        java.lang.String viewModelPointsDataDescription = null;
        int viewModelUserDataTypeEqualsJavaLangString1ViewVISIBLEViewGONE = 0;
        boolean viewModelUserDataTypeEqualsJavaLangString1 = false;
        te.app.notta.pages.home.viewModels.ItemPointsViewModel viewModel = mViewModel;
        java.lang.String viewModelPointsDataName = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (viewModel != null) {
                    // read viewModel.pointsData
                    viewModelPointsData = viewModel.getPointsData();
                }


                if (viewModelPointsData != null) {
                    // read viewModel.pointsData.image
                    viewModelPointsDataImage = viewModelPointsData.getImage();
                    // read viewModel.pointsData.description
                    viewModelPointsDataDescription = viewModelPointsData.getDescription();
                    // read viewModel.pointsData.name
                    viewModelPointsDataName = viewModelPointsData.getName();
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
                        // read viewModel.userData.type.equals("1")
                        viewModelUserDataTypeEqualsJavaLangString1 = viewModelUserDataType.equals("1");
                    }
                if((dirtyFlags & 0x5L) != 0) {
                    if(viewModelUserDataTypeEqualsJavaLangString2) {
                            dirtyFlags |= 0x10L;
                    }
                    else {
                            dirtyFlags |= 0x8L;
                    }
                }
                if((dirtyFlags & 0x5L) != 0) {
                    if(viewModelUserDataTypeEqualsJavaLangString1) {
                            dirtyFlags |= 0x40L;
                    }
                    else {
                            dirtyFlags |= 0x20L;
                    }
                }


                    // read viewModel.userData.type.equals("2") ? View.VISIBLE : View.GONE
                    viewModelUserDataTypeEqualsJavaLangString2ViewVISIBLEViewGONE = ((viewModelUserDataTypeEqualsJavaLangString2) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                    // read viewModel.userData.type.equals("1") ? View.VISIBLE : View.GONE
                    viewModelUserDataTypeEqualsJavaLangString1ViewVISIBLEViewGONE = ((viewModelUserDataTypeEqualsJavaLangString1) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
        }
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.icDelete.setOnClickListener(mCallback34);
        }
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            this.icDelete.setVisibility(viewModelUserDataTypeEqualsJavaLangString2ViewVISIBLEViewGONE);
            this.mboundView5.setVisibility(viewModelUserDataTypeEqualsJavaLangString2ViewVISIBLEViewGONE);
            this.mboundView6.setVisibility(viewModelUserDataTypeEqualsJavaLangString1ViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            te.app.notta.base.ApplicationBinding.loadImage(this.icUser, viewModelPointsDataImage);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvDescPoint, viewModelPointsDataDescription);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvGroupName, viewModelPointsDataName);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // viewModel
        te.app.notta.pages.home.viewModels.ItemPointsViewModel viewModel = mViewModel;
        // viewModel != null
        boolean viewModelJavaLangObjectNull = false;



        viewModelJavaLangObjectNull = (viewModel) != (null);
        if (viewModelJavaLangObjectNull) {




            viewModel.itemAction(te.app.notta.utils.Constants.DELETE_GIFT);
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel
        flag 1 (0x2L): viewModel.pointsData
        flag 2 (0x3L): null
        flag 3 (0x4L): viewModel.userData.type.equals("2") ? View.VISIBLE : View.GONE
        flag 4 (0x5L): viewModel.userData.type.equals("2") ? View.VISIBLE : View.GONE
        flag 5 (0x6L): viewModel.userData.type.equals("1") ? View.VISIBLE : View.GONE
        flag 6 (0x7L): viewModel.userData.type.equals("1") ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}