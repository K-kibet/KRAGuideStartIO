package com.filkra.kraguide;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.button.MaterialButton;
import com.onesignal.OneSignal;
import com.startapp.sdk.adsbase.AutoInterstitialPreferences;
import com.startapp.sdk.adsbase.StartAppAd;
import com.startapp.sdk.adsbase.StartAppSDK;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MaterialButton btnShare = findViewById(R.id.btnShare);
        MaterialButton btnStart = findViewById(R.id.btnStart);
        MaterialButton btnRate = findViewById(R.id.btnRate);
        MaterialButton btnAbout = findViewById(R.id.btnAbout);


        StartAppSDK.setUserConsent (this,
                "pas",
                System.currentTimeMillis(),
                true);

        StartAppSDK.init(this, "StartApp App ID", false);

        OneSignal.setLogLevel(OneSignal.LOG_LEVEL.VERBOSE, OneSignal.LOG_LEVEL.NONE);

        // OneSignal Initialization
        OneSignal.initWithContext(this);
        OneSignal.setAppId("bbdeb88c-4d49-4ed1-9d49-44ce7050e921");

        btnShare.setOnClickListener(view -> shareApp());
        btnRate.setOnClickListener(view -> {
            try {
                startActivity(new Intent(Intent.ACTION_VIEW,
                        Uri.parse("market://details?id=" + MainActivity.this.getPackageName())));
            } catch (android.content.ActivityNotFoundException e) {
                startActivity(new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://play.google.com/store/apps/details?id=" + MainActivity.this.getPackageName())));
            }
        });

        btnStart.setOnClickListener(view -> {
            Intent dealsIntent = new Intent(MainActivity.this, TermsActivity.class);
            startActivity(dealsIntent);
            StartAppAd.showAd(MainActivity.this);
        });

        btnAbout.setOnClickListener(view -> {
            Intent aboutIntent = new Intent(MainActivity.this, OneActivity.class);
            startActivity(aboutIntent);
            StartAppAd.showAd(MainActivity.this);
        });


        StartAppAd.setAutoInterstitialPreferences(
                new AutoInterstitialPreferences()
                        .setSecondsBetweenAds(60)
        );

        StartAppAd.setAutoInterstitialPreferences(
                new AutoInterstitialPreferences()
                        .setActivitiesBetweenAds(1)
        );
    }
    private void shareApp() {
        Intent sendIntent = new Intent();
        sendIntent.setAction(Intent.ACTION_SEND);
        sendIntent.putExtra(Intent.EXTRA_SUBJECT, "B_Divine Loans");
        String shareMessage= "\nLet me recommend you this application\n\n";
        shareMessage = shareMessage + "https://play.google.com/store/apps/details?id=" + this.getPackageName() +"\n\n";
        sendIntent.putExtra(Intent.EXTRA_TEXT, shareMessage);
        sendIntent.setType("text/plain");
        Intent shareIntent = Intent.createChooser(sendIntent, null);
        startActivity(shareIntent);
    }
}