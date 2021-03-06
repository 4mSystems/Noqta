package te.app.nottaa.utils.session;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.util.Log;

import java.util.Locale;

import te.app.nottaa.base.MyApplication;
import te.app.nottaa.utils.Constants;


public class LanguagesHelper {

    public static void changeLanguage(Context context, String languageToLoad) {
        Locale locale = new Locale(languageToLoad);
        Locale.setDefault(locale);
        Configuration config = new Configuration();
        config.locale = locale;
        context.getResources().updateConfiguration(config,
                context.getResources().getDisplayMetrics());

        setLanguage(languageToLoad);
    }

    public static void setLanguage(String language) {
        Log.e("setLanguage", "setLanguage: "+language );
        SharedPreferences userDetails = MyApplication.getInstance().getSharedPreferences(Constants.LANGUAGE, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = userDetails.edit();
        editor.putString(Constants.LANGUAGE, language);
        editor.apply();
    }

    public static String getCurrentLanguage() {
        SharedPreferences preferences = MyApplication.getInstance().getApplicationContext().getSharedPreferences(Constants.LANGUAGE, Context.MODE_PRIVATE);
        if (preferences.getString(Constants.LANGUAGE, "").length() > 0) {
            return preferences.getString(Constants.LANGUAGE, "");
        } else {
            setLanguage(Constants.DEFAULT_LANGUAGE);
            return Constants.DEFAULT_LANGUAGE;
        }
    }

    public static Locale getLocalLanguage() {
        return new Locale(getCurrentLanguage());
    }
    public static String getJwt() {
        if (UserHelper.getInstance(MyApplication.getInstance()).getJwt() != null)
            return UserHelper.getInstance(MyApplication.getInstance()).getJwt();
        else if (UserHelper.getInstance(MyApplication.getInstance()).getUserData()!=null)
            return UserHelper.getInstance(MyApplication.getInstance()).getUserData().getAccess_token();
        return null;
    }
}
