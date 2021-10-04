package te.app.notta.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import te.app.notta.R;
import te.app.notta.databinding.ActivityExoPlayerBinding;

public class ExoPlayerActivity extends AppCompatActivity {
    private static final String KEY_VIDEO_URI = "video_uri";
    private ActivityExoPlayerBinding exoPlayerBinding;
    //    String videoUri = "http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/ElephantsDream.mp4";
    String videoUri;

    public static Intent getStartIntent(Context context, String videoUri) {
        Intent intent = new Intent(context, ExoPlayerActivity.class);
        intent.putExtra(KEY_VIDEO_URI, videoUri);
        return intent;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        exoPlayerBinding = DataBindingUtil.setContentView(this, R.layout.activity_exo_player);
        if (getIntent().hasExtra(KEY_VIDEO_URI)) {
            videoUri = getIntent().getStringExtra(KEY_VIDEO_URI);
            Log.e("onCreate", "onCreate: " + videoUri);
        }

    }

}