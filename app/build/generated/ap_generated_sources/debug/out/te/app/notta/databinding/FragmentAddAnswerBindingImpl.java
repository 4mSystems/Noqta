package te.app.notta.databinding;
import te.app.notta.R;
import te.app.notta.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentAddAnswerBindingImpl extends FragmentAddAnswerBinding implements te.app.notta.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.board_header, 2);
        sViewsWithIds.put(R.id.tv_profile_title, 3);
        sViewsWithIds.put(R.id.tv_tasks, 4);
        sViewsWithIds.put(R.id.MaterialCardView, 5);
        sViewsWithIds.put(R.id.tv_date, 6);
        sViewsWithIds.put(R.id.tv_details, 7);
        sViewsWithIds.put(R.id.br4, 8);
        sViewsWithIds.put(R.id.main_image, 9);
        sViewsWithIds.put(R.id.ic_second, 10);
        sViewsWithIds.put(R.id.ic_third, 11);
        sViewsWithIds.put(R.id.ic_fourth, 12);
        sViewsWithIds.put(R.id.ic_fifth, 13);
        sViewsWithIds.put(R.id.flow, 14);
        sViewsWithIds.put(R.id.v_line4, 15);
        sViewsWithIds.put(R.id.tv_answer, 16);
        sViewsWithIds.put(R.id.input_answer, 17);
        sViewsWithIds.put(R.id.tv_images, 18);
        sViewsWithIds.put(R.id.images_container, 19);
        sViewsWithIds.put(R.id.ic_cloud_upload, 20);
        sViewsWithIds.put(R.id.tv_video, 21);
        sViewsWithIds.put(R.id.video_container, 22);
        sViewsWithIds.put(R.id.ic_cloud_upload_video, 23);
    }
    // views
    @NonNull
    private final androidx.core.widget.NestedScrollView mboundView0;
    @NonNull
    private final androidx.appcompat.widget.AppCompatImageView mboundView1;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback27;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentAddAnswerBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 24, sIncludes, sViewsWithIds));
    }
    private FragmentAddAnswerBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (com.google.android.material.card.MaterialCardView) bindings[5]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[2]
            , (androidx.constraintlayout.widget.Barrier) bindings[8]
            , (androidx.constraintlayout.helper.widget.Flow) bindings[14]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[20]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[23]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[13]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[12]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[10]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[11]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[19]
            , (com.google.android.material.textfield.TextInputLayout) bindings[17]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[9]
            , (te.app.notta.customViews.views.CustomTextViewMedium) bindings[16]
            , (te.app.notta.customViews.views.CustomTextViewRegular) bindings[6]
            , (te.app.notta.customViews.views.CustomTextViewMedium) bindings[7]
            , (te.app.notta.customViews.views.CustomTextViewMedium) bindings[18]
            , (te.app.notta.customViews.views.CustomTextViewMedium) bindings[3]
            , (te.app.notta.customViews.views.CustomTextViewMedium) bindings[4]
            , (te.app.notta.customViews.views.CustomTextViewMedium) bindings[21]
            , (android.view.View) bindings[15]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[22]
            );
        this.mboundView0 = (androidx.core.widget.NestedScrollView) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (androidx.appcompat.widget.AppCompatImageView) bindings[1];
        this.mboundView1.setTag(null);
        setRootTag(root);
        // listeners
        mCallback27 = new te.app.notta.generated.callback.OnClickListener(this, 1);
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
            setViewmodel((te.app.notta.pages.addAnswer.viewModels.AddAnswerViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewmodel(@Nullable te.app.notta.pages.addAnswer.viewModels.AddAnswerViewModel Viewmodel) {
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
                return onChangeViewmodel((te.app.notta.pages.addAnswer.viewModels.AddAnswerViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewmodel(te.app.notta.pages.addAnswer.viewModels.AddAnswerViewModel Viewmodel, int fieldId) {
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
        te.app.notta.pages.addAnswer.viewModels.AddAnswerViewModel viewmodel = mViewmodel;
        // batch finished
        if ((dirtyFlags & 0x2L) != 0) {
            // api target 1

            this.mboundView1.setOnClickListener(mCallback27);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // viewmodel != null
        boolean viewmodelJavaLangObjectNull = false;
        // viewmodel
        te.app.notta.pages.addAnswer.viewModels.AddAnswerViewModel viewmodel = mViewmodel;



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