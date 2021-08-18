package grand.app.aber_provider.databinding;
import grand.app.aber_provider.R;
import grand.app.aber_provider.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentLangBindingImpl extends FragmentLangBinding implements grand.app.aber_provider.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.tv_take_me, 5);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback45;
    // values
    // listeners
    private OnCheckedChangeListenerImpl mViewmodelOnLangChangeAndroidWidgetRadioGroupOnCheckedChangeListener;
    // Inverse Binding Event Handlers

    public FragmentLangBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private FragmentLangBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.RadioButton) bindings[3]
            , (androidx.appcompat.widget.AppCompatButton) bindings[4]
            , (android.widget.RadioButton) bindings[2]
            , (android.widget.RadioGroup) bindings[1]
            , (grand.app.aber_provider.customViews.views.CustomTextViewMedium) bindings[5]
            );
        this.arabic.setTag(null);
        this.btnPhone.setTag(null);
        this.english.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.radioGroup.setTag(null);
        setRootTag(root);
        // listeners
        mCallback45 = new grand.app.aber_provider.generated.callback.OnClickListener(this, 1);
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
            setViewmodel((grand.app.aber_provider.pages.settings.viewModels.SettingsViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewmodel(@Nullable grand.app.aber_provider.pages.settings.viewModels.SettingsViewModel Viewmodel) {
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
                return onChangeViewmodel((grand.app.aber_provider.pages.settings.viewModels.SettingsViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewmodel(grand.app.aber_provider.pages.settings.viewModels.SettingsViewModel Viewmodel, int fieldId) {
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
        android.widget.RadioGroup.OnCheckedChangeListener viewmodelOnLangChangeAndroidWidgetRadioGroupOnCheckedChangeListener = null;
        java.lang.String viewmodelLang = null;
        boolean viewmodelLangEqualsJavaLangStringArBooleanTrueBooleanFalse = false;
        boolean viewmodelLangEqualsJavaLangStringEnBooleanTrueBooleanFalse = false;
        grand.app.aber_provider.pages.settings.viewModels.SettingsViewModel viewmodel = mViewmodel;
        boolean viewmodelLangEqualsJavaLangStringEn = false;

        if ((dirtyFlags & 0x3L) != 0) {



                if (viewmodel != null) {
                    // read viewmodel::onLangChange
                    viewmodelOnLangChangeAndroidWidgetRadioGroupOnCheckedChangeListener = (((mViewmodelOnLangChangeAndroidWidgetRadioGroupOnCheckedChangeListener == null) ? (mViewmodelOnLangChangeAndroidWidgetRadioGroupOnCheckedChangeListener = new OnCheckedChangeListenerImpl()) : mViewmodelOnLangChangeAndroidWidgetRadioGroupOnCheckedChangeListener).setValue(viewmodel));
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
                        dirtyFlags |= 0x8L;
                }
                else {
                        dirtyFlags |= 0x4L;
                }
            }
            if((dirtyFlags & 0x3L) != 0) {
                if(viewmodelLangEqualsJavaLangStringEn) {
                        dirtyFlags |= 0x20L;
                }
                else {
                        dirtyFlags |= 0x10L;
                }
            }


                // read viewmodel.lang.equals("ar") ? true : false
                viewmodelLangEqualsJavaLangStringArBooleanTrueBooleanFalse = ((viewmodelLangEqualsJavaLangStringAr) ? (true) : (false));
                // read viewmodel.lang.equals("en") ? true : false
                viewmodelLangEqualsJavaLangStringEnBooleanTrueBooleanFalse = ((viewmodelLangEqualsJavaLangStringEn) ? (true) : (false));
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.CompoundButtonBindingAdapter.setChecked(this.arabic, viewmodelLangEqualsJavaLangStringArBooleanTrueBooleanFalse);
            androidx.databinding.adapters.CompoundButtonBindingAdapter.setChecked(this.english, viewmodelLangEqualsJavaLangStringEnBooleanTrueBooleanFalse);
            androidx.databinding.adapters.RadioGroupBindingAdapter.setListeners(this.radioGroup, (android.widget.RadioGroup.OnCheckedChangeListener)viewmodelOnLangChangeAndroidWidgetRadioGroupOnCheckedChangeListener, (androidx.databinding.InverseBindingListener)null);
        }
        if ((dirtyFlags & 0x2L) != 0) {
            // api target 1

            this.btnPhone.setOnClickListener(mCallback45);
        }
    }
    // Listener Stub Implementations
    public static class OnCheckedChangeListenerImpl implements android.widget.RadioGroup.OnCheckedChangeListener{
        private grand.app.aber_provider.pages.settings.viewModels.SettingsViewModel value;
        public OnCheckedChangeListenerImpl setValue(grand.app.aber_provider.pages.settings.viewModels.SettingsViewModel value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onCheckedChanged(android.widget.RadioGroup arg0, int arg1) {
            this.value.onLangChange(arg0, arg1); 
        }
    }
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // viewmodel != null
        boolean viewmodelJavaLangObjectNull = false;
        // viewmodel
        grand.app.aber_provider.pages.settings.viewModels.SettingsViewModel viewmodel = mViewmodel;



        viewmodelJavaLangObjectNull = (viewmodel) != (null);
        if (viewmodelJavaLangObjectNull) {


            viewmodel.changeLang();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewmodel
        flag 1 (0x2L): null
        flag 2 (0x3L): viewmodel.lang.equals("ar") ? true : false
        flag 3 (0x4L): viewmodel.lang.equals("ar") ? true : false
        flag 4 (0x5L): viewmodel.lang.equals("en") ? true : false
        flag 5 (0x6L): viewmodel.lang.equals("en") ? true : false
    flag mapping end*/
    //end
}