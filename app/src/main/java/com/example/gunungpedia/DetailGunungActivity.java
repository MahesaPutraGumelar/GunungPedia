package com.example.gunungpedia;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class DetailGunungActivity extends AppCompatActivity {
    private TextView namaG, tinggiG, DesG, tittleG;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_detail_gunung);

        // Adjust for system bars
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Initialize TextViews
        tittleG = findViewById(R.id.title);
        namaG = findViewById(R.id.namagunung);
        tinggiG = findViewById(R.id.tinggigunung);
        DesG = findViewById(R.id.deskripsigunung);

        // Retrieve and set Intent data
        String nama = getIntent().getStringExtra("nama");
        String tinggi = getIntent().getStringExtra("tinggi");
        String deskripsi = getIntent().getStringExtra("deskripsi");

        if (nama != null) namaG.setText(nama);
        if (nama != null) tittleG.setText(nama);
        if (tinggi != null) tinggiG.setText(tinggi);
        if (deskripsi != null) DesG.setText(deskripsi);
    }
    public void profile (View view) {
        Intent intent = new Intent(DetailGunungActivity.this, ProfileActivity.class);
        startActivity(intent);
    }
    public void aboutus (View view) {
        Intent intent = new Intent(DetailGunungActivity.this, AboutUsActivity.class);
        startActivity(intent);
    }
    public void home (View view) {
        Intent intent = new Intent(DetailGunungActivity.this, DashboardActivity.class);
        startActivity(intent);
    }
    public void help (View view) {
        Intent intent = new Intent(DetailGunungActivity.this, Help.class);
        startActivity(intent);
    }
}
