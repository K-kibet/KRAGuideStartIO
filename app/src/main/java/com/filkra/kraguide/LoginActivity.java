package com.filkra.kraguide;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.button.MaterialButton;
import com.startapp.sdk.adsbase.StartAppAd;

public class LoginActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        MaterialButton btnLogin = findViewById(R.id.btnLogin);
        TextView textViewRegister = findViewById(R.id.textViewRegister);

        StartAppAd startAppAd = new StartAppAd(LoginActivity.this);

        startAppAd.loadAd(StartAppAd.AdMode.REWARDED_VIDEO);

        btnLogin.setOnClickListener(view -> {
            Intent buttonsIntent = new Intent(LoginActivity.this, ButtonsActivity.class);
            startActivity(buttonsIntent);
            finish();
            startAppAd.showAd();
        });

        textViewRegister.setOnClickListener(view -> {
            Intent registerIntent = new Intent(LoginActivity.this, RegisterActivity.class);
            startActivity(registerIntent);
            //StartAppAd.showAd(LoginActivity.this);
            startAppAd.showAd();
        });
    }
}