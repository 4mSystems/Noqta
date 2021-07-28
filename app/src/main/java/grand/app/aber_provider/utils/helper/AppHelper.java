package grand.app.aber_provider.utils.helper;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.Toast;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import com.google.android.material.textfield.TextInputEditText;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

import grand.app.aber_provider.base.MyApplication;
import grand.app.aber_provider.R;
import grand.app.aber_provider.utils.Constants;
import grand.app.aber_provider.utils.session.LanguagesHelper;


public class AppHelper {


    public static String selectDate(Long date, String format) {
        SimpleDateFormat sdf = new SimpleDateFormat(format, Locale.ENGLISH);
        return sdf.format(date);
    }

    public static String getDay(Long date) {
        Log.e("getDay", "getDay: "+date );
        SimpleDateFormat sdf = new SimpleDateFormat("dd", new Locale(LanguagesHelper.getCurrentLanguage()));
        return sdf.format(date);
    }

    public static String getDayText(Long date) {
        SimpleDateFormat sdf = new SimpleDateFormat("EEEE", new Locale(LanguagesHelper.getCurrentLanguage()));
        return sdf.format(date);
    }

    public static String selectTime(int hour, int min) {
        Calendar datetime = Calendar.getInstance();
        datetime.set(Calendar.HOUR_OF_DAY, hour);
        datetime.set(Calendar.MINUTE, min);
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm", Locale.ENGLISH);
        return sdf.format(datetime.getTime());
    }

    public static Bitmap resizeIcon(Drawable drawable) {
        int height = 50;
        int width = 50;
//        BitmapDrawable bitmapDrawable = (BitmapDrawable) convertVectorToBitMap(drawable);
        Bitmap b = convertVectorToBitMap(drawable);
        return Bitmap.createScaledBitmap(b, width, height, false);
    }

    public static Bitmap convertVectorToBitMap(Drawable drawable) {
        try {
            Bitmap bitmap;

            bitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);

            Canvas canvas = new Canvas(bitmap);
            drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            drawable.draw(canvas);

            return bitmap;
        } catch (OutOfMemoryError e) {
            // Handle the error
            Log.e("convertVectorToBitMap", "convertVectorToBitMap: " + e.getMessage());
            return null;
        }
    }

    public static Bitmap resizeVectorIcon(Drawable drawable, int width, int height) {
        try {
            Bitmap bitmap;
            bitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmap);
            drawable.setBounds(0, 0, width, height);
            drawable.draw(canvas);
            return bitmap;
        } catch (OutOfMemoryError e) {
            return null;
        }
    }

    public static void shareApp(Activity activity) {
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        String shareSub = activity.getString(R.string.app_name);
        String shareBody = getPlayStoreLink(activity);
        intent.putExtra(Intent.EXTRA_SUBJECT, shareSub);
        intent.putExtra(Intent.EXTRA_TEXT, shareBody);
//        activity.startActivity(Intent.createChooser(intent, activity.getString(R.string.share)));
        activity.startActivity(Intent.createChooser(intent, "share"));
    }

    public static String getPlayStoreLink(Context context) {
        final String appPackageName = context.getPackageName();
        return "https://play.google.com/store/apps/details?id=" + appPackageName;
    }

    public static void rateApp(Context context) {
        Uri uri = Uri.parse("market://details?id=" + context.getPackageName());
        Intent goToMarket = new Intent(Intent.ACTION_VIEW, uri);
//        goToMarket.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY |
//                Intent.FLAG_ACTIVITY_NEW_DOCUMENT |
//                Intent.FLAG_ACTIVITY_MULTIPLE_TASK);
        try {
            context.startActivity(goToMarket);
        } catch (ActivityNotFoundException e) {
            context.startActivity(new Intent(Intent.ACTION_VIEW,
                    Uri.parse("http://play.google.com/store/apps/details?id=" + context.getPackageName())));
        }
    }

    public static void shareCustom(Activity activity, String title, String message) {
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        final String appPackageName = MyApplication.getInstance().getPackageName();
        message += "\n\nhttps://play.google.com/store/apps/details?id=" + appPackageName;
        intent.putExtra(Intent.EXTRA_SUBJECT, title);
        intent.putExtra(Intent.EXTRA_TEXT, message);
//        activity.startActivity(Intent.createChooser(intent, activity.getString(R.string.share)));
        activity.startActivity(Intent.createChooser(intent, "share"));

    }

    public static void openWhats(Activity activity, String number) {
        Uri uri = Uri.parse("smsto:" + number);
        Intent i = new Intent(Intent.ACTION_SENDTO, uri);
        i.setPackage("com.whatsapp");
        activity.startActivity(Intent.createChooser(i, ""));
    }

    public static void openDialNumber(Context context, String number) {
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:" + number));
        context.startActivity(intent);
    }

    public static void openBrowser(Context context, String url) {
        if (!url.startsWith("http://") && !url.startsWith("https://"))
            url = "http://" + url;
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        context.startActivity(browserIntent);
    }


    public static void openEmail(Context context, String email) {

        String mailto = "mailto:" + email + "?" +
//                "?cc=" + "sales@2grand.net" +
                "&subject=" + context.getString(R.string.app_name) +
                "&body=";

        Intent emailIntent = new Intent(Intent.ACTION_SENDTO);
        emailIntent.setData(Uri.parse(mailto));

        try {
            context.startActivity(emailIntent);
        } catch (ActivityNotFoundException e) {
            //TODO: Handle case where no email app is available
            Toast.makeText(context, "No Server Mail Application Found", Toast.LENGTH_SHORT).show();
        }


    }

    @SuppressLint("WrongConstant")
    public static void initVerticalRV(RecyclerView recyclerView, Context context, int spanCount) {
        recyclerView.setHasFixedSize(true);
        recyclerView.setItemViewCacheSize(30);
        recyclerView.setDrawingCacheEnabled(true);
        recyclerView.setDrawingCacheQuality(View.DRAWING_CACHE_QUALITY_HIGH);
        recyclerView.setLayoutManager(new GridLayoutManager(context, spanCount, LinearLayoutManager.VERTICAL, false));
    }

    @SuppressLint("WrongConstant")
    public static void initHorizontalRV(RecyclerView recyclerView, Context context, int spanCount) {
        recyclerView.setHasFixedSize(true);
        recyclerView.setItemViewCacheSize(30);
        recyclerView.setDrawingCacheEnabled(true);
        recyclerView.setDrawingCacheQuality(View.DRAWING_CACHE_QUALITY_HIGH);
        recyclerView.setLayoutManager(new GridLayoutManager(context, spanCount, LinearLayoutManager.HORIZONTAL, false));
    }

    public static String numberToDecimal(int number) {
        String number2Decimal = String.valueOf(number);
        if (number < 10) {
            number2Decimal = "0" + number2Decimal;
        }
        return number2Decimal;
    }


    public static void hideKeyboard(Activity activity) {
        View view = activity.getCurrentFocus();
        if (view != null) {
            InputMethodManager imm = (InputMethodManager) activity.getSystemService(Context.INPUT_METHOD_SERVICE);
            imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
        activity.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
    }

    public static void showKeyboard(Context context, TextInputEditText remarkEditText) {
        remarkEditText.setFocusable(true);
        remarkEditText.setFocusableInTouchMode(true);
        remarkEditText.requestFocus();
        InputMethodManager inputManager =
                (InputMethodManager) context.getSystemService(
                        Context.INPUT_METHOD_SERVICE);
        inputManager.showSoftInput(remarkEditText, 0);

    }

    public static void startAndroidGoogleMap(Context context, String url) {
        Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                Uri.parse(url));
        // intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(intent);

    }

    public static void makeActionSound(Context context, String type) {
        Uri defaultSoundUri;
        if (type.equals(Constants.COMMENT)) {
            defaultSoundUri = Uri.parse(ContentResolver.SCHEME_ANDROID_RESOURCE + "://" + MyApplication.getInstance().getPackageName() + "/" + R.raw.comment);
        } else if (type.equals(Constants.SHARE_POST))
            defaultSoundUri = Uri.parse(ContentResolver.SCHEME_ANDROID_RESOURCE + "://" + MyApplication.getInstance().getPackageName() + "/" + R.raw.share);
        else
            defaultSoundUri = Uri.parse(ContentResolver.SCHEME_ANDROID_RESOURCE + "://" + MyApplication.getInstance().getPackageName() + "/" + R.raw.like);
        Ringtone r = RingtoneManager.getRingtone(context, defaultSoundUri);
        r.play();
    }
}
