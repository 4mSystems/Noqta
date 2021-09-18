package te.app.notta.customViews.views;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;

import com.google.android.material.textview.MaterialTextView;


public class CustomTextViewRegular extends MaterialTextView {


    public CustomTextViewRegular(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init(context);
    }

    public CustomTextViewRegular(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }


    public CustomTextViewRegular(Context context) {
        super(context);

        init(context);

    }

    private void init(Context context) {

        if (!isInEditMode()) {
            Typeface font = null;
            font = Typeface.createFromAsset(getContext().getAssets(), "fonts/font_regular.otf");
            setTypeface(font);
        }

    }

}