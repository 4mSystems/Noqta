package te.app.notta.base;

import android.graphics.Color;
import android.text.TextUtils;
import android.util.Log;
import android.widget.ImageView;
import android.widget.RatingBar;

import androidx.databinding.BindingAdapter;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.squareup.picasso.Picasso;

import te.app.notta.R;
import te.app.notta.utils.helper.AppHelper;
import te.app.notta.utils.images.PhotoFullPopupWindow;

public class ApplicationBinding {
    private static final String TAG = "ApplicationBinding";

    @BindingAdapter("imageUrl")
    public static void loadImage(ImageView imageView, Object image) {
        if (image instanceof String) {
            Glide
                    .with(imageView.getContext())
                    .load((String) image)
                    .placeholder(R.drawable.splash)
                    .into(imageView);
        } else if (image instanceof Integer) {
            Log.e(TAG, "loadImage: " + image);
            imageView.setImageResource((Integer) image);
        }
    }

    @BindingAdapter("imageMarketUrl")
    public static void loadMarketImage(ImageView imageView, Object image) {
        if (image instanceof String) {
            Picasso.get().load((String) image).placeholder(R.mipmap.ic_launcher_round).into(imageView);
        }
    }

    @BindingAdapter("imageFullUrl")
    public static void loadFullImage(ImageView imageView, Object image) {
        if (image instanceof String) {
            Glide.with(imageView.getContext()).load((String) image).placeholder(R.drawable.splash).into(imageView);
            imageView.setOnClickListener(v -> new PhotoFullPopupWindow(imageView.getContext(), R.layout.popup_photo_full, imageView, (String) image, null));
        }
    }

    @BindingAdapter("color")
    public static void color(ImageView imageView, String color) {
        if (color != null && !color.equals("") && color.charAt(0) == '#') {
            imageView.setBackgroundColor(Color.parseColor(color));
        }
    }

//    @BindingAdapter("android:drawableStart")
//    public static void drawableStart(TextView view, int drawable) {
//        view.setCompoundDrawables(null, null, drawable, null);
//    }

    @BindingAdapter({"app:adapter", "app:span", "app:orientation"})
    public static void getItemsV2Binding(RecyclerView recyclerView, RecyclerView.Adapter<?> itemsAdapter, String spanCount, String orientation) {
        if (orientation.equals("1"))
            AppHelper.initVerticalRV(recyclerView, recyclerView.getContext(), Integer.parseInt(spanCount));
        else
            AppHelper.initHorizontalRV(recyclerView, recyclerView.getContext(), Integer.parseInt(spanCount));
        recyclerView.setAdapter(itemsAdapter);
    }


    @BindingAdapter("rate")
    public static void setRate(final RatingBar ratingBar, String rate) {
        if (!TextUtils.isEmpty(rate))
            ratingBar.setRating(Float.parseFloat(rate));
    }

}
