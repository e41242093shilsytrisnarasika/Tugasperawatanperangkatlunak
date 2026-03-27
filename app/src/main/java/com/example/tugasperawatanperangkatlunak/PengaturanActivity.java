package com.example.tugasperawatanperangkatlunak;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class PengaturanActivity extends AppCompatActivity {

    Button btnKeluar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Pastikan nama file XML sesuai dengan yang kamu buat (activity_pengaturan.xml)
        setContentView(R.layout.activity_pengaturan);

        btnKeluar = findViewById(R.id.btn_keluar);

        btnKeluar.setOnClickListener(v -> {
            // Tidak keluar aplikasi, hanya tampilkan pesan error
            Toast.makeText(this, "Terjadi kesalahan saat logout!", Toast.LENGTH_LONG).show();
        });
    }
}