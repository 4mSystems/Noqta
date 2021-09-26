package te.app.notta.databinding;
import te.app.notta.R;
import te.app.notta.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentProfileBindingImpl extends FragmentProfileBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.board_header, 5);
        sViewsWithIds.put(R.id.logout, 6);
    }
    // views
    @NonNull
    private final androidx.core.widget.NestedScrollView mboundView0;
    @NonNull
    private final androidx.recyclerview.widget.RecyclerView mboundView4;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentProfileBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds));
    }
    private FragmentProfileBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.appcompat.widget.AppCompatImageView) bindings[5]
            , (com.google.android.material.button.MaterialButton) bindings[6]
            , (de.hdodenhof.circleimageview.CircleImageView) bindings[1]
            , (te.app.notta.customViews.views.CustomTextViewRegular) bindings[3]
            , (te.app.notta.customViews.views.CustomTextViewMedium) bindings[2]
            );
        this.mboundView0 = (androidx.core.widget.NestedScrollView) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView4 = (androidx.recyclerview.widget.RecyclerView) bindings[4];
        this.mboundView4.setTag(null);
        this.memberProfile.setTag(null);
        this.tvEmail.setTag(null);
        this.tvUserName.setTag(null);
        setRootTag(root);
        // listeners
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
        else if (fieldId == BR.profileAdaptersAdapter) {
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
        java.lang.String viewmodelUserDataName = null;
        te.app.notta.pages.auth.models.UserData viewmodelUserData = null;
        java.lang.String viewmodelUserDataImage = null;
        te.app.notta.pages.settings.adapters.ProfileAdaptersAdapter viewmodelProfileAdaptersAdapter = null;
        te.app.notta.pages.settings.viewModels.SettingsViewModel viewmodel = mViewmodel;
        java.lang.String viewmodelUserDataEmail = null;

        if ((dirtyFlags & 0x7L) != 0) {


            if ((dirtyFlags & 0x5L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.userData
                        viewmodelUserData = viewmodel.userData;
                    }


                    if (viewmodelUserData != null) {
                        // read viewmodel.userData.name
                        viewmodelUserDataName = viewmodelUserData.getName();
                        // read viewmodel.userData.image
                        viewmodelUserDataImage = viewmodelUserData.getImage();
                        // read viewmodel.userData.email
                        viewmodelUserDataEmail = viewmodelUserData.getEmail();
                    }
            }

                if (viewmodel != null) {
                    // read viewmodel.profileAdaptersAdapter
                    viewmodelProfileAdaptersAdapter = viewmodel.getProfileAdaptersAdapter();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            te.app.notta.base.ApplicationBinding.getItemsV2Binding(this.mboundView4, viewmodelProfileAdaptersAdapter, "2", "1");
        }
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            te.app.notta.base.ApplicationBinding.loadImage(this.memberProfile, viewmodelUserDataImage);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvEmail, viewmodelUserDataEmail);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvUserName, viewmodelUserDataName);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewmodel
        flag 1 (0x2L): viewmodel.profileAdaptersAdapter
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}