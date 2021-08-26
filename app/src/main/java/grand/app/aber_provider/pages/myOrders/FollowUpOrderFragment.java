package grand.app.aber_provider.pages.myOrders;

import static com.google.android.gms.location.LocationServices.getFusedLocationProviderClient;

import android.Manifest;
import android.app.Activity;
import android.content.IntentSender;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.databinding.DataBindingUtil;

import com.directions.route.AbstractRouting;
import com.directions.route.Route;
import com.directions.route.RouteException;
import com.directions.route.Routing;
import com.directions.route.RoutingListener;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.ResolvableApiException;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.LocationSettingsResponse;
import com.google.android.gms.location.LocationSettingsStatusCodes;
import com.google.android.gms.location.SettingsClient;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.Polyline;
import com.google.android.gms.maps.model.PolylineOptions;
import com.google.android.gms.tasks.Task;
import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import grand.app.aber_provider.PassingObject;
import grand.app.aber_provider.R;
import grand.app.aber_provider.base.BaseFragment;
import grand.app.aber_provider.base.IApplicationComponent;
import grand.app.aber_provider.base.MyApplication;
import grand.app.aber_provider.databinding.FragmentFollowUpOrdersBinding;
import grand.app.aber_provider.pages.orderDetails.models.OrderDetailsMain;
import grand.app.aber_provider.pages.orderDetails.viewModels.OrderDetailsViewModel;
import grand.app.aber_provider.utils.Constants;
import grand.app.aber_provider.utils.helper.AppHelper;
import grand.app.aber_provider.utils.locations.MapConfig;
import grand.app.aber_provider.utils.resources.ResourceManager;


public class FollowUpOrderFragment extends BaseFragment implements OnMapReadyCallback, RoutingListener {
    FragmentFollowUpOrdersBinding binding;
    @Inject
    OrderDetailsViewModel viewModel;
    GoogleMap mMap;
    List<Polyline> polyline = null;
    Polyline polylineOld = null;
    LatLng start = null, end = null;
    LocationRequest locationRequest;

    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_follow_up_orders, container, false);
        IApplicationComponent component = ((MyApplication) requireActivity().getApplicationContext()).getApplicationComponent();
        component.inject(this);
        binding.setViewModel(viewModel);
        Bundle bundle = this.getArguments();
        if (bundle != null) {
            String passingObject = bundle.getString(Constants.BUNDLE);
            viewModel.setPassingObject(new Gson().fromJson(passingObject, PassingObject.class));
            viewModel.setOrderDetailsMain(new Gson().fromJson(String.valueOf(viewModel.getPassingObject().getObjectClass()), OrderDetailsMain.class));
        }
        init(savedInstanceState);
        return binding.getRoot();
    }

    private static final String TAG = "FollowUpOrderFragment";

    // function to find Routes.
    private void findRoutes() {
        // new Trip
        end = new LatLng(Double.parseDouble(viewModel.getOrderDetailsMain().getLatitude()), Double.parseDouble(viewModel.getOrderDetailsMain().getLongitude()));
        if (start == null) {
            Toast.makeText(getActivity(), "Unable to get location", Toast.LENGTH_LONG).show();
        } else {
            Routing routing;
            try {
                routing = new Routing.Builder()
                        .travelMode(AbstractRouting.TravelMode.DRIVING)
                        .withListener(this)
                        .alternativeRoutes(true)
                        .waypoints(start, end)
                        .key(getString(R.string.google_map))  //also define your api key here.
                        .build();
                routing.execute();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    //Routing call back functions.
    @Override
    public void onRoutingFailure(RouteException e) {
        Log.e(TAG, "onRoutingFailure: " + e.getMessage());
        e.printStackTrace();
        findRoutes();
    }

    @Override
    public void onRoutingStart() {
//        showMessage(getResources().getString(R.string.finding_route), 1, 0);

    }

    @Override
    public void onRoutingSuccess(ArrayList<Route> route, int shortestRouteIndex) {
        if (polyline != null) {
            polyline.clear();
        }
        PolylineOptions polyOptions = new PolylineOptions();
        polyline = new ArrayList<>();
        //add route(s) to the map using polyline
        for (int i = 0; i < route.size(); i++) {
            if (i == shortestRouteIndex) {
                polyOptions.color(getResources().getColor(R.color.black, null));
                polyOptions.width(7);
                polyOptions.addAll(route.get(i).getPoints());
                Polyline polyline = mMap.addPolyline(polyOptions);
                if (polylineOld != null) {
                    polylineOld.remove();
                } else
                    polylineOld = polyline;
                this.polyline.add(polyline);
            }
        }

        MapConfig mapConfig = new MapConfig(requireActivity(), mMap);
        ArrayList<LatLng> latLngs = new ArrayList<>();
        latLngs.add(start);
        latLngs.add(end);
        mapConfig.moveCamera(latLngs);
        addUserMarker(start, ResourceManager.getDrawable(R.drawable.ic_order_location), true);
        addUserMarker(end, ResourceManager.getDrawable(R.drawable.ic_user_location), false);
    }

    @Override
    public void onRoutingCancelled() {
        findRoutes();
    }

    public void addUserMarker(LatLng position, Drawable drawable, boolean myLocation) {
        MarkerOptions markerOptionsFirst = new MarkerOptions();
        markerOptionsFirst.draggable(false);
        markerOptionsFirst.position(position);
        markerOptionsFirst.anchor(1f, 1f);
        markerOptionsFirst.icon(BitmapDescriptorFactory.fromBitmap(AppHelper.resizeVectorIcon(drawable, drawable.getMinimumWidth(), drawable.getMinimumHeight())));
//        if (markerDriver != null)
//            markerDriver.remove();
//        if (myLocation)
//            markerDriver = mMap.addMarker(markerOptionsFirst);
//        else
            mMap.addMarker(markerOptionsFirst);
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        binding.followImgMap.getMapAsync(this);
        binding.followImgMap.onResume();
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
    }

    private void init(Bundle savedInstanceState) {
        binding.followImgMap.onCreate(savedInstanceState);
        if (ActivityCompat.checkSelfPermission(requireActivity(), Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED
                && ActivityCompat.checkSelfPermission(requireActivity(), Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(requireActivity(), new String[]{Manifest.permission.ACCESS_FINE_LOCATION, Manifest.permission.ACCESS_COARSE_LOCATION}, 1001);
        } else {
            binding.followImgMap.getMapAsync(this);
        }
    }

    public void getLastKnownLocation() {
        if (ActivityCompat.checkSelfPermission(requireActivity(), Manifest.permission.ACCESS_FINE_LOCATION)
                != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(requireActivity(), Manifest.permission.ACCESS_COARSE_LOCATION)
                != PackageManager.PERMISSION_GRANTED) {
            enableLocationDialog();
            return;
        }
        mMap.setMyLocationEnabled(true);
        FusedLocationProviderClient fusedLocationClient = getFusedLocationProviderClient(MyApplication.getInstance());
        fusedLocationClient.getLastLocation()
                .addOnSuccessListener(requireActivity(), location -> {
                    if (location != null) {
                        start = new LatLng(location.getLatitude(), location.getLongitude());
                        findRoutes();
                    } else {
                        Task<Location> locationResult = fusedLocationClient.getLastLocation();
                        locationResult.addOnCompleteListener(requireActivity(), task -> {
                            if (!task.isSuccessful()) return;
                            Location location1 = task.getResult();
                            if (location1 != null) {
                                start = new LatLng(location1.getLatitude(), location1.getLongitude());
                                findRoutes();
                            } else {
                                getFusedLocationProviderClient(requireActivity()).requestLocationUpdates(getLocationRequest(), new LocationCallback() {
                                            @Override
                                            public void onLocationResult(@NonNull LocationResult locationResult) {
                                                start = new LatLng(locationResult.getLastLocation().getLatitude(), locationResult.getLastLocation().getLongitude());
                                                findRoutes();
                                            }
                                        },
                                        Looper.myLooper());
                            }
                        });
                    }
                });

    }

    private LocationRequest getLocationRequest() {
        locationRequest.setInterval(10000);
        locationRequest.setFastestInterval(5000);
        locationRequest.setPriority(LocationRequest.PRIORITY_HIGH_ACCURACY);
        return locationRequest;
    }

    public void enableLocationDialog() {
        LocationRequest locationRequest = getLocationRequest();
        LocationSettingsRequest settingsRequest = new LocationSettingsRequest.Builder()
                .addLocationRequest(locationRequest).build();
        SettingsClient client = LocationServices.getSettingsClient(requireActivity());
        Task<LocationSettingsResponse> task = client
                .checkLocationSettings(settingsRequest);

        task.addOnFailureListener(requireActivity(), e -> {
            int statusCode = ((ApiException) e).getStatusCode();
            if (statusCode == LocationSettingsStatusCodes.RESOLUTION_REQUIRED) {
                try {
                    ResolvableApiException resolvable =
                            (ResolvableApiException) e;
                    resolvable.startResolutionForResult
                            (requireActivity(),
                                    1019);
                } catch (IntentSender.SendIntentException sendEx) {
                    sendEx.printStackTrace();
                }
            }
        });
    }

    @Override
    public void onMapReady(@NonNull GoogleMap googleMap) {
        mMap = googleMap;
        locationRequest = new LocationRequest();
        getLastKnownLocation();
    }

    @Override
    public void onResume() {
        binding.followImgMap.onResume();
        super.onResume();
    }

    @Override
    public void onPause() {
        super.onPause();
        binding.followImgMap.onPause();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        binding.followImgMap.onDestroy();
    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();
        binding.followImgMap.onLowMemory();
    }
}
