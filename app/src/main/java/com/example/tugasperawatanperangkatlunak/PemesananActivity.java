package com.example.tugasperawatanperangkatlunak;

import android.content.SharedPreferences;
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

        btnKirimPesanan.setOnClickListener(v -> {
            String nama = edtNamaPemesan.getText().toString().trim();
            String detail = edtDetailPesanan.getText().toString().trim();

            if (nama.isEmpty() || detail.isEmpty()) {
                Toast.makeText(this, "Isi semua data dulu", Toast.LENGTH_SHORT).show();
                return;
            }

            String dataBaru = nama + " - " + detail;

            SharedPreferences sharedPreferences = getSharedPreferences("DataPemesanan", MODE_PRIVATE);
            String dataLama = sharedPreferences.getString("riwayat", "");

            String dataGabung;
            if (dataLama.isEmpty()) {
                dataGabung = dataBaru;
            } else {
                dataGabung = dataBaru + "##" + dataLama;
            }

            SharedPreferences.Editor editor = sharedPreferences.edit();
            editor.putString("riwayat", dataGabung);
            editor.apply();

            Toast.makeText(this, "Pesanan berhasil disimpan", Toast.LENGTH_SHORT).show();

            edtNamaPemesan.setText("");
            edtDetailPesanan.setText("");
        });
    }
}