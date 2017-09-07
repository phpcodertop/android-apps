package com.elasefa.piano;

import android.app.Activity;
import android.media.AudioManager;
import android.media.SoundPool;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class MainActivity extends Activity  implements View.OnClickListener{

    // Helpful Constants
    private final int NR_OF_SIMULTANEOUS_SOUNDS = 7;
    private final float LEFT_VOLUME = 1.0f;
    private final float RIGHT_VOLUME = 1.0f;
    private final int NO_LOOP = 0;
    private final int PRIORITY = 0;
    private final float NORMAL_PLAY_RATE = 1.0f;

    // TODO: Add member variables here
    private int mCSoundId;
    private int mDSoundId;
    private int mESoundId;
    private int mFSoundId;
    private int mGSoundId;
    private int mASoundId;
    private int mBSoundId;

    private SoundPool mSoundPool;

    public Button c_key,d_key,e_key,f_key,g_key,a_key,b_key;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // TODO: Create a new SoundPool
        mSoundPool = new SoundPool(NR_OF_SIMULTANEOUS_SOUNDS, AudioManager.STREAM_MUSIC,0);

        // TODO: Load and get the IDs to identify the sounds
        mCSoundId = mSoundPool.load(getApplicationContext(),R.raw.note1_c,1);
        mDSoundId = mSoundPool.load(getApplicationContext(),R.raw.note2_d,1);
        mESoundId = mSoundPool.load(getApplicationContext(),R.raw.note3_e,1);
        mFSoundId = mSoundPool.load(getApplicationContext(),R.raw.note4_f,1);
        mGSoundId = mSoundPool.load(getApplicationContext(),R.raw.note5_g,1);
        mASoundId = mSoundPool.load(getApplicationContext(),R.raw.note6_a,1);
        mBSoundId = mSoundPool.load(getApplicationContext(),R.raw.note7_b,1);

        // TODO: define buttons
        c_key = (Button) findViewById(R.id.c_key);
        c_key.setOnClickListener(this);
        d_key = (Button) findViewById(R.id.d_key);
        d_key.setOnClickListener(this);
        e_key = (Button) findViewById(R.id.e_key);
        e_key.setOnClickListener(this);
        f_key = (Button) findViewById(R.id.f_key);
        f_key.setOnClickListener(this);
        g_key = (Button) findViewById(R.id.g_key);
        g_key.setOnClickListener(this);
        a_key = (Button) findViewById(R.id.a_key);
        a_key.setOnClickListener(this);
        b_key = (Button) findViewById(R.id.b_key);
        b_key.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.c_key:
                mSoundPool.play(mCSoundId, LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
                break;
            case R.id.d_key:
                mSoundPool.play(mDSoundId,LEFT_VOLUME,RIGHT_VOLUME,PRIORITY,NO_LOOP,NORMAL_PLAY_RATE);
                break;
            case R.id.e_key:
                mSoundPool.play(mESoundId,LEFT_VOLUME,RIGHT_VOLUME,PRIORITY,NO_LOOP,NORMAL_PLAY_RATE);
                break;
            case R.id.f_key:
                mSoundPool.play(mFSoundId,LEFT_VOLUME,RIGHT_VOLUME,PRIORITY,NO_LOOP,NORMAL_PLAY_RATE);
                break;
            case R.id.g_key:
                mSoundPool.play(mGSoundId,LEFT_VOLUME,RIGHT_VOLUME,PRIORITY,NO_LOOP,NORMAL_PLAY_RATE);
                break;
            case R.id.a_key:
                mSoundPool.play(mASoundId,LEFT_VOLUME,RIGHT_VOLUME,PRIORITY,NO_LOOP,NORMAL_PLAY_RATE);
                break;
            case R.id.b_key:
                mSoundPool.play(mBSoundId,LEFT_VOLUME,RIGHT_VOLUME,PRIORITY,NO_LOOP,NORMAL_PLAY_RATE);
                break;
        }
    }

    // TODO: Add the play methods triggered by the buttons


}
