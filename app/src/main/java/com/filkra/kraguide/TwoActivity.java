package com.filkra.kraguide;

import android.os.Bundle;
import android.widget.FrameLayout;

import androidx.appcompat.app.AppCompatActivity;

public class TwoActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);
        FrameLayout nativeAdView = findViewById(R.id.nativeAdView);
        NativeController nativeController = new NativeController(TwoActivity.this, nativeAdView);
        nativeController.createNativeAd();
    }
}