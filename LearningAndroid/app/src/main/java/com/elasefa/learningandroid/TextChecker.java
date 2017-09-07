package com.elasefa.learningandroid;

import android.app.Activity;
import android.graphics.Color;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.text.InputType;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.ToggleButton;

import java.util.Arrays;
import java.util.Random;


public class TextChecker extends Activity implements View.OnClickListener{
    // declare all fields
    EditText etInput;
    Button btnCheck;
    ToggleButton toggleButton;
    TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_checker);
        // declare variables
        etInput = (EditText) findViewById(R.id.etInput);
        btnCheck = (Button) findViewById(R.id.btnCheck);
        toggleButton = (ToggleButton) findViewById(R.id.toggleButton);
        tvResult = (TextView) findViewById(R.id.tvResult);
        toggleButton.setOnClickListener(this);
        btnCheck.setOnClickListener(this);

    }


    @Override
    public void onClick(View view) {
        switch(view.getId()){
            // set click listner for toggle button
            case R.id.toggleButton:
                if(toggleButton.isChecked()){
                    etInput.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);
                }else{
                    etInput.setInputType(InputType.TYPE_CLASS_TEXT);
                }
                break;

            // check user inputs
            case R.id.btnCheck:
                String inputVal = btnCheck.getText().toString();
                tvResult.setText("Valid");
                String validValues[] = {"good","nice","wonderful"};
                if(Arrays.asList(validValues).contains(etInput.getText().toString())){
                    tvResult.setText("Valid");
                }else {
                    tvResult.setText("InValid");
                }

                // random position and random color
                Random random = new Random();
                tvResult.setTextColor(Color.rgb(random.nextInt(255),random.nextInt(255),random.nextInt(255)));
                tvResult.setTextSize(random.nextInt(75));
                break;
        }
    }
}
