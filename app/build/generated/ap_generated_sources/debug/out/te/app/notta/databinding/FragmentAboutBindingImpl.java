package te.app.notta.databinding;
import te.app.notta.R;
import te.app.notta.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentAboutBindingImpl extends FragmentAboutBinding implements te.app.notta.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.img_login_header, 5);
        sViewsWithIds.put(R.id.login_container, 6);
        sViewsWithIds.put(R.id.ic_logo, 7);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback35;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentAboutBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds));
    }
    private FragmentAboutBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (te.app.notta.customViews.views.CustomTextViewMedium) bindings[4]
            , (te.app.notta.customViews.views.CustomTextViewMedium) bindings[3]
            , (com.google.android.material.floatingactionbutton.FloatingActionButton) bindings[2]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[7]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[5]
            , (androidx.cardview.widget.CardView) bindings[6]
            , (te.app.notta.customViews.views.CustomTextViewMedium) bindings[1]
            );
        this.aboutBody.setTag(null);
        this.aboutSubTitle.setTag(null);
        this.back.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.tvProfileTitle.setTag(null);
        setRootTag(root);
        // listeners
        mCallback35 = new te.app.notta.generated.callback.OnClickListener(this, 1);
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
        else if (fieldId == BR.passingObject) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        else if (fieldId == BR.aboutData) {
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
        te.app.notta.PassingObject viewmodelPassingObject = null;
        te.app.notta.pages.settings.models.AboutData viewmodelAboutData = null;
        int viewmodelPassingObjectId = 0;
        java.lang.String viewmodelPassingObjectIdInt1AboutSubTitleAndroidStringAboutTitleAboutSubTitleAndroidStringTerms = null;
        java.lang.String viewmodelPassingObjectIdInt1TvProfileTitleAndroidStringAboutTitleTvProfileTitleAndroidStringTerms = null;
        boolean viewmodelPassingObjectIdInt1 = false;
        java.lang.String viewmodelAboutDataBody = null;
        te.app.notta.pages.settings.viewModels.SettingsViewModel viewmodel = mViewmodel;

        if ((dirtyFlags & 0xfL) != 0) {


            if ((dirtyFlags & 0xbL) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.passingObject
                        viewmodelPassingObject = viewmodel.getPassingObject();
                    }


                    if (viewmodelPassingObject != null) {
                        // read viewmodel.passingObject.id
                        viewmodelPassingObjectId = viewmodelPassingObject.getId();
                    }


                    // read viewmodel.passingObject.id == 1
                    viewmodelPassingObjectIdInt1 = (viewmodelPassingObjectId) == (1);
                if((dirtyFlags & 0xbL) != 0) {
                    if(viewmodelPassingObjectIdInt1) {
                            dirtyFlags |= 0x20L;
                            dirtyFlags |= 0x80L;
                    }
                    else {
                            dirtyFlags |= 0x10L;
                            dirtyFlags |= 0x40L;
                    }
                }


                    // read viewmodel.passingObject.id == 1 ? @android:string/about_title : @android:string/terms
                    viewmodelPassingObjectIdInt1AboutSubTitleAndroidStringAboutTitleAboutSubTitleAndroidStringTerms = ((viewmodelPassingObjectIdInt1) ? (aboutSubTitle.getResources().getString(R.string.about_title)) : (aboutSubTitle.getResources().getString(R.string.terms)));
                    // read viewmodel.passingObject.id == 1 ? @android:string/about_title : @android:string/terms
                    viewmodelPassingObjectIdInt1TvProfileTitleAndroidStringAboutTitleTvProfileTitleAndroidStringTerms = ((viewmodelPassingObjectIdInt1) ? (tvProfileTitle.getResources().getString(R.string.about_title)) : (tvProfileTitle.getResources().getString(R.string.terms)));
            }
            if ((dirtyFlags & 0xdL) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.aboutData
                        viewmodelAboutData = viewmodel.getAboutData();
                    }


                    if (viewmodelAboutData != null) {
                        // read viewmodel.aboutData.body
                        viewmodelAboutDataBody = viewmodelAboutData.getBody();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.aboutBody, viewmodelAboutDataBody);
        }
        if ((dirtyFlags & 0xbL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.aboutSubTitle, viewmodelPassingObjectIdInt1AboutSubTitleAndroidStringAboutTitleAboutSubTitleAndroidStringTerms);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvProfileTitle, viewmodelPassingObjectIdInt1TvProfileTitleAndroidStringAboutTitleTvProfileTitleAndroidStringTerms);
        }
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            this.back.setOnClickListener(mCallback35);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // viewmodel != null
        boolean viewmodelJavaLangObjectNull = false;
        // viewmodel
        te.app.notta.pages.settings.viewModels.SettingsViewModel viewmodel = mViewmodel;



        viewmodelJavaLangObjectNull = (viewmodel) != (null);
        if (viewmodelJavaLangObjectNull) {



            viewmodel.goBack(getRoot().getContext());
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewmodel
        flag 1 (0x2L): viewmodel.passingObject
        flag 2 (0x3L): viewmodel.aboutData
        flag 3 (0x4L): null
        flag 4 (0x5L): viewmodel.passingObject.id == 1 ? @android:string/about_title : @android:string/terms
        flag 5 (0x6L): viewmodel.passingObject.id == 1 ? @android:string/about_title : @android:string/terms
        flag 6 (0x7L): viewmodel.passingObject.id == 1 ? @android:string/about_title : @android:string/terms
        flag 7 (0x8L): viewmodel.passingObject.id == 1 ? @android:string/about_title : @android:string/terms
    flag mapping end*/
    //end
}