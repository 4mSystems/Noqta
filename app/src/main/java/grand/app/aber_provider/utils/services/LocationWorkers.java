package grand.app.aber_provider.utils.services;

import android.Manifest;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.core.app.ActivityCompat;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.firebase.geofire.GeoFire;
import com.firebase.geofire.GeoLocation;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.location.LocationServices;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import grand.app.aber_provider.R;
import grand.app.aber_provider.utils.session.UserHelper;

public class LocationWorkers extends Worker {
    DatabaseReference ref = FirebaseDatabase.getInstance().getReference("Drivers");
    GeoFire geoFire = new GeoFire(ref);

    private static final String TAG = "MyWorker";

    Context mContext;

    public LocationWorkers(@NonNull Context context, @NonNull WorkerParameters workerParams) {
        super(context, workerParams);
        mContext = context;
    }

    @NonNull
    @Override
    public Result doWork() {
        Log.e(TAG, "doWork: Done");

        Log.e(TAG, "onStartJob: STARTING JOB..");
        startLocationService();
        return Result.success();
    }

    private void startLocationService() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            CharSequence name = mContext.getString(R.string.app_name);
            String description = mContext.getString(R.string.app_name);
            int importance = NotificationManager.IMPORTANCE_DEFAULT;
            NotificationChannel channel = new NotificationChannel(mContext.getString(R.string.app_name), name, importance);
            channel.setDescription(description);
            NotificationManager notificationManager = mContext.getSystemService(NotificationManager.class);
            notificationManager.createNotificationChannel(channel);
        }

        NotificationCompat.Builder builder = new NotificationCompat.Builder(mContext, mContext.getString(R.string.app_name))
                .setSmallIcon(android.R.drawable.ic_menu_mylocation)
                .setContentTitle("New Location Update")
                .setPriority(NotificationCompat.PRIORITY_DEFAULT);

        NotificationManagerCompat notificationManager = NotificationManagerCompat.from(mContext);

        // notificationId is a unique int for each notification that you must define
        notificationManager.notify(1001, builder.build());
        LocationRequest locationRequest = new LocationRequest();
        locationRequest.setInterval(3000);
        locationRequest.setFastestInterval(3000);
        locationRequest.setPriority(LocationRequest.PRIORITY_HIGH_ACCURACY);
        if (ActivityCompat.checkSelfPermission(mContext, Manifest.permission.ACCESS_FINE_LOCATION)
                != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(mContext, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            return;
        }
        LocationServices.getFusedLocationProviderClient(mContext)
                .requestLocationUpdates(locationRequest, mLocationCallback, Looper.getMainLooper());
    }

    LocationCallback mLocationCallback = new LocationCallback() {
        @Override
        public void onLocationResult(@NonNull LocationResult locationResult) {
            super.onLocationResult(locationResult);
            double latitude = locationResult.getLastLocation().getLatitude();
            double longitude = locationResult.getLastLocation().getLongitude();
            Log.e(TAG, "Location : " + latitude);
            geoFire.setLocation(String.valueOf(UserHelper.getInstance(mContext).getUserData().getId()), new GeoLocation(latitude, longitude), (key, error) -> {

            });
        }
    };

}