package grand.app.aber_provider.utils.upload;

import android.Manifest;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ContentUris;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.Environment;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import android.util.Base64;
import android.util.Log;

import androidx.appcompat.app.AlertDialog;
import androidx.core.app.ActivityCompat;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Date;
import java.util.Objects;

import grand.app.aber_provider.base.MyApplication;
import grand.app.aber_provider.connection.FileObject;
import grand.app.aber_provider.utils.Constants;
import grand.app.aber_provider.utils.helper.LauncherHelper;
import grand.app.aber_provider.utils.resources.ResourceManager;
import grand.app.aber_provider.R;


@SuppressLint("NewApi")
public class FileOperations {
    public static int code;

    public static String getPath(final Context context, final Uri uri) {

        // DocumentProvider
        if (DocumentsContract.isDocumentUri(context, uri)) {
            // ExternalStorageProvider
            if (isExternalStorageDocument(uri)) {
                final String docId = DocumentsContract.getDocumentId(uri);
                final String[] split = docId.split(":");
                final String type = split[0];

                if ("primary".equalsIgnoreCase(type)) {
                    return Environment.getExternalStorageDirectory() + "/" + split[1];
                }
            }
            // DownloadsProvider
            else if (isDownloadsDocument(uri)) {

                final String id = DocumentsContract.getDocumentId(uri);
                final Uri contentUri = ContentUris.withAppendedId(
                        Uri.parse("content://downloads/public_downloads"), Long.valueOf(id));

                return getDataColumn(context, contentUri, null, null);
            }
            // MediaProvider
            else if (isMediaDocument(uri)) {
                final String docId = DocumentsContract.getDocumentId(uri);
                final String[] split = docId.split(":");
                final String type = split[0];

                Uri contentUri;
                if ("image".equals(type)) {
                    contentUri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
                } else if ("video".equals(type)) {
                    contentUri = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
                } else if ("audio".equals(type)) {
                    contentUri = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
                } else {
                    contentUri = MediaStore.getMediaScannerUri();
                }

                final String selection = "_id=?";
                final String[] selectionArgs = new String[]{
                        split[1]
                };

                return getDataColumn(context, contentUri, selection, selectionArgs);
            }
        }
        // MediaStore (and general)
        else if ("content".equalsIgnoreCase(uri.getScheme())) {
            return getDataColumn(context, uri, null, null);
        }
        // File
        else if ("file".equalsIgnoreCase(uri.getScheme())) {
            return uri.getPath();
        }

        return null;
    }


    /**
     * Get the value of the data column for this Uri. This is useful for
     * MediaStore Uris, and other file-based ContentProviders.
     *
     * @param context       The context.
     * @param uri           The Uri to query.
     * @param selection     (Optional) Filter used in the query.
     * @param selectionArgs (Optional) Selection arguments used in the query.
     * @return The value of the _data column, which is typically a file path.
     */
    private static String getDataColumn(Context context, Uri uri, String selection,
                                        String[] selectionArgs) {

        Cursor cursor = null;
        final String column = "_data";
        final String[] projection = {
                column
        };

        try {
            cursor = context.getContentResolver().query(uri, projection, selection, selectionArgs,
                    null);
            if (cursor != null && cursor.moveToFirst()) {
                final int columnIndex = cursor.getColumnIndexOrThrow(column);
                return cursor.getString(columnIndex);
            }
        } finally {
            if (cursor != null)
                cursor.close();
        }
        return null;
    }


    /**
     * @param uri The Uri to check.
     * @return Whether the Uri authority is ExternalStorageProvider.
     */
    private static boolean isExternalStorageDocument(Uri uri) {
        return "com.android.externalstorage.documents".equals(uri.getAuthority());
    }

    /**
     * @param uri The Uri to check.
     * @return Whether the Uri authority is DownloadsProvider.
     */
    private static boolean isDownloadsDocument(Uri uri) {
        return "com.android.providers.downloads.documents".equals(uri.getAuthority());
    }

    /**
     * @param uri The Uri to check.
     * @return Whether the Uri authority is MediaProvider.
     */
    private static boolean isMediaDocument(Uri uri) {
        return "com.android.providers.media.documents".equals(uri.getAuthority());
    }


    public String getFileAsString(final Context context, final Uri uri) {
        return fileToString(getPath(context, uri));
    }

    private String fileToString(String selectedPath) {
        FileInputStream inputStream = null;
        String str_image = "";
        ByteArrayOutputStream byteBuffer = new ByteArrayOutputStream();
        try {
            inputStream = new FileInputStream(new File(selectedPath));

            int bufferSize = 16777216;
            byte[] buffer = new byte[bufferSize];

            int len;
            while ((len = inputStream.read(buffer)) != -1) {
                byteBuffer.write(buffer, 0, len);
            }
            try {
                inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            str_image = Base64.encodeToString(byteBuffer.toByteArray(), 0);

        } catch (Exception ex) {
            ex.getStackTrace();
        }

        return str_image;
    }

    public static byte[] fileToBytes(String selectedPath) {
        FileInputStream inputStream;

        File file = new File(selectedPath);
        int size = (int) file.length();
        ByteArrayOutputStream byteBuffer = new ByteArrayOutputStream();
        try {
            inputStream = new FileInputStream(new File(selectedPath));


            byte[] buffer = new byte[size];

            int len;
            while ((len = inputStream.read(buffer)) != -1) {
                byteBuffer.write(buffer, 0, len);
            }
            try {
                inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return buffer;

        } catch (Exception ex) {
            ex.getStackTrace();
        }

        return null;
    }

    public String BitMapToString(Bitmap bitmap) {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.PNG, 70, baos);
        byte[] b = baos.toByteArray();
        return Base64.encodeToString(b, Base64.DEFAULT);
    }


    private static Uri specialCameraSelector(Context inContext, Bitmap bitmap) {
//        ByteArrayOutputStream bytes = new ByteArrayOutputStream();
//        bitmap.compress(Bitmap.CompressFormat.JPEG, 70, bytes);

        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, 70, stream);
        byte[] byteArray = stream.toByteArray();
        Bitmap compressedBitmap = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length);

        String path = MediaStore.Images.Media.insertImage(inContext.getContentResolver(), compressedBitmap, new Date(System.currentTimeMillis()).toString() + "photo", null);
        return Uri.parse(path);
    }


    public static String getImageUri(Context inContext, Bitmap inImage) {
        ByteArrayOutputStream bytes = new ByteArrayOutputStream();
        String pathBase = Environment.getExternalStorageDirectory().toString();


        OutputStream fOut = null;
        File file = new File(pathBase, "image"); // the File to save , append increasing numeric counter to prevent files from getting overwritten.
        try {
            fOut = new FileOutputStream(file);
            inImage.compress(Bitmap.CompressFormat.JPEG, 70, fOut); // saving the Bitmap to a file compressed as a JPEG with 85% compression rate
            fOut.flush(); // Not really required
            fOut.close(); // do not forget to close the stream
            MediaStore.Images.Media.insertImage(inContext.getContentResolver(), file.getAbsolutePath(), file.getName(), file.getName());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return file.getAbsolutePath();
    }


    public static FileObject getFileObject(Context context, Intent data, String paramName, int fileType) {
        if (data == null) return null;
        Uri dataUrl = data.getData();
        if (fileType == Constants.FILE_TYPE_IMAGE) {
            if (dataUrl == null) {
                dataUrl = FileOperations.specialCameraSelector(context, (Bitmap) Objects.requireNonNull(Objects.requireNonNull(data.getExtras()).get("data")));
            }
            if (dataUrl == null) {
                return null;
            }
        }
        String filePath = getPath(context, dataUrl);
//        CompressObject compressObject;
//        Log.e("FilePath", " >> " + filePath);
//        if (fileType == Constants.FILE_TYPE_IMAGE) {
//            compressObject = new ImageCompression().compressImage(filePath);
//            Log.e("FilePathAfterCompress", " >> " + filePath);
//        } else {
//            compressObject = new CompressObject();
//            compressObject.setBytes(fileToBytes(filePath));
//        }
        FileObject volleyFileObject = new FileObject(paramName, filePath, fileType);
//        volleyFileObject.setCompressObject(compressObject);
        volleyFileObject.setUri(dataUrl);
        return volleyFileObject;
    }


    public static void pickImage(Context context) {
        if (ActivityCompat.checkSelfPermission(context, Manifest.permission.CAMERA) == PackageManager.PERMISSION_GRANTED &&
                ActivityCompat.checkSelfPermission(context, Manifest.permission.READ_EXTERNAL_STORAGE) == PackageManager.PERMISSION_GRANTED &&
                ActivityCompat.checkSelfPermission(context, Manifest.permission.WRITE_EXTERNAL_STORAGE) == PackageManager.PERMISSION_GRANTED) {
            String[] choiceString = new String[]{ResourceManager.getString(R.string.gallery), ResourceManager.getString(R.string.camera)};
            AlertDialog.Builder dialog = new AlertDialog.Builder(context);
            dialog.setIcon(R.mipmap.ic_launcher);
            dialog.setTitle(ResourceManager.getString(R.string.select_image_from));
            dialog.setItems(choiceString,
                    (dialog1, which) -> {
                        Intent intent;
                        if (which == 0) {
                            intent = new Intent(
                                    Intent.ACTION_PICK,
                                    MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                        } else {
                            intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                        }
                        LauncherHelper.execute(Intent.createChooser(intent, ResourceManager.getString(R.string.select_image_from)), Constants.FILE_TYPE_IMAGE, context);
                    }).show();
        } else {
            ActivityCompat.requestPermissions(((Activity) context), new String[]{Manifest.permission.READ_EXTERNAL_STORAGE, Manifest.permission.WRITE_EXTERNAL_STORAGE, Manifest.permission.CAMERA}, 1007);
        }
    }

    public static void pickPostMedia(Context context) {
        if (ActivityCompat.checkSelfPermission(context, Manifest.permission.CAMERA) == PackageManager.PERMISSION_GRANTED &&
                ActivityCompat.checkSelfPermission(context, Manifest.permission.READ_EXTERNAL_STORAGE) == PackageManager.PERMISSION_GRANTED &&
                ActivityCompat.checkSelfPermission(context, Manifest.permission.WRITE_EXTERNAL_STORAGE) == PackageManager.PERMISSION_GRANTED) {
            String[] choiceString = new String[]{ResourceManager.getString(R.string.image)
                    , MyApplication.getInstance().getResources().getString(R.string.total_cost),
                    MyApplication.getInstance().getResources().getString(R.string.camera)};
            AlertDialog.Builder dialog = new AlertDialog.Builder(context);
            dialog.setIcon(R.mipmap.ic_launcher);
            dialog.setTitle(MyApplication.getInstance().getResources().getString(R.string.select_file));
            dialog.setItems(choiceString,
                    (dialog1, which) -> {
                        Intent intent;
                        if (which == 0) {
                            code = Constants.FILE_TYPE_IMAGE;
                            intent = new Intent(
                                    Intent.ACTION_PICK,
                                    MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                        } else if (which == 1) {
                            code = Constants.FILE_TYPE_VIDEO;
                            intent = new Intent(
                                    Intent.ACTION_PICK,
                                    MediaStore.Video.Media.EXTERNAL_CONTENT_URI);
                        } else {
                            code = Constants.FILE_TYPE_IMAGE;
                            intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                        }
                        LauncherHelper.execute(Intent.createChooser(intent, MyApplication.getInstance().getResources().getString(R.string.select_file)), code, context);
                    }).show();
        } else
            ActivityCompat.requestPermissions((Activity) context, new String[]{Manifest.permission.READ_EXTERNAL_STORAGE, Manifest.permission.WRITE_EXTERNAL_STORAGE, Manifest.permission.CAMERA}, 1007);
    }

    public static void verifyStoragePermissions(Context context) {
        // Check if we have write permission
        int permission = ActivityCompat.checkSelfPermission(context, Manifest.permission.WRITE_EXTERNAL_STORAGE);

        if (permission == PackageManager.PERMISSION_GRANTED) {
            pickPostMedia(context);
        } else
            ActivityCompat.requestPermissions((Activity) context, new String[]{Manifest.permission.READ_EXTERNAL_STORAGE, Manifest.permission.WRITE_EXTERNAL_STORAGE, Manifest.permission.CAMERA, Manifest.permission.RECORD_AUDIO}, 1007);
    }

    private static final String TAG = "FileOperations";

    public static long videoTime(File videoFile, Context context) {
        MediaMetadataRetriever retriever = new MediaMetadataRetriever();
        retriever.setDataSource(context, Uri.fromFile(videoFile));
        String time = retriever.extractMetadata(MediaMetadataRetriever.METADATA_KEY_DURATION);
        long timeInMillisec = Long.parseLong(time);
        long sec = timeInMillisec / 1000;
        Log.e(TAG, "videoLength: " + sec);
        retriever.release();
        return sec;
    }

    public static void pickVideo(final Context context) {
        if (ActivityCompat.checkSelfPermission(context, Manifest.permission.READ_EXTERNAL_STORAGE) == PackageManager.PERMISSION_GRANTED &&
                ActivityCompat.checkSelfPermission(context, Manifest.permission.WRITE_EXTERNAL_STORAGE) == PackageManager.PERMISSION_GRANTED) {
            Intent intent = new Intent(
                    Intent.ACTION_PICK,
                    MediaStore.Video.Media.EXTERNAL_CONTENT_URI);
            LauncherHelper.execute(Intent.createChooser(intent, MyApplication.getInstance().getResources().getString(R.string.select_file)), Constants.FILE_TYPE_VIDEO, context);

        } else
            ActivityCompat.requestPermissions((Activity) context, new String[]{Manifest.permission.READ_EXTERNAL_STORAGE, Manifest.permission.WRITE_EXTERNAL_STORAGE, Manifest.permission.CAMERA}, 1007);

    }

}
