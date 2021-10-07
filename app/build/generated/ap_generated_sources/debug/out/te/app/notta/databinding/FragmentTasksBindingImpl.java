package te.app.notta.databinding;
import te.app.notta.R;
import te.app.notta.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentTasksBindingImpl extends FragmentTasksBinding implements te.app.notta.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.board_header, 5);
        sViewsWithIds.put(R.id.tv_home_desc, 6);
        sViewsWithIds.put(R.id.search_input, 7);
        sViewsWithIds.put(R.id.tv_home_body, 8);
    }
    // views
    @NonNull
    private final androidx.coordinatorlayout.widget.CoordinatorLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback68;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentTasksBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 9, sIncludes, sViewsWithIds));
    }
    private FragmentTasksBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (androidx.appcompat.widget.AppCompatImageView) bindings[5]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[2]
            , (com.google.android.material.progressindicator.CircularProgressIndicator) bindings[4]
            , (androidx.recyclerview.widget.RecyclerView) bindings[3]
            , (com.google.android.material.textfield.TextInputEditText) bindings[7]
            , (te.app.notta.customViews.views.CustomTextViewMedium) bindings[8]
            , (te.app.notta.customViews.views.CustomTextViewMedium) bindings[6]
            , (te.app.notta.customViews.views.CustomTextViewMedium) bindings[1]
            );
        this.icHomeNotification.setTag(null);
        this.mboundView0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.progress.setTag(null);
        this.rcGroups.setTag(null);
        this.tvHomeUsername.setTag(null);
        setRootTag(root);
        // listeners
        mCallback68 = new te.app.notta.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
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
                return onChangeViewmodelSearchProgressVisible((androidx.databinding.ObservableBoolean) object, fieldId);
            case 1 :
                return onChangeViewmodel((te.app.notta.pages.home.viewModels.HomeViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewmodelSearchProgressVisible(androidx.databinding.ObservableBoolean ViewmodelSearchProgressVisible, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodel(te.app.notta.pages.home.viewModels.HomeViewModel Viewmodel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        else if (fieldId == BR.groupsAdapter) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
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
        te.app.notta.pages.home.adapters.GroupsAdapter viewmodelGroupsAdapter = null;
        java.lang.String tvHomeUsernameAndroidStringHiConcatJavaLangStringConcatViewmodelUserDataNameConcatJavaLangStringConcatJavaLangString = null;
        androidx.databinding.ObservableBoolean viewmodelSearchProgressVisible = null;
        java.lang.String tvHomeUsernameAndroidStringHiConcatJavaLangStringConcatViewmodelUserDataNameConcatJavaLangString = null;
        java.lang.String viewmodelUserDataName = null;
        te.app.notta.pages.auth.models.UserData viewmodelUserData = null;
        boolean viewmodelSearchProgressVisibleGet = false;
        java.lang.String tvHomeUsernameAndroidStringHiConcatJavaLangStringConcatViewmodelUserDataName = null;
        int viewmodelSearchProgressVisibleViewVISIBLEViewGONE = 0;
        te.app.notta.pages.home.viewModels.HomeViewModel viewmodel = mViewmodel;

        if ((dirtyFlags & 0xfL) != 0) {


            if ((dirtyFlags & 0xeL) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.groupsAdapter
                        viewmodelGroupsAdapter = viewmodel.getGroupsAdapter();
                    }
            }
            if ((dirtyFlags & 0xbL) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.searchProgressVisible
                        viewmodelSearchProgressVisible = viewmodel.searchProgressVisible;
                    }
                    updateRegistration(0, viewmodelSearchProgressVisible);


                    if (viewmodelSearchProgressVisible != null) {
                        // read viewmodel.searchProgressVisible.get()
                        viewmodelSearchProgressVisibleGet = viewmodelSearchProgressVisible.get();
                    }
                if((dirtyFlags & 0xbL) != 0) {
                    if(viewmodelSearchProgressVisibleGet) {
                            dirtyFlags |= 0x20L;
                    }
                    else {
                            dirtyFlags |= 0x10L;
                    }
                }


                    // read viewmodel.searchProgressVisible.get() ? View.VISIBLE : View.GONE
                    viewmodelSearchProgressVisibleViewVISIBLEViewGONE = ((viewmodelSearchProgressVisibleGet) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0xaL) != 0) {

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
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            this.icHomeNotification.setOnClickListener(mCallback68);
        }
        if ((dirtyFlags & 0xbL) != 0) {
            // api target 1

            this.progress.setVisibility(viewmodelSearchProgressVisibleViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0xeL) != 0) {
            // api target 1

            te.app.notta.base.ApplicationBinding.getItemsV2Binding(this.rcGroups, viewmodelGroupsAdapter, "1", "1");
        }
        if ((dirtyFlags & 0xaL) != 0) {
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




            viewmodel.action(te.app.notta.utils.Constants.NOTIFICATIONS);
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewmodel.searchProgressVisible
        flag 1 (0x2L): viewmodel
        flag 2 (0x3L): viewmodel.groupsAdapter
        flag 3 (0x4L): null
        flag 4 (0x5L): viewmodel.searchProgressVisible.get() ? View.VISIBLE : View.GONE
        flag 5 (0x6L): viewmodel.searchProgressVisible.get() ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}