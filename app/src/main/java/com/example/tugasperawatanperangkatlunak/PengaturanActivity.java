package com.example.tugasperawatanperangkatlunak;

import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class PengaturanActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pengaturan);   // Pastikan ini tidak merah

        Button btnKeluar = findViewById(R.id.btn_keluar);
        TextView tvVersion = findViewById(R.id.tv_version);

        // Tampilkan versi
        try {
            PackageInfo pInfo = getPackageManager().getPackageInfo(getPackageName(), 0);
            tvVersion.setText("Versi: " + pInfo.versionName);
        } catch (Exception e) {
            tvVersion.setText("Versi: 1.0");
        }

        btnKeluar.setOnClickListener(v -> {
            SharedPreferences prefs = getSharedPreferences("LoginPrefs", MODE_PRIVATE);
            prefs.edit().clear().apply();

            Toast.makeText(this, "Berhasil keluar", Toast.LENGTH_LONG).show();

            Intent intent = new Intent(PengaturanActivity.this, LoginActivity.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
            startActivity(intent);
            finishAffinity();
        });
    }
}