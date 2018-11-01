package hamedshahidi.greenzone;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class SplashActivity extends AppCompatActivity {

    private static int SPLASH_TIME_OUT = 3000;
    MediaPlayer splashSound = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        splashSound = MediaPlayer.create(this,R.raw.splash_sound);
        splashSound.start();



        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent startMainAct = new Intent(SplashActivity.this, MainActivity.class);
                startActivity(startMainAct);
                overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
                SplashActivity.this.finish();
            }
        },SPLASH_TIME_OUT);

    }
}
