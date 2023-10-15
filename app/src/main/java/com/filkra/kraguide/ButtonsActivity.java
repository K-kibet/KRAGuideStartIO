package com.filkra.kraguide;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.button.MaterialButton;
import com.startapp.sdk.adsbase.StartAppAd;


public class ButtonsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buttons);

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
            StartAppAd.showAd(ButtonsActivity.this);
        });

        btnTwo.setOnClickListener(view -> {
            Intent intent = new Intent(ButtonsActivity.this, TwoActivity.class);
            startActivity(intent);
            StartAppAd.showAd(ButtonsActivity.this);
        });
        btnThree.setOnClickListener(view -> {
            Intent intent = new Intent(ButtonsActivity.this, ThreeActivity.class);
            startActivity(intent);
            StartAppAd.showAd(ButtonsActivity.this);
        });

        btnNine.setOnClickListener(view -> {
            Intent intent = new Intent(ButtonsActivity.this, NineActivity.class);
            startActivity(intent);
            StartAppAd.showAd(ButtonsActivity.this);
        });
        btnTen.setOnClickListener(view -> {
            Intent intent = new Intent(ButtonsActivity.this, TenActivity.class);
            startActivity(intent);
            StartAppAd.showAd(ButtonsActivity.this);
        });

        btnFour.setOnClickListener(view -> {
            Intent intent = new Intent(ButtonsActivity.this, FourActivity.class);
            startActivity(intent);
            StartAppAd.showAd(ButtonsActivity.this);
        });

        btnFive.setOnClickListener(view -> {
            Intent intent = new Intent(ButtonsActivity.this, FiveActivity.class);
            startActivity(intent);
            StartAppAd.showAd(ButtonsActivity.this);
        });

        btnSix.setOnClickListener(view -> {
            Intent intent = new Intent(ButtonsActivity.this, SixActivity.class);
            startActivity(intent);
            StartAppAd.showAd(ButtonsActivity.this);
        });

        btnSeven.setOnClickListener(view -> {
            Intent intent = new Intent(ButtonsActivity.this, SevenActivity.class);
            startActivity(intent);
            StartAppAd.showAd(ButtonsActivity.this);
        });

        btnEight.setOnClickListener(view -> {
            Intent intent = new Intent(ButtonsActivity.this, EightActivity.class);
            startActivity(intent);
            StartAppAd.showAd(ButtonsActivity.this);
        });
    }
}