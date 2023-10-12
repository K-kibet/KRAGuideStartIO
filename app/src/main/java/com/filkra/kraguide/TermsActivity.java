package com.filkra.kraguide;

import android.content.Intent;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.applovin.mediation.ads.MaxInterstitialAd;
import com.google.android.material.button.MaterialButton;

public class TermsActivity extends AppCompatActivity {
    private MaxInterstitialAd mediationInterstitialAd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terms);

        CheckBox checkBox = findViewById(R.id.checkBox);
        MaterialButton btnContinue = findViewById(R.id.btnContinue);
        FrameLayout nativeAdView = findViewById(R.id.nativeAdView);
        NativeController nativeController = new NativeController(TermsActivity.this, nativeAdView);
        nativeController.createNativeAd();

        btnContinue.setOnClickListener(view -> {
            if(!checkBox.isChecked()) {
                Toast.makeText(TermsActivity.this, "Accept the terms to continue", Toast.LENGTH_SHORT).show();
                showMediationInterstitialAd();
            } else {
                Intent intent = new Intent(TermsActivity.this, RegisterActivity.class);
                startActivity(intent);
                showMediationInterstitialAd();
            }
        });

        mediationInterstitialAd = new MaxInterstitialAd(getResources().getString(R.string.Interstitial_Ad_Unit), TermsActivity.this);
        mediationInterstitialAd.loadAd();
    }

    private void showMediationInterstitialAd() {
        if (mediationInterstitialAd.isReady()) {
            mediationInterstitialAd.showAd();
        }
    }
}