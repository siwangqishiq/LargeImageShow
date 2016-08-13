package com.xinlan.largeimageshow;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.xinlan.widget.ImageSource;
import com.xinlan.widget.SubsamplingScaleImageView;

public class MainActivity extends AppCompatActivity {
    private SubsamplingScaleImageView mScaleView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mScaleView = (SubsamplingScaleImageView) findViewById(R.id.scale_view);

        mScaleView.setImage(ImageSource.asset("pic1.jpg"));
    }
}//end class
