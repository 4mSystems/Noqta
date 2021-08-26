package grand.app.aber_provider.databinding;
import grand.app.aber_provider.R;
import grand.app.aber_provider.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class MenuBindingImpl extends MenuBinding implements grand.app.aber_provider.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.v1, 10);
        sViewsWithIds.put(R.id.v5, 11);
        sViewsWithIds.put(R.id.v7, 12);
        sViewsWithIds.put(R.id.tv_notifications, 13);
        sViewsWithIds.put(R.id.v8, 14);
        sViewsWithIds.put(R.id.v9, 15);
        sViewsWithIds.put(R.id.v16, 16);
        sViewsWithIds.put(R.id.v17, 17);
        sViewsWithIds.put(R.id.v15, 18);
        sViewsWithIds.put(R.id.v20, 19);
        sViewsWithIds.put(R.id.grand_logo, 20);
    }
    // views
    @NonNull
    private final androidx.core.widget.NestedScrollView mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback47;
    @Nullable
    private final android.view.View.OnClickListener mCallback45;
    @Nullable
    private final android.view.View.OnClickListener mCallback43;
    @Nullable
    private final android.view.View.OnClickListener mCallback42;
    @Nullable
    private final android.view.View.OnClickListener mCallback48;
    @Nullable
    private final android.view.View.OnClickListener mCallback46;
    @Nullable
    private final android.view.View.OnClickListener mCallback44;
    @Nullable
    private final android.view.View.OnClickListener mCallback41;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public MenuBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 21, sIncludes, sViewsWithIds));
    }
    private MenuBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (grand.app.aber_provider.customViews.grandDialog.GrandImageDialog) bindings[20]
            , (androidx.recyclerview.widget.RecyclerView) bindings[9]
            , (grand.app.aber_provider.customViews.views.CustomTextViewMedium) bindings[7]
            , (grand.app.aber_provider.customViews.views.CustomTextViewMedium) bindings[6]
            , (grand.app.aber_provider.customViews.views.CustomTextViewMedium) bindings[1]
            , (grand.app.aber_provider.customViews.views.CustomTextViewMedium) bindings[5]
            , (grand.app.aber_provider.customViews.views.CustomTextViewMedium) bindings[8]
            , (grand.app.aber_provider.customViews.views.CustomTextViewMedium) bindings[2]
            , (grand.app.aber_provider.customViews.views.CustomTextViewMedium) bindings[13]
            , (grand.app.aber_provider.customViews.views.CustomTextViewMedium) bindings[4]
            , (grand.app.aber_provider.customViews.views.CustomTextViewMedium) bindings[3]
            , (android.view.View) bindings[10]
            , (android.view.View) bindings[18]
            , (android.view.View) bindings[16]
            , (android.view.View) bindings[17]
            , (android.view.View) bindings[19]
            , (android.view.View) bindings[11]
            , (android.view.View) bindings[12]
            , (android.view.View) bindings[14]
            , (android.view.View) bindings[15]
            );
        this.mboundView0 = (androidx.core.widget.NestedScrollView) bindings[0];
        this.mboundView0.setTag(null);
        this.rcMenuSocial.setTag(null);
        this.tvCity.setTag(null);
        this.tvCountry.setTag(null);
        this.tvHome.setTag(null);
        this.tvLang.setTag(null);
        this.tvMore.setTag(null);
        this.tvMyServices.setTag(null);
        this.tvPrivacy.setTag(null);
        this.tvProvider.setTag(null);
        setRootTag(root);
        // listeners
        mCallback47 = new grand.app.aber_provider.generated.callback.OnClickListener(this, 7);
        mCallback45 = new grand.app.aber_provider.generated.callback.OnClickListener(this, 5);
        mCallback43 = new grand.app.aber_provider.generated.callback.OnClickListener(this, 3);
        mCallback42 = new grand.app.aber_provider.generated.callback.OnClickListener(this, 2);
        mCallback48 = new grand.app.aber_provider.generated.callback.OnClickListener(this, 8);
        mCallback46 = new grand.app.aber_provider.generated.callback.OnClickListener(this, 6);
        mCallback44 = new grand.app.aber_provider.generated.callback.OnClickListener(this, 4);
        mCallback41 = new grand.app.aber_provider.generated.callback.OnClickListener(this, 1);
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
        if (BR.menuViewModel == variableId) {
            setMenuViewModel((grand.app.aber_provider.customViews.views.MenuViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setMenuViewModel(@Nullable grand.app.aber_provider.customViews.views.MenuViewModel MenuViewModel) {
        updateRegistration(0, MenuViewModel);
        this.mMenuViewModel = MenuViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.menuViewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeMenuViewModel((grand.app.aber_provider.customViews.views.MenuViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeMenuViewModel(grand.app.aber_provider.customViews.views.MenuViewModel MenuViewModel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        else if (fieldId == BR.socialAdapter) {
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
        grand.app.aber_provider.customViews.views.MenuViewModel menuViewModel = mMenuViewModel;
        grand.app.aber_provider.pages.settings.adapters.MenuSocialAdapter menuViewModelSocialAdapter = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (menuViewModel != null) {
                    // read menuViewModel.socialAdapter
                    menuViewModelSocialAdapter = menuViewModel.getSocialAdapter();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            grand.app.aber_provider.base.ApplicationBinding.getItemsV2Binding(this.rcMenuSocial, menuViewModelSocialAdapter, "1", "2");
        }
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.tvCity.setOnClickListener(mCallback47);
            this.tvCountry.setOnClickListener(mCallback46);
            this.tvHome.setOnClickListener(mCallback41);
            this.tvLang.setOnClickListener(mCallback45);
            this.tvMore.setOnClickListener(mCallback48);
            this.tvMyServices.setOnClickListener(mCallback42);
            this.tvPrivacy.setOnClickListener(mCallback44);
            this.tvProvider.setOnClickListener(mCallback43);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 7: {
                // localize variables for thread safety
                // menuViewModel
                grand.app.aber_provider.customViews.views.MenuViewModel menuViewModel = mMenuViewModel;
                // menuViewModel != null
                boolean menuViewModelJavaLangObjectNull = false;



                menuViewModelJavaLangObjectNull = (menuViewModel) != (null);
                if (menuViewModelJavaLangObjectNull) {




                    menuViewModel.liveDataActions(grand.app.aber_provider.utils.Constants.CITIES);
                }
                break;
            }
            case 5: {
                // localize variables for thread safety
                // menuViewModel
                grand.app.aber_provider.customViews.views.MenuViewModel menuViewModel = mMenuViewModel;
                // menuViewModel != null
                boolean menuViewModelJavaLangObjectNull = false;



                menuViewModelJavaLangObjectNull = (menuViewModel) != (null);
                if (menuViewModelJavaLangObjectNull) {




                    menuViewModel.liveDataActions(grand.app.aber_provider.utils.Constants.LANGUAGE);
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // menuViewModel
                grand.app.aber_provider.customViews.views.MenuViewModel menuViewModel = mMenuViewModel;
                // menuViewModel != null
                boolean menuViewModelJavaLangObjectNull = false;



                menuViewModelJavaLangObjectNull = (menuViewModel) != (null);
                if (menuViewModelJavaLangObjectNull) {




                    menuViewModel.liveDataActions(grand.app.aber_provider.utils.Constants.PREVIOUS);
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // menuViewModel
                grand.app.aber_provider.customViews.views.MenuViewModel menuViewModel = mMenuViewModel;
                // menuViewModel != null
                boolean menuViewModelJavaLangObjectNull = false;



                menuViewModelJavaLangObjectNull = (menuViewModel) != (null);
                if (menuViewModelJavaLangObjectNull) {




                    menuViewModel.liveDataActions(grand.app.aber_provider.utils.Constants.MY_ORDERS);
                }
                break;
            }
            case 8: {
                // localize variables for thread safety
                // menuViewModel
                grand.app.aber_provider.customViews.views.MenuViewModel menuViewModel = mMenuViewModel;
                // menuViewModel != null
                boolean menuViewModelJavaLangObjectNull = false;



                menuViewModelJavaLangObjectNull = (menuViewModel) != (null);
                if (menuViewModelJavaLangObjectNull) {




                    menuViewModel.liveDataActions(grand.app.aber_provider.utils.Constants.MORE);
                }
                break;
            }
            case 6: {
                // localize variables for thread safety
                // menuViewModel
                grand.app.aber_provider.customViews.views.MenuViewModel menuViewModel = mMenuViewModel;
                // menuViewModel != null
                boolean menuViewModelJavaLangObjectNull = false;



                menuViewModelJavaLangObjectNull = (menuViewModel) != (null);
                if (menuViewModelJavaLangObjectNull) {




                    menuViewModel.liveDataActions(grand.app.aber_provider.utils.Constants.COUNTRIES);
                }
                break;
            }
            case 4: {
                // localize variables for thread safety
                // menuViewModel
                grand.app.aber_provider.customViews.views.MenuViewModel menuViewModel = mMenuViewModel;
                // menuViewModel != null
                boolean menuViewModelJavaLangObjectNull = false;



                menuViewModelJavaLangObjectNull = (menuViewModel) != (null);
                if (menuViewModelJavaLangObjectNull) {




                    menuViewModel.liveDataActions(grand.app.aber_provider.utils.Constants.MENU_ACCOUNT);
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // menuViewModel
                grand.app.aber_provider.customViews.views.MenuViewModel menuViewModel = mMenuViewModel;
                // menuViewModel != null
                boolean menuViewModelJavaLangObjectNull = false;



                menuViewModelJavaLangObjectNull = (menuViewModel) != (null);
                if (menuViewModelJavaLangObjectNull) {




                    menuViewModel.liveDataActions(grand.app.aber_provider.utils.Constants.MENU_HOME);
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): menuViewModel
        flag 1 (0x2L): menuViewModel.socialAdapter
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}