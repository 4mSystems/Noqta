package grand.app.aber_provider.databinding;
import grand.app.aber_provider.R;
import grand.app.aber_provider.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentMyAccountSettingsBindingImpl extends FragmentMyAccountSettingsBinding implements grand.app.aber_provider.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.curve, 7);
        sViewsWithIds.put(R.id.card_packages, 8);
    }
    // views
    @NonNull
    private final androidx.core.widget.NestedScrollView mboundView0;
    @NonNull
    private final com.google.android.material.floatingactionbutton.FloatingActionButton mboundView2;
    @NonNull
    private final com.google.android.material.floatingactionbutton.FloatingActionButton mboundView4;
    @NonNull
    private final androidx.cardview.widget.CardView mboundView5;
    @NonNull
    private final com.google.android.material.floatingactionbutton.FloatingActionButton mboundView6;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback10;
    @Nullable
    private final android.view.View.OnClickListener mCallback9;
    @Nullable
    private final android.view.View.OnClickListener mCallback7;
    @Nullable
    private final android.view.View.OnClickListener mCallback8;
    @Nullable
    private final android.view.View.OnClickListener mCallback5;
    @Nullable
    private final android.view.View.OnClickListener mCallback6;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentMyAccountSettingsBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 9, sIncludes, sViewsWithIds));
    }
    private FragmentMyAccountSettingsBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.cardview.widget.CardView) bindings[3]
            , (androidx.cardview.widget.CardView) bindings[8]
            , (androidx.cardview.widget.CardView) bindings[1]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[7]
            );
        this.cardMyWallet.setTag(null);
        this.cardProfile.setTag(null);
        this.mboundView0 = (androidx.core.widget.NestedScrollView) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView2 = (com.google.android.material.floatingactionbutton.FloatingActionButton) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView4 = (com.google.android.material.floatingactionbutton.FloatingActionButton) bindings[4];
        this.mboundView4.setTag(null);
        this.mboundView5 = (androidx.cardview.widget.CardView) bindings[5];
        this.mboundView5.setTag(null);
        this.mboundView6 = (com.google.android.material.floatingactionbutton.FloatingActionButton) bindings[6];
        this.mboundView6.setTag(null);
        setRootTag(root);
        // listeners
        mCallback10 = new grand.app.aber_provider.generated.callback.OnClickListener(this, 6);
        mCallback9 = new grand.app.aber_provider.generated.callback.OnClickListener(this, 5);
        mCallback7 = new grand.app.aber_provider.generated.callback.OnClickListener(this, 3);
        mCallback8 = new grand.app.aber_provider.generated.callback.OnClickListener(this, 4);
        mCallback5 = new grand.app.aber_provider.generated.callback.OnClickListener(this, 1);
        mCallback6 = new grand.app.aber_provider.generated.callback.OnClickListener(this, 2);
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
            setViewmodel((grand.app.aber_provider.pages.settings.viewModels.MyAccountSettingsViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewmodel(@Nullable grand.app.aber_provider.pages.settings.viewModels.MyAccountSettingsViewModel Viewmodel) {
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
                return onChangeViewmodel((grand.app.aber_provider.pages.settings.viewModels.MyAccountSettingsViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewmodel(grand.app.aber_provider.pages.settings.viewModels.MyAccountSettingsViewModel Viewmodel, int fieldId) {
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
        int viewmodelUserDataIsPromoted = 0;
        int viewmodelUserDataIsPromotedInt0ViewVISIBLEViewGONE = 0;
        grand.app.aber_provider.pages.auth.models.UserData viewmodelUserData = null;
        boolean viewmodelUserDataIsPromotedInt0 = false;
        grand.app.aber_provider.pages.settings.viewModels.MyAccountSettingsViewModel viewmodel = mViewmodel;

        if ((dirtyFlags & 0x3L) != 0) {



                if (viewmodel != null) {
                    // read viewmodel.userData
                    viewmodelUserData = viewmodel.userData;
                }


                if (viewmodelUserData != null) {
                    // read viewmodel.userData.isPromoted
                    viewmodelUserDataIsPromoted = viewmodelUserData.getIsPromoted();
                }


                // read viewmodel.userData.isPromoted == 0
                viewmodelUserDataIsPromotedInt0 = (viewmodelUserDataIsPromoted) == (0);
            if((dirtyFlags & 0x3L) != 0) {
                if(viewmodelUserDataIsPromotedInt0) {
                        dirtyFlags |= 0x8L;
                }
                else {
                        dirtyFlags |= 0x4L;
                }
            }


                // read viewmodel.userData.isPromoted == 0 ? View.VISIBLE : View.GONE
                viewmodelUserDataIsPromotedInt0ViewVISIBLEViewGONE = ((viewmodelUserDataIsPromotedInt0) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished
        if ((dirtyFlags & 0x2L) != 0) {
            // api target 1

            this.cardMyWallet.setOnClickListener(mCallback7);
            this.cardProfile.setOnClickListener(mCallback5);
            this.mboundView2.setOnClickListener(mCallback6);
            this.mboundView4.setOnClickListener(mCallback8);
            this.mboundView5.setOnClickListener(mCallback9);
            this.mboundView6.setOnClickListener(mCallback10);
        }
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            this.cardMyWallet.setVisibility(viewmodelUserDataIsPromotedInt0ViewVISIBLEViewGONE);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 6: {
                // localize variables for thread safety
                // viewmodel != null
                boolean viewmodelJavaLangObjectNull = false;
                // viewmodel
                grand.app.aber_provider.pages.settings.viewModels.MyAccountSettingsViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {




                    viewmodel.buttonActions(grand.app.aber_provider.utils.Constants.SHOW_LOGOUT_WARNING);
                }
                break;
            }
            case 5: {
                // localize variables for thread safety
                // viewmodel != null
                boolean viewmodelJavaLangObjectNull = false;
                // viewmodel
                grand.app.aber_provider.pages.settings.viewModels.MyAccountSettingsViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {




                    viewmodel.buttonActions(grand.app.aber_provider.utils.Constants.SHOW_LOGOUT_WARNING);
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // viewmodel != null
                boolean viewmodelJavaLangObjectNull = false;
                // viewmodel
                grand.app.aber_provider.pages.settings.viewModels.MyAccountSettingsViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {




                    viewmodel.buttonActions(grand.app.aber_provider.utils.Constants.INSTURCTOR);
                }
                break;
            }
            case 4: {
                // localize variables for thread safety
                // viewmodel != null
                boolean viewmodelJavaLangObjectNull = false;
                // viewmodel
                grand.app.aber_provider.pages.settings.viewModels.MyAccountSettingsViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {




                    viewmodel.buttonActions(grand.app.aber_provider.utils.Constants.INSTURCTOR);
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // viewmodel != null
                boolean viewmodelJavaLangObjectNull = false;
                // viewmodel
                grand.app.aber_provider.pages.settings.viewModels.MyAccountSettingsViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {




                    viewmodel.buttonActions(grand.app.aber_provider.utils.Constants.QUESTIONS);
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // viewmodel != null
                boolean viewmodelJavaLangObjectNull = false;
                // viewmodel
                grand.app.aber_provider.pages.settings.viewModels.MyAccountSettingsViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {




                    viewmodel.buttonActions(grand.app.aber_provider.utils.Constants.QUESTIONS);
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewmodel
        flag 1 (0x2L): null
        flag 2 (0x3L): viewmodel.userData.isPromoted == 0 ? View.VISIBLE : View.GONE
        flag 3 (0x4L): viewmodel.userData.isPromoted == 0 ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}