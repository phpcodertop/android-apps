package com.elasefa.learningandroid;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class splash extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        // add sound effect to startup
        final MediaPlayer mediaPlayer = MediaPlayer.create(splash.this, R.raw.splash);
        mediaPlayer.start();
        // create thread timer to wait 5 seconds
        Thread timer = new Thread(){
            public void run(){
                try {
                    sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }finally {
                    Intent openMainActivity = new Intent(splash.this,AppMenu.class);
                    startActivity(openMainActivity);
                    mediaPlayer.stop();
                    finish();
                }
            }
        };
        timer.start();


    }


}
