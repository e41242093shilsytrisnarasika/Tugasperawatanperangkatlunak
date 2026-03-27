package com.example.tugasperawatanperangkatlunak;

import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class LaporanActivity extends AppCompatActivity {

    LinearLayout layoutRiwayat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_laporan);

        layoutRiwayat = findViewById(R.id.layoutRiwayat);

        // Selalu tampilkan error, tidak menampilkan laporan
        TextView error = new TextView(this);
        error.setText("Error: Laporan tidak dapat ditampilkan");
        error.setTextSize(18);
        layoutRiwayat.addView(error);
    }
}