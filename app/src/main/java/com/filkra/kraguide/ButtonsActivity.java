package com.filkra.kraguide;

import android.content.Intent;
import android.os.Bundle;
import android.widget.FrameLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.applovin.mediation.ads.MaxAdView;
import com.applovin.mediation.ads.MaxInterstitialAd;
import com.google.android.material.button.MaterialButton;


public class ButtonsActivity extends AppCompatActivity {
    private MaxInterstitialAd mediationInterstitialAd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buttons);

        FrameLayout nativeAdView = findViewById(R.id.nativeAdView);
        NativeController nativeController = new NativeController(ButtonsActivity.this, nativeAdView);
        nativeController.createNativeAd();

        MaxAdView adView = findViewById(R.id.adView);
        adView.loadAd();
        adView.startAutoRefresh();

        mediationInterstitialAd = new MaxInterstitialAd(getResources().getString(R.string.Interstitial_Ad_Unit), ButtonsActivity.this);
        mediationInterstitialAd.loadAd();

        MaterialButton btnOne = findViewById(R.id.btnOne);
        MaterialButton btnTwo = findViewById(R.id.btnTwo);
        MaterialButton btnThree = findViewById(R.id.btnThree);
        MaterialButton btnFour = findViewById(R.id.btnFour);
        MaterialButton btnFive = findViewById(R.id.btnFive);
        MaterialButton btnSix = findViewById(R.id.btnSix);
        MaterialButton btnSeven = findViewById(R.id.btnSeven);
        MaterialButton btnEight = findViewById(R.id.btnEight);
        MaterialButton btnNine = findViewById(R.id.btnNine);
        MaterialButton btnTen = findViewById(R.id.btnTen);

        btnOne.setOnClickListener(view -> {
            Intent intent = new Intent(ButtonsActivity.this, OneActivity.class);
            startActivity(intent);
            showMediationInterstitialAd();
        });

        btnTwo.setOnClickListener(view -> {
            Intent intent = new Intent(ButtonsActivity.this, TwoActivity.class);
            startActivity(intent);
            showMediationInterstitialAd();
        });
        btnThree.setOnClickListener(view -> {
            Intent intent = new Intent(ButtonsActivity.this, ThreeActivity.class);
            startActivity(intent);
            showMediationInterstitialAd();
        });

        btnNine.setOnClickListener(view -> {
            Intent intent = new Intent(ButtonsActivity.this, NineActivity.class);
            startActivity(intent);
            showMediationInterstitialAd();
        });
        btnTen.setOnClickListener(view -> {
            Intent intent = new Intent(ButtonsActivity.this, TenActivity.class);
            startActivity(intent);
            showMediationInterstitialAd();
        });

        btnFour.setOnClickListener(view -> {
            Intent intent = new Intent(ButtonsActivity.this, FourActivity.class);
            startActivity(intent);
            showMediationInterstitialAd();
        });

        btnFive.setOnClickListener(view -> {
            Intent intent = new Intent(ButtonsActivity.this, FiveActivity.class);
            startActivity(intent);
            showMediationInterstitialAd();
        });

        btnSix.setOnClickListener(view -> {
            Intent intent = new Intent(ButtonsActivity.this, SixActivity.class);
            startActivity(intent);
            showMediationInterstitialAd();
        });

        btnSeven.setOnClickListener(view -> {
            Intent intent = new Intent(ButtonsActivity.this, SevenActivity.class);
            startActivity(intent);
            showMediationInterstitialAd();
        });

        btnEight.setOnClickListener(view -> {
            Intent intent = new Intent(ButtonsActivity.this, EightActivity.class);
            startActivity(intent);
            showMediationInterstitialAd();
        });
    }

    private void showMediationInterstitialAd() {
        if (mediationInterstitialAd.isReady()) {
            mediationInterstitialAd.showAd();
        }
    }
}