package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class HomeActivity extends AppCompatActivity {

    LinearLayout Burjo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);

        LinearLayout burjoLinearLayout = findViewById(R.id.Burjo);
        burjoLinearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Kode yang akan dijalankan saat LinearLayout diklik
                Intent intent = new Intent(HomeActivity.this, DaftarBurjoActivity.class);
                startActivity(intent);
            }
        });

    }
}