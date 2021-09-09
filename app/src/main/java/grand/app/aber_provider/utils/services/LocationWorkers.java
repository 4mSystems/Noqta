package grand.app.aber_provider.utils.services;

import android.Manifest;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.IntentSender;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Looper;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;
import androidx.work.WorkInfo;
import androidx.work.WorkManager;
import androidx.work.Worker;
import androidx.work.WorkerParameters;

import com.firebase.geofire.GeoFire;
import com.firebase.geofire.GeoLocation;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.ResolvableApiException;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.LocationSettingsResponse;
import com.google.android.gms.location.LocationSettingsStatusCodes;
import com.google.android.gms.location.SettingsClient;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.List;
import java.util.concurrent.ExecutionException;

import grand.app.aber_provider.R;
import grand.app.aber_provider.pages.orderDetails.OrderDetailsFragment;
import grand.app.aber_provider.utils.resources.ResourceManager;
import grand.app.aber_provider.utils.session.UserHelper;

public class LocationWorkers extends Worker {
    DatabaseReference ref = FirebaseDatabase.getInstance().getReference("Drivers");
    GeoFire geoFire = new GeoFire(ref);

    private static final String TAG = "MyWorker";

    Context mContext;
    LocationRequest locationRequest;

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
                .setContentTitle(ResourceManager.getString(R.string.access_location))
                .setPriority(NotificationCompat.PRIORITY_DEFAULT);

        NotificationManagerCompat notificationManager = NotificationManagerCompat.from(mContext);

        // notificationId is a unique int for each notification that you must define
        notificationManager.notify(1001, builder.build());
        locationRequest = new LocationRequest();
        if (ActivityCompat.checkSelfPermission(mContext, Manifest.permission.ACCESS_FINE_LOCATION)
                != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(mContext, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {

            return;
        }
        LocationServices.getFusedLocationProviderClient(mContext)
                .requestLocationUpdates(getLocationRequest(), mLocationCallback, Looper.getMainLooper());
    }

    public LocationCallback mLocationCallback = new LocationCallback() {
        @Override
        public void onLocationResult(@NonNull LocationResult locationResult) {
            super.onLocationResult(locationResult);
            double latitude = locationResult.getLastLocation().getLatitude();
            double longitude = locationResult.getLastLocation().getLongitude();
            if (UserHelper.getInstance(mContext).getUserData() != null) {
                geoFire.setLocation(String.valueOf(UserHelper.getInstance(mContext).getUserData().getId()), new GeoLocation(latitude, longitude), (key, error) -> {
                    try {
                        if (!isWorkScheduled(WorkManager.getInstance(mContext).getWorkInfosForUniqueWork(OrderDetailsFragment.class.getName()).get())) {
                            LocationServices.getFusedLocationProviderClient(mContext)
                                    .removeLocationUpdates(mLocationCallback);
                            geoFire.removeLocation(String.valueOf(UserHelper.getInstance(mContext).getUserData().getId()));
                        }
                    } catch (ExecutionException | InterruptedException e) {
                        e.printStackTrace();
                    }
                });
            }
        }
    };

    private boolean isWorkScheduled(List<WorkInfo> workInfo) {
        boolean running = false;
        if (workInfo == null || workInfo.size() == 0) return false;
        for (WorkInfo workStatus : workInfo) {
            running = workStatus.getState() == WorkInfo.State.RUNNING | workStatus.getState() == WorkInfo.State.ENQUEUED;
        }
        Log.e(TAG, ": " + running);
        return running;
    }

    private LocationRequest getLocationRequest() {
        locationRequest.setInterval(10000);
        locationRequest.setFastestInterval(5000);
        locationRequest.setPriority(LocationRequest.PRIORITY_HIGH_ACCURACY);
        return locationRequest;
    }


}