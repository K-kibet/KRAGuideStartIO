package com.filkra.kraguide;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.applovin.mediation.ads.MaxAdView;
import com.applovin.mediation.ads.MaxInterstitialAd;
import com.google.android.material.button.MaterialButton;

public class LoginActivity extends AppCompatActivity {
    private MaxInterstitialAd mediationInterstitialAd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        MaterialButton btnLogin = findViewById(R.id.btnLogin);
        TextView textViewRegister = findViewById(R.id.textViewRegister);

        btnLogin.setOnClickListener(view -> {
            Intent buttonsIntent = new Intent(LoginActivity.this, ButtonsActivity.class);
            startActivity(buttonsIntent);
            finish();
            showMediationInterstitialAd();
        });

        textViewRegister.setOnClickListener(view -> {
            Intent registerIntent = new Intent(LoginActivity.this, RegisterActivity.class);
            startActivity(registerIntent);
            showMediationInterstitialAd();
        });

        MaxAdView adView = findViewById(R.id.adView);
        adView.loadAd();
        adView.startAutoRefresh();

        mediationInterstitialAd = new MaxInterstitialAd(getResources().getString(R.string.Interstitial_Ad_Unit), LoginActivity.this);
        mediationInterstitialAd.loadAd();
    }

    private void showMediationInterstitialAd() {
        if (mediationInterstitialAd.isReady()) {
            mediationInterstitialAd.showAd();
        }
    }
}