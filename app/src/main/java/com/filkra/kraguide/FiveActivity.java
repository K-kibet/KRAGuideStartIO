package com.filkra.kraguide;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.applovin.mediation.ads.MaxAdView;

public class FiveActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_five);

        MaxAdView adView = findViewById(R.id.adView);
        adView.loadAd();
        adView.startAutoRefresh();
    }
}