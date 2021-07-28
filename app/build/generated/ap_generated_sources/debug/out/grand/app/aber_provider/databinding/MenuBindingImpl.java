package grand.app.aber_provider.databinding;
import grand.app.aber_provider.R;
import grand.app.aber_provider.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class MenuBindingImpl extends MenuBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.tv_home, 1);
        sViewsWithIds.put(R.id.v1, 2);
        sViewsWithIds.put(R.id.tv_favorite, 3);
        sViewsWithIds.put(R.id.v2, 4);
        sViewsWithIds.put(R.id.tv_cart, 5);
        sViewsWithIds.put(R.id.v3, 6);
        sViewsWithIds.put(R.id.tv_services, 7);
        sViewsWithIds.put(R.id.rc_services, 8);
        sViewsWithIds.put(R.id.v4, 9);
        sViewsWithIds.put(R.id.tv_my_services, 10);
        sViewsWithIds.put(R.id.v5, 11);
        sViewsWithIds.put(R.id.tv_account, 12);
        sViewsWithIds.put(R.id.v6, 13);
        sViewsWithIds.put(R.id.tv_provider, 14);
        sViewsWithIds.put(R.id.v7, 15);
        sViewsWithIds.put(R.id.tv_suggest, 16);
        sViewsWithIds.put(R.id.v8, 17);
        sViewsWithIds.put(R.id.tv_privacy, 18);
        sViewsWithIds.put(R.id.v9, 19);
        sViewsWithIds.put(R.id.tv_terms, 20);
        sViewsWithIds.put(R.id.v10, 21);
        sViewsWithIds.put(R.id.tv_contact, 22);
        sViewsWithIds.put(R.id.v11, 23);
        sViewsWithIds.put(R.id.tv_about, 24);
        sViewsWithIds.put(R.id.v12, 25);
        sViewsWithIds.put(R.id.tv_social, 26);
        sViewsWithIds.put(R.id.v13, 27);
        sViewsWithIds.put(R.id.tv_rate, 28);
        sViewsWithIds.put(R.id.v14, 29);
        sViewsWithIds.put(R.id.tv_share, 30);
        sViewsWithIds.put(R.id.v15, 31);
        sViewsWithIds.put(R.id.tv_lang, 32);
        sViewsWithIds.put(R.id.v16, 33);
    }
    // views
    @NonNull
    private final androidx.core.widget.NestedScrollView mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public MenuBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 34, sIncludes, sViewsWithIds));
    }
    private MenuBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.recyclerview.widget.RecyclerView) bindings[8]
            , (grand.app.aber_provider.customViews.views.CustomTextViewMedium) bindings[24]
            , (grand.app.aber_provider.customViews.views.CustomTextViewMedium) bindings[12]
            , (grand.app.aber_provider.customViews.views.CustomTextViewMedium) bindings[5]
            , (grand.app.aber_provider.customViews.views.CustomTextViewMedium) bindings[22]
            , (grand.app.aber_provider.customViews.views.CustomTextViewMedium) bindings[3]
            , (grand.app.aber_provider.customViews.views.CustomTextViewMedium) bindings[1]
            , (grand.app.aber_provider.customViews.views.CustomTextViewMedium) bindings[32]
            , (grand.app.aber_provider.customViews.views.CustomTextViewMedium) bindings[10]
            , (grand.app.aber_provider.customViews.views.CustomTextViewMedium) bindings[18]
            , (grand.app.aber_provider.customViews.views.CustomTextViewMedium) bindings[14]
            , (grand.app.aber_provider.customViews.views.CustomTextViewMedium) bindings[28]
            , (grand.app.aber_provider.customViews.views.CustomTextViewMedium) bindings[7]
            , (grand.app.aber_provider.customViews.views.CustomTextViewMedium) bindings[30]
            , (grand.app.aber_provider.customViews.views.CustomTextViewMedium) bindings[26]
            , (grand.app.aber_provider.customViews.views.CustomTextViewMedium) bindings[16]
            , (grand.app.aber_provider.customViews.views.CustomTextViewMedium) bindings[20]
            , (android.view.View) bindings[2]
            , (android.view.View) bindings[21]
            , (android.view.View) bindings[23]
            , (android.view.View) bindings[25]
            , (android.view.View) bindings[27]
            , (android.view.View) bindings[29]
            , (android.view.View) bindings[31]
            , (android.view.View) bindings[33]
            , (android.view.View) bindings[4]
            , (android.view.View) bindings[6]
            , (android.view.View) bindings[9]
            , (android.view.View) bindings[11]
            , (android.view.View) bindings[13]
            , (android.view.View) bindings[15]
            , (android.view.View) bindings[17]
            , (android.view.View) bindings[19]
            );
        this.mboundView0 = (androidx.core.widget.NestedScrollView) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
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
        if (BR.menuViewModel == variableId) {
            setMenuViewModel((grand.app.aber_provider.customViews.views.MenuViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setMenuViewModel(@Nullable grand.app.aber_provider.customViews.views.MenuViewModel MenuViewModel) {
        this.mMenuViewModel = MenuViewModel;
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
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        // batch finished
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): menuViewModel
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}