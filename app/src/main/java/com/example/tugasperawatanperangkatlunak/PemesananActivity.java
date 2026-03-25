package com.example.tugasperawatanperangkatlunak;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class PemesananActivity extends AppCompatActivity {

    EditText etNama, etDetail;
    Button btnKirim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pemesanan);

        etNama = findViewById(R.id.etNamaPemesan);
        etDetail = findViewById(R.id.etDetailPesanan);
        btnKirim = findViewById(R.id.btnKirimPesanan);

        btnKirim.setOnClickListener(v -> {
            String nama = etNama.getText().toString();
            String detail = etDetail.getText().toString();

            if (!nama.isEmpty() && !detail.isEmpty()) {
                // Di sini kamu bisa menambahkan logika simpan ke database nanti
                Toast.makeText(this, "Pesanan " + nama + " Berhasil Dikirim!", Toast.LENGTH_LONG).show();
                finish(); // Kembali ke Dashboard
            } else {
                Toast.makeText(this, "Harap isi semua kolom", Toast.LENGTH_SHORT).show();
            }
        });
    }
}