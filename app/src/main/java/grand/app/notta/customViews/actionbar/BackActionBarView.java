package grand.app.notta.customViews.actionbar;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.RelativeLayout;

import androidx.databinding.DataBindingUtil;

import grand.app.notta.R;
import grand.app.notta.base.ParentActivity;
import grand.app.notta.databinding.LayoutActionBarBackBinding;
import grand.app.notta.utils.helper.MovementHelper;

public class BackActionBarView extends RelativeLayout {
    public LayoutActionBarBackBinding layoutActionBarBackBinding;
    public int type = 0;
    public int flag = 0;
    Context context;

    public BackActionBarView(Context context) {
        super(context);
        this.context = context;

        init();
    }

    public BackActionBarView(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.context = context;

        init();

    }

    public BackActionBarView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs);
        this.context = context;

        init();
    }

    private void init() {
        LayoutInflater layoutInflater = LayoutInflater.from(getContext());
        layoutActionBarBackBinding = DataBindingUtil.inflate(layoutInflater, R.layout.layout_action_bar_back, this, true);
        setEvents();
    }

    private void setEvents() {
        layoutActionBarBackBinding.imgActionBarCancel.setOnClickListener(view -> {
            if (flag == 1) {
                if (((ParentActivity) context).isTaskRoot()) {
                    // This activity is at root of task, so launch main activity
                    MovementHelper.startActivityMain(context);
                } else {
                    // This activity isn't at root of task, so just finish()
                    ((Activity) getContext()).finish();
                }
            } else
                ((Activity) getContext()).finish();
        });

    }

    public void setTitle(String title) {
        layoutActionBarBackBinding.tvActionBarTitle.setText(title);
    }

}
