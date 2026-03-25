package com.example.tugasperawatanperangkatlunak;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ProfileActivityy extends AppCompatActivity {

    TextView tvUsername;
    EditText etNamaLengkap, etEmail, etNoHp;
    Button btnSimpan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        tvUsername    = findViewById(R.id.tv_username);
        etNamaLengkap = findViewById(R.id.et_nama_lengkap);
        etEmail       = findViewById(R.id.et_email);
        etNoHp        = findViewById(R.id.et_no_hp);
        btnSimpan     = findViewById(R.id.btn_simpan);

        SharedPreferences prefs = getSharedPreferences("LoginPrefs", MODE_PRIVATE);
        String username = prefs.getString("username", "admin");
        tvUsername.setText("Username: " + username);

        // Muat data profil yang sudah tersimpan
        etNamaLengkap.setText(prefs.getString("nama_lengkap", ""));
        etEmail.setText(prefs.getString("email", ""));
        etNoHp.setText(prefs.getString("no_hp", ""));

        btnSimpan.setOnClickListener(v -> {
            String nama  = etNamaLengkap.getText().toString().trim();
            String email = etEmail.getText().toString().trim();
            String noHp  = etNoHp.getText().toString().trim();

            prefs.edit()
                    .putString("nama_lengkap", nama)
                    .putString("email", email)
                    .putString("no_hp", noHp)
                    .apply();

            Toast.makeText(this, "Profil berhasil disimpan", Toast.LENGTH_SHORT).show();
        });
    }
}
