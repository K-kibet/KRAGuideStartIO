package com.filkra.kraguide;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.button.MaterialButton;
import com.startapp.sdk.adsbase.StartAppAd;

public class RegisterActivity extends AppCompatActivity {
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
            StartAppAd.showAd(RegisterActivity.this);
        });

        textViewLogin.setOnClickListener(view -> {
            Intent registerIntent = new Intent(RegisterActivity.this, LoginActivity.class);
            finish();
            startActivity(registerIntent);
            StartAppAd.showAd(RegisterActivity.this);
        });
    }
}