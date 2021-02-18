package com.yuzumin.guranoises;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.VideoView;

public class Splash extends AppCompatActivity {

    VideoView Splash;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        getSupportActionBar().hide();

        Splash=findViewById(R.id.SplashVideo);

        Uri video= Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.splashscreen);
        Splash.setVideoURI(video);

        Splash.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                finish();
                startActivity(new Intent(Splash.this,MainActivity.class));
            }
        });

        Splash.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                finish();
                startActivity(new Intent(Splash.this,MainActivity.class));
                return false;
            }
        });


        Splash.start();

    }
}