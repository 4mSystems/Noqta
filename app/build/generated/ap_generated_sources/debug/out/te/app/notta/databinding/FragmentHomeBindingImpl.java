package te.app.notta.databinding;
import te.app.notta.R;
import te.app.notta.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentHomeBindingImpl extends FragmentHomeBinding implements te.app.notta.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.board_header, 4);
        sViewsWithIds.put(R.id.tv_home_desc, 5);
        sViewsWithIds.put(R.id.ic_home_notification, 6);
        sViewsWithIds.put(R.id.search_input, 7);
        sViewsWithIds.put(R.id.tv_home_body, 8);
    }
    // views
    @NonNull
    private final androidx.coordinatorlayout.widget.CoordinatorLayout mboundView0;
    @NonNull
    private final androidx.recyclerview.widget.RecyclerView mboundView2;
    @NonNull
    private final com.google.android.material.floatingactionbutton.FloatingActionButton mboundView3;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback16;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentHomeBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 9, sIncludes, sViewsWithIds));
    }
    private FragmentHomeBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.appcompat.widget.AppCompatImageView) bindings[4]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[6]
            , (com.google.android.material.textfield.TextInputEditText) bindings[7]
            , (te.app.notta.customViews.views.CustomTextViewMedium) bindings[8]
            , (te.app.notta.customViews.views.CustomTextViewMedium) bindings[5]
            , (te.app.notta.customViews.views.CustomTextViewMedium) bindings[1]
            );
        this.mboundView0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView2 = (androidx.recyclerview.widget.RecyclerView) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (com.google.android.material.floatingactionbutton.FloatingActionButton) bindings[3];
        this.mboundView3.setTag(null);
        this.tvHomeUsername.setTag(null);
        setRootTag(root);
        // listeners
        mCallback16 = new te.app.notta.generated.callback.OnClickListener(this, 1);
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
            setViewmodel((te.app.notta.pages.home.viewModels.HomeViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewmodel(@Nullable te.app.notta.pages.home.viewModels.HomeViewModel Viewmodel) {
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
                return onChangeViewmodel((te.app.notta.pages.home.viewModels.HomeViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewmodel(te.app.notta.pages.home.viewModels.HomeViewModel Viewmodel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        else if (fieldId == BR.groupsAdapter) {
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
        te.app.notta.pages.home.adapters.GroupsAdapter viewmodelGroupsAdapter = null;
        te.app.notta.pages.auth.models.UserData viewmodelUserData = null;
        java.lang.String tvHomeUsernameAndroidStringHiConcatJavaLangStringConcatViewmodelUserDataNameConcatJavaLangStringConcatJavaLangString = null;
        java.lang.String tvHomeUsernameAndroidStringHiConcatJavaLangStringConcatViewmodelUserDataName = null;
        java.lang.String tvHomeUsernameAndroidStringHiConcatJavaLangStringConcatViewmodelUserDataNameConcatJavaLangString = null;
        te.app.notta.pages.home.viewModels.HomeViewModel viewmodel = mViewmodel;

        if ((dirtyFlags & 0x7L) != 0) {



                if (viewmodel != null) {
                    // read viewmodel.groupsAdapter
                    viewmodelGroupsAdapter = viewmodel.getGroupsAdapter();
                }
            if ((dirtyFlags & 0x5L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.userData
                        viewmodelUserData = viewmodel.userData;
                    }


                    if (viewmodelUserData != null) {
                        // read viewmodel.userData.name
                        viewmodelUserDataName = viewmodelUserData.getName();
                    }


                    // read @android:string/hi.concat(" ").concat(viewmodel.userData.name)
                    tvHomeUsernameAndroidStringHiConcatJavaLangStringConcatViewmodelUserDataName = tvHomeUsername.getResources().getString(R.string.hi).concat(" ").concat(viewmodelUserDataName);


                    if (tvHomeUsernameAndroidStringHiConcatJavaLangStringConcatViewmodelUserDataName != null) {
                        // read @android:string/hi.concat(" ").concat(viewmodel.userData.name).concat(" ")
                        tvHomeUsernameAndroidStringHiConcatJavaLangStringConcatViewmodelUserDataNameConcatJavaLangString = tvHomeUsernameAndroidStringHiConcatJavaLangStringConcatViewmodelUserDataName.concat(" ");
                    }


                    if (tvHomeUsernameAndroidStringHiConcatJavaLangStringConcatViewmodelUserDataNameConcatJavaLangString != null) {
                        // read @android:string/hi.concat(" ").concat(viewmodel.userData.name).concat(" ").concat("!")
                        tvHomeUsernameAndroidStringHiConcatJavaLangStringConcatViewmodelUserDataNameConcatJavaLangStringConcatJavaLangString = tvHomeUsernameAndroidStringHiConcatJavaLangStringConcatViewmodelUserDataNameConcatJavaLangString.concat("!");
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            te.app.notta.base.ApplicationBinding.getItemsV2Binding(this.mboundView2, viewmodelGroupsAdapter, "1", "1");
        }
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.mboundView3.setOnClickListener(mCallback16);
        }
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvHomeUsername, tvHomeUsernameAndroidStringHiConcatJavaLangStringConcatViewmodelUserDataNameConcatJavaLangStringConcatJavaLangString);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // viewmodel != null
        boolean viewmodelJavaLangObjectNull = false;
        // viewmodel
        te.app.notta.pages.home.viewModels.HomeViewModel viewmodel = mViewmodel;



        viewmodelJavaLangObjectNull = (viewmodel) != (null);
        if (viewmodelJavaLangObjectNull) {




            viewmodel.action(te.app.notta.utils.Constants.ADD_GROUP);
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewmodel
        flag 1 (0x2L): viewmodel.groupsAdapter
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}