package grand.app.aber_provider.databinding;
import grand.app.aber_provider.R;
import grand.app.aber_provider.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentOrderServiceDetailsBindingImpl extends FragmentOrderServiceDetailsBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.card_info, 1);
        sViewsWithIds.put(R.id.tv_services_name, 2);
        sViewsWithIds.put(R.id.tv_services_name_value, 3);
        sViewsWithIds.put(R.id.v_services_name, 4);
        sViewsWithIds.put(R.id.tv_service_location, 5);
        sViewsWithIds.put(R.id.tv_service_location_value, 6);
        sViewsWithIds.put(R.id.v_service_location, 7);
        sViewsWithIds.put(R.id.tv_service_time, 8);
        sViewsWithIds.put(R.id.tv_service_time_value, 9);
        sViewsWithIds.put(R.id.v_service_status, 10);
        sViewsWithIds.put(R.id.tv_service_status, 11);
        sViewsWithIds.put(R.id.tv_service_status_value, 12);
        sViewsWithIds.put(R.id.v_service, 13);
        sViewsWithIds.put(R.id.tv_service_rc, 14);
        sViewsWithIds.put(R.id.rc_services, 15);
        sViewsWithIds.put(R.id.tv_service_provider, 16);
        sViewsWithIds.put(R.id.card_provider, 17);
        sViewsWithIds.put(R.id.ic_provider, 18);
        sViewsWithIds.put(R.id.tv_home_item, 19);
        sViewsWithIds.put(R.id.tv_desc, 20);
        sViewsWithIds.put(R.id.flow, 21);
        sViewsWithIds.put(R.id.tv_service_following, 22);
        sViewsWithIds.put(R.id.card_follow_order, 23);
        sViewsWithIds.put(R.id.ic_accept, 24);
        sViewsWithIds.put(R.id.ic_accept_line, 25);
        sViewsWithIds.put(R.id.ic_on_way, 26);
        sViewsWithIds.put(R.id.ic_on_way_line, 27);
        sViewsWithIds.put(R.id.ic_arrived, 28);
        sViewsWithIds.put(R.id.ic_arrived_line, 29);
        sViewsWithIds.put(R.id.ic_finished, 30);
        sViewsWithIds.put(R.id.btn_follow_provider, 31);
        sViewsWithIds.put(R.id.btn_call_provider, 32);
    }
    // views
    @NonNull
    private final androidx.core.widget.NestedScrollView mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentOrderServiceDetailsBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 33, sIncludes, sViewsWithIds));
    }
    private FragmentOrderServiceDetailsBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (com.google.android.material.button.MaterialButton) bindings[32]
            , (com.google.android.material.button.MaterialButton) bindings[31]
            , (androidx.cardview.widget.CardView) bindings[23]
            , (androidx.cardview.widget.CardView) bindings[1]
            , (androidx.cardview.widget.CardView) bindings[17]
            , (androidx.constraintlayout.helper.widget.Flow) bindings[21]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[24]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[25]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[28]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[29]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[30]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[26]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[27]
            , (de.hdodenhof.circleimageview.CircleImageView) bindings[18]
            , (androidx.recyclerview.widget.RecyclerView) bindings[15]
            , (grand.app.aber_provider.customViews.views.CustomTextViewRegular) bindings[20]
            , (grand.app.aber_provider.customViews.views.CustomTextViewMedium) bindings[19]
            , (grand.app.aber_provider.customViews.views.CustomTextViewMedium) bindings[22]
            , (grand.app.aber_provider.customViews.views.CustomTextViewRegular) bindings[5]
            , (grand.app.aber_provider.customViews.views.CustomTextViewRegular) bindings[6]
            , (grand.app.aber_provider.customViews.views.CustomTextViewMedium) bindings[16]
            , (grand.app.aber_provider.customViews.views.CustomTextViewMedium) bindings[14]
            , (grand.app.aber_provider.customViews.views.CustomTextViewRegular) bindings[11]
            , (grand.app.aber_provider.customViews.views.CustomTextViewRegular) bindings[12]
            , (grand.app.aber_provider.customViews.views.CustomTextViewRegular) bindings[8]
            , (grand.app.aber_provider.customViews.views.CustomTextViewRegular) bindings[9]
            , (grand.app.aber_provider.customViews.views.CustomTextViewRegular) bindings[2]
            , (grand.app.aber_provider.customViews.views.CustomTextViewRegular) bindings[3]
            , (android.view.View) bindings[13]
            , (android.view.View) bindings[7]
            , (android.view.View) bindings[10]
            , (android.view.View) bindings[4]
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
        if (BR.viewmodel == variableId) {
            setViewmodel((grand.app.aber_provider.pages.profile.viewModels.ProfileFollowersViewModels) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewmodel(@Nullable grand.app.aber_provider.pages.profile.viewModels.ProfileFollowersViewModels Viewmodel) {
        this.mViewmodel = Viewmodel;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewmodel((grand.app.aber_provider.pages.profile.viewModels.ProfileFollowersViewModels) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewmodel(grand.app.aber_provider.pages.profile.viewModels.ProfileFollowersViewModels Viewmodel, int fieldId) {
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
        flag 0 (0x1L): viewmodel
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}