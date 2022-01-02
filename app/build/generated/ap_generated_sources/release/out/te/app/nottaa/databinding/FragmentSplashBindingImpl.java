package te.app.nottaa.databinding;
import te.app.nottaa.R;
import te.app.nottaa.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentSplashBindingImpl extends FragmentSplashBinding implements te.app.nottaa.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.tv_take_me, 6);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView1;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback50;
    // values
    // listeners
    private OnCheckedChangeListenerImpl mViewmodelOnLangChangeAndroidWidgetRadioGroupOnCheckedChangeListener;
    // Inverse Binding Event Handlers

    public FragmentSplashBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds));
    }
    private FragmentSplashBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (android.widget.RadioButton) bindings[4]
            , (androidx.appcompat.widget.AppCompatButton) bindings[5]
            , (com.google.android.material.radiobutton.MaterialRadioButton) bindings[3]
            , (android.widget.RadioGroup) bindings[2]
            , (te.app.nottaa.customViews.views.CustomTextViewMedium) bindings[6]
            );
        this.arabic.setTag(null);
        this.btnPhone.setTag(null);
        this.english.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[1];
        this.mboundView1.setTag(null);
        this.radioGroup.setTag(null);
        setRootTag(root);
        // listeners
        mCallback50 = new te.app.nottaa.generated.callback.OnClickListener(this, 1);
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
            setViewmodel((te.app.nottaa.pages.splash.SplashViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewmodel(@Nullable te.app.nottaa.pages.splash.SplashViewModel Viewmodel) {
        updateRegistration(1, Viewmodel);
        this.mViewmodel = Viewmodel;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.viewmodel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewmodelIsLangShow((androidx.databinding.ObservableBoolean) object, fieldId);
            case 1 :
                return onChangeViewmodel((te.app.nottaa.pages.splash.SplashViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewmodelIsLangShow(androidx.databinding.ObservableBoolean ViewmodelIsLangShow, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodel(te.app.nottaa.pages.splash.SplashViewModel Viewmodel, int fieldId) {
        if (fieldId == BR._all) {
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
        androidx.databinding.ObservableBoolean viewmodelIsLangShow = null;
        int userHelperGetInstanceContextIsFirstBooleanTrueViewmodelIsLangShowBooleanFalseViewVISIBLEViewGONE = 0;
        boolean viewmodelIsLangShowGet = false;
        boolean userHelperGetInstanceContextIsFirst = false;
        boolean userHelperGetInstanceContextIsFirstBooleanTrueViewmodelIsLangShowBooleanFalse = false;
        boolean viewmodelLangEqualsJavaLangStringAr = false;
        android.widget.RadioGroup.OnCheckedChangeListener viewmodelOnLangChangeAndroidWidgetRadioGroupOnCheckedChangeListener = null;
        boolean viewmodelLangEqualsJavaLangStringArBooleanTrueBooleanFalse = false;
        boolean viewmodelLangEqualsJavaLangStringEn = false;
        boolean userHelperGetInstanceContextIsFirstBooleanTrue = false;
        java.lang.String viewmodelLang = null;
        boolean viewmodelLangEqualsJavaLangStringEnBooleanTrueBooleanFalse = false;
        te.app.nottaa.pages.splash.SplashViewModel viewmodel = mViewmodel;

        if ((dirtyFlags & 0x7L) != 0) {

                // read UserHelper.getInstance(context).isFirst
                userHelperGetInstanceContextIsFirst = te.app.nottaa.utils.session.UserHelper.getInstance(getRoot().getContext()).getIsFirst();


                // read UserHelper.getInstance(context).isFirst == true
                userHelperGetInstanceContextIsFirstBooleanTrue = (userHelperGetInstanceContextIsFirst) == (true);
            if((dirtyFlags & 0x7L) != 0) {
                if(userHelperGetInstanceContextIsFirstBooleanTrue) {
                        dirtyFlags |= 0x40L;
                }
                else {
                        dirtyFlags |= 0x20L;
                }
            }
        }
        if ((dirtyFlags & 0x6L) != 0) {



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
            if((dirtyFlags & 0x6L) != 0) {
                if(viewmodelLangEqualsJavaLangStringAr) {
                        dirtyFlags |= 0x100L;
                }
                else {
                        dirtyFlags |= 0x80L;
                }
            }
            if((dirtyFlags & 0x6L) != 0) {
                if(viewmodelLangEqualsJavaLangStringEn) {
                        dirtyFlags |= 0x400L;
                }
                else {
                        dirtyFlags |= 0x200L;
                }
            }


                // read viewmodel.lang.equals("ar") ? true : false
                viewmodelLangEqualsJavaLangStringArBooleanTrueBooleanFalse = ((viewmodelLangEqualsJavaLangStringAr) ? (true) : (false));
                // read viewmodel.lang.equals("en") ? true : false
                viewmodelLangEqualsJavaLangStringEnBooleanTrueBooleanFalse = ((viewmodelLangEqualsJavaLangStringEn) ? (true) : (false));
        }
        // batch finished

        if ((dirtyFlags & 0x40L) != 0) {



                if (viewmodel != null) {
                    // read viewmodel.isLangShow
                    viewmodelIsLangShow = viewmodel.isLangShow;
                }
                updateRegistration(0, viewmodelIsLangShow);


                if (viewmodelIsLangShow != null) {
                    // read viewmodel.isLangShow.get()
                    viewmodelIsLangShowGet = viewmodelIsLangShow.get();
                }
        }

        if ((dirtyFlags & 0x7L) != 0) {

                // read UserHelper.getInstance(context).isFirst == true ? viewmodel.isLangShow.get() : false
                userHelperGetInstanceContextIsFirstBooleanTrueViewmodelIsLangShowBooleanFalse = ((userHelperGetInstanceContextIsFirstBooleanTrue) ? (viewmodelIsLangShowGet) : (false));
            if((dirtyFlags & 0x7L) != 0) {
                if(userHelperGetInstanceContextIsFirstBooleanTrueViewmodelIsLangShowBooleanFalse) {
                        dirtyFlags |= 0x10L;
                }
                else {
                        dirtyFlags |= 0x8L;
                }
            }


                // read UserHelper.getInstance(context).isFirst == true ? viewmodel.isLangShow.get() : false ? View.VISIBLE : View.GONE
                userHelperGetInstanceContextIsFirstBooleanTrueViewmodelIsLangShowBooleanFalseViewVISIBLEViewGONE = ((userHelperGetInstanceContextIsFirstBooleanTrueViewmodelIsLangShowBooleanFalse) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            androidx.databinding.adapters.CompoundButtonBindingAdapter.setChecked(this.arabic, viewmodelLangEqualsJavaLangStringArBooleanTrueBooleanFalse);
            androidx.databinding.adapters.CompoundButtonBindingAdapter.setChecked(this.english, viewmodelLangEqualsJavaLangStringEnBooleanTrueBooleanFalse);
            androidx.databinding.adapters.RadioGroupBindingAdapter.setListeners(this.radioGroup, (android.widget.RadioGroup.OnCheckedChangeListener)viewmodelOnLangChangeAndroidWidgetRadioGroupOnCheckedChangeListener, (androidx.databinding.InverseBindingListener)null);
        }
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.btnPhone.setOnClickListener(mCallback50);
        }
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            this.mboundView1.setVisibility(userHelperGetInstanceContextIsFirstBooleanTrueViewmodelIsLangShowBooleanFalseViewVISIBLEViewGONE);
        }
    }
    // Listener Stub Implementations
    public static class OnCheckedChangeListenerImpl implements android.widget.RadioGroup.OnCheckedChangeListener{
        private te.app.nottaa.pages.splash.SplashViewModel value;
        public OnCheckedChangeListenerImpl setValue(te.app.nottaa.pages.splash.SplashViewModel value) {
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
        te.app.nottaa.pages.splash.SplashViewModel viewmodel = mViewmodel;



        viewmodelJavaLangObjectNull = (viewmodel) != (null);
        if (viewmodelJavaLangObjectNull) {


            viewmodel.changeLang();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewmodel.isLangShow
        flag 1 (0x2L): viewmodel
        flag 2 (0x3L): null
        flag 3 (0x4L): UserHelper.getInstance(context).isFirst == true ? viewmodel.isLangShow.get() : false ? View.VISIBLE : View.GONE
        flag 4 (0x5L): UserHelper.getInstance(context).isFirst == true ? viewmodel.isLangShow.get() : false ? View.VISIBLE : View.GONE
        flag 5 (0x6L): UserHelper.getInstance(context).isFirst == true ? viewmodel.isLangShow.get() : false
        flag 6 (0x7L): UserHelper.getInstance(context).isFirst == true ? viewmodel.isLangShow.get() : false
        flag 7 (0x8L): viewmodel.lang.equals("ar") ? true : false
        flag 8 (0x9L): viewmodel.lang.equals("ar") ? true : false
        flag 9 (0xaL): viewmodel.lang.equals("en") ? true : false
        flag 10 (0xbL): viewmodel.lang.equals("en") ? true : false
    flag mapping end*/
    //end
}