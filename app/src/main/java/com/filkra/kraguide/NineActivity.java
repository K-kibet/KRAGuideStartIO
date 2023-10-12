package com.filkra.kraguide;

import android.os.Bundle;
import android.widget.FrameLayout;

import androidx.appcompat.app.AppCompatActivity;

public class NineActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nine);
        FrameLayout nativeAdView = findViewById(R.id.nativeAdView);
        NativeController nativeController = new NativeController(NineActivity.this, nativeAdView);
        nativeController.createNativeAd();
    }
}