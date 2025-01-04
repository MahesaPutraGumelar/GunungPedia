package com.example.gunungpedia;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FavoriteActivity extends AppCompatActivity implements InProvinsiAdapter.OnItemClickListener {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_favorite);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        RecyclerView recycleView = findViewById(R.id.listG);
        recycleView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        List<Map<String, String>> dataGunung = new ArrayList<>();
        addMountain(dataGunung, "Gunung Ciremai", "Tinggi 3,078 m", "Gunung tertinggi di Jawa Barat", "gunungciremai.jpg");
        addMountain(dataGunung, "Gunung Gede", "2,958 m", "Bagian dari Taman Nasional Gunung Gede Pangrango", "gununggede.jpg");
        addMountain(dataGunung, "Gunung Pangrango", "3,019 m", "Pemandangan indah dan padang edelweiss", "gunungpangrango.jpg");
        addMountain(dataGunung, "Gunung Papandayan", "2,665 m", "Kawah belerang aktif", "gunungpapandayan.jpg");
        addMountain(dataGunung, "Gunung Tangkuban Perahu", "2,084 m", "Gunung bersejarah dengan kawah unik", "gunungtangkubanperahu.jpg");
        InProvinsiAdapter adapter = new InProvinsiAdapter(dataGunung, this);
        recycleView.setAdapter(adapter);
    }

    private void addMountain(List<Map<String, String>> dataGunung, String nama, String tinggi, String deskripsi, String img) {
        Map<String, String> gunung = new HashMap<>();
        gunung.put("img", img);
        gunung.put("nama", nama);
        gunung.put("tinggi", tinggi);
        gunung.put("deskripsi", deskripsi);
        dataGunung.add(gunung);
    }
    public void help (View view) {
        Intent intent = new Intent(this, Help.class);
        startActivity(intent);
    }
    public void home (View view) {
        Intent intent = new Intent(this, DashboardActivity.class);
        startActivity(intent);
    }
    public void favorite (View view) {
        Intent intent = new Intent(this, FavoriteActivity.class);
        startActivity(intent);
    }
    public void aboutus (View view) {
        Intent intent = new Intent(this, AboutUsActivity.class);
        startActivity(intent);
    }
    public void profile (View view) {
        Intent intent = new Intent(this, ProfileActivity.class);
        startActivity(intent);
    }



    @Override
    public void onItemClick(Map<String, String> d) {

    }
}