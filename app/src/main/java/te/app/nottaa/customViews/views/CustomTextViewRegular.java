package te.app.nottaa.customViews.views;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;

public class CustomTextViewRegular extends AppCompatTextView {


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

        Typeface tf = Typeface.createFromAsset(context.getAssets(),
                "fonts/font_regular.otf");
        setTypeface(tf);
    }

}