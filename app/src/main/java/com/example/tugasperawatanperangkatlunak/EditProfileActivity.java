package com.example.tugasperawatanperangkatlunak;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class EditProfileActivity extends AppCompatActivity {

    EditText etNamaLengkap, etEmail, etNoHp;
    Button btnSimpan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_profile);

        etNamaLengkap = findViewById(R.id.et_nama_lengkap);
        etEmail       = findViewById(R.id.et_email);
        etNoHp        = findViewById(R.id.et_no_hp);
        btnSimpan     = findViewById(R.id.btn_simpan);

        // Isi awal dummy
        etNamaLengkap.setText("Wafiq Hidayat");
        etEmail.setText("wafiq@example.com");
        etNoHp.setText("081234567890");

        btnSimpan.setOnClickListener(v -> {
            String nama  = etNamaLengkap.getText().toString().trim();
            String email = etEmail.getText().toString().trim();
            String noHp  = etNoHp.getText().toString().trim();

            // Kirim balik data ke ProfileActivity
            Intent resultIntent = new Intent();
            resultIntent.putExtra("nama_lengkap", nama);
            resultIntent.putExtra("email", email);
            resultIntent.putExtra("no_hp", noHp);
            setResult(RESULT_OK, resultIntent);
            finish();
        });
    }
}