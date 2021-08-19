package grand.app.aber_provider.databinding;
import grand.app.aber_provider.R;
import grand.app.aber_provider.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentAppWalletBindingImpl extends FragmentAppWalletBinding implements grand.app.aber_provider.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.header_layout, 4);
        sViewsWithIds.put(R.id.curve, 5);
        sViewsWithIds.put(R.id.card_my_wallet, 6);
        sViewsWithIds.put(R.id.tv_wallet_balance, 7);
        sViewsWithIds.put(R.id.tv_wallet, 8);
        sViewsWithIds.put(R.id.card_put_balance, 9);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    @NonNull
    private final com.google.android.material.textfield.TextInputEditText mboundView1;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback37;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener mboundView1androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewmodel.raiseWalletRequest.amount
            //         is viewmodel.raiseWalletRequest.setAmount((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView1);
            // localize variables for thread safety
            // viewmodel.raiseWalletRequest != null
            boolean viewmodelRaiseWalletRequestJavaLangObjectNull = false;
            // viewmodel != null
            boolean viewmodelJavaLangObjectNull = false;
            // viewmodel.raiseWalletRequest
            grand.app.aber_provider.pages.appWallet.models.RaiseWalletRequest viewmodelRaiseWalletRequest = null;
            // viewmodel.raiseWalletRequest.amount
            java.lang.String viewmodelRaiseWalletRequestAmount = null;
            // viewmodel
            grand.app.aber_provider.pages.appWallet.viewModels.AppWalletViewModel viewmodel = mViewmodel;



            viewmodelJavaLangObjectNull = (viewmodel) != (null);
            if (viewmodelJavaLangObjectNull) {


                viewmodelRaiseWalletRequest = viewmodel.getRaiseWalletRequest();

                viewmodelRaiseWalletRequestJavaLangObjectNull = (viewmodelRaiseWalletRequest) != (null);
                if (viewmodelRaiseWalletRequestJavaLangObjectNull) {




                    viewmodelRaiseWalletRequest.setAmount(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public FragmentAppWalletBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 10, sIncludes, sViewsWithIds));
    }
    private FragmentAppWalletBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.cardview.widget.CardView) bindings[6]
            , (androidx.cardview.widget.CardView) bindings[9]
            , (androidx.appcompat.widget.AppCompatButton) bindings[3]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[5]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[4]
            , (androidx.recyclerview.widget.RecyclerView) bindings[2]
            , (grand.app.aber_provider.customViews.views.CustomTextViewMedium) bindings[8]
            , (grand.app.aber_provider.customViews.views.CustomTextViewMedium) bindings[7]
            );
        this.chargeAppWalletBtn.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (com.google.android.material.textfield.TextInputEditText) bindings[1];
        this.mboundView1.setTag(null);
        this.rcWalletHistory.setTag(null);
        setRootTag(root);
        // listeners
        mCallback37 = new grand.app.aber_provider.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
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
            setViewmodel((grand.app.aber_provider.pages.appWallet.viewModels.AppWalletViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewmodel(@Nullable grand.app.aber_provider.pages.appWallet.viewModels.AppWalletViewModel Viewmodel) {
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
                return onChangeViewmodel((grand.app.aber_provider.pages.appWallet.viewModels.AppWalletViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewmodel(grand.app.aber_provider.pages.appWallet.viewModels.AppWalletViewModel Viewmodel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
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
        grand.app.aber_provider.pages.appWallet.adapters.AppWalletAdapter viewmodelAppWalletAdapter = null;
        grand.app.aber_provider.pages.appWallet.models.RaiseWalletRequest viewmodelRaiseWalletRequest = null;
        java.lang.String viewmodelRaiseWalletRequestAmount = null;
        grand.app.aber_provider.pages.appWallet.viewModels.AppWalletViewModel viewmodel = mViewmodel;

        if ((dirtyFlags & 0x3L) != 0) {



                if (viewmodel != null) {
                    // read viewmodel.appWalletAdapter
                    viewmodelAppWalletAdapter = viewmodel.getAppWalletAdapter();
                    // read viewmodel.raiseWalletRequest
                    viewmodelRaiseWalletRequest = viewmodel.getRaiseWalletRequest();
                }


                if (viewmodelRaiseWalletRequest != null) {
                    // read viewmodel.raiseWalletRequest.amount
                    viewmodelRaiseWalletRequestAmount = viewmodelRaiseWalletRequest.getAmount();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x2L) != 0) {
            // api target 1

            this.chargeAppWalletBtn.setOnClickListener(mCallback37);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView1, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView1androidTextAttrChanged);
        }
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView1, viewmodelRaiseWalletRequestAmount);
            grand.app.aber_provider.base.ApplicationBinding.getItemsV2Binding(this.rcWalletHistory, viewmodelAppWalletAdapter, "1", "1");
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // viewmodel != null
        boolean viewmodelJavaLangObjectNull = false;
        // viewmodel
        grand.app.aber_provider.pages.appWallet.viewModels.AppWalletViewModel viewmodel = mViewmodel;



        viewmodelJavaLangObjectNull = (viewmodel) != (null);
        if (viewmodelJavaLangObjectNull) {


            viewmodel.putInWallet();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewmodel
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}