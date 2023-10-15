package com.filkra.kraguide;

import android.content.Intent;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.button.MaterialButton;
import com.startapp.sdk.adsbase.StartAppAd;

public class TermsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terms);

        CheckBox checkBox = findViewById(R.id.checkBox);
        MaterialButton btnContinue = findViewById(R.id.btnContinue);

        btnContinue.setOnClickListener(view -> {
            if(!checkBox.isChecked()) {
                Toast.makeText(TermsActivity.this, "Accept the terms to continue", Toast.LENGTH_SHORT).show();
                StartAppAd.showAd(TermsActivity.this);
            } else {
                Intent intent = new Intent(TermsActivity.this, RegisterActivity.class);
                startActivity(intent);
                StartAppAd.showAd(TermsActivity.this);
            }
        });
    }
}