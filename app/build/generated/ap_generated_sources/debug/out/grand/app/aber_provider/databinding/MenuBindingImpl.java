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
        sViewsWithIds.put(R.id.tv_my_services, 3);
        sViewsWithIds.put(R.id.v5, 4);
        sViewsWithIds.put(R.id.tv_provider, 5);
        sViewsWithIds.put(R.id.v7, 6);
        sViewsWithIds.put(R.id.tv_notifications, 7);
        sViewsWithIds.put(R.id.v8, 8);
        sViewsWithIds.put(R.id.tv_privacy, 9);
        sViewsWithIds.put(R.id.v9, 10);
        sViewsWithIds.put(R.id.tv_terms, 11);
        sViewsWithIds.put(R.id.v10, 12);
        sViewsWithIds.put(R.id.tv_lang, 13);
        sViewsWithIds.put(R.id.v16, 14);
        sViewsWithIds.put(R.id.tv_country, 15);
        sViewsWithIds.put(R.id.v17, 16);
        sViewsWithIds.put(R.id.tv_city, 17);
        sViewsWithIds.put(R.id.v15, 18);
        sViewsWithIds.put(R.id.tv_more, 19);
        sViewsWithIds.put(R.id.v20, 20);
        sViewsWithIds.put(R.id.rc_menu_social, 21);
        sViewsWithIds.put(R.id.grand_logo, 22);
    }
    // views
    @NonNull
    private final androidx.core.widget.NestedScrollView mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public MenuBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 23, sIncludes, sViewsWithIds));
    }
    private MenuBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (grand.app.aber_provider.customViews.grandDialog.GrandImageDialog) bindings[22]
            , (androidx.recyclerview.widget.RecyclerView) bindings[21]
            , (grand.app.aber_provider.customViews.views.CustomTextViewMedium) bindings[17]
            , (grand.app.aber_provider.customViews.views.CustomTextViewMedium) bindings[15]
            , (grand.app.aber_provider.customViews.views.CustomTextViewMedium) bindings[1]
            , (grand.app.aber_provider.customViews.views.CustomTextViewMedium) bindings[13]
            , (grand.app.aber_provider.customViews.views.CustomTextViewMedium) bindings[19]
            , (grand.app.aber_provider.customViews.views.CustomTextViewMedium) bindings[3]
            , (grand.app.aber_provider.customViews.views.CustomTextViewMedium) bindings[7]
            , (grand.app.aber_provider.customViews.views.CustomTextViewMedium) bindings[9]
            , (grand.app.aber_provider.customViews.views.CustomTextViewMedium) bindings[5]
            , (grand.app.aber_provider.customViews.views.CustomTextViewMedium) bindings[11]
            , (android.view.View) bindings[2]
            , (android.view.View) bindings[12]
            , (android.view.View) bindings[18]
            , (android.view.View) bindings[14]
            , (android.view.View) bindings[16]
            , (android.view.View) bindings[20]
            , (android.view.View) bindings[4]
            , (android.view.View) bindings[6]
            , (android.view.View) bindings[8]
            , (android.view.View) bindings[10]
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