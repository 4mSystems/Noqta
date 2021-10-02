package te.app.notta.activity;

import static te.app.notta.utils.VideoPlayerConfig.MAX_BUFFER_DURATION;
import static te.app.notta.utils.VideoPlayerConfig.MIN_BUFFER_DURATION;
import static te.app.notta.utils.VideoPlayerConfig.MIN_PLAYBACK_RESUME_BUFFER;
import static te.app.notta.utils.VideoPlayerConfig.MIN_PLAYBACK_START_BUFFER;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.databinding.DataBindingUtil;

import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.DefaultLoadControl;
import com.google.android.exoplayer2.ExoPlayer;
import com.google.android.exoplayer2.LoadControl;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.SimpleExoPlayer;
import com.google.android.exoplayer2.source.DefaultMediaSourceFactory;
import com.google.android.exoplayer2.source.MediaSourceFactory;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DefaultAllocator;
import com.google.android.exoplayer2.upstream.DefaultDataSourceFactory;
import com.google.android.exoplayer2.util.Util;

import te.app.notta.R;
import te.app.notta.databinding.ActivityExoPlayerBinding;


public class ExoPlayerActivity extends AppCompatActivity  {
    private static final String KEY_VIDEO_URI = "video_uri";
    private ActivityExoPlayerBinding exoPlayerBinding;
//    String videoUri="http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/ElephantsDream.mp4";
    String videoUri;
    SimpleExoPlayer player;
    Handler mHandler;
    Runnable mRunnable;

    public static Intent getStartIntent(Context context, String videoUri) {
        Intent intent = new Intent(context, ExoPlayerActivity.class);
        intent.putExtra(KEY_VIDEO_URI, videoUri);
        return intent;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        exoPlayerBinding = DataBindingUtil.setContentView(this, R.layout.activity_exo_player);
        AppCompatDelegate.setCompatVectorFromResourcesEnabled(true);
        if (getIntent().hasExtra(KEY_VIDEO_URI)) {
            videoUri = getIntent().getStringExtra(KEY_VIDEO_URI);
            Log.e("onCreate", "onCreate: "+videoUri );
        }
        setUp();
    }

    private void setUp() {
        initializePlayer();
        if (videoUri == null) {
            return;
        }
    }

    private void initializePlayer() {
        if (player == null) {
            DefaultAllocator allocator = new DefaultAllocator(true, C.DEFAULT_BUFFER_SEGMENT_SIZE);
            LoadControl loadControl = new DefaultLoadControl.Builder()
                    .setAllocator(new DefaultAllocator(true, 16))
                    .setBufferDurationsMs(MIN_BUFFER_DURATION,
                            MAX_BUFFER_DURATION,
                            MIN_PLAYBACK_START_BUFFER,
                            MIN_PLAYBACK_RESUME_BUFFER)
                    .setTargetBufferBytes(-1)
                    .setPrioritizeTimeOverSizeThresholds(true).createDefaultLoadControl();


            DataSource.Factory mediaDataSourceFactory = new DefaultDataSourceFactory(this, Util.getUserAgent(this, "mediaPlayerSample"));
            ProgressiveMediaSource mediaSource = new ProgressiveMediaSource.Factory(mediaDataSourceFactory).createMediaSource(MediaItem.fromUri(videoUri));
            MediaSourceFactory mediaSourceFactory = new DefaultMediaSourceFactory(mediaDataSourceFactory);

            player = new SimpleExoPlayer.Builder(this)
                    .setMediaSourceFactory(mediaSourceFactory)
                    .setLoadControl(loadControl)
                    .build();
            player.addMediaSource(mediaSource);
            player.prepare();
            exoPlayerBinding.videoFullScreenPlayer.setUseController(true);
            exoPlayerBinding.videoFullScreenPlayer.setPlayer(player);
            player.play();
            player.addListener(new Player.Listener() {
                @Override
                public void onPlaybackStateChanged(int state) {
                    if (state == ExoPlayer.STATE_BUFFERING){
                        exoPlayerBinding.spinnerVideoDetails.setVisibility(View.VISIBLE);
                    } else {
                        exoPlayerBinding.spinnerVideoDetails.setVisibility(View.GONE);
                    }
                }
            });
        }
    }

    private void releasePlayer() {
        if (player != null) {
            player.release();
            player = null;
        }
    }

    private void pausePlayer() {
        if (player != null) {
            player.setPlayWhenReady(false);
            player.getPlaybackState();
        }
    }

    private void resumePlayer() {
        if (player != null) {
            player.setPlayWhenReady(true);
            player.getPlaybackState();
        }
    }

    @Override
    protected void onPause() {
        super.onPause();
        pausePlayer();
        if (mRunnable != null) {
            mHandler.removeCallbacks(mRunnable);
        }
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        resumePlayer();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        releasePlayer();
    }
}