package te.app.notta.databinding;
import te.app.notta.R;
import te.app.notta.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentLangBindingImpl extends FragmentLangBinding implements te.app.notta.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.board_header, 9);
        sViewsWithIds.put(R.id.tv_profile_title, 10);
        sViewsWithIds.put(R.id.tv_change_lang, 11);
        sViewsWithIds.put(R.id.tv_change_lang_body, 12);
        sViewsWithIds.put(R.id.v_line5, 13);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback96;
    @Nullable
    private final android.view.View.OnClickListener mCallback94;
    @Nullable
    private final android.view.View.OnClickListener mCallback92;
    @Nullable
    private final android.view.View.OnClickListener mCallback97;
    @Nullable
    private final android.view.View.OnClickListener mCallback95;
    @Nullable
    private final android.view.View.OnClickListener mCallback93;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentLangBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 14, sIncludes, sViewsWithIds));
    }
    private FragmentLangBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (com.google.android.material.floatingactionbutton.FloatingActionButton) bindings[1]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[9]
            , (com.google.android.material.button.MaterialButton) bindings[8]
            , (de.hdodenhof.circleimageview.CircleImageView) bindings[2]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[4]
            , (de.hdodenhof.circleimageview.CircleImageView) bindings[5]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[7]
            , (te.app.notta.customViews.views.CustomTextViewMedium) bindings[3]
            , (te.app.notta.customViews.views.CustomTextViewMedium) bindings[11]
            , (te.app.notta.customViews.views.CustomTextViewMedium) bindings[12]
            , (te.app.notta.customViews.views.CustomTextViewMedium) bindings[6]
            , (te.app.notta.customViews.views.CustomTextViewMedium) bindings[10]
            , (android.view.View) bindings[13]
            );
        this.back.setTag(null);
        this.btnChange.setTag(null);
        this.icAr.setTag(null);
        this.icArCheck.setTag(null);
        this.icEn.setTag(null);
        this.icEnCheck.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.tvAr.setTag(null);
        this.tvEn.setTag(null);
        setRootTag(root);
        // listeners
        mCallback96 = new te.app.notta.generated.callback.OnClickListener(this, 5);
        mCallback94 = new te.app.notta.generated.callback.OnClickListener(this, 3);
        mCallback92 = new te.app.notta.generated.callback.OnClickListener(this, 1);
        mCallback97 = new te.app.notta.generated.callback.OnClickListener(this, 6);
        mCallback95 = new te.app.notta.generated.callback.OnClickListener(this, 4);
        mCallback93 = new te.app.notta.generated.callback.OnClickListener(this, 2);
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
            setViewmodel((te.app.notta.pages.settings.viewModels.SettingsViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewmodel(@Nullable te.app.notta.pages.settings.viewModels.SettingsViewModel Viewmodel) {
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
                return onChangeViewmodel((te.app.notta.pages.settings.viewModels.SettingsViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewmodel(te.app.notta.pages.settings.viewModels.SettingsViewModel Viewmodel, int fieldId) {
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
        boolean viewmodelLangEqualsJavaLangStringAr = false;
        boolean viewmodelLangEqualsJavaLangStringEn = false;
        int viewmodelLangEqualsJavaLangStringEnViewVISIBLEViewGONE = 0;
        int viewmodelLangEqualsJavaLangStringArViewVISIBLEViewGONE = 0;
        java.lang.String viewmodelLang = null;
        te.app.notta.pages.settings.viewModels.SettingsViewModel viewmodel = mViewmodel;

        if ((dirtyFlags & 0x3L) != 0) {



                if (viewmodel != null) {
                    // read viewmodel.lang
                    viewmodelLang = viewmodel.lang;
                }


                if (viewmodelLang != null) {
                    // read viewmodel.lang.equals("ar")
                    viewmodelLangEqualsJavaLangStringAr = viewmodelLang.equals("ar");
                    // read viewmodel.lang.equals("en")
                    viewmodelLangEqualsJavaLangStringEn = viewmodelLang.equals("en");
                }
            if((dirtyFlags & 0x3L) != 0) {
                if(viewmodelLangEqualsJavaLangStringAr) {
                        dirtyFlags |= 0x20L;
                }
                else {
                        dirtyFlags |= 0x10L;
                }
            }
            if((dirtyFlags & 0x3L) != 0) {
                if(viewmodelLangEqualsJavaLangStringEn) {
                        dirtyFlags |= 0x8L;
                }
                else {
                        dirtyFlags |= 0x4L;
                }
            }


                // read viewmodel.lang.equals("ar") ? View.VISIBLE : View.GONE
                viewmodelLangEqualsJavaLangStringArViewVISIBLEViewGONE = ((viewmodelLangEqualsJavaLangStringAr) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                // read viewmodel.lang.equals("en") ? View.VISIBLE : View.GONE
                viewmodelLangEqualsJavaLangStringEnViewVISIBLEViewGONE = ((viewmodelLangEqualsJavaLangStringEn) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished
        if ((dirtyFlags & 0x2L) != 0) {
            // api target 1

            this.back.setOnClickListener(mCallback92);
            this.btnChange.setOnClickListener(mCallback97);
            this.icAr.setOnClickListener(mCallback93);
            this.icEn.setOnClickListener(mCallback95);
            this.tvAr.setOnClickListener(mCallback94);
            this.tvEn.setOnClickListener(mCallback96);
        }
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            this.icArCheck.setVisibility(viewmodelLangEqualsJavaLangStringArViewVISIBLEViewGONE);
            this.icEnCheck.setVisibility(viewmodelLangEqualsJavaLangStringEnViewVISIBLEViewGONE);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 5: {
                // localize variables for thread safety
                // viewmodel != null
                boolean viewmodelJavaLangObjectNull = false;
                // viewmodel
                te.app.notta.pages.settings.viewModels.SettingsViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {



                    viewmodel.changeLang("en");
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // viewmodel != null
                boolean viewmodelJavaLangObjectNull = false;
                // viewmodel
                te.app.notta.pages.settings.viewModels.SettingsViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {



                    viewmodel.changeLang("ar");
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // viewmodel != null
                boolean viewmodelJavaLangObjectNull = false;
                // viewmodel
                te.app.notta.pages.settings.viewModels.SettingsViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {



                    viewmodel.goBack(getRoot().getContext());
                }
                break;
            }
            case 6: {
                // localize variables for thread safety
                // viewmodel != null
                boolean viewmodelJavaLangObjectNull = false;
                // viewmodel
                te.app.notta.pages.settings.viewModels.SettingsViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {


                    viewmodel.restart();
                }
                break;
            }
            case 4: {
                // localize variables for thread safety
                // viewmodel != null
                boolean viewmodelJavaLangObjectNull = false;
                // viewmodel
                te.app.notta.pages.settings.viewModels.SettingsViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {



                    viewmodel.changeLang("en");
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // viewmodel != null
                boolean viewmodelJavaLangObjectNull = false;
                // viewmodel
                te.app.notta.pages.settings.viewModels.SettingsViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {



                    viewmodel.changeLang("ar");
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
        flag 2 (0x3L): viewmodel.lang.equals("en") ? View.VISIBLE : View.GONE
        flag 3 (0x4L): viewmodel.lang.equals("en") ? View.VISIBLE : View.GONE
        flag 4 (0x5L): viewmodel.lang.equals("ar") ? View.VISIBLE : View.GONE
        flag 5 (0x6L): viewmodel.lang.equals("ar") ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}