package te.app.notta.databinding;
import te.app.notta.R;
import te.app.notta.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentOnboardBindingImpl extends FragmentOnboardBinding implements te.app.notta.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.imageSlider, 4);
        sViewsWithIds.put(R.id.br, 5);
    }
    // views
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback5;
    @Nullable
    private final android.view.View.OnClickListener mCallback6;
    @Nullable
    private final android.view.View.OnClickListener mCallback4;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentOnboardBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private FragmentOnboardBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.appcompat.widget.AppCompatImageView) bindings[2]
            , (androidx.appcompat.widget.AppCompatButton) bindings[3]
            , (androidx.constraintlayout.widget.Barrier) bindings[5]
            , (com.smarteist.autoimageslider.SliderView) bindings[4]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (te.app.notta.customViews.views.CustomTextViewMedium) bindings[1]
            );
        this.appCompatButtonNext.setTag(null);
        this.appCompatFinish.setTag(null);
        this.searchContainer.setTag(null);
        this.skip.setTag(null);
        setRootTag(root);
        // listeners
        mCallback5 = new te.app.notta.generated.callback.OnClickListener(this, 2);
        mCallback6 = new te.app.notta.generated.callback.OnClickListener(this, 3);
        mCallback4 = new te.app.notta.generated.callback.OnClickListener(this, 1);
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
        if (BR.onBoardViewModels == variableId) {
            setOnBoardViewModels((te.app.notta.pages.splash.SplashViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setOnBoardViewModels(@Nullable te.app.notta.pages.splash.SplashViewModel OnBoardViewModels) {
        updateRegistration(0, OnBoardViewModels);
        this.mOnBoardViewModels = OnBoardViewModels;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.onBoardViewModels);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeOnBoardViewModels((te.app.notta.pages.splash.SplashViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeOnBoardViewModels(te.app.notta.pages.splash.SplashViewModel OnBoardViewModels, int fieldId) {
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
        te.app.notta.pages.splash.SplashViewModel onBoardViewModels = mOnBoardViewModels;
        // batch finished
        if ((dirtyFlags & 0x2L) != 0) {
            // api target 1

            this.appCompatButtonNext.setOnClickListener(mCallback5);
            this.appCompatFinish.setOnClickListener(mCallback6);
            this.skip.setOnClickListener(mCallback4);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 2: {
                // localize variables for thread safety
                // onBoardViewModels
                te.app.notta.pages.splash.SplashViewModel onBoardViewModels = mOnBoardViewModels;
                // onBoardViewModels != null
                boolean onBoardViewModelsJavaLangObjectNull = false;



                onBoardViewModelsJavaLangObjectNull = (onBoardViewModels) != (null);
                if (onBoardViewModelsJavaLangObjectNull) {




                    onBoardViewModels.action(te.app.notta.utils.Constants.NEXT);
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // onBoardViewModels
                te.app.notta.pages.splash.SplashViewModel onBoardViewModels = mOnBoardViewModels;
                // onBoardViewModels != null
                boolean onBoardViewModelsJavaLangObjectNull = false;



                onBoardViewModelsJavaLangObjectNull = (onBoardViewModels) != (null);
                if (onBoardViewModelsJavaLangObjectNull) {




                    onBoardViewModels.action(te.app.notta.utils.Constants.START_APP);
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // onBoardViewModels
                te.app.notta.pages.splash.SplashViewModel onBoardViewModels = mOnBoardViewModels;
                // onBoardViewModels != null
                boolean onBoardViewModelsJavaLangObjectNull = false;



                onBoardViewModelsJavaLangObjectNull = (onBoardViewModels) != (null);
                if (onBoardViewModelsJavaLangObjectNull) {




                    onBoardViewModels.action(te.app.notta.utils.Constants.PREVIOUS);
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): onBoardViewModels
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}