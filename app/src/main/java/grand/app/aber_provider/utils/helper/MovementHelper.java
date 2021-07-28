package grand.app.aber_provider.utils.helper;


import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.Settings;

import androidx.browser.customtabs.CustomTabsIntent;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.gson.Gson;

import grand.app.aber_provider.PassingObject;
import grand.app.aber_provider.activity.BaseActivity;
import grand.app.aber_provider.activity.MainActivity;
import grand.app.aber_provider.base.ParentActivity;
import grand.app.aber_provider.utils.Constants;
import grand.app.aber_provider.R;
import grand.app.aber_provider.utils.resources.ResourceManager;

import static android.app.Activity.RESULT_OK;


public class MovementHelper {


    //---------Fragments----------//
    private static final int CONTAINER_ID = R.id.fl_home_container;

    public static void popAllFragments(Context context) {
        FragmentManager fm = ((FragmentActivity) context).getSupportFragmentManager();
        for (int i = 0; i < fm.getBackStackEntryCount(); ++i) {
            fm.popBackStack();
        }
    }

    public static void addFragmentFromMain(Context context, Fragment fragment, String backStackText) {
        FragmentManager fragmentManager = ((FragmentActivity) context).getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction()
                .add(CONTAINER_ID, fragment);
        if (!backStackText.equals("")) {
            fragmentTransaction.addToBackStack(backStackText);
        }
        fragmentTransaction.commit();
    }

    public static void addFragment(Context context, Fragment fragment, String backStackText) {
        FragmentManager fragmentManager = ((FragmentActivity) context).getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction().add(CONTAINER_ID, fragment);
        if (!backStackText.equals("")) {
            fragmentTransaction.addToBackStack(backStackText);
        }
        fragmentTransaction.commit();
    }


    public static void addFragmentTag(Context context, Fragment fragment, String tag, String backStackText) {
        FragmentManager fragmentManager = ((FragmentActivity) context).getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction().add(CONTAINER_ID, fragment, tag);
        if (!backStackText.equals("")) {
            fragmentTransaction.addToBackStack(backStackText);
        }
        fragmentTransaction.commit();
    }


    public static void replaceFragmentTag(Context context, Fragment fragment, String tag, String backStackText) {
        FragmentManager fragmentManager = ((FragmentActivity) context).getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction().replace(CONTAINER_ID, fragment, tag);
        if (!backStackText.equals("")) {
            fragmentTransaction.addToBackStack(backStackText);
        }
        fragmentTransaction.commit();
    }


    public static void replaceFragment(Context context, Fragment fragment, String backStackText) {
        FragmentManager fragmentManager = ((FragmentActivity) context).getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction().replace(CONTAINER_ID, fragment);
        fragmentTransaction.commit();
    }

    public static void replaceProfileFragment(Context context, Fragment fragment, PassingObject passingObject) {
        FragmentManager fragmentManager = ((FragmentActivity) context).getSupportFragmentManager();
        Bundle bundle = new Bundle();
        bundle.putSerializable(Constants.BUNDLE, new Gson().toJson(passingObject));
        fragment.setArguments(bundle);
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction().replace(R.id.frame_profile, fragment);
        fragmentTransaction.commit();
    }

    public static void replaceHomeFragment(Context context, Fragment fragment) {
        FragmentManager fragmentManager = ((FragmentActivity) context).getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction().replace(CONTAINER_ID, fragment);
        fragmentTransaction.commit();
    }


    public static void popLastFragment(Context context) {
        ((FragmentActivity) context).getSupportFragmentManager().popBackStack();
    }


    //-----------Activities-----------------//

    public static void startActivityWithBundle(Context from, PassingObject passingObject, String name, String page, String shareBar) {
        Intent intent = new Intent(from, BaseActivity.class);
        intent.putExtra(Constants.PAGE, page);
        intent.putExtra(Constants.BUNDLE, new Gson().toJson(passingObject));
        //   intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        if (name != null) {
            intent.putExtra(Constants.NAME_BAR, name);
        }
        if (shareBar != null) {
            intent.putExtra(Constants.SHARE_BAR, shareBar);
        }
        from.startActivity(intent);
    }

    public static void startActivityForResultWithBundle(Context from, PassingObject passingObject, String name, String page, int request) {
        Intent intent = new Intent(from, BaseActivity.class);
        intent.putExtra(Constants.PAGE, page);
        intent.putExtra(Constants.BUNDLE, new Gson().toJson(passingObject));
        if (name != null) {
            intent.putExtra(Constants.NAME_BAR, name);
        }
        LauncherHelper.execute(intent, request, from);
    }

    public static void finishWithResult(PassingObject passingObject, Context context, int request) {
        Intent intent = new Intent();
        Bundle bundle = new Bundle();
        bundle.putSerializable(Constants.BUNDLE, passingObject);
        intent.putExtra(Constants.BUNDLE, bundle);
        ((ParentActivity) context).setResult(RESULT_OK, intent);
        ((ParentActivity) context).finish();
    }

    public static void startActivityBase(Context context, String page, String pageNameBar, String shareBar) {
        Intent intent = new Intent(context, BaseActivity.class);
        intent.putExtra(Constants.PAGE, page);
        if (pageNameBar != null) {
            intent.putExtra(Constants.NAME_BAR, pageNameBar);
        }
        if (shareBar != null)
            intent.putExtra(Constants.SHARE_BAR, shareBar);
        context.startActivity(intent);
        ((Activity) context).finishAffinity();
    }

    public static void startActivity(Context context, String page, String pageNameBar, String shareBar) {
        Intent intent = new Intent(context, BaseActivity.class);
        intent.putExtra(Constants.PAGE, page);
        if (pageNameBar != null) {
            intent.putExtra(Constants.NAME_BAR, pageNameBar);
        }
        if (shareBar != null)
            intent.putExtra(Constants.SHARE_BAR, shareBar);
        context.startActivity(intent);
    }

    public static void startActivityMain(Context context) {
        Intent intent = new Intent(context, MainActivity.class);
        context.startActivity(intent);
        ((Activity) context).finishAffinity();
    }

    public static void startNotificationSettings(Context context) {
        Intent intent;
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
            intent = new Intent(Settings.ACTION_CHANNEL_NOTIFICATION_SETTINGS);
            intent.putExtra(Settings.EXTRA_APP_PACKAGE, context.getPackageName());
            intent.putExtra(Settings.EXTRA_CHANNEL_ID, "channelId");
        } else
            intent = new Intent(Settings.ACTION_APPLICATION_DETAILS_SETTINGS, Uri.parse("package:" + context.getPackageName()));
        context.startActivity(intent);

    }
    public static void mpaZoomCamera(LatLng latLng, GoogleMap mMap) {
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(latLng, 13));
        CameraPosition cameraPosition = new CameraPosition.Builder().target(latLng).zoom(18).bearing(90).tilt(40).build();
        mMap.animateCamera(CameraUpdateFactory.newCameraPosition(cameraPosition));
    }
    public static void openCustomTabs(Context from, String url, String title) {
        CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
        builder.setToolbarColor(ResourceManager.getColor(R.color.colorPrimaryDark));
//        Bitmap icon = BitmapFactory.decodeResource(from.getResources(), R.drawable.ic_back);
//        Intent intent = new Intent(Intent.ACTION_SEND);
//        intent.setType("text/plain");
//        intent.putExtra(Intent.EXTRA_TEXT, title);
//        PendingIntent pendingIntent = PendingIntent.getActivity(from,
//                Constants.RESULT_CODE,
//                intent,
//                PendingIntent.FLAG_UPDATE_CURRENT);
//        builder.setActionButton(icon, title, pendingIntent, true);
        CustomTabsIntent customTabsIntent = builder.build();
        customTabsIntent.launchUrl(from, Uri.parse(url));
    }

    public static void startWebPage(Context context, String page) {
        try {
            context.startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(page)));
        } catch (Exception e) {
            e.getStackTrace();
        }
    }

    public static Activity unwrap(Context context) {
        while (!(context instanceof Activity) && context instanceof ContextWrapper) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        return (Activity) context;
    }
}
