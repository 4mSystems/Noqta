package grand.app.aber_provider.utils.timer;

import android.app.Dialog;
import android.app.DialogFragment;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TimePicker;

import java.util.Calendar;

import grand.app.aber_provider.R;


public class TimePickerFragment extends DialogFragment implements TimePickerDialog.OnTimeSetListener{

    int viewId = -1;
    public void setView(int viewId){
        this.viewId = viewId;
    }

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState){
        // Get a Calendar instance
        final Calendar calendar = Calendar.getInstance();
        // Get the current hour and minute
        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        int minute = calendar.get(Calendar.MINUTE);

        // Create a TimePickerDialog with current time
        TimePickerDialog tpd = new TimePickerDialog(getActivity(), R.style.TimePickerTheme,this,hour,minute,true);
        // Return the TimePickerDialog
        return tpd;
    }

    public void onTimeSet(TimePicker view, int hourOfDay, int minute){
        if(viewId != -1) {
            View viewType = getActivity().findViewById(viewId);
            if(viewType instanceof TextView) {
                TextView txt = (TextView) viewType;
                txt.setText(String.valueOf(hourOfDay) + ":" + String.valueOf(minute));
            }else if(viewType instanceof EditText){
                EditText edt = (EditText) viewType;
                edt.setText(String.valueOf(hourOfDay) + ":" + String.valueOf(minute));
            }
        }
    }
}