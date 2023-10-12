package com.filkra.kraguide;

import android.os.Bundle;
import android.widget.FrameLayout;

import androidx.appcompat.app.AppCompatActivity;

public class TenActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ten);
        FrameLayout nativeAdView = findViewById(R.id.nativeAdView);
        NativeController nativeController = new NativeController(TenActivity.this, nativeAdView);
        nativeController.createNativeAd();
    }
}