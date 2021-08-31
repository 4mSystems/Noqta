package grand.app.aber_provider.pages.home.viewModels;


import android.os.CountDownTimer;

import androidx.databinding.Bindable;

import java.util.Locale;
import java.util.concurrent.TimeUnit;

import grand.app.aber_provider.BR;
import grand.app.aber_provider.base.BaseViewModel;
import grand.app.aber_provider.pages.home.models.Orders;
import grand.app.aber_provider.utils.session.LanguagesHelper;

public class ItemHomeViewModel extends BaseViewModel {
    public Orders orders;
    public CountDownTimer countDownTimer;

    public ItemHomeViewModel(Orders orders) {
        this.orders = orders;
        avaTimer(orders.getAcceptancePeriod());
    }

    private void avaTimer(long acceptMilSeconds) {
        countDownTimer = new CountDownTimer(acceptMilSeconds, 1000) {
            public void onTick(long millisUntilFinished) {
                long mil = TimeUnit.MILLISECONDS.toSeconds(millisUntilFinished) - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(millisUntilFinished));
                long min = TimeUnit.MILLISECONDS.toMinutes(millisUntilFinished);
                String time = "" + String.format(new Locale(LanguagesHelper.getCurrentLanguage()), "%d : %d ",
                        LanguagesHelper.getCurrentLanguage().equals("ar") || LanguagesHelper.getCurrentLanguage().equals("ur") ? mil : min, LanguagesHelper.getCurrentLanguage().equals("ar") ? min : mil);
                getOrders().setAcceptMilSeconds(time);
                notifyChange(BR.orders);
            }

            public void onFinish() {
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
