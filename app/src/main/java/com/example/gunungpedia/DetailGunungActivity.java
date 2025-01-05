package com.example.gunungpedia;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class DetailGunungActivity extends AppCompatActivity {
    private TextView namaG, tinggiG, DesG, tittleG;
    private String nama, tinggi, deskripsi, img;
    private ImageView imgG;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_detail_gunung);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        tittleG = findViewById(R.id.title);
        namaG = findViewById(R.id.namagunung);
        tinggiG = findViewById(R.id.tinggigunung);
        DesG = findViewById(R.id.deskripsigunung);
        imgG = findViewById(R.id.imggunung);

        nama = getIntent().getStringExtra("nama");
        tinggi = getIntent().getStringExtra("tinggi");
        deskripsi = getIntent().getStringExtra("deskripsi");
        img = getIntent().getStringExtra("img");

        if (nama != null) namaG.setText(nama);
        if (nama != null) tittleG.setText(nama);
        if (tinggi != null) tinggiG.setText(tinggi);
        if (img != null) imgG.setImageResource(getResources().getIdentifier(img, "drawable", getPackageName()));
        if (deskripsi != null) DesG.setText(deskripsi);
    }

    public void profile(View view) {
        Intent intent = new Intent(DetailGunungActivity.this, ProfileActivity.class);
        startActivity(intent);
    }

    public void aboutus(View view) {
        Intent intent = new Intent(DetailGunungActivity.this, AboutUsActivity.class);
        startActivity(intent);
    }

    public void home(View view) {
        Intent intent = new Intent(DetailGunungActivity.this, DashboardActivity.class);
        startActivity(intent);
    }

    public void help(View view) {
        Intent intent = new Intent(DetailGunungActivity.this, Help.class);
        startActivity(intent);
    }

    public void save(View view) {
        Toast.makeText(this, "Berhasil disimpan ke Favorit!", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(DetailGunungActivity.this, FavoriteActivity.class);
        startActivity(intent);
    }
    public void favorite (View view){
        Intent intent = new Intent(DetailGunungActivity.this, FavoriteActivity.class);
        startActivity(intent);
    }
    public void share(View view) {
        Intent shareIntent = new Intent(Intent.ACTION_SEND);
        shareIntent.setType("text/plain");
        String shareBody = "Gunung " + nama + " memiliki tinggi " + tinggi + " meter.\n" + deskripsi;
        shareIntent.putExtra(Intent.EXTRA_SUBJECT, "Gunung Pedia");
        shareIntent.putExtra(Intent.EXTRA_TEXT, shareBody);
        startActivity(Intent.createChooser(shareIntent, "Bagikan melalui"));
    }
}
