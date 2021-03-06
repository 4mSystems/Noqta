package te.app.nottaa.connection;


import android.util.Log;

import androidx.lifecycle.MutableLiveData;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.File;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;
import javax.inject.Singleton;

import te.app.nottaa.model.base.Mutable;
import te.app.nottaa.model.base.StatusMessage;
import te.app.nottaa.utils.Constants;
import io.reactivex.Flowable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import io.reactivex.subscribers.DisposableSubscriber;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;


@Singleton
public class ConnectionHelper {

    private static final String TAG = "ConnectionHelper";
    @Inject
    public Api api;

    //    @Inject
    public MutableLiveData<Mutable> liveData;

    public Gson gson;


    @Inject
    public ConnectionHelper(Api api) {
        this.api = api;
//        this.liveData = liveData;
    }

    @Inject
    public void init() {
        gson = new Gson();
    }

    //public Disposable requestApi(String url, Object requestData, Class<?> responseType, String constantSuccessResponse,
// boolean showProgress) {
    public Disposable requestApi(String url, final Object requestData,
                                 final List<FileObject> fileObjects, final Class<?> responseType, String constantSuccessResponse, boolean showProgress) {
        Map<String, String> map = getParameters(requestData);
        Flowable<JsonObject> call = null;
        MultipartBody.Part file = null;
        if (fileObjects != null && fileObjects.size() > 0) {
            List<MultipartBody.Part> images = new ArrayList<>();
            int counter = 0;
            for (FileObject fileObject : fileObjects) {
                File myFile = fileObject.getFile();
                RequestBody mFile = null;
                if (fileObject.getFileType() == Constants.FILE_TYPE_IMAGE) {
                    mFile = RequestBody.create(MediaType.parse("image/*"), myFile);
                } else {
                    mFile = RequestBody.create(MediaType.parse("video/*"), myFile);
                }
                file = MultipartBody.Part.createFormData(fileObject.getParamName(), myFile.getName(), mFile);
                images.add(file);
                counter++;
                call = api.post(url, map, images);
            }
        } else {
            call = api.post(url, map);
        }
        if (showProgress) {
            Log.d(TAG, "showProgress");
            liveData.setValue(new Mutable(Constants.SHOW_PROGRESS));
        }
        return call.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeWith(new DisposableSubscriber<JsonObject>() {
                    @Override
                    public void onNext(JsonObject response) {
                        hideProgress(showProgress);
                        String jsonString = gson.toJson(response);
                        try {
                            StatusMessage statusMessage = gson.fromJson(jsonString, (Type) responseType);
                            Log.e(TAG, "onNext: " + statusMessage.mMessage);
                            if (statusMessage.mStatus == Constants.RESPONSE_SUCCESS)
                                liveData.setValue(new Mutable(constantSuccessResponse, gson.fromJson(jsonString, responseType)));
                            else if (statusMessage.mStatus == Constants.RESPONSE_JWT_EXPIRE)
                                liveData.setValue(new Mutable(Constants.LOGOUT, statusMessage.mMessage));
                            else
                                liveData.setValue(new Mutable(Constants.ERROR, statusMessage.mMessage));
                        } catch (Exception e) {
                            liveData.setValue(new Mutable(Constants.ERROR, e.getMessage()));
                            e.printStackTrace();
                        }

                    }

                    @Override
                    public void onError(Throwable t) {
                        hideProgress(showProgress);
                        liveData.setValue(new Mutable(Constants.SERVER_ERROR));
                    }

                    @Override
                    public void onComplete() {
                        hideProgress(showProgress);
                    }
                });
    }


    /***
     *
     * @param method (method POST-> 200 , GET->201)
     * @param url (url end point)
     * @param requestData (json object for request your data)
     * @param responseType (json object for delivery your response)
     * @param constantSuccessResponse (constant value for delivery in view example (mutable.message == constantSuccessResponse) => success call)
     * @param showProgress (boolean take true or false)
     */


    public Disposable requestApi(int method, String url, Object requestData, Class<?> responseType, String constantSuccessResponse, boolean showProgress) {
        Flowable<JsonObject> call = null;
        Map<String, String> map = getParameters(requestData);
        if (method == Constants.POST_REQUEST) {
            call = api.post(url, requestData);
        } else if (method == Constants.GET_REQUEST) {
            call = api.get(url, map);
        } else if (method == Constants.DELETE_REQUEST) {
            call = api.delete(url, map);
        } else
            call = api.get(url, map);
        if (showProgress) {
            liveData.setValue(new Mutable(Constants.SHOW_PROGRESS));
        }

        return call.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeWith(new DisposableSubscriber<JsonObject>() {
                    @Override
                    public void onNext(JsonObject response) {
                        hideProgress(showProgress);
                        try {
                            String jsonString = gson.toJson(response);
                            StatusMessage statusMessage = gson.fromJson(jsonString, (Type) responseType);
                            Log.e(TAG, "onNext: " + statusMessage.mStatus);
                            if (statusMessage.mStatus == Constants.RESPONSE_SUCCESS)
                                liveData.setValue(new Mutable(constantSuccessResponse, gson.fromJson(jsonString, responseType)));
                            else if (statusMessage.mStatus == Constants.RESPONSE_JWT_EXPIRE)
                                liveData.setValue(new Mutable(Constants.LOGOUT, statusMessage.mMessage));
                            else if (statusMessage.mStatus == Constants.RESPONSE_404)
                                liveData.setValue(new Mutable(Constants.ERROR_NOT_FOUND, statusMessage.mMessage));
                            else if (statusMessage.mStatus == Constants.RESPONSE_CHANGE)
                                liveData.setValue(new Mutable(Constants.RESPONSE_URL_CHANGED, statusMessage.mMessage));
                            else if (statusMessage.mStatus == Constants.RESPONSE_405)
                                liveData.setValue(new Mutable(Constants.NOT_VERIFIED, statusMessage.mMessage));
                            else
                                liveData.setValue(new Mutable(Constants.ERROR, statusMessage.mMessage));
                        } catch (Exception e) {
                            liveData.setValue(new Mutable(Constants.ERROR, e.getMessage()));
                            e.printStackTrace();
                        }

                    }

                    @Override
                    public void onError(Throwable t) {
                        hideProgress(showProgress);
                        liveData.setValue(new Mutable(Constants.SERVER_ERROR));
                    }

                    @Override
                    public void onComplete() {
                        hideProgress(showProgress);
                    }
                });

    }

    public Disposable requestApiBackground(int method, String url, Object requestData) {
        Flowable<JsonObject> call = null;
        Map<String, String> map = getParameters(requestData);
        if (method == Constants.POST_REQUEST) {
            call = api.post(url, requestData);
        } else if (method == Constants.GET_REQUEST) {
            call = api.get(url, map);
        } else if (method == Constants.DELETE_REQUEST) {
            call = api.delete(url, map);
        } else
            call = api.get(url, map);


        return call.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeWith(new DisposableSubscriber<JsonObject>() {
                    @Override
                    public void onNext(JsonObject response) {
                        Log.e(TAG, "onNext CALL BACKGROUND" + response.toString());
                    }

                    @Override
                    public void onError(Throwable t) {
                        Log.d(TAG, "ERROR CALL BACKGROUND");
                    }

                    @Override
                    public void onComplete() {
                        Log.d(TAG, "onComplete CALL BACKGROUND");
                    }
                });

    }


    private void hideProgress(boolean showProgress) {
        if (showProgress)
            liveData.setValue(new Mutable(Constants.HIDE_PROGRESS));
    }


    private Map<String, String> getParameters(final Object requestData) {
        Map<String, String> params = new HashMap<>();
        try {
            JSONObject jsonObject = new JSONObject(gson.toJson(requestData));
            for (int i = 0; i < jsonObject.names().length(); i++) {
//                jsonObject.get(jsonObject.names().getString(i));
                if (jsonObject.get(jsonObject.names().getString(i)) instanceof JSONArray) {
                    JSONArray jsonArray = (JSONArray) jsonObject.get(jsonObject.names().getString(i));
                    for (int j = 0; j < jsonArray.length(); j++) {
                        {
                            String name = jsonObject.names().getString(i) + "[" + j + "]";
                            params.put(name, jsonArray.get(j) + "");
                        }
                    }
                } else
                    params.put(jsonObject.names().getString(i), jsonObject.get(jsonObject.names().getString(i)) + "");
                Log.e("PARAMS", jsonObject.names().getString(i) + ":" + jsonObject.get(jsonObject.names().getString(i)) + "");
            }
            Log.e("PARAMS", params.size() + "");
        } catch (Exception e) {
            Log.e("PARAMS", e.getStackTrace() + "");
            e.getStackTrace();
        }
        return params;
    }

}
