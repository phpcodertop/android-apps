package com.elasefa.dice;

import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import java.util.Random;


public class MainActivity extends Activity implements View.OnClickListener{
    Button rollBtn;
    ImageButton diceRight , diceLeft;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rollBtn = (Button) findViewById(R.id.rollBtn);
        diceRight = (ImageButton) findViewById(R.id.diceRight);
        diceLeft = (ImageButton) findViewById(R.id.diceLeft);

        // add listner to roll button
        rollBtn.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        int id = v.getId();
        int[] diceArray = {
                R.drawable.dice1,
                R.drawable.dice2,
                R.drawable.dice3,
                R.drawable.dice4,
                R.drawable.dice5,
                R.drawable.dice6,
        } ;
        switch (id){
            case R.id.rollBtn:
                Random random = new Random();
                int numberOne = random.nextInt(6);
                int numberTwo = random.nextInt(6);
                diceLeft.setBackgroundResource(diceArray[numberOne]);
                diceRight.setBackgroundResource(diceArray[numberTwo]);
                break;
        }
    }
}
