package grand.app.notta.base;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.media.AudioAttributes;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.util.Log;

import androidx.core.app.NotificationCompat;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

import org.jetbrains.annotations.NotNull;

import java.util.Map;

import grand.app.notta.R;
import grand.app.notta.activity.BaseActivity;
import grand.app.notta.utils.Constants;
import grand.app.notta.utils.session.UserHelper;

import static androidx.core.app.NotificationCompat.DEFAULT_SOUND;
import static androidx.core.app.NotificationCompat.DEFAULT_VIBRATE;

public class MyFirebaseMessagingService extends FirebaseMessagingService {

    @Override
    public void onNewToken(@NotNull String s) {
        super.onNewToken(s);
    }

    @Override
    public void onMessageReceived(@NotNull RemoteMessage remoteMessage) {
        super.onMessageReceived(remoteMessage);
        Log.e("MyFirebaseMessagingService", ": " + remoteMessage.getData());
        UserHelper.getInstance(MyApplication.getInstance()).addCountNotification(UserHelper.getInstance(MyApplication.getInstance()).getCountNotification() + 1);
        Intent intent = new Intent();
        intent.putExtra("counter", UserHelper.getInstance(MyApplication.getInstance()).getCountNotification());
        intent.setAction("app.te.receiver");
        sendBroadcast(intent);
        showNotification(remoteMessage.getData());
    }

    private void showNotification(Map<String, String> notification) {
        Intent intent = new Intent(this, BaseActivity.class);
        intent.putExtra("is_notification", true);
        intent.putExtra(Constants.TYPE, notification.get(Constants.TYPE));
        intent.putExtra(Constants.ORDER_ID, notification.get(Constants.ORDER_ID));
        // Set the Activity to start in a new, empty task
        PendingIntent pendingIntent = PendingIntent.getActivity(this, 0 /* Request code */, intent,
                PendingIntent.FLAG_UPDATE_CURRENT);
        String channelId = "channelId";
        try {
            Uri defaultSoundUri = Uri.parse(ContentResolver.SCHEME_ANDROID_RESOURCE + "://" + MyApplication.getInstance().getPackageName() + "/" + R.raw.notify_default);
            Ringtone r = RingtoneManager.getRingtone(getApplicationContext(), defaultSoundUri);
            r.play();
            NotificationCompat.Builder notificationBuilder =
                    new NotificationCompat.Builder(this, channelId)
                            .setSmallIcon(R.mipmap.ic_launcher)
                            .setContentTitle(notification.get("title"))
                            .setContentText(notification.get("body"))
                            .setPriority(Notification.PRIORITY_HIGH)
                            .setAutoCancel(true)
                            .setDefaults(DEFAULT_SOUND | DEFAULT_VIBRATE) //Important for heads-up notification
                            .setSound(defaultSoundUri)
                            .setVibrate(new long[]{1000, 1000, 1000, 1000, 1000})
                            .setContentIntent(pendingIntent);
            NotificationManager notificationManager =
                    (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
            // Since android Oreo notification channel is needed.
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                NotificationChannel channel = new NotificationChannel(channelId,
                        "Channel human readable title",
                        NotificationManager.IMPORTANCE_HIGH);
                AudioAttributes attributes = new AudioAttributes.Builder()
                        .setContentType(AudioAttributes.CONTENT_TYPE_SONIFICATION)
                        .setUsage(AudioAttributes.USAGE_NOTIFICATION)
                        .build();
                channel.enableVibration(true);
                channel.setSound(defaultSoundUri, attributes);
                channel.setVibrationPattern(new long[]{100, 200, 300, 400, 500, 400, 300, 200, 400});
                notificationManager.createNotificationChannel(channel);
            }
            notificationManager.notify(0, notificationBuilder.build());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}