package com.example.tugasperawatanperangkatlunak;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ProfileActivity extends AppCompatActivity {

    TextView tvUsername, tvNamaLengkap, tvEmail, tvNoHp;
    Button btnEdit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        tvUsername    = findViewById(R.id.tv_username);
        tvNamaLengkap = findViewById(R.id.tv_nama_lengkap);
        tvEmail       = findViewById(R.id.tv_email);
        tvNoHp        = findViewById(R.id.tv_no_hp);
        btnEdit       = findViewById(R.id.btn_edit);

        // Data awal dummy cokkkkkkkk
        tvUsername.setText("Username: admin123");
        tvNamaLengkap.setText("Nama Lengkap: Wafiq Hidayat");
        tvEmail.setText("Email: wafiq@example.com");
        tvNoHp.setText("No HP: 081234567890");

        // Tombol edit: sengaja tidak melakukan apa-apa
        btnEdit.setOnClickListener(v -> {
            // Kosong, tidak ada aksi
        });
    }
}