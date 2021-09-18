package te.app.notta.utils.services;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class RealTimeReceiver extends BroadcastReceiver {
    public static MessageReceiverListener messageReceiverListene;
    public static NotificationCounterListener notificationCounterListener;

    @Override
    public void onReceive(Context context, Intent intent) {
        if (intent != null) {
            if (intent.getAction().equals("app.te.receiver")) {
                if (intent.getSerializableExtra("chat") != null) {
                    String details = String.valueOf(intent.getSerializableExtra("chat"));
                    Log.e("onReceive", "onReceive: " + details);
//                    Chat messagesItem = new Gson().fromJson(details, Chat.class);
//                    messageReceiverListene.onMessageChanged(messagesItem);
                }
                if (intent.getSerializableExtra("counter") != null) {
                    int counter = (int) intent.getSerializableExtra("counter");
                    Log.e("onReceive", "onReceive: " + counter);
                    notificationCounterListener.onNotificationsCounter(counter);
                }
            }
        } else
            Log.i("onReceive", "onReceive: null");
    }

    public interface MessageReceiverListener {
//        void onMessageChanged(Chat messagesItem);
    }
    public interface NotificationCounterListener {
        void onNotificationsCounter(int count);
    }
}
