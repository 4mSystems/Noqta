package te.app.notta.databinding;
import te.app.notta.R;
import te.app.notta.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentGroupDetailsBindingImpl extends FragmentGroupDetailsBinding implements te.app.notta.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.board_header, 2);
        sViewsWithIds.put(R.id.tv_profile_title, 3);
        sViewsWithIds.put(R.id.ic_teacher, 4);
        sViewsWithIds.put(R.id.tv_teacher_name, 5);
        sViewsWithIds.put(R.id.tv_user_work, 6);
        sViewsWithIds.put(R.id.btn_tech_type, 7);
        sViewsWithIds.put(R.id.btn_tech, 8);
        sViewsWithIds.put(R.id.tv_location, 9);
        sViewsWithIds.put(R.id.tv_date, 10);
        sViewsWithIds.put(R.id.flow, 11);
        sViewsWithIds.put(R.id.br3, 12);
        sViewsWithIds.put(R.id.v_line, 13);
        sViewsWithIds.put(R.id.tv_group_desc, 14);
        sViewsWithIds.put(R.id.tv_group_desc_value, 15);
        sViewsWithIds.put(R.id.v_line1, 16);
        sViewsWithIds.put(R.id.tv_info, 17);
        sViewsWithIds.put(R.id.btn_students, 18);
        sViewsWithIds.put(R.id.btn_groups, 19);
        sViewsWithIds.put(R.id.btn_requests, 20);
        sViewsWithIds.put(R.id.btn_join, 21);
        sViewsWithIds.put(R.id.flow1, 22);
        sViewsWithIds.put(R.id.v_line2, 23);
        sViewsWithIds.put(R.id.tv_members, 24);
        sViewsWithIds.put(R.id.tv_show_all, 25);
        sViewsWithIds.put(R.id.rc_members, 26);
        sViewsWithIds.put(R.id.v_line3, 27);
        sViewsWithIds.put(R.id.tv_tasks, 28);
    }
    // views
    @NonNull
    private final androidx.core.widget.NestedScrollView mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback26;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentGroupDetailsBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 29, sIncludes, sViewsWithIds));
    }
    private FragmentGroupDetailsBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (com.google.android.material.floatingactionbutton.FloatingActionButton) bindings[1]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[2]
            , (androidx.constraintlayout.widget.Barrier) bindings[12]
            , (com.google.android.material.button.MaterialButton) bindings[19]
            , (com.google.android.material.button.MaterialButton) bindings[21]
            , (com.google.android.material.button.MaterialButton) bindings[20]
            , (com.google.android.material.button.MaterialButton) bindings[18]
            , (com.google.android.material.button.MaterialButton) bindings[8]
            , (com.google.android.material.button.MaterialButton) bindings[7]
            , (androidx.constraintlayout.helper.widget.Flow) bindings[11]
            , (androidx.constraintlayout.helper.widget.Flow) bindings[22]
            , (com.makeramen.roundedimageview.RoundedImageView) bindings[4]
            , (androidx.recyclerview.widget.RecyclerView) bindings[26]
            , (te.app.notta.customViews.views.CustomTextViewRegular) bindings[10]
            , (te.app.notta.customViews.views.CustomTextViewMedium) bindings[14]
            , (te.app.notta.customViews.views.CustomTextViewRegular) bindings[15]
            , (te.app.notta.customViews.views.CustomTextViewMedium) bindings[17]
            , (te.app.notta.customViews.views.CustomTextViewRegular) bindings[9]
            , (te.app.notta.customViews.views.CustomTextViewMedium) bindings[24]
            , (te.app.notta.customViews.views.CustomTextViewMedium) bindings[3]
            , (te.app.notta.customViews.views.CustomTextViewMedium) bindings[25]
            , (te.app.notta.customViews.views.CustomTextViewMedium) bindings[28]
            , (te.app.notta.customViews.views.CustomTextViewMedium) bindings[5]
            , (te.app.notta.customViews.views.CustomTextViewRegular) bindings[6]
            , (android.view.View) bindings[13]
            , (android.view.View) bindings[16]
            , (android.view.View) bindings[23]
            , (android.view.View) bindings[27]
            );
        this.back.setTag(null);
        this.mboundView0 = (androidx.core.widget.NestedScrollView) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        mCallback26 = new te.app.notta.generated.callback.OnClickListener(this, 1);
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
            setViewmodel((te.app.notta.pages.auth.register.RegisterViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewmodel(@Nullable te.app.notta.pages.auth.register.RegisterViewModel Viewmodel) {
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
                return onChangeViewmodel((te.app.notta.pages.auth.register.RegisterViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewmodel(te.app.notta.pages.auth.register.RegisterViewModel Viewmodel, int fieldId) {
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
        te.app.notta.pages.auth.register.RegisterViewModel viewmodel = mViewmodel;
        // batch finished
        if ((dirtyFlags & 0x2L) != 0) {
            // api target 1

            this.back.setOnClickListener(mCallback26);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // viewmodel != null
        boolean viewmodelJavaLangObjectNull = false;
        // viewmodel
        te.app.notta.pages.auth.register.RegisterViewModel viewmodel = mViewmodel;



        viewmodelJavaLangObjectNull = (viewmodel) != (null);
        if (viewmodelJavaLangObjectNull) {



            viewmodel.goBack(getRoot().getContext());
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewmodel
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}