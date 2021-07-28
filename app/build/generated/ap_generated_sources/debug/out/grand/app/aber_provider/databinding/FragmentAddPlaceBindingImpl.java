package grand.app.aber_provider.databinding;
import grand.app.aber_provider.R;
import grand.app.aber_provider.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentAddPlaceBindingImpl extends FragmentAddPlaceBinding implements grand.app.aber_provider.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.curve, 15);
        sViewsWithIds.put(R.id.br, 16);
        sViewsWithIds.put(R.id.location, 17);
        sViewsWithIds.put(R.id.city, 18);
        sViewsWithIds.put(R.id.region, 19);
    }
    // views
    @NonNull
    private final androidx.core.widget.NestedScrollView mboundView0;
    @NonNull
    private final com.google.android.material.button.MaterialButton mboundView14;
    @NonNull
    private final com.google.android.material.textfield.TextInputEditText mboundView2;
    @NonNull
    private final com.google.android.material.textfield.TextInputEditText mboundView4;
    @NonNull
    private final com.google.android.material.textfield.TextInputEditText mboundView6;
    @NonNull
    private final com.google.android.material.textfield.TextInputEditText mboundView9;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback5;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener mboundView2androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.addLocationRequest.title
            //         is viewModel.addLocationRequest.setTitle((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView2);
            // localize variables for thread safety
            // viewModel.addLocationRequest != null
            boolean viewModelAddLocationRequestJavaLangObjectNull = false;
            // viewModel
            grand.app.aber_provider.pages.myLocations.viewModels.MyLocationsViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;
            // viewModel.addLocationRequest.title
            java.lang.String viewModelAddLocationRequestTitle = null;
            // viewModel.addLocationRequest
            grand.app.aber_provider.pages.myLocations.models.AddLocationRequest viewModelAddLocationRequest = null;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelAddLocationRequest = viewModel.getAddLocationRequest();

                viewModelAddLocationRequestJavaLangObjectNull = (viewModelAddLocationRequest) != (null);
                if (viewModelAddLocationRequestJavaLangObjectNull) {




                    viewModelAddLocationRequest.setTitle(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener mboundView4androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.addLocationRequest.title
            //         is viewModel.addLocationRequest.setTitle((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView4);
            // localize variables for thread safety
            // viewModel.addLocationRequest != null
            boolean viewModelAddLocationRequestJavaLangObjectNull = false;
            // viewModel
            grand.app.aber_provider.pages.myLocations.viewModels.MyLocationsViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;
            // viewModel.addLocationRequest.title
            java.lang.String viewModelAddLocationRequestTitle = null;
            // viewModel.addLocationRequest
            grand.app.aber_provider.pages.myLocations.models.AddLocationRequest viewModelAddLocationRequest = null;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelAddLocationRequest = viewModel.getAddLocationRequest();

                viewModelAddLocationRequestJavaLangObjectNull = (viewModelAddLocationRequest) != (null);
                if (viewModelAddLocationRequestJavaLangObjectNull) {




                    viewModelAddLocationRequest.setTitle(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener mboundView6androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.addLocationRequest.street
            //         is viewModel.addLocationRequest.setStreet((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView6);
            // localize variables for thread safety
            // viewModel.addLocationRequest.street
            java.lang.String viewModelAddLocationRequestStreet = null;
            // viewModel.addLocationRequest != null
            boolean viewModelAddLocationRequestJavaLangObjectNull = false;
            // viewModel
            grand.app.aber_provider.pages.myLocations.viewModels.MyLocationsViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;
            // viewModel.addLocationRequest
            grand.app.aber_provider.pages.myLocations.models.AddLocationRequest viewModelAddLocationRequest = null;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelAddLocationRequest = viewModel.getAddLocationRequest();

                viewModelAddLocationRequestJavaLangObjectNull = (viewModelAddLocationRequest) != (null);
                if (viewModelAddLocationRequestJavaLangObjectNull) {




                    viewModelAddLocationRequest.setStreet(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener mboundView9androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.addLocationRequest.floor
            //         is viewModel.addLocationRequest.setFloor((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView9);
            // localize variables for thread safety
            // viewModel.addLocationRequest.floor
            java.lang.String viewModelAddLocationRequestFloor = null;
            // viewModel.addLocationRequest != null
            boolean viewModelAddLocationRequestJavaLangObjectNull = false;
            // viewModel
            grand.app.aber_provider.pages.myLocations.viewModels.MyLocationsViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;
            // viewModel.addLocationRequest
            grand.app.aber_provider.pages.myLocations.models.AddLocationRequest viewModelAddLocationRequest = null;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelAddLocationRequest = viewModel.getAddLocationRequest();

                viewModelAddLocationRequestJavaLangObjectNull = (viewModelAddLocationRequest) != (null);
                if (viewModelAddLocationRequestJavaLangObjectNull) {




                    viewModelAddLocationRequest.setFloor(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public FragmentAddPlaceBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 20, sIncludes, sViewsWithIds));
    }
    private FragmentAddPlaceBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 7
            , (androidx.constraintlayout.widget.Barrier) bindings[16]
            , (com.google.android.material.textfield.TextInputEditText) bindings[18]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[15]
            , (com.google.android.material.textfield.TextInputLayout) bindings[10]
            , (com.google.android.material.textfield.TextInputLayout) bindings[7]
            , (com.google.android.material.textfield.TextInputLayout) bindings[5]
            , (com.google.android.material.textfield.TextInputLayout) bindings[11]
            , (com.google.android.material.textfield.TextInputLayout) bindings[12]
            , (com.google.android.material.textfield.TextInputLayout) bindings[13]
            , (com.google.android.material.textfield.TextInputLayout) bindings[8]
            , (com.google.android.material.textfield.TextInputLayout) bindings[1]
            , (com.google.android.material.textfield.TextInputLayout) bindings[3]
            , (com.google.android.material.textfield.TextInputEditText) bindings[17]
            , (com.google.android.material.textfield.TextInputEditText) bindings[19]
            );
        this.inputBuildingNumber.setTag(null);
        this.inputCity.setTag(null);
        this.inputCountry.setTag(null);
        this.inputFloor.setTag(null);
        this.inputMark.setTag(null);
        this.inputPhone.setTag(null);
        this.inputStreet.setTag(null);
        this.inputTitle.setTag(null);
        this.inputTitle2.setTag(null);
        this.mboundView0 = (androidx.core.widget.NestedScrollView) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView14 = (com.google.android.material.button.MaterialButton) bindings[14];
        this.mboundView14.setTag(null);
        this.mboundView2 = (com.google.android.material.textfield.TextInputEditText) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView4 = (com.google.android.material.textfield.TextInputEditText) bindings[4];
        this.mboundView4.setTag(null);
        this.mboundView6 = (com.google.android.material.textfield.TextInputEditText) bindings[6];
        this.mboundView6.setTag(null);
        this.mboundView9 = (com.google.android.material.textfield.TextInputEditText) bindings[9];
        this.mboundView9.setTag(null);
        setRootTag(root);
        // listeners
        mCallback5 = new grand.app.aber_provider.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x80L;
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
            setViewModel((grand.app.aber_provider.pages.myLocations.viewModels.MyLocationsViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable grand.app.aber_provider.pages.myLocations.viewModels.MyLocationsViewModel ViewModel) {
        updateRegistration(5, ViewModel);
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x20L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelAddLocationRequestCityError((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeViewModelAddLocationRequestRegionError((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 2 :
                return onChangeViewModelAddLocationRequestStreetError((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 3 :
                return onChangeViewModelAddLocationRequestTitleError((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 4 :
                return onChangeViewModelAddLocationRequestLatError((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 5 :
                return onChangeViewModel((grand.app.aber_provider.pages.myLocations.viewModels.MyLocationsViewModel) object, fieldId);
            case 6 :
                return onChangeViewModelAddLocationRequestFloorError((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelAddLocationRequestCityError(androidx.databinding.ObservableField<java.lang.String> ViewModelAddLocationRequestCityError, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelAddLocationRequestRegionError(androidx.databinding.ObservableField<java.lang.String> ViewModelAddLocationRequestRegionError, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelAddLocationRequestStreetError(androidx.databinding.ObservableField<java.lang.String> ViewModelAddLocationRequestStreetError, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelAddLocationRequestTitleError(androidx.databinding.ObservableField<java.lang.String> ViewModelAddLocationRequestTitleError, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelAddLocationRequestLatError(androidx.databinding.ObservableField<java.lang.String> ViewModelAddLocationRequestLatError, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModel(grand.app.aber_provider.pages.myLocations.viewModels.MyLocationsViewModel ViewModel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelAddLocationRequestFloorError(androidx.databinding.ObservableField<java.lang.String> ViewModelAddLocationRequestFloorError, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x40L;
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
        java.lang.String viewModelAddLocationRequestFloorErrorGet = null;
        grand.app.aber_provider.pages.myLocations.models.AddLocationRequest viewModelAddLocationRequest = null;
        java.lang.String viewModelAddLocationRequestLatErrorGet = null;
        androidx.databinding.ObservableField<java.lang.String> viewModelAddLocationRequestCityError = null;
        androidx.databinding.ObservableField<java.lang.String> viewModelAddLocationRequestRegionError = null;
        androidx.databinding.ObservableField<java.lang.String> viewModelAddLocationRequestStreetError = null;
        java.lang.String viewModelAddLocationRequestFloor = null;
        androidx.databinding.ObservableField<java.lang.String> viewModelAddLocationRequestTitleError = null;
        java.lang.String viewModelAddLocationRequestStreet = null;
        java.lang.String viewModelAddLocationRequestStreetErrorGet = null;
        androidx.databinding.ObservableField<java.lang.String> viewModelAddLocationRequestLatError = null;
        java.lang.String viewModelAddLocationRequestRegionErrorGet = null;
        java.lang.String viewModelAddLocationRequestTitleErrorGet = null;
        java.lang.String viewModelAddLocationRequestCityErrorGet = null;
        grand.app.aber_provider.pages.myLocations.viewModels.MyLocationsViewModel viewModel = mViewModel;
        androidx.databinding.ObservableField<java.lang.String> viewModelAddLocationRequestFloorError = null;
        java.lang.String viewModelAddLocationRequestTitle = null;

        if ((dirtyFlags & 0xffL) != 0) {



                if (viewModel != null) {
                    // read viewModel.addLocationRequest
                    viewModelAddLocationRequest = viewModel.getAddLocationRequest();
                }

            if ((dirtyFlags & 0xa1L) != 0) {

                    if (viewModelAddLocationRequest != null) {
                        // read viewModel.addLocationRequest.cityError
                        viewModelAddLocationRequestCityError = viewModelAddLocationRequest.cityError;
                    }
                    updateRegistration(0, viewModelAddLocationRequestCityError);


                    if (viewModelAddLocationRequestCityError != null) {
                        // read viewModel.addLocationRequest.cityError.get()
                        viewModelAddLocationRequestCityErrorGet = viewModelAddLocationRequestCityError.get();
                    }
            }
            if ((dirtyFlags & 0xa2L) != 0) {

                    if (viewModelAddLocationRequest != null) {
                        // read viewModel.addLocationRequest.regionError
                        viewModelAddLocationRequestRegionError = viewModelAddLocationRequest.regionError;
                    }
                    updateRegistration(1, viewModelAddLocationRequestRegionError);


                    if (viewModelAddLocationRequestRegionError != null) {
                        // read viewModel.addLocationRequest.regionError.get()
                        viewModelAddLocationRequestRegionErrorGet = viewModelAddLocationRequestRegionError.get();
                    }
            }
            if ((dirtyFlags & 0xa4L) != 0) {

                    if (viewModelAddLocationRequest != null) {
                        // read viewModel.addLocationRequest.streetError
                        viewModelAddLocationRequestStreetError = viewModelAddLocationRequest.streetError;
                    }
                    updateRegistration(2, viewModelAddLocationRequestStreetError);


                    if (viewModelAddLocationRequestStreetError != null) {
                        // read viewModel.addLocationRequest.streetError.get()
                        viewModelAddLocationRequestStreetErrorGet = viewModelAddLocationRequestStreetError.get();
                    }
            }
            if ((dirtyFlags & 0xa0L) != 0) {

                    if (viewModelAddLocationRequest != null) {
                        // read viewModel.addLocationRequest.floor
                        viewModelAddLocationRequestFloor = viewModelAddLocationRequest.getFloor();
                        // read viewModel.addLocationRequest.street
                        viewModelAddLocationRequestStreet = viewModelAddLocationRequest.getStreet();
                        // read viewModel.addLocationRequest.title
                        viewModelAddLocationRequestTitle = viewModelAddLocationRequest.getTitle();
                    }
            }
            if ((dirtyFlags & 0xa8L) != 0) {

                    if (viewModelAddLocationRequest != null) {
                        // read viewModel.addLocationRequest.titleError
                        viewModelAddLocationRequestTitleError = viewModelAddLocationRequest.titleError;
                    }
                    updateRegistration(3, viewModelAddLocationRequestTitleError);


                    if (viewModelAddLocationRequestTitleError != null) {
                        // read viewModel.addLocationRequest.titleError.get()
                        viewModelAddLocationRequestTitleErrorGet = viewModelAddLocationRequestTitleError.get();
                    }
            }
            if ((dirtyFlags & 0xb0L) != 0) {

                    if (viewModelAddLocationRequest != null) {
                        // read viewModel.addLocationRequest.latError
                        viewModelAddLocationRequestLatError = viewModelAddLocationRequest.latError;
                    }
                    updateRegistration(4, viewModelAddLocationRequestLatError);


                    if (viewModelAddLocationRequestLatError != null) {
                        // read viewModel.addLocationRequest.latError.get()
                        viewModelAddLocationRequestLatErrorGet = viewModelAddLocationRequestLatError.get();
                    }
            }
            if ((dirtyFlags & 0xe0L) != 0) {

                    if (viewModelAddLocationRequest != null) {
                        // read viewModel.addLocationRequest.floorError
                        viewModelAddLocationRequestFloorError = viewModelAddLocationRequest.floorError;
                    }
                    updateRegistration(6, viewModelAddLocationRequestFloorError);


                    if (viewModelAddLocationRequestFloorError != null) {
                        // read viewModel.addLocationRequest.floorError.get()
                        viewModelAddLocationRequestFloorErrorGet = viewModelAddLocationRequestFloorError.get();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0xa1L) != 0) {
            // api target 1

            this.inputBuildingNumber.setError(viewModelAddLocationRequestCityErrorGet);
        }
        if ((dirtyFlags & 0xb0L) != 0) {
            // api target 1

            this.inputCity.setError(viewModelAddLocationRequestLatErrorGet);
        }
        if ((dirtyFlags & 0xa4L) != 0) {
            // api target 1

            this.inputCountry.setError(viewModelAddLocationRequestStreetErrorGet);
        }
        if ((dirtyFlags & 0xa2L) != 0) {
            // api target 1

            this.inputFloor.setError(viewModelAddLocationRequestRegionErrorGet);
            this.inputMark.setError(viewModelAddLocationRequestRegionErrorGet);
            this.inputPhone.setError(viewModelAddLocationRequestRegionErrorGet);
        }
        if ((dirtyFlags & 0xe0L) != 0) {
            // api target 1

            this.inputStreet.setError(viewModelAddLocationRequestFloorErrorGet);
        }
        if ((dirtyFlags & 0xa8L) != 0) {
            // api target 1

            this.inputTitle.setError(viewModelAddLocationRequestTitleErrorGet);
            this.inputTitle2.setError(viewModelAddLocationRequestTitleErrorGet);
        }
        if ((dirtyFlags & 0x80L) != 0) {
            // api target 1

            this.mboundView14.setOnClickListener(mCallback5);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView2, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView2androidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView4, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView4androidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView6, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView6androidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView9, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView9androidTextAttrChanged);
        }
        if ((dirtyFlags & 0xa0L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, viewModelAddLocationRequestTitle);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView4, viewModelAddLocationRequestTitle);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView6, viewModelAddLocationRequestStreet);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView9, viewModelAddLocationRequestFloor);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // viewModel
        grand.app.aber_provider.pages.myLocations.viewModels.MyLocationsViewModel viewModel = mViewModel;
        // viewModel != null
        boolean viewModelJavaLangObjectNull = false;



        viewModelJavaLangObjectNull = (viewModel) != (null);
        if (viewModelJavaLangObjectNull) {


            viewModel.addPlace();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.addLocationRequest.cityError
        flag 1 (0x2L): viewModel.addLocationRequest.regionError
        flag 2 (0x3L): viewModel.addLocationRequest.streetError
        flag 3 (0x4L): viewModel.addLocationRequest.titleError
        flag 4 (0x5L): viewModel.addLocationRequest.latError
        flag 5 (0x6L): viewModel
        flag 6 (0x7L): viewModel.addLocationRequest.floorError
        flag 7 (0x8L): null
    flag mapping end*/
    //end
}