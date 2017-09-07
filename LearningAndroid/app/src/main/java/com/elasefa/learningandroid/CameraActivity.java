package com.elasefa.learningandroid;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import java.io.IOException;
import java.io.InputStream;


public class CameraActivity extends Activity implements View.OnClickListener {
    ImageView ivReturnedPicture;
    ImageButton ibCapture;
    Button btnWallpaper;
    Intent intent;
    int cameraResult = 0;
    Bitmap bitmap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera);

        // declare variables
        ivReturnedPicture = (ImageView) findViewById(R.id.ivReturnedPicture);
        ibCapture = (ImageButton) findViewById(R.id.ibCapture);
        btnWallpaper = (Button) findViewById(R.id.btnWallpaper);

        // set click listners
        ibCapture.setOnClickListener(this);
        btnWallpaper.setOnClickListener(this);


    }


    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.ibCapture:
                    intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                    startActivityForResult(intent,cameraResult);
                break;

            case R.id.btnWallpaper:
                
                break;
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(resultCode == RESULT_OK){
            Bundle bundle = data.getExtras();
            bitmap = (Bitmap) bundle.get("data");
            ivReturnedPicture.setImageBitmap(bitmap);
        }

    }
}
