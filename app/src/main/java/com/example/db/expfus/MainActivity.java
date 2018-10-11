package com.example.db.expfus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.SurfaceView;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import org.opencv.android.BaseLoaderCallback;
import org.opencv.android.CameraBridgeViewBase;
import org.opencv.android.JavaCameraView;
import org.opencv.android.OpenCVLoader;
import org.opencv.core.Core;
import org.opencv.core.CvType;
import org.opencv.core.Mat;
import org.opencv.imgproc.Imgproc;

public class MainActivity extends AppCompatActivity /*implements CameraBridgeViewBase.CvCameraViewListener2*/ {


    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(OpenCVLoader.initDebug())
        {
            Toast.makeText(getApplicationContext(),"OpenCV loaded successfully",Toast.LENGTH_SHORT).show();
        }
        else
        {
            Toast.makeText(getApplicationContext(),"Could not load OpenCV",Toast.LENGTH_SHORT).show();
        }

        imageView = (ImageView) findViewById(R.id.imgHdr);
    }

    public void doHdrImaging(View view) {
        Intent hdrAct = new Intent(this, HDRImagingActivity.class);
        startActivity(hdrAct);
    }
}
