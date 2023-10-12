package com.filkra.kraguide;

import android.os.Bundle;
import android.widget.FrameLayout;

import androidx.appcompat.app.AppCompatActivity;

public class ThreeActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three);
        FrameLayout nativeAdView = findViewById(R.id.nativeAdView);
        NativeController nativeController = new NativeController(ThreeActivity.this, nativeAdView);
        nativeController.createNativeAd();
    }
}