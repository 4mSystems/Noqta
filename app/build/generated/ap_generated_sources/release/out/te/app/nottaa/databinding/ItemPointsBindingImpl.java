package te.app.nottaa.databinding;
import te.app.nottaa.R;
import te.app.nottaa.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemPointsBindingImpl extends ItemPointsBinding implements te.app.nottaa.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.br2, 8);
    }
    // views
    @NonNull
    private final androidx.cardview.widget.CardView mboundView0;
    @NonNull
    private final android.view.View mboundView6;
    @NonNull
    private final androidx.appcompat.widget.AppCompatButton mboundView7;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback21;
    @Nullable
    private final android.view.View.OnClickListener mCallback20;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemPointsBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 9, sIncludes, sViewsWithIds));
    }
    private ItemPointsBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.constraintlayout.widget.Barrier) bindings[8]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[4]
            , (com.makeramen.roundedimageview.RoundedImageView) bindings[1]
            , (te.app.nottaa.customViews.views.CustomTextViewRegular) bindings[5]
            , (te.app.nottaa.customViews.views.CustomTextViewMedium) bindings[3]
            , (te.app.nottaa.customViews.views.CustomTextViewRegular) bindings[2]
            );
        this.icDelete.setTag(null);
        this.icUser.setTag(null);
        this.mboundView0 = (androidx.cardview.widget.CardView) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView6 = (android.view.View) bindings[6];
        this.mboundView6.setTag(null);
        this.mboundView7 = (androidx.appcompat.widget.AppCompatButton) bindings[7];
        this.mboundView7.setTag(null);
        this.tvDescPoint.setTag(null);
        this.tvGroupName.setTag(null);
        this.tvPoints.setTag(null);
        setRootTag(root);
        // listeners
        mCallback21 = new te.app.nottaa.generated.callback.OnClickListener(this, 2);
        mCallback20 = new te.app.nottaa.generated.callback.OnClickListener(this, 1);
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
        if (BR.viewModel == variableId) {
            setViewModel((te.app.nottaa.pages.points.viewModels.ItemPointsViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable te.app.nottaa.pages.points.viewModels.ItemPointsViewModel ViewModel) {
        updateRegistration(0, ViewModel);
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModel((te.app.nottaa.pages.points.viewModels.ItemPointsViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModel(te.app.nottaa.pages.points.viewModels.ItemPointsViewModel ViewModel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        else if (fieldId == BR.pointsData) {
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
        java.lang.String viewModelUserDataType = null;
        int viewModelUserDataTypeEqualsJavaLangString2ViewVISIBLEViewGONE = 0;
        java.lang.String viewModelPointsDataImage = null;
        int viewModelPointsDataNumEqualsViewModelPointsDataReplacedNumMboundView7AndroidColorMediumColorMboundView7AndroidColorColorAccent = 0;
        java.lang.String viewModelPointsDataNum = null;
        java.lang.String viewModelPointsDataName = null;
        java.lang.String viewModelPointsDataPointsConcatJavaLangStringConcatTvPointsAndroidStringYourPoint2 = null;
        boolean viewModelPointsDataNumEqualsViewModelPointsDataReplacedNumBooleanFalseBooleanTrue = false;
        java.lang.String viewModelPointsDataNumEqualsViewModelPointsDataReplacedNumMboundView7AndroidStringSoldOutMboundView7AndroidStringExchange = null;
        te.app.nottaa.pages.points.models.PointsData viewModelPointsData = null;
        boolean viewModelUserDataTypeEqualsJavaLangString2 = false;
        te.app.nottaa.pages.auth.models.UserData viewModelUserData = null;
        java.lang.String viewModelPointsDataPointsConcatJavaLangString = null;
        boolean viewModelPointsDataNumEqualsViewModelPointsDataReplacedNum = false;
        java.lang.String viewModelPointsDataDescription = null;
        int viewModelUserDataTypeEqualsJavaLangString1ViewVISIBLEViewGONE = 0;
        java.lang.String viewModelPointsDataPoints = null;
        boolean viewModelUserDataTypeEqualsJavaLangString1 = false;
        te.app.nottaa.pages.points.viewModels.ItemPointsViewModel viewModel = mViewModel;
        java.lang.String viewModelPointsDataReplacedNum = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (viewModel != null) {
                    // read viewModel.pointsData
                    viewModelPointsData = viewModel.getPointsData();
                }


                if (viewModelPointsData != null) {
                    // read viewModel.pointsData.image
                    viewModelPointsDataImage = viewModelPointsData.getImage();
                    // read viewModel.pointsData.num
                    viewModelPointsDataNum = viewModelPointsData.getNum();
                    // read viewModel.pointsData.name
                    viewModelPointsDataName = viewModelPointsData.getName();
                    // read viewModel.pointsData.description
                    viewModelPointsDataDescription = viewModelPointsData.getDescription();
                    // read viewModel.pointsData.points
                    viewModelPointsDataPoints = viewModelPointsData.getPoints();
                    // read viewModel.pointsData.replaced_num
                    viewModelPointsDataReplacedNum = viewModelPointsData.getReplaced_num();
                }


                if (viewModelPointsDataPoints != null) {
                    // read viewModel.pointsData.points.concat(" ")
                    viewModelPointsDataPointsConcatJavaLangString = viewModelPointsDataPoints.concat(" ");
                }
                if (viewModelPointsDataNum != null) {
                    // read viewModel.pointsData.num.equals(viewModel.pointsData.replaced_num)
                    viewModelPointsDataNumEqualsViewModelPointsDataReplacedNum = viewModelPointsDataNum.equals(viewModelPointsDataReplacedNum);
                }
            if((dirtyFlags & 0x7L) != 0) {
                if(viewModelPointsDataNumEqualsViewModelPointsDataReplacedNum) {
                        dirtyFlags |= 0x40L;
                        dirtyFlags |= 0x100L;
                        dirtyFlags |= 0x400L;
                }
                else {
                        dirtyFlags |= 0x20L;
                        dirtyFlags |= 0x80L;
                        dirtyFlags |= 0x200L;
                }
            }


                if (viewModelPointsDataPointsConcatJavaLangString != null) {
                    // read viewModel.pointsData.points.concat(" ").concat(@android:string/your_point2)
                    viewModelPointsDataPointsConcatJavaLangStringConcatTvPointsAndroidStringYourPoint2 = viewModelPointsDataPointsConcatJavaLangString.concat(tvPoints.getResources().getString(R.string.your_point2));
                }
                // read viewModel.pointsData.num.equals(viewModel.pointsData.replaced_num) ? @android:color/medium_color : @android:color/colorAccent
                viewModelPointsDataNumEqualsViewModelPointsDataReplacedNumMboundView7AndroidColorMediumColorMboundView7AndroidColorColorAccent = ((viewModelPointsDataNumEqualsViewModelPointsDataReplacedNum) ? (getColorFromResource(mboundView7, R.color.medium_color)) : (getColorFromResource(mboundView7, R.color.colorAccent)));
                // read viewModel.pointsData.num.equals(viewModel.pointsData.replaced_num) ? false : true
                viewModelPointsDataNumEqualsViewModelPointsDataReplacedNumBooleanFalseBooleanTrue = ((viewModelPointsDataNumEqualsViewModelPointsDataReplacedNum) ? (false) : (true));
                // read viewModel.pointsData.num.equals(viewModel.pointsData.replaced_num) ? @android:string/sold_out : @android:string/exchange
                viewModelPointsDataNumEqualsViewModelPointsDataReplacedNumMboundView7AndroidStringSoldOutMboundView7AndroidStringExchange = ((viewModelPointsDataNumEqualsViewModelPointsDataReplacedNum) ? (mboundView7.getResources().getString(R.string.sold_out)) : (mboundView7.getResources().getString(R.string.exchange)));
            if ((dirtyFlags & 0x5L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.userData
                        viewModelUserData = viewModel.userData;
                    }


                    if (viewModelUserData != null) {
                        // read viewModel.userData.type
                        viewModelUserDataType = viewModelUserData.getType();
                    }


                    if (viewModelUserDataType != null) {
                        // read viewModel.userData.type.equals("2")
                        viewModelUserDataTypeEqualsJavaLangString2 = viewModelUserDataType.equals("2");
                        // read viewModel.userData.type.equals("1")
                        viewModelUserDataTypeEqualsJavaLangString1 = viewModelUserDataType.equals("1");
                    }
                if((dirtyFlags & 0x5L) != 0) {
                    if(viewModelUserDataTypeEqualsJavaLangString2) {
                            dirtyFlags |= 0x10L;
                    }
                    else {
                            dirtyFlags |= 0x8L;
                    }
                }
                if((dirtyFlags & 0x5L) != 0) {
                    if(viewModelUserDataTypeEqualsJavaLangString1) {
                            dirtyFlags |= 0x1000L;
                    }
                    else {
                            dirtyFlags |= 0x800L;
                    }
                }


                    // read viewModel.userData.type.equals("2") ? View.VISIBLE : View.GONE
                    viewModelUserDataTypeEqualsJavaLangString2ViewVISIBLEViewGONE = ((viewModelUserDataTypeEqualsJavaLangString2) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                    // read viewModel.userData.type.equals("1") ? View.VISIBLE : View.GONE
                    viewModelUserDataTypeEqualsJavaLangString1ViewVISIBLEViewGONE = ((viewModelUserDataTypeEqualsJavaLangString1) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
        }
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.icDelete.setOnClickListener(mCallback20);
            this.mboundView7.setOnClickListener(mCallback21);
        }
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            this.icDelete.setVisibility(viewModelUserDataTypeEqualsJavaLangString2ViewVISIBLEViewGONE);
            this.mboundView6.setVisibility(viewModelUserDataTypeEqualsJavaLangString2ViewVISIBLEViewGONE);
            this.mboundView7.setVisibility(viewModelUserDataTypeEqualsJavaLangString1ViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            te.app.nottaa.base.ApplicationBinding.loadImage(this.icUser, viewModelPointsDataImage);
            androidx.databinding.adapters.ViewBindingAdapter.setBackground(this.mboundView7, androidx.databinding.adapters.Converters.convertColorToDrawable(viewModelPointsDataNumEqualsViewModelPointsDataReplacedNumMboundView7AndroidColorMediumColorMboundView7AndroidColorColorAccent));
            this.mboundView7.setEnabled(viewModelPointsDataNumEqualsViewModelPointsDataReplacedNumBooleanFalseBooleanTrue);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView7, viewModelPointsDataNumEqualsViewModelPointsDataReplacedNumMboundView7AndroidStringSoldOutMboundView7AndroidStringExchange);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvDescPoint, viewModelPointsDataDescription);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvGroupName, viewModelPointsDataName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvPoints, viewModelPointsDataPointsConcatJavaLangStringConcatTvPointsAndroidStringYourPoint2);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 2: {
                // localize variables for thread safety
                // viewModel
                te.app.nottaa.pages.points.viewModels.ItemPointsViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {




                    viewModel.itemAction(te.app.nottaa.utils.Constants.GET_GIFT);
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // viewModel
                te.app.nottaa.pages.points.viewModels.ItemPointsViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {




                    viewModel.itemAction(te.app.nottaa.utils.Constants.DELETE_GIFT);
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel
        flag 1 (0x2L): viewModel.pointsData
        flag 2 (0x3L): null
        flag 3 (0x4L): viewModel.userData.type.equals("2") ? View.VISIBLE : View.GONE
        flag 4 (0x5L): viewModel.userData.type.equals("2") ? View.VISIBLE : View.GONE
        flag 5 (0x6L): viewModel.pointsData.num.equals(viewModel.pointsData.replaced_num) ? @android:color/medium_color : @android:color/colorAccent
        flag 6 (0x7L): viewModel.pointsData.num.equals(viewModel.pointsData.replaced_num) ? @android:color/medium_color : @android:color/colorAccent
        flag 7 (0x8L): viewModel.pointsData.num.equals(viewModel.pointsData.replaced_num) ? false : true
        flag 8 (0x9L): viewModel.pointsData.num.equals(viewModel.pointsData.replaced_num) ? false : true
        flag 9 (0xaL): viewModel.pointsData.num.equals(viewModel.pointsData.replaced_num) ? @android:string/sold_out : @android:string/exchange
        flag 10 (0xbL): viewModel.pointsData.num.equals(viewModel.pointsData.replaced_num) ? @android:string/sold_out : @android:string/exchange
        flag 11 (0xcL): viewModel.userData.type.equals("1") ? View.VISIBLE : View.GONE
        flag 12 (0xdL): viewModel.userData.type.equals("1") ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}