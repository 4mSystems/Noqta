package te.app.notta.databinding;
import te.app.notta.R;
import te.app.notta.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentPointsBindingImpl extends FragmentPointsBinding implements te.app.notta.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.board_header, 6);
        sViewsWithIds.put(R.id.ic_gifts, 7);
        sViewsWithIds.put(R.id.tv_your_point1, 8);
        sViewsWithIds.put(R.id.tv_your_point3, 9);
    }
    // views
    @NonNull
    private final androidx.coordinatorlayout.widget.CoordinatorLayout mboundView0;
    @NonNull
    private final com.google.android.material.floatingactionbutton.FloatingActionButton mboundView5;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback34;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentPointsBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 10, sIncludes, sViewsWithIds));
    }
    private FragmentPointsBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.appcompat.widget.AppCompatImageView) bindings[6]
            , (androidx.cardview.widget.CardView) bindings[2]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[7]
            , (androidx.recyclerview.widget.RecyclerView) bindings[4]
            , (te.app.notta.customViews.views.CustomTextViewMedium) bindings[1]
            , (te.app.notta.customViews.views.CustomTextViewMedium) bindings[8]
            , (te.app.notta.customViews.views.CustomTextViewMedium) bindings[3]
            , (te.app.notta.customViews.views.CustomTextViewMedium) bindings[9]
            );
        this.cardPoints.setTag(null);
        this.mboundView0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView5 = (com.google.android.material.floatingactionbutton.FloatingActionButton) bindings[5];
        this.mboundView5.setTag(null);
        this.rcPoints.setTag(null);
        this.tvHomeUsername.setTag(null);
        this.tvYourPoint2.setTag(null);
        setRootTag(root);
        // listeners
        mCallback34 = new te.app.notta.generated.callback.OnClickListener(this, 1);
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
            setViewmodel((te.app.notta.pages.points.viewModels.PointsViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewmodel(@Nullable te.app.notta.pages.points.viewModels.PointsViewModel Viewmodel) {
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
                return onChangeViewmodel((te.app.notta.pages.points.viewModels.PointsViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewmodel(te.app.notta.pages.points.viewModels.PointsViewModel Viewmodel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        else if (fieldId == BR.studentMainPoints) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        else if (fieldId == BR.pointsAdapter) {
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
        java.lang.String viewmodelUserDataType = null;
        int viewmodelUserDataTypeEqualsJavaLangString1ViewVISIBLEViewGONE = 0;
        te.app.notta.pages.auth.models.UserData viewmodelUserData = null;
        int viewmodelUserDataTypeEqualsJavaLangString2ViewVISIBLEViewGONE = 0;
        boolean viewmodelUserDataTypeEqualsJavaLangString2 = false;
        te.app.notta.pages.points.adapters.PointsAdapter viewmodelPointsAdapter = null;
        te.app.notta.pages.points.models.students.StudentMainPoints viewmodelStudentMainPoints = null;
        java.lang.String viewmodelStudentMainPointsPointsInStore = null;
        boolean viewmodelUserDataTypeEqualsJavaLangString1 = false;
        java.lang.String viewmodelUserDataTypeEqualsJavaLangString2TvHomeUsernameAndroidStringMyGiftsTvHomeUsernameAndroidStringShop = null;
        te.app.notta.pages.points.viewModels.PointsViewModel viewmodel = mViewmodel;

        if ((dirtyFlags & 0xfL) != 0) {


            if ((dirtyFlags & 0x9L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.userData
                        viewmodelUserData = viewmodel.userData;
                    }


                    if (viewmodelUserData != null) {
                        // read viewmodel.userData.type
                        viewmodelUserDataType = viewmodelUserData.getType();
                    }


                    if (viewmodelUserDataType != null) {
                        // read viewmodel.userData.type.equals("2")
                        viewmodelUserDataTypeEqualsJavaLangString2 = viewmodelUserDataType.equals("2");
                        // read viewmodel.userData.type.equals("1")
                        viewmodelUserDataTypeEqualsJavaLangString1 = viewmodelUserDataType.equals("1");
                    }
                if((dirtyFlags & 0x9L) != 0) {
                    if(viewmodelUserDataTypeEqualsJavaLangString2) {
                            dirtyFlags |= 0x80L;
                            dirtyFlags |= 0x200L;
                    }
                    else {
                            dirtyFlags |= 0x40L;
                            dirtyFlags |= 0x100L;
                    }
                }
                if((dirtyFlags & 0x9L) != 0) {
                    if(viewmodelUserDataTypeEqualsJavaLangString1) {
                            dirtyFlags |= 0x20L;
                    }
                    else {
                            dirtyFlags |= 0x10L;
                    }
                }


                    // read viewmodel.userData.type.equals("2") ? View.VISIBLE : View.GONE
                    viewmodelUserDataTypeEqualsJavaLangString2ViewVISIBLEViewGONE = ((viewmodelUserDataTypeEqualsJavaLangString2) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                    // read viewmodel.userData.type.equals("2") ? @android:string/my_gifts : @android:string/shop
                    viewmodelUserDataTypeEqualsJavaLangString2TvHomeUsernameAndroidStringMyGiftsTvHomeUsernameAndroidStringShop = ((viewmodelUserDataTypeEqualsJavaLangString2) ? (tvHomeUsername.getResources().getString(R.string.my_gifts)) : (tvHomeUsername.getResources().getString(R.string.shop)));
                    // read viewmodel.userData.type.equals("1") ? View.VISIBLE : View.GONE
                    viewmodelUserDataTypeEqualsJavaLangString1ViewVISIBLEViewGONE = ((viewmodelUserDataTypeEqualsJavaLangString1) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0xdL) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.pointsAdapter
                        viewmodelPointsAdapter = viewmodel.getPointsAdapter();
                    }
            }
            if ((dirtyFlags & 0xbL) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.studentMainPoints
                        viewmodelStudentMainPoints = viewmodel.getStudentMainPoints();
                    }


                    if (viewmodelStudentMainPoints != null) {
                        // read viewmodel.studentMainPoints.pointsInStore
                        viewmodelStudentMainPointsPointsInStore = viewmodelStudentMainPoints.getPointsInStore();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x9L) != 0) {
            // api target 1

            this.cardPoints.setVisibility(viewmodelUserDataTypeEqualsJavaLangString1ViewVISIBLEViewGONE);
            this.mboundView5.setVisibility(viewmodelUserDataTypeEqualsJavaLangString2ViewVISIBLEViewGONE);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvHomeUsername, viewmodelUserDataTypeEqualsJavaLangString2TvHomeUsernameAndroidStringMyGiftsTvHomeUsernameAndroidStringShop);
        }
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            this.mboundView5.setOnClickListener(mCallback34);
        }
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            te.app.notta.base.ApplicationBinding.getItemsV2Binding(this.rcPoints, viewmodelPointsAdapter, "1", "1");
        }
        if ((dirtyFlags & 0xbL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvYourPoint2, viewmodelStudentMainPointsPointsInStore);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // viewmodel != null
        boolean viewmodelJavaLangObjectNull = false;
        // viewmodel
        te.app.notta.pages.points.viewModels.PointsViewModel viewmodel = mViewmodel;



        viewmodelJavaLangObjectNull = (viewmodel) != (null);
        if (viewmodelJavaLangObjectNull) {




            viewmodel.action(te.app.notta.utils.Constants.ADD_GIFT);
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewmodel
        flag 1 (0x2L): viewmodel.studentMainPoints
        flag 2 (0x3L): viewmodel.pointsAdapter
        flag 3 (0x4L): null
        flag 4 (0x5L): viewmodel.userData.type.equals("1") ? View.VISIBLE : View.GONE
        flag 5 (0x6L): viewmodel.userData.type.equals("1") ? View.VISIBLE : View.GONE
        flag 6 (0x7L): viewmodel.userData.type.equals("2") ? View.VISIBLE : View.GONE
        flag 7 (0x8L): viewmodel.userData.type.equals("2") ? View.VISIBLE : View.GONE
        flag 8 (0x9L): viewmodel.userData.type.equals("2") ? @android:string/my_gifts : @android:string/shop
        flag 9 (0xaL): viewmodel.userData.type.equals("2") ? @android:string/my_gifts : @android:string/shop
    flag mapping end*/
    //end
}