package te.app.notta.customViews.views;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.LinearLayout;

import com.google.android.material.textfield.TextInputEditText;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

import te.app.notta.R;
import te.app.notta.base.MyApplication;

public class FutureDateEditText extends TextInputEditText {
    DatePickerDialog datePickerDialog;
    Context context;

    public FutureDateEditText(Context context) {
        super(context);
        this.context = context;
        init();
    }

    public FutureDateEditText(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.context = context;
        init();
    }

    public FutureDateEditText(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.context = context;
        init();
    }


    private void init() {
        setOnClickListener(v -> showDateDialog());
    }

    private void showDateDialog() {
        if (datePickerDialog == null) {
            Calendar mcurrentTime = Calendar.getInstance();
            mcurrentTime.add(Calendar.YEAR, 0);
            int year = mcurrentTime.get(Calendar.YEAR);
            int month = mcurrentTime.get(Calendar.MONTH);
            int day = mcurrentTime.get(Calendar.DAY_OF_MONTH);
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm", new Locale("en"));
            datePickerDialog = new DatePickerDialog(getContext(), (datePicker, i, i1, i2) -> {
                Calendar calendar = Calendar.getInstance();
                calendar.set(datePicker.getYear(), datePicker.getMonth(), datePicker.getDayOfMonth());
                new TimePickerDialog(context, (view, hourOfDay, minute) -> {
                    calendar.set(Calendar.HOUR_OF_DAY, hourOfDay);
                    calendar.set(Calendar.MINUTE, minute);
                    String strDate = format.format(calendar.getTime());
                    setText(strDate);
                }, mcurrentTime.get(Calendar.HOUR_OF_DAY), mcurrentTime.get(Calendar.MINUTE), true).show();


            }, year, month, day);
            datePickerDialog.getDatePicker().setMinDate(mcurrentTime.getTimeInMillis());
        }
        datePickerDialog.show();
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
        );
        params.setMargins(8, 0, 8, 0);
        Button button = datePickerDialog.getButton(DatePickerDialog.BUTTON_NEGATIVE);
        button.setBackgroundColor(MyApplication.getInstance().getResources().getColor(R.color.colorPrimaryDark, null));
        button.setTextColor(MyApplication.getInstance().getResources().getColor(R.color.white, null));
        button.setLayoutParams(params);


    }

    public DatePickerDialog getDatePickerDialog() {
        return datePickerDialog;
    }
}
