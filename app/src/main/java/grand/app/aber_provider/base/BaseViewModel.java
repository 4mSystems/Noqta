package grand.app.aber_provider.base;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;

import androidx.databinding.Bindable;
import androidx.databinding.Observable;
import androidx.databinding.PropertyChangeRegistry;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import grand.app.aber_provider.BR;
import grand.app.aber_provider.PassingObject;
import grand.app.aber_provider.R;
import grand.app.aber_provider.activity.BaseActivity;
import grand.app.aber_provider.pages.auth.models.UserData;
import grand.app.aber_provider.utils.helper.MovementHelper;
import grand.app.aber_provider.utils.images.PhotoFullPopupWindow;
import grand.app.aber_provider.utils.resources.ResourceManager;
import grand.app.aber_provider.utils.session.LanguagesHelper;
import grand.app.aber_provider.utils.session.UserHelper;


public class BaseViewModel extends ViewModel implements Observable {
    private MutableLiveData<Object> mutableLiveData = new MutableLiveData<>();
    String message;
    PropertyChangeRegistry mCallBacks;
    private PassingObject passingObject = new PassingObject();
    public UserData userData = UserHelper.getInstance(MyApplication.getInstance()).getUserData();
    public String lang = LanguagesHelper.getCurrentLanguage();
    public String currency = UserHelper.getInstance(MyApplication.getInstance()).getCountriesData() != null ? lang.equals("en") ? UserHelper.getInstance(MyApplication.getInstance()).getCountriesData().getCurrencyEn() : lang.equals("ar") ? UserHelper.getInstance(MyApplication.getInstance()).getCountriesData().getCurrencyAr() : UserHelper.getInstance(MyApplication.getInstance()).getCountriesData().getCurrencyUr() : "";

    public BaseViewModel() {
        mCallBacks = new PropertyChangeRegistry();
    }

    public MutableLiveData<Object> getLiveData() {
        return mutableLiveData == null ? mutableLiveData = new MutableLiveData<>() : mutableLiveData;
    }

    @Bindable
    public String getMessage() {
        return message;
    }

    @Bindable
    public void setMessage(String message) {
        notifyChange(BR.message);
        this.message = message;
    }

    public String getString(int stringRes) {
        return ResourceManager.getString(stringRes);
    }

    public Drawable getDrawable(int drawable) {
        return ResourceManager.getDrawable(drawable);
    }


    public String[] getStringArray(int resArray) {
        return MyApplication.getInstance().getResources().getStringArray(resArray);
    }

    @Override
    public void addOnPropertyChangedCallback(OnPropertyChangedCallback callback) {
        mCallBacks.add(callback);
    }

    @Override
    public void removeOnPropertyChangedCallback(OnPropertyChangedCallback callback) {
        mCallBacks.remove(callback);
    }

    public void goBack(Context context) {
        if (((BaseActivity) context).backActionBarView.flag == 1) {
            if (((ParentActivity) context).isTaskRoot()) {
                // This activity is at root of task, so launch main activity
                MovementHelper.startActivityMain(context);
            } else {
                // This activity isn't at root of task, so just finish()
                ((Activity) context).finish();
            }
        } else
            ((Activity) context).finish();
    }

    public void notifyChange() {
        mCallBacks.notifyChange(this, 0);
    }

    public void notifyChange(int propertyId) {
        mCallBacks.notifyChange(this, propertyId);
    }

    @Bindable
    public PassingObject getPassingObject() {
        return passingObject;
    }

    @Bindable
    public void setPassingObject(PassingObject passingObject) {
        notifyChange(BR.passingObject);
        this.passingObject = passingObject;
    }

    public void showImage(String imgUrl, View imageView) {
        new PhotoFullPopupWindow(MyApplication.getInstance(), R.layout.popup_photo_full, imageView, imgUrl, null);
    }

}
