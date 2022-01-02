package te.app.nottaa.databinding;
import te.app.nottaa.R;
import te.app.nottaa.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class NotifyItemBindingImpl extends NotifyItemBinding implements te.app.nottaa.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final androidx.cardview.widget.CardView mboundView0;
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView1;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback37;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public NotifyItemBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private NotifyItemBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (com.makeramen.roundedimageview.RoundedImageView) bindings[3]
            , (te.app.nottaa.customViews.views.CustomTextViewMedium) bindings[2]
            , (te.app.nottaa.customViews.views.CustomTextViewMedium) bindings[4]
            );
        this.img.setTag(null);
        this.mboundView0 = (androidx.cardview.widget.CardView) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[1];
        this.mboundView1.setTag(null);
        this.textView13.setTag(null);
        this.textView14.setTag(null);
        setRootTag(root);
        // listeners
        mCallback37 = new te.app.nottaa.generated.callback.OnClickListener(this, 1);
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
        if (BR.notifyItemViewModels == variableId) {
            setNotifyItemViewModels((te.app.nottaa.pages.notifications.itemViewModels.NotificationsItemViewModels) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setNotifyItemViewModels(@Nullable te.app.nottaa.pages.notifications.itemViewModels.NotificationsItemViewModels NotifyItemViewModels) {
        updateRegistration(0, NotifyItemViewModels);
        this.mNotifyItemViewModels = NotifyItemViewModels;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.notifyItemViewModels);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeNotifyItemViewModels((te.app.nottaa.pages.notifications.itemViewModels.NotificationsItemViewModels) object, fieldId);
        }
        return false;
    }
    private boolean onChangeNotifyItemViewModels(te.app.nottaa.pages.notifications.itemViewModels.NotificationsItemViewModels NotifyItemViewModels, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        else if (fieldId == BR.notificationsData) {
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
        java.lang.String notifyItemViewModelsNotificationsDataCreatedAt = null;
        te.app.nottaa.pages.notifications.itemViewModels.NotificationsItemViewModels notifyItemViewModels = mNotifyItemViewModels;
        java.lang.String notifyItemViewModelsNotificationsDataBody = null;
        te.app.nottaa.pages.notifications.models.NotificationsData notifyItemViewModelsNotificationsData = null;
        java.lang.String notifyItemViewModelsNotificationsDataImage = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (notifyItemViewModels != null) {
                    // read notifyItemViewModels.notificationsData
                    notifyItemViewModelsNotificationsData = notifyItemViewModels.getNotificationsData();
                }


                if (notifyItemViewModelsNotificationsData != null) {
                    // read notifyItemViewModels.notificationsData.createdAt
                    notifyItemViewModelsNotificationsDataCreatedAt = notifyItemViewModelsNotificationsData.getCreatedAt();
                    // read notifyItemViewModels.notificationsData.body
                    notifyItemViewModelsNotificationsDataBody = notifyItemViewModelsNotificationsData.getBody();
                    // read notifyItemViewModels.notificationsData.image
                    notifyItemViewModelsNotificationsDataImage = notifyItemViewModelsNotificationsData.getImage();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            te.app.nottaa.base.ApplicationBinding.loadFullImage(this.img, notifyItemViewModelsNotificationsDataImage);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textView13, notifyItemViewModelsNotificationsDataCreatedAt);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textView14, notifyItemViewModelsNotificationsDataBody);
        }
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.mboundView1.setOnClickListener(mCallback37);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // notifyItemViewModels != null
        boolean notifyItemViewModelsJavaLangObjectNull = false;
        // notifyItemViewModels
        te.app.nottaa.pages.notifications.itemViewModels.NotificationsItemViewModels notifyItemViewModels = mNotifyItemViewModels;



        notifyItemViewModelsJavaLangObjectNull = (notifyItemViewModels) != (null);
        if (notifyItemViewModelsJavaLangObjectNull) {


            notifyItemViewModels.itemAction();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): notifyItemViewModels
        flag 1 (0x2L): notifyItemViewModels.notificationsData
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}