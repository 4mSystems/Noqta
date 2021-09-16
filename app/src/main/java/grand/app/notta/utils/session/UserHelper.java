package grand.app.notta.utils.session;

import android.content.Context;
import android.content.SharedPreferences;

import com.google.gson.Gson;

import grand.app.notta.pages.auth.models.UserData;

public class UserHelper {
    private static UserHelper mInstance;
    Context mCtx;
    private static final String SHARED_PREF_NAME = "myshared";
    private static final String SHARED_PREF_NAME_NO_DELETED = "NO_DELETED";

    private UserHelper(Context context) {
        mCtx = context;
    }

    //
    public static synchronized UserHelper getInstance(Context context) {
        if (mInstance == null) {
            mInstance = new UserHelper(context);
        }
        return mInstance;
    }


    public void userLogin(UserData userData) {
        SharedPreferences sharedPreferences = mCtx.getSharedPreferences(SHARED_PREF_NAME, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        Gson gson = new Gson();
        String json = gson.toJson(userData);
        editor.putString("userData", json);
        editor.apply();
        editor.commit();

    }


    public String addUserData() {
        SharedPreferences sharedPreferences = mCtx.getSharedPreferences(SHARED_PREF_NAME, Context.MODE_PRIVATE);
        return sharedPreferences.getString("userData", null);

    }

    public UserData getUserData() {
        Gson gson = new Gson();
        String json = addUserData();
        return gson.fromJson(json, UserData.class);
    }



    public String addCountriesData() {
        SharedPreferences sharedPreferences = mCtx.getSharedPreferences(SHARED_PREF_NAME, Context.MODE_PRIVATE);
        return sharedPreferences.getString("CountriesData", null);

    }



    public void addIsFirst(boolean isFirst) {
        SharedPreferences sharedPreferences = mCtx.getSharedPreferences(SHARED_PREF_NAME_NO_DELETED, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putBoolean("isFirst", isFirst);
        editor.apply();

    }

    public boolean getIsFirst() {
        SharedPreferences sharedPreferences = mCtx.getSharedPreferences(SHARED_PREF_NAME_NO_DELETED, Context.MODE_PRIVATE);
        return sharedPreferences.getBoolean("isFirst", true);
    }

    public void addToken(String token) {
        SharedPreferences sharedPreferences = mCtx.getSharedPreferences(SHARED_PREF_NAME, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("token", token);
        editor.apply();

    }

    public String getToken() {
        SharedPreferences sharedPreferences = mCtx.getSharedPreferences(SHARED_PREF_NAME, Context.MODE_PRIVATE);
        return sharedPreferences.getString("token", null);
    }

    public boolean loggout() {
        SharedPreferences sharedPreferences = mCtx.getSharedPreferences(SHARED_PREF_NAME, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.clear();
        editor.apply();
        return true;
    }

    public void addCountNotification(int count) {
        SharedPreferences sharedPreferences = mCtx.getSharedPreferences(SHARED_PREF_NAME_NO_DELETED, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putInt("COUNT", count);
        editor.apply();

    }

    public int getCountNotification() {
        SharedPreferences sharedPreferences = mCtx.getSharedPreferences(SHARED_PREF_NAME_NO_DELETED, Context.MODE_PRIVATE);
        return sharedPreferences.getInt("COUNT", 0);
    }


    public void addJwt(String jwt) {
        SharedPreferences sharedPreferences = mCtx.getSharedPreferences(SHARED_PREF_NAME, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("jwt", jwt);
        editor.apply();

    }

    public String getJwt() {
        SharedPreferences sharedPreferences = mCtx.getSharedPreferences(SHARED_PREF_NAME, Context.MODE_PRIVATE);
        return sharedPreferences.getString("jwt", null);
    }

    public void addAccountType(String type) {
        SharedPreferences sharedPreferences = mCtx.getSharedPreferences(SHARED_PREF_NAME, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("type", type);
        editor.apply();
    }

    public String getAccountType() {
        SharedPreferences sharedPreferences = mCtx.getSharedPreferences(SHARED_PREF_NAME, Context.MODE_PRIVATE);
        return sharedPreferences.getString("type", "");
    }

}
