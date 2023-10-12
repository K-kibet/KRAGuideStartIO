package com.filkra.kraguide;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.applovin.mediation.ads.MaxAdView;
import com.applovin.mediation.ads.MaxInterstitialAd;
import com.google.android.material.button.MaterialButton;

public class RegisterActivity extends AppCompatActivity {
    private MaxInterstitialAd mediationInterstitialAd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);


        MaterialButton btnRegister = findViewById(R.id.btnRegister);
        TextView textViewLogin = findViewById(R.id.textViewLogin);

        btnRegister.setOnClickListener(view -> {
            Intent loginIntent = new Intent(RegisterActivity.this, LoginActivity.class);
            finish();
            startActivity(loginIntent);
            showMediationInterstitialAd();
        });

        textViewLogin.setOnClickListener(view -> {
            Intent registerIntent = new Intent(RegisterActivity.this, LoginActivity.class);
            finish();
            startActivity(registerIntent);
            showMediationInterstitialAd();
        });
        MaxAdView adView = findViewById(R.id.adView);
        adView.loadAd();
        adView.startAutoRefresh();

        mediationInterstitialAd = new MaxInterstitialAd(getResources().getString(R.string.Interstitial_Ad_Unit), RegisterActivity.this);
        mediationInterstitialAd.loadAd();

    }

    private void showMediationInterstitialAd() {
        if (mediationInterstitialAd.isReady()) {
            mediationInterstitialAd.showAd();
        }
    }
}