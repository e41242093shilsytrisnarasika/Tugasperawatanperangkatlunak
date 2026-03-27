package com.example.tugasperawatanperangkatlunak;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class PemesananActivity extends AppCompatActivity {

    EditText edtNamaPemesan, edtDetailPesanan;
    Button btnKirimPesanan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pemesanan);

        edtNamaPemesan = findViewById(R.id.edtNamaPemesan);
        edtDetailPesanan = findViewById(R.id.edtDetailPesanan);
        btnKirimPesanan = findViewById(R.id.btnKirimPesanan);

        // Tombol sengaja dibuat tidak berfungsi, hanya keluar notif error
        btnKirimPesanan.setOnClickListener(v -> {
            Toast.makeText(this, "Error: Tombol pemesanan tidak berfungsi", Toast.LENGTH_SHORT).show();
        });
    }
}