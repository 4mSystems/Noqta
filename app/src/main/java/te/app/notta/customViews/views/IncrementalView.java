package te.app.notta.customViews.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.BindingAdapter;
import androidx.databinding.InverseBindingAdapter;
import androidx.databinding.InverseBindingListener;

import te.app.notta.R;

public class IncrementalView extends ConstraintLayout {
    View view;
    private TextView incrementalViewText;
    ImageView increment, decrement;
    public String value = "1";
    int type;
    Context context;

    public IncrementalView(@NonNull Context context) {
        super(context);
        this.context = context;
    }

    public IncrementalView(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        this.context = context;
        initView(attrs);
    }

    public IncrementalView(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.context = context;
        initView(attrs);
    }

    private void initView(@Nullable AttributeSet attrs) {
        TypedArray a = context.getTheme().obtainStyledAttributes(
                attrs,
                R.styleable.IncrementalView,
                0, 0);
        int n = a.getIndexCount();
        for (int i = 0; i < n; i++) {
            //note that you are accessing standard attributes using your attrs identifier
            type = a.getInt(R.styleable.IncrementalView_type, 0);
        }
        a.recycle();
        view = inflate(getContext(), R.layout.incremental_view, this);
        incrementalViewText = findViewById(R.id.incrementalViewText);
        increment = findViewById(R.id.increment);
        decrement = findViewById(R.id.decrement);
        increment.setOnClickListener(v -> {
            incrementalViewText.setText(String.valueOf(Integer.parseInt(incrementalViewText.getText().toString()) + 1));
        });
        decrement.setOnClickListener(v -> {
            if (!incrementalViewText.getText().toString().equals("0") && !incrementalViewText.getText().toString().equals("1"))
                incrementalViewText.setText(String.valueOf(Integer.parseInt(incrementalViewText.getText().toString()) - 1));
        });
        value = incrementalViewText.getText().toString();
    }

    @BindingAdapter("app:value")
    public static void getValue(IncrementalView view, String text) {
        view.incrementalViewText.setText(text);
    }

    @InverseBindingAdapter(attribute = "value")
    public static String setValue(IncrementalView customEditText) {
        return customEditText.incrementalViewText.getText().toString();
    }

    @BindingAdapter(value = "valueAttrChanged")
    public static void setValueListner(final IncrementalView view, final InverseBindingListener textAttrChanged) {
        if (textAttrChanged != null) {
            view.incrementalViewText.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                }

                @Override
                public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                }

                @Override
                public void afterTextChanged(Editable editable) {
                    textAttrChanged.onChange();
                }
            });


        }

    }

}

