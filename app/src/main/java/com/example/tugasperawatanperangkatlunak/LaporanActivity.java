package com.example.tugasperawatanperangkatlunak;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class LaporanActivity extends AppCompatActivity {

    Button btnLaporanHarian, btnLaporanBulanan, btnLaporanTahunan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_laporan);

        btnLaporanHarian = findViewById(R.id.btnLaporanHarian);
        btnLaporanBulanan = findViewById(R.id.btnLaporanBulanan);
        btnLaporanTahunan = findViewById(R.id.btnLaporanTahunan);

        btnLaporanHarian.setOnClickListener(v -> {
            Toast.makeText(this, "Laporan Harian diklik", Toast.LENGTH_SHORT).show();
        });

        btnLaporanBulanan.setOnClickListener(v -> {
            Toast.makeText(this, "Laporan Bulanan diklik", Toast.LENGTH_SHORT).show();
        });

        btnLaporanTahunan.setOnClickListener(v -> {
            Toast.makeText(this, "Laporan Tahunan diklik", Toast.LENGTH_SHORT).show();
        });
    }
}