package com.example.tugasperawatanperangkatlunak;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;

import com.google.android.material.navigation.NavigationView;

public class DashboardActivity extends AppCompatActivity {

    DrawerLayout drawerLayout;
    NavigationView navigationView;
    ActionBarDrawerToggle toggle;

    Button btnDashboard, btnLaporan, btnPemesanan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        drawerLayout = findViewById(R.id.drawerLayout);
        navigationView = findViewById(R.id.navigationView);

        btnDashboard = findViewById(R.id.btnDashboard);
        btnLaporan = findViewById(R.id.btnLaporan);
        btnPemesanan = findViewById(R.id.btnPemesanan);

        // Ambil Toolbar dari layout
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // Setup drawer toggle dengan Toolbar
        toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.app_name, R.string.app_name);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        // Sidebar menu click
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.nav_profile) {
            Toast.makeText(DashboardActivity.this, "Profile dipilih", Toast.LENGTH_SHORT).show();
        } else if (id == R.id.nav_settings) {
            android.content.Intent intent =
                    new android.content.Intent(DashboardActivity.this, PengaturanActivity.class);
            startActivity(intent);
        }

        drawerLayout.closeDrawers();
        return true;
    }
});

        // Fitur tombol kosongan
        btnDashboard.setOnClickListener(v ->
                Toast.makeText(this, "Fitur Dashboard", Toast.LENGTH_SHORT).show());

        btnLaporan.setOnClickListener(v -> {
            android.content.Intent intent =
                    new android.content.Intent(DashboardActivity.this, LaporanActivity.class);
            startActivity(intent);
        });

        btnPemesanan.setOnClickListener(v -> {
            android.content.Intent intent =
                    new android.content.Intent(DashboardActivity.this, PemesananActivity.class);
            startActivity(intent);
        });
    }
}