package grand.app.aber_provider.databinding;
import grand.app.aber_provider.R;
import grand.app.aber_provider.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentWinchBindingImpl extends FragmentWinchBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.searchContainer, 4);
        sViewsWithIds.put(R.id.info_card, 5);
        sViewsWithIds.put(R.id.input_message, 6);
        sViewsWithIds.put(R.id.search_location, 7);
        sViewsWithIds.put(R.id.pic_time, 8);
        sViewsWithIds.put(R.id.checkbox, 9);
    }
    // views
    @NonNull
    private final androidx.core.widget.NestedScrollView mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentWinchBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 10, sIncludes, sViewsWithIds));
    }
    private FragmentWinchBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.appcompat.widget.AppCompatButton) bindings[2]
            , (com.google.android.material.checkbox.MaterialCheckBox) bindings[9]
            , (androidx.cardview.widget.CardView) bindings[5]
            , (com.google.android.material.textfield.TextInputLayout) bindings[6]
            , (com.google.android.material.button.MaterialButton) bindings[8]
            , (com.google.android.material.progressindicator.CircularProgressIndicator) bindings[3]
            , (androidx.recyclerview.widget.RecyclerView) bindings[1]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[4]
            , (com.google.android.material.button.MaterialButton) bindings[7]
            );
        this.btnPhone.setTag(null);
        this.mboundView0 = (androidx.core.widget.NestedScrollView) bindings[0];
        this.mboundView0.setTag(null);
        this.progress.setTag(null);
        this.rcPosts.setTag(null);
        setRootTag(root);
        // listeners
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
        if (BR.viewModel == variableId) {
            setViewModel((grand.app.aber_provider.pages.services.viewModels.ServicesViewModels) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable grand.app.aber_provider.pages.services.viewModels.ServicesViewModels ViewModel) {
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
                return onChangeViewModel((grand.app.aber_provider.pages.services.viewModels.ServicesViewModels) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModel(grand.app.aber_provider.pages.services.viewModels.ServicesViewModels ViewModel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        else if (fieldId == BR.postsAdapter) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        else if (fieldId == BR.message) {
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
        boolean textUtilsIsEmptyViewModelMessage = false;
        java.lang.String viewModelMessage = null;
        boolean TextUtilsIsEmptyViewModelMessage1 = false;
        grand.app.aber_provider.pages.home.adapters.PostsAdapter viewModelPostsAdapter = null;
        boolean textUtilsIsEmptyViewModelMessageViewModelMessageEqualsConstantsSHOWPROGRESSBooleanFalse = false;
        int textUtilsIsEmptyViewModelMessageViewModelMessageEqualsConstantsSHOWPROGRESSBooleanFalseViewVISIBLEViewGONE = 0;
        boolean textUtilsIsEmptyViewModelMessageBooleanTrueViewModelMessageEqualsConstantsHIDEPROGRESSBooleanTrueBooleanFalse = false;
        boolean viewModelMessageEqualsConstantsSHOWPROGRESS = false;
        android.graphics.drawable.Drawable textUtilsIsEmptyViewModelMessageBooleanTrueViewModelMessageEqualsConstantsHIDEPROGRESSBtnPhoneAndroidDrawableCornerViewGradientBtnPhoneAndroidDrawableCornerViewPrimaryMedium = null;
        boolean viewModelMessageEqualsConstantsHIDEPROGRESS = false;
        grand.app.aber_provider.pages.services.viewModels.ServicesViewModels viewModel = mViewModel;
        boolean textUtilsIsEmptyViewModelMessageBooleanTrueViewModelMessageEqualsConstantsHIDEPROGRESS = false;

        if ((dirtyFlags & 0xfL) != 0) {


            if ((dirtyFlags & 0xdL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.message
                        viewModelMessage = viewModel.getMessage();
                    }


                    // read TextUtils.isEmpty(viewModel.message)
                    TextUtilsIsEmptyViewModelMessage1 = android.text.TextUtils.isEmpty(viewModelMessage);
                if((dirtyFlags & 0xdL) != 0) {
                    if(TextUtilsIsEmptyViewModelMessage1) {
                            dirtyFlags |= 0x2000L;
                    }
                    else {
                            dirtyFlags |= 0x1000L;
                    }
                }


                    // read !TextUtils.isEmpty(viewModel.message)
                    textUtilsIsEmptyViewModelMessage = !TextUtilsIsEmptyViewModelMessage1;
                if((dirtyFlags & 0xdL) != 0) {
                    if(textUtilsIsEmptyViewModelMessage) {
                            dirtyFlags |= 0x20L;
                    }
                    else {
                            dirtyFlags |= 0x10L;
                    }
                }
            }
            if ((dirtyFlags & 0xbL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.postsAdapter
                        viewModelPostsAdapter = viewModel.getPostsAdapter();
                    }
            }
        }
        // batch finished

        if ((dirtyFlags & 0x20L) != 0) {

                if (viewModelMessage != null) {
                    // read viewModel.message.equals(Constants.SHOW_PROGRESS)
                    viewModelMessageEqualsConstantsSHOWPROGRESS = viewModelMessage.equals(grand.app.aber_provider.utils.Constants.SHOW_PROGRESS);
                }
        }
        if ((dirtyFlags & 0x1000L) != 0) {

                if (viewModelMessage != null) {
                    // read viewModel.message.equals(Constants.HIDE_PROGRESS)
                    viewModelMessageEqualsConstantsHIDEPROGRESS = viewModelMessage.equals(grand.app.aber_provider.utils.Constants.HIDE_PROGRESS);
                }
        }

        if ((dirtyFlags & 0xdL) != 0) {

                // read !TextUtils.isEmpty(viewModel.message) ? viewModel.message.equals(Constants.SHOW_PROGRESS) : false
                textUtilsIsEmptyViewModelMessageViewModelMessageEqualsConstantsSHOWPROGRESSBooleanFalse = ((textUtilsIsEmptyViewModelMessage) ? (viewModelMessageEqualsConstantsSHOWPROGRESS) : (false));
                // read TextUtils.isEmpty(viewModel.message) ? true : viewModel.message.equals(Constants.HIDE_PROGRESS)
                textUtilsIsEmptyViewModelMessageBooleanTrueViewModelMessageEqualsConstantsHIDEPROGRESS = ((TextUtilsIsEmptyViewModelMessage1) ? (true) : (viewModelMessageEqualsConstantsHIDEPROGRESS));
            if((dirtyFlags & 0xdL) != 0) {
                if(textUtilsIsEmptyViewModelMessageViewModelMessageEqualsConstantsSHOWPROGRESSBooleanFalse) {
                        dirtyFlags |= 0x80L;
                }
                else {
                        dirtyFlags |= 0x40L;
                }
            }
            if((dirtyFlags & 0xdL) != 0) {
                if(textUtilsIsEmptyViewModelMessageBooleanTrueViewModelMessageEqualsConstantsHIDEPROGRESS) {
                        dirtyFlags |= 0x200L;
                        dirtyFlags |= 0x800L;
                }
                else {
                        dirtyFlags |= 0x100L;
                        dirtyFlags |= 0x400L;
                }
            }


                // read !TextUtils.isEmpty(viewModel.message) ? viewModel.message.equals(Constants.SHOW_PROGRESS) : false ? View.VISIBLE : View.GONE
                textUtilsIsEmptyViewModelMessageViewModelMessageEqualsConstantsSHOWPROGRESSBooleanFalseViewVISIBLEViewGONE = ((textUtilsIsEmptyViewModelMessageViewModelMessageEqualsConstantsSHOWPROGRESSBooleanFalse) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                // read TextUtils.isEmpty(viewModel.message) ? true : viewModel.message.equals(Constants.HIDE_PROGRESS) ? true : false
                textUtilsIsEmptyViewModelMessageBooleanTrueViewModelMessageEqualsConstantsHIDEPROGRESSBooleanTrueBooleanFalse = ((textUtilsIsEmptyViewModelMessageBooleanTrueViewModelMessageEqualsConstantsHIDEPROGRESS) ? (true) : (false));
                // read TextUtils.isEmpty(viewModel.message) ? true : viewModel.message.equals(Constants.HIDE_PROGRESS) ? @android:drawable/corner_view_gradient : @android:drawable/corner_view_primary_medium
                textUtilsIsEmptyViewModelMessageBooleanTrueViewModelMessageEqualsConstantsHIDEPROGRESSBtnPhoneAndroidDrawableCornerViewGradientBtnPhoneAndroidDrawableCornerViewPrimaryMedium = ((textUtilsIsEmptyViewModelMessageBooleanTrueViewModelMessageEqualsConstantsHIDEPROGRESS) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(btnPhone.getContext(), R.drawable.corner_view_gradient)) : (androidx.appcompat.content.res.AppCompatResources.getDrawable(btnPhone.getContext(), R.drawable.corner_view_primary_medium)));
        }
        // batch finished
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            androidx.databinding.adapters.ViewBindingAdapter.setBackground(this.btnPhone, textUtilsIsEmptyViewModelMessageBooleanTrueViewModelMessageEqualsConstantsHIDEPROGRESSBtnPhoneAndroidDrawableCornerViewGradientBtnPhoneAndroidDrawableCornerViewPrimaryMedium);
            this.btnPhone.setEnabled(textUtilsIsEmptyViewModelMessageBooleanTrueViewModelMessageEqualsConstantsHIDEPROGRESSBooleanTrueBooleanFalse);
            this.progress.setVisibility(textUtilsIsEmptyViewModelMessageViewModelMessageEqualsConstantsSHOWPROGRESSBooleanFalseViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0xbL) != 0) {
            // api target 1

            grand.app.aber_provider.base.ApplicationBinding.getItemsV2Binding(this.rcPosts, viewModelPostsAdapter, "2", "1");
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel
        flag 1 (0x2L): viewModel.postsAdapter
        flag 2 (0x3L): viewModel.message
        flag 3 (0x4L): null
        flag 4 (0x5L): !TextUtils.isEmpty(viewModel.message) ? viewModel.message.equals(Constants.SHOW_PROGRESS) : false
        flag 5 (0x6L): !TextUtils.isEmpty(viewModel.message) ? viewModel.message.equals(Constants.SHOW_PROGRESS) : false
        flag 6 (0x7L): !TextUtils.isEmpty(viewModel.message) ? viewModel.message.equals(Constants.SHOW_PROGRESS) : false ? View.VISIBLE : View.GONE
        flag 7 (0x8L): !TextUtils.isEmpty(viewModel.message) ? viewModel.message.equals(Constants.SHOW_PROGRESS) : false ? View.VISIBLE : View.GONE
        flag 8 (0x9L): TextUtils.isEmpty(viewModel.message) ? true : viewModel.message.equals(Constants.HIDE_PROGRESS) ? true : false
        flag 9 (0xaL): TextUtils.isEmpty(viewModel.message) ? true : viewModel.message.equals(Constants.HIDE_PROGRESS) ? true : false
        flag 10 (0xbL): TextUtils.isEmpty(viewModel.message) ? true : viewModel.message.equals(Constants.HIDE_PROGRESS) ? @android:drawable/corner_view_gradient : @android:drawable/corner_view_primary_medium
        flag 11 (0xcL): TextUtils.isEmpty(viewModel.message) ? true : viewModel.message.equals(Constants.HIDE_PROGRESS) ? @android:drawable/corner_view_gradient : @android:drawable/corner_view_primary_medium
        flag 12 (0xdL): TextUtils.isEmpty(viewModel.message) ? true : viewModel.message.equals(Constants.HIDE_PROGRESS)
        flag 13 (0xeL): TextUtils.isEmpty(viewModel.message) ? true : viewModel.message.equals(Constants.HIDE_PROGRESS)
    flag mapping end*/
    //end
}