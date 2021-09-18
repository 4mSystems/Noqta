package te.app.notta.customViews.actionbar;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.RelativeLayout;

import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.LifecycleOwner;

import te.app.notta.R;
import te.app.notta.base.ParentActivity;
import te.app.notta.databinding.LayoutActionBarHomeBinding;
import te.app.notta.utils.session.UserHelper;

public class HomeActionBarView extends RelativeLayout {
    public LayoutActionBarHomeBinding layoutActionBarHomeBinding;
    Context context;

    public HomeActionBarView(Context context) {
        super(context);
        this.context = context;
        init();
    }


    private void init() {
        LayoutInflater layoutInflater = LayoutInflater.from(getContext());
        layoutActionBarHomeBinding = DataBindingUtil.inflate(layoutInflater, R.layout.layout_action_bar_home, this, true);
        layoutActionBarHomeBinding.badge.setText(UserHelper.getInstance(context).getCountNotification() > 0 ? String.valueOf(UserHelper.getInstance(context).getCountNotification()) : "");

        setEvents();
        ((ParentActivity) context).notificationsCount.observe((LifecycleOwner) context, count -> {
            layoutActionBarHomeBinding.badge.setText(count > 0 ? String.valueOf(count) : "");
        });
    }

    private void setEvents() {
        layoutActionBarHomeBinding.imgHomeBarMenuNotifications.setOnClickListener(view -> {
            UserHelper.getInstance(context).addCountNotification(0);
            layoutActionBarHomeBinding.badge.setText("");
//            MovementHelper.startActivity(context, NotificationsFragment.class.getName(), ResourceManager.getString(R.string.notifications), null);
        });
    }

    public void setTitle(String string) {
//        layoutActionBarHomeBinding.tvHomeBarText.setText(string);
    }

    public void notificationVisible(int visible) {
        layoutActionBarHomeBinding.imgHomeBarMenuNotifications.setVisibility(visible);
        layoutActionBarHomeBinding.badge.setVisibility(visible);
    }
}
