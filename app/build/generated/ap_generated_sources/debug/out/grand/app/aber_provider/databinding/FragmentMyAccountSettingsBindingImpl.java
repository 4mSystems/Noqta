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
        sViewsWithIds.put(R.id.curve, 23);
    }
    // views
    @NonNull
    private final androidx.core.widget.NestedScrollView mboundView0;
    @NonNull
    private final com.google.android.material.floatingactionbutton.FloatingActionButton mboundView10;
    @NonNull
    private final com.google.android.material.floatingactionbutton.FloatingActionButton mboundView12;
    @NonNull
    private final com.google.android.material.floatingactionbutton.FloatingActionButton mboundView14;
    @NonNull
    private final com.google.android.material.floatingactionbutton.FloatingActionButton mboundView16;
    @NonNull
    private final com.google.android.material.floatingactionbutton.FloatingActionButton mboundView18;
    @NonNull
    private final com.google.android.material.floatingactionbutton.FloatingActionButton mboundView2;
    @NonNull
    private final com.google.android.material.floatingactionbutton.FloatingActionButton mboundView20;
    @NonNull
    private final androidx.cardview.widget.CardView mboundView21;
    @NonNull
    private final com.google.android.material.floatingactionbutton.FloatingActionButton mboundView22;
    @NonNull
    private final com.google.android.material.floatingactionbutton.FloatingActionButton mboundView4;
    @NonNull
    private final com.google.android.material.floatingactionbutton.FloatingActionButton mboundView6;
    @NonNull
    private final com.google.android.material.floatingactionbutton.FloatingActionButton mboundView8;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback27;
    @Nullable
    private final android.view.View.OnClickListener mCallback17;
    @Nullable
    private final android.view.View.OnClickListener mCallback25;
    @Nullable
    private final android.view.View.OnClickListener mCallback15;
    @Nullable
    private final android.view.View.OnClickListener mCallback23;
    @Nullable
    private final android.view.View.OnClickListener mCallback13;
    @Nullable
    private final android.view.View.OnClickListener mCallback21;
    @Nullable
    private final android.view.View.OnClickListener mCallback11;
    @Nullable
    private final android.view.View.OnClickListener mCallback19;
    @Nullable
    private final android.view.View.OnClickListener mCallback8;
    @Nullable
    private final android.view.View.OnClickListener mCallback20;
    @Nullable
    private final android.view.View.OnClickListener mCallback16;
    @Nullable
    private final android.view.View.OnClickListener mCallback28;
    @Nullable
    private final android.view.View.OnClickListener mCallback14;
    @Nullable
    private final android.view.View.OnClickListener mCallback26;
    @Nullable
    private final android.view.View.OnClickListener mCallback12;
    @Nullable
    private final android.view.View.OnClickListener mCallback24;
    @Nullable
    private final android.view.View.OnClickListener mCallback10;
    @Nullable
    private final android.view.View.OnClickListener mCallback22;
    @Nullable
    private final android.view.View.OnClickListener mCallback9;
    @Nullable
    private final android.view.View.OnClickListener mCallback18;
    @Nullable
    private final android.view.View.OnClickListener mCallback7;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentMyAccountSettingsBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 24, sIncludes, sViewsWithIds));
    }
    private FragmentMyAccountSettingsBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.cardview.widget.CardView) bindings[1]
            , (androidx.cardview.widget.CardView) bindings[5]
            , (androidx.cardview.widget.CardView) bindings[17]
            , (androidx.cardview.widget.CardView) bindings[19]
            , (androidx.cardview.widget.CardView) bindings[15]
            , (androidx.cardview.widget.CardView) bindings[11]
            , (androidx.cardview.widget.CardView) bindings[13]
            , (androidx.cardview.widget.CardView) bindings[9]
            , (androidx.cardview.widget.CardView) bindings[7]
            , (androidx.cardview.widget.CardView) bindings[3]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[23]
            );
        this.cardAbout.setTag(null);
        this.cardContact.setTag(null);
        this.cardMyWallet.setTag(null);
        this.cardPackages.setTag(null);
        this.cardProfile.setTag(null);
        this.cardRate.setTag(null);
        this.cardShare.setTag(null);
        this.cardSocial.setTag(null);
        this.cardSuggest.setTag(null);
        this.cardTerms.setTag(null);
        this.mboundView0 = (androidx.core.widget.NestedScrollView) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView10 = (com.google.android.material.floatingactionbutton.FloatingActionButton) bindings[10];
        this.mboundView10.setTag(null);
        this.mboundView12 = (com.google.android.material.floatingactionbutton.FloatingActionButton) bindings[12];
        this.mboundView12.setTag(null);
        this.mboundView14 = (com.google.android.material.floatingactionbutton.FloatingActionButton) bindings[14];
        this.mboundView14.setTag(null);
        this.mboundView16 = (com.google.android.material.floatingactionbutton.FloatingActionButton) bindings[16];
        this.mboundView16.setTag(null);
        this.mboundView18 = (com.google.android.material.floatingactionbutton.FloatingActionButton) bindings[18];
        this.mboundView18.setTag(null);
        this.mboundView2 = (com.google.android.material.floatingactionbutton.FloatingActionButton) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView20 = (com.google.android.material.floatingactionbutton.FloatingActionButton) bindings[20];
        this.mboundView20.setTag(null);
        this.mboundView21 = (androidx.cardview.widget.CardView) bindings[21];
        this.mboundView21.setTag(null);
        this.mboundView22 = (com.google.android.material.floatingactionbutton.FloatingActionButton) bindings[22];
        this.mboundView22.setTag(null);
        this.mboundView4 = (com.google.android.material.floatingactionbutton.FloatingActionButton) bindings[4];
        this.mboundView4.setTag(null);
        this.mboundView6 = (com.google.android.material.floatingactionbutton.FloatingActionButton) bindings[6];
        this.mboundView6.setTag(null);
        this.mboundView8 = (com.google.android.material.floatingactionbutton.FloatingActionButton) bindings[8];
        this.mboundView8.setTag(null);
        setRootTag(root);
        // listeners
        mCallback27 = new grand.app.aber_provider.generated.callback.OnClickListener(this, 21);
        mCallback17 = new grand.app.aber_provider.generated.callback.OnClickListener(this, 11);
        mCallback25 = new grand.app.aber_provider.generated.callback.OnClickListener(this, 19);
        mCallback15 = new grand.app.aber_provider.generated.callback.OnClickListener(this, 9);
        mCallback23 = new grand.app.aber_provider.generated.callback.OnClickListener(this, 17);
        mCallback13 = new grand.app.aber_provider.generated.callback.OnClickListener(this, 7);
        mCallback21 = new grand.app.aber_provider.generated.callback.OnClickListener(this, 15);
        mCallback11 = new grand.app.aber_provider.generated.callback.OnClickListener(this, 5);
        mCallback19 = new grand.app.aber_provider.generated.callback.OnClickListener(this, 13);
        mCallback8 = new grand.app.aber_provider.generated.callback.OnClickListener(this, 2);
        mCallback20 = new grand.app.aber_provider.generated.callback.OnClickListener(this, 14);
        mCallback16 = new grand.app.aber_provider.generated.callback.OnClickListener(this, 10);
        mCallback28 = new grand.app.aber_provider.generated.callback.OnClickListener(this, 22);
        mCallback14 = new grand.app.aber_provider.generated.callback.OnClickListener(this, 8);
        mCallback26 = new grand.app.aber_provider.generated.callback.OnClickListener(this, 20);
        mCallback12 = new grand.app.aber_provider.generated.callback.OnClickListener(this, 6);
        mCallback24 = new grand.app.aber_provider.generated.callback.OnClickListener(this, 18);
        mCallback10 = new grand.app.aber_provider.generated.callback.OnClickListener(this, 4);
        mCallback22 = new grand.app.aber_provider.generated.callback.OnClickListener(this, 16);
        mCallback9 = new grand.app.aber_provider.generated.callback.OnClickListener(this, 3);
        mCallback18 = new grand.app.aber_provider.generated.callback.OnClickListener(this, 12);
        mCallback7 = new grand.app.aber_provider.generated.callback.OnClickListener(this, 1);
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
        else if (fieldId == BR.passingObject) {
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
        grand.app.aber_provider.PassingObject viewmodelPassingObject = null;
        int viewmodelPassingObjectObjectEqualsConstantsMENUACCOUNTViewVISIBLEViewGONE = 0;
        boolean viewmodelPassingObjectObjectEqualsConstantsMORE = false;
        boolean viewmodelPassingObjectObjectEqualsConstantsMENUACCOUNT = false;
        java.lang.String viewmodelPassingObjectObject = null;
        int viewmodelPassingObjectObjectEqualsConstantsMOREViewVISIBLEViewGONE = 0;
        grand.app.aber_provider.pages.settings.viewModels.MyAccountSettingsViewModel viewmodel = mViewmodel;

        if ((dirtyFlags & 0x7L) != 0) {



                if (viewmodel != null) {
                    // read viewmodel.passingObject
                    viewmodelPassingObject = viewmodel.getPassingObject();
                }


                if (viewmodelPassingObject != null) {
                    // read viewmodel.passingObject.object
                    viewmodelPassingObjectObject = viewmodelPassingObject.getObject();
                }


                if (viewmodelPassingObjectObject != null) {
                    // read viewmodel.passingObject.object.equals(Constants.MORE)
                    viewmodelPassingObjectObjectEqualsConstantsMORE = viewmodelPassingObjectObject.equals(grand.app.aber_provider.utils.Constants.MORE);
                    // read viewmodel.passingObject.object.equals(Constants.MENU_ACCOUNT)
                    viewmodelPassingObjectObjectEqualsConstantsMENUACCOUNT = viewmodelPassingObjectObject.equals(grand.app.aber_provider.utils.Constants.MENU_ACCOUNT);
                }
            if((dirtyFlags & 0x7L) != 0) {
                if(viewmodelPassingObjectObjectEqualsConstantsMORE) {
                        dirtyFlags |= 0x40L;
                }
                else {
                        dirtyFlags |= 0x20L;
                }
            }
            if((dirtyFlags & 0x7L) != 0) {
                if(viewmodelPassingObjectObjectEqualsConstantsMENUACCOUNT) {
                        dirtyFlags |= 0x10L;
                }
                else {
                        dirtyFlags |= 0x8L;
                }
            }


                // read viewmodel.passingObject.object.equals(Constants.MORE) ? View.VISIBLE : View.GONE
                viewmodelPassingObjectObjectEqualsConstantsMOREViewVISIBLEViewGONE = ((viewmodelPassingObjectObjectEqualsConstantsMORE) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                // read viewmodel.passingObject.object.equals(Constants.MENU_ACCOUNT) ? View.VISIBLE : View.GONE
                viewmodelPassingObjectObjectEqualsConstantsMENUACCOUNTViewVISIBLEViewGONE = ((viewmodelPassingObjectObjectEqualsConstantsMENUACCOUNT) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.cardAbout.setOnClickListener(mCallback7);
            this.cardContact.setOnClickListener(mCallback11);
            this.cardMyWallet.setOnClickListener(mCallback23);
            this.cardPackages.setOnClickListener(mCallback25);
            this.cardProfile.setOnClickListener(mCallback21);
            this.cardRate.setOnClickListener(mCallback17);
            this.cardShare.setOnClickListener(mCallback19);
            this.cardSocial.setOnClickListener(mCallback15);
            this.cardSuggest.setOnClickListener(mCallback13);
            this.cardTerms.setOnClickListener(mCallback9);
            this.mboundView10.setOnClickListener(mCallback16);
            this.mboundView12.setOnClickListener(mCallback18);
            this.mboundView14.setOnClickListener(mCallback20);
            this.mboundView16.setOnClickListener(mCallback22);
            this.mboundView18.setOnClickListener(mCallback24);
            this.mboundView2.setOnClickListener(mCallback8);
            this.mboundView20.setOnClickListener(mCallback26);
            this.mboundView21.setOnClickListener(mCallback27);
            this.mboundView22.setOnClickListener(mCallback28);
            this.mboundView4.setOnClickListener(mCallback10);
            this.mboundView6.setOnClickListener(mCallback12);
            this.mboundView8.setOnClickListener(mCallback14);
        }
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            this.cardAbout.setVisibility(viewmodelPassingObjectObjectEqualsConstantsMOREViewVISIBLEViewGONE);
            this.cardContact.setVisibility(viewmodelPassingObjectObjectEqualsConstantsMOREViewVISIBLEViewGONE);
            this.cardMyWallet.setVisibility(viewmodelPassingObjectObjectEqualsConstantsMENUACCOUNTViewVISIBLEViewGONE);
            this.cardPackages.setVisibility(viewmodelPassingObjectObjectEqualsConstantsMENUACCOUNTViewVISIBLEViewGONE);
            this.cardProfile.setVisibility(viewmodelPassingObjectObjectEqualsConstantsMENUACCOUNTViewVISIBLEViewGONE);
            this.cardRate.setVisibility(viewmodelPassingObjectObjectEqualsConstantsMOREViewVISIBLEViewGONE);
            this.cardShare.setVisibility(viewmodelPassingObjectObjectEqualsConstantsMOREViewVISIBLEViewGONE);
            this.cardSocial.setVisibility(viewmodelPassingObjectObjectEqualsConstantsMOREViewVISIBLEViewGONE);
            this.cardSuggest.setVisibility(viewmodelPassingObjectObjectEqualsConstantsMOREViewVISIBLEViewGONE);
            this.cardTerms.setVisibility(viewmodelPassingObjectObjectEqualsConstantsMOREViewVISIBLEViewGONE);
            this.mboundView21.setVisibility(viewmodelPassingObjectObjectEqualsConstantsMENUACCOUNTViewVISIBLEViewGONE);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 21: {
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
            case 11: {
                // localize variables for thread safety
                // viewmodel != null
                boolean viewmodelJavaLangObjectNull = false;
                // viewmodel
                grand.app.aber_provider.pages.settings.viewModels.MyAccountSettingsViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {




                    viewmodel.buttonActions(grand.app.aber_provider.utils.Constants.CONTACT);
                }
                break;
            }
            case 19: {
                // localize variables for thread safety
                // viewmodel != null
                boolean viewmodelJavaLangObjectNull = false;
                // viewmodel
                grand.app.aber_provider.pages.settings.viewModels.MyAccountSettingsViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {




                    viewmodel.buttonActions(grand.app.aber_provider.utils.Constants.SUBSCRIPTION);
                }
                break;
            }
            case 9: {
                // localize variables for thread safety
                // viewmodel != null
                boolean viewmodelJavaLangObjectNull = false;
                // viewmodel
                grand.app.aber_provider.pages.settings.viewModels.MyAccountSettingsViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {




                    viewmodel.buttonActions(grand.app.aber_provider.utils.Constants.SOCIAL);
                }
                break;
            }
            case 17: {
                // localize variables for thread safety
                // viewmodel != null
                boolean viewmodelJavaLangObjectNull = false;
                // viewmodel
                grand.app.aber_provider.pages.settings.viewModels.MyAccountSettingsViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {




                    viewmodel.buttonActions(grand.app.aber_provider.utils.Constants.WALLET);
                }
                break;
            }
            case 7: {
                // localize variables for thread safety
                // viewmodel != null
                boolean viewmodelJavaLangObjectNull = false;
                // viewmodel
                grand.app.aber_provider.pages.settings.viewModels.MyAccountSettingsViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {




                    viewmodel.buttonActions(grand.app.aber_provider.utils.Constants.COMPLAINTS);
                }
                break;
            }
            case 15: {
                // localize variables for thread safety
                // viewmodel != null
                boolean viewmodelJavaLangObjectNull = false;
                // viewmodel
                grand.app.aber_provider.pages.settings.viewModels.MyAccountSettingsViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {




                    viewmodel.buttonActions(grand.app.aber_provider.utils.Constants.PROFILE);
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




                    viewmodel.buttonActions(grand.app.aber_provider.utils.Constants.CONTACT);
                }
                break;
            }
            case 13: {
                // localize variables for thread safety
                // viewmodel != null
                boolean viewmodelJavaLangObjectNull = false;
                // viewmodel
                grand.app.aber_provider.pages.settings.viewModels.MyAccountSettingsViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {




                    viewmodel.buttonActions(grand.app.aber_provider.utils.Constants.SHARE_BAR);
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




                    viewmodel.buttonActions(grand.app.aber_provider.utils.Constants.ABOUT);
                }
                break;
            }
            case 14: {
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
            case 10: {
                // localize variables for thread safety
                // viewmodel != null
                boolean viewmodelJavaLangObjectNull = false;
                // viewmodel
                grand.app.aber_provider.pages.settings.viewModels.MyAccountSettingsViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {




                    viewmodel.buttonActions(grand.app.aber_provider.utils.Constants.SOCIAL);
                }
                break;
            }
            case 22: {
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
            case 8: {
                // localize variables for thread safety
                // viewmodel != null
                boolean viewmodelJavaLangObjectNull = false;
                // viewmodel
                grand.app.aber_provider.pages.settings.viewModels.MyAccountSettingsViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {




                    viewmodel.buttonActions(grand.app.aber_provider.utils.Constants.COMPLAINTS);
                }
                break;
            }
            case 20: {
                // localize variables for thread safety
                // viewmodel != null
                boolean viewmodelJavaLangObjectNull = false;
                // viewmodel
                grand.app.aber_provider.pages.settings.viewModels.MyAccountSettingsViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {




                    viewmodel.buttonActions(grand.app.aber_provider.utils.Constants.SUBSCRIPTION);
                }
                break;
            }
            case 6: {
                // localize variables for thread safety
                // viewmodel != null
                boolean viewmodelJavaLangObjectNull = false;
                // viewmodel
                grand.app.aber_provider.pages.settings.viewModels.MyAccountSettingsViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {




                    viewmodel.buttonActions(grand.app.aber_provider.utils.Constants.CONTACT);
                }
                break;
            }
            case 18: {
                // localize variables for thread safety
                // viewmodel != null
                boolean viewmodelJavaLangObjectNull = false;
                // viewmodel
                grand.app.aber_provider.pages.settings.viewModels.MyAccountSettingsViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {




                    viewmodel.buttonActions(grand.app.aber_provider.utils.Constants.WALLET);
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




                    viewmodel.buttonActions(grand.app.aber_provider.utils.Constants.TERMS);
                }
                break;
            }
            case 16: {
                // localize variables for thread safety
                // viewmodel != null
                boolean viewmodelJavaLangObjectNull = false;
                // viewmodel
                grand.app.aber_provider.pages.settings.viewModels.MyAccountSettingsViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {




                    viewmodel.buttonActions(grand.app.aber_provider.utils.Constants.PROFILE);
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




                    viewmodel.buttonActions(grand.app.aber_provider.utils.Constants.TERMS);
                }
                break;
            }
            case 12: {
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
            case 1: {
                // localize variables for thread safety
                // viewmodel != null
                boolean viewmodelJavaLangObjectNull = false;
                // viewmodel
                grand.app.aber_provider.pages.settings.viewModels.MyAccountSettingsViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {




                    viewmodel.buttonActions(grand.app.aber_provider.utils.Constants.ABOUT);
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewmodel
        flag 1 (0x2L): viewmodel.passingObject
        flag 2 (0x3L): null
        flag 3 (0x4L): viewmodel.passingObject.object.equals(Constants.MENU_ACCOUNT) ? View.VISIBLE : View.GONE
        flag 4 (0x5L): viewmodel.passingObject.object.equals(Constants.MENU_ACCOUNT) ? View.VISIBLE : View.GONE
        flag 5 (0x6L): viewmodel.passingObject.object.equals(Constants.MORE) ? View.VISIBLE : View.GONE
        flag 6 (0x7L): viewmodel.passingObject.object.equals(Constants.MORE) ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}