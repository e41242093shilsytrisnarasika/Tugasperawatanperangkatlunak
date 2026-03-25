package com.example.tugasperawatanperangkatlunak;

import android.content.SharedPreferences;
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

        SharedPreferences sharedPreferences = getSharedPreferences("DataPemesanan", MODE_PRIVATE);
        String dataRiwayat = sharedPreferences.getString("riwayat", "");

        if (dataRiwayat.isEmpty()) {
            TextView kosong = new TextView(this);
            kosong.setText("Belum ada data pemesanan");
            kosong.setTextSize(18);
            layoutRiwayat.addView(kosong);
        } else {
            String[] daftarPesanan = dataRiwayat.split("##");

            for (String pesanan : daftarPesanan) {
                TextView item = new TextView(this);
                item.setText(pesanan);
                item.setTextSize(18);
                item.setPadding(24, 24, 24, 24);
                item.setBackgroundColor(android.graphics.Color.parseColor("#DDDDDD"));

                LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                        LinearLayout.LayoutParams.MATCH_PARENT,
                        LinearLayout.LayoutParams.WRAP_CONTENT
                );
                params.setMargins(0, 0, 0, 16);
                item.setLayoutParams(params);

                layoutRiwayat.addView(item);
            }
        }
    }
}