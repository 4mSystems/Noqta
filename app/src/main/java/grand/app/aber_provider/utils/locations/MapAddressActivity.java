package grand.app.aber_provider.utils.locations;

import android.Manifest;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.text.TextUtils;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

import androidx.annotation.NonNull;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.FragmentActivity;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.libraries.places.api.Places;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.widget.Autocomplete;
import com.google.android.libraries.places.widget.AutocompleteActivity;
import com.google.android.libraries.places.widget.model.AutocompleteActivityMode;
import com.google.gson.Gson;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.List;

import javax.inject.Inject;

import grand.app.aber_provider.PassingObject;
import grand.app.aber_provider.R;
import grand.app.aber_provider.base.IApplicationComponent;
import grand.app.aber_provider.base.MyApplication;
import grand.app.aber_provider.base.ParentActivity;
import grand.app.aber_provider.databinding.ActivityMapAddressBinding;
import grand.app.aber_provider.utils.Constants;
import grand.app.aber_provider.utils.helper.MovementHelper;
import grand.app.aber_provider.utils.session.LanguagesHelper;
import grand.app.aber_provider.utils.session.MyContextWrapper;


public class MapAddressActivity extends FragmentActivity implements
        LocationListener {

    public double lat = 0, lng = 0;
    @Inject
    MapAddressViewModel mapAddressViewModel = null;
    ActivityMapAddressBinding activityMapAddressBinding;
    MapView mapView;
    boolean async = false;
    FusedLocationProviderClient fusedLocationProviderClient = null;
    private static final int LOCATION_REQUEST = 500;
    private static final int MY_PERMISSIONS_REQUEST_CODE = 7000;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        IApplicationComponent component = ((MyApplication) getApplicationContext()).getApplicationComponent();
        component.inject(this);
        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            String passingObject = bundle.getString(Constants.BUNDLE);
            mapAddressViewModel.setPassingObject(new Gson().fromJson(passingObject, PassingObject.class));
        }
        activityMapAddressBinding = DataBindingUtil.setContentView(this, R.layout.activity_map_address);
        mapView = activityMapAddressBinding.mapView;
        activityMapAddressBinding.setMapAddressViewModel(mapAddressViewModel);
        initViews();
        onMapReady();
        setClickEvent();
    }

    private void setClickEvent() {
        mapAddressViewModel.getLiveData().observe(this, o -> {
            if (o.equals(Constants.PICKED_SUCCESSFULLY)) {
                activityMapAddressBinding.mapProgress.setVisibility(View.VISIBLE);
                double lat = mapAddressViewModel.mMap.getCameraPosition().target.latitude;
                double lng = mapAddressViewModel.mMap.getCameraPosition().target.longitude;
                MapConfig.getAddress(lat, lng, this, (address, city) -> {
                    if (!TextUtils.isEmpty(address)) {
                        Intent intent = new Intent();
                        intent.putExtra(Constants.LAT, lat);
                        intent.putExtra(Constants.LNG, lng);
                        intent.putExtra(Constants.ADDRESS, address);
                        intent.putExtra(Constants.CITY, city);
                        setResult(Activity.RESULT_OK, intent);
                        finish();
                    } else {
                        ((ParentActivity) getApplicationContext()).showError(getResources().getString(R.string.order_accepted));
                    }
                    activityMapAddressBinding.mapProgress.setVisibility(View.GONE);
                    closeKeyboard();

                });
            } else if (o.equals(Constants.SEARCH_LOCATION)) {
                if (!com.google.android.libraries.places.api.Places.isInitialized()) {
                    Places.initialize(this, getString(R.string.google_map));
                }
                List<Place.Field> fields = Arrays.asList(com.google.android.libraries.places.api.model.Place.Field.NAME, Place.Field.ADDRESS,
                        com.google.android.libraries.places.api.model.Place.Field.LAT_LNG);
                Intent intent = new Autocomplete.IntentBuilder(
                        AutocompleteActivityMode.FULLSCREEN, fields)
                        .build(this);
                startActivityForResult(intent, Constants.AUTOCOMPLETE_REQUEST_CODE);
            }
            closeKeyboard();
        });
    }


    private void closeKeyboard() {

        View view = this.getCurrentFocus();
        if (view != null) {
            InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
            imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    private void onMapReady() {
        activityMapAddressBinding.mapView.getMapAsync(googleMap -> {
            mapAddressViewModel.mMap = googleMap;
            MapConfig mapConfig = new MapConfig(MapAddressActivity.this, mapAddressViewModel.mMap);
            mapConfig.setSettings();
            activityMapAddressBinding.imgMarkerCenter.setVisibility(View.VISIBLE);
            enableMyLocationIfPermitted();
        });
    }

    private void enableMyLocationIfPermitted() {
        if (ContextCompat.checkSelfPermission(this,
                Manifest.permission.ACCESS_FINE_LOCATION)
                != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this,
                    new String[]{Manifest.permission.ACCESS_FINE_LOCATION,
                            Manifest.permission.ACCESS_COARSE_LOCATION},
                    LOCATION_REQUEST);
        } else if (mapAddressViewModel.mMap != null) {
            mapAddressViewModel.mMap.setMyLocationEnabled(true);
            startUpdateLocation();
            onResume();
        }
    }

    private void initViews() {
        activityMapAddressBinding.mapView.onCreate(null);
        activityMapAddressBinding.mapView.onResume();
        onMapReady();
        fusedLocationProviderClient = LocationServices.getFusedLocationProviderClient(this);
        setUpLocation();
    }

    private void setUpLocation() {
        if (ContextCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED &&
                ContextCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            //Request RunTime Permission
            ActivityCompat.requestPermissions(this, new String[]{
                    Manifest.permission.ACCESS_FINE_LOCATION,
                    Manifest.permission.ACCESS_COARSE_LOCATION,
            }, MY_PERMISSIONS_REQUEST_CODE);

        }
    }

    private void startUpdateLocation() {
        LocationManager mLocationManager = (LocationManager) getApplicationContext().getSystemService(LOCATION_SERVICE);
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION)
                != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            return;
        }
        List<String> providers = mLocationManager.getProviders(true);
        Location bestLocation = null;
        for (String provider : providers) {
            Location l = mLocationManager.getLastKnownLocation(provider);
            if (l == null) {
                continue;
            }
            if (bestLocation == null || l.getAccuracy() < bestLocation.getAccuracy()) {
                // Found best last known location: %s", l);
                bestLocation = l;
                mapAddressViewModel.mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(bestLocation.getLatitude(), bestLocation.getLongitude()), 17.0f));
                MapConfig.getAddress(bestLocation.getLatitude(), bestLocation.getLongitude(), this, (address, city) -> {
                    if (!TextUtils.isEmpty(address)) {
                        activityMapAddressBinding.locationSearch.setText(address);
                    }
                });
            }
        }
    }

    @Override
    public void onResume() {
        super.onResume();
        if (async) {
            onMapReady();
            async = false;
        }
    }

    @Override
    public void onPause() {
        super.onPause();
    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        mapAddressViewModel.reset();
    }

    @Override
    public void onStart() {
        super.onStart();

    }

    @Override
    public void onStop() {
        super.onStop();
    }

    @SuppressLint("MissingPermission")
    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions,
                                           @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (requestCode == LOCATION_REQUEST && grantResults.length > 0) {
            if (grantResults[0] == PackageManager.PERMISSION_GRANTED && grantResults[1] == PackageManager.PERMISSION_GRANTED) {

            } else {
                runtime_permissions();
            }
        }
    }

    private static final int ACCESS_CODE = 102;

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (data != null) {
            if (requestCode == 1000) {
                if (resultCode == Activity.RESULT_OK) {
                    final String action = Settings.ACTION_LOCATION_SOURCE_SETTINGS;
                    startActivityForResult(new Intent(action), ACCESS_CODE);
                }
            } else if (requestCode == Constants.AUTOCOMPLETE_REQUEST_CODE) {
                if (resultCode == RESULT_OK) {
                    Place place = Autocomplete.getPlaceFromIntent(data);
                    if (place.getLatLng() != null) {
                        MovementHelper.mpaZoomCamera(place.getLatLng(), mapAddressViewModel.mMap);
                        lat = place.getLatLng().latitude;
                        lng = place.getLatLng().longitude;
                        activityMapAddressBinding.locationSearch.setText(place.getAddress());
                    }
                } else if (resultCode == AutocompleteActivity.RESULT_ERROR) {
                    Status status = Autocomplete.getStatusFromIntent(data);
                }
                return;
            }
        }
        super.onActivityResult(requestCode, resultCode, data);
    }

    private boolean runtime_permissions() {
        if (Build.VERSION.SDK_INT >= 23 &&
                ContextCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED &&
                ContextCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            requestPermissions(new String[]{Manifest.permission.ACCESS_FINE_LOCATION,
                    Manifest.permission.ACCESS_COARSE_LOCATION}, LOCATION_REQUEST);
            return true;
        }
        return false;
    }

    @Override
    public void onLocationChanged(@NotNull Location location) {
    }

    @Override
    protected void attachBaseContext(Context newBase) {
        if (Build.VERSION.SDK_INT > Build.VERSION_CODES.N_MR1) {
            super.attachBaseContext(MyContextWrapper.wrap(newBase, LanguagesHelper.getCurrentLanguage()));
        } else {
            super.attachBaseContext(newBase);
        }
    }
}
