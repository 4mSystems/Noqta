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
        sViewsWithIds.put(R.id.tv_home, 4);
        sViewsWithIds.put(R.id.v1, 5);
        sViewsWithIds.put(R.id.tv_my_services, 6);
        sViewsWithIds.put(R.id.v5, 7);
        sViewsWithIds.put(R.id.tv_provider, 8);
        sViewsWithIds.put(R.id.v7, 9);
        sViewsWithIds.put(R.id.tv_notifications, 10);
        sViewsWithIds.put(R.id.v8, 11);
        sViewsWithIds.put(R.id.v9, 12);
        sViewsWithIds.put(R.id.tv_lang, 13);
        sViewsWithIds.put(R.id.v16, 14);
        sViewsWithIds.put(R.id.tv_country, 15);
        sViewsWithIds.put(R.id.v17, 16);
        sViewsWithIds.put(R.id.tv_city, 17);
        sViewsWithIds.put(R.id.v15, 18);
        sViewsWithIds.put(R.id.v20, 19);
        sViewsWithIds.put(R.id.grand_logo, 20);
    }
    // views
    @NonNull
    private final androidx.core.widget.NestedScrollView mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback39;
    @Nullable
    private final android.view.View.OnClickListener mCallback40;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public MenuBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 21, sIncludes, sViewsWithIds));
    }
    private MenuBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (grand.app.aber_provider.customViews.grandDialog.GrandImageDialog) bindings[20]
            , (androidx.recyclerview.widget.RecyclerView) bindings[3]
            , (grand.app.aber_provider.customViews.views.CustomTextViewMedium) bindings[17]
            , (grand.app.aber_provider.customViews.views.CustomTextViewMedium) bindings[15]
            , (grand.app.aber_provider.customViews.views.CustomTextViewMedium) bindings[4]
            , (grand.app.aber_provider.customViews.views.CustomTextViewMedium) bindings[13]
            , (grand.app.aber_provider.customViews.views.CustomTextViewMedium) bindings[2]
            , (grand.app.aber_provider.customViews.views.CustomTextViewMedium) bindings[6]
            , (grand.app.aber_provider.customViews.views.CustomTextViewMedium) bindings[10]
            , (grand.app.aber_provider.customViews.views.CustomTextViewMedium) bindings[1]
            , (grand.app.aber_provider.customViews.views.CustomTextViewMedium) bindings[8]
            , (android.view.View) bindings[5]
            , (android.view.View) bindings[18]
            , (android.view.View) bindings[14]
            , (android.view.View) bindings[16]
            , (android.view.View) bindings[19]
            , (android.view.View) bindings[7]
            , (android.view.View) bindings[9]
            , (android.view.View) bindings[11]
            , (android.view.View) bindings[12]
            );
        this.mboundView0 = (androidx.core.widget.NestedScrollView) bindings[0];
        this.mboundView0.setTag(null);
        this.rcMenuSocial.setTag(null);
        this.tvMore.setTag(null);
        this.tvPrivacy.setTag(null);
        setRootTag(root);
        // listeners
        mCallback39 = new grand.app.aber_provider.generated.callback.OnClickListener(this, 1);
        mCallback40 = new grand.app.aber_provider.generated.callback.OnClickListener(this, 2);
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

            this.tvMore.setOnClickListener(mCallback40);
            this.tvPrivacy.setOnClickListener(mCallback39);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 1: {
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
            case 2: {
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