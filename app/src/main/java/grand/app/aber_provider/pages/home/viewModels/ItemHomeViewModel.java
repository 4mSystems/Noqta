package grand.app.aber_provider.pages.home.viewModels;


import android.os.CountDownTimer;
import android.util.Log;

import androidx.databinding.Bindable;

import java.util.Locale;
import java.util.concurrent.TimeUnit;

import grand.app.aber_provider.BR;
import grand.app.aber_provider.base.BaseViewModel;
import grand.app.aber_provider.pages.home.models.Orders;
import grand.app.aber_provider.utils.Constants;
import grand.app.aber_provider.utils.session.LanguagesHelper;

public class ItemHomeViewModel extends BaseViewModel {
    public Orders orders;
    private static final String TAG = "ItemHomeViewModel";
    public CountDownTimer countDownTimer;

    public ItemHomeViewModel(Orders orders) {
        this.orders = orders;
        avaTimer(orders.getAcceptancePeriod());
    }

    private void avaTimer(long acceptMilSeconds) {
        countDownTimer = new CountDownTimer(acceptMilSeconds, 1000) {
            public void onTick(long millisUntilFinished) {
                String time = "" + String.format(new Locale(LanguagesHelper.getCurrentLanguage()), "%d : %d ",
                        TimeUnit.MILLISECONDS.toSeconds(millisUntilFinished) -
                                TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(millisUntilFinished)), TimeUnit.MILLISECONDS.toMinutes(millisUntilFinished));
                getOrders().setAcceptMilSeconds(time);
                notifyChange(BR.orders);
            }

            public void onFinish() {
                Log.e("avaTimer", ": Finish");
                countDownTimer.cancel();
//                getLiveData().setValue(Constants.REMOVE);
                getOrders().position = false;
                notifyChange(BR.orders);
            }
        }.start();
    }

    @Bindable
    public Orders getOrders() {
        return orders;
    }

    public void itemAction(String action) {
        getLiveData().setValue(action);
    }

}
