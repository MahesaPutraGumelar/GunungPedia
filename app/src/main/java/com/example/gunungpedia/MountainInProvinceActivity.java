package com.example.gunungpedia;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;


import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MountainInProvinceActivity extends AppCompatActivity implements InProvinsiAdapter.OnItemClickListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_mountain_in_province);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        String provinsi = getIntent().getStringExtra("provinsi");
        TextView textView = findViewById(R.id.home);
        textView.setText(provinsi);
        RecyclerView recycleView = findViewById(R.id.listG);
        recycleView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        List<Map<String, String>> dataGunung = new ArrayList<>();

        if (provinsi != null) {
            if (provinsi.equals("Jawa Barat")) {
                // Menambahkan data gunung pertama
                Map<String, String> gunung1 = new HashMap<>();
                gunung1.put("nama", "Gunung Ciremai");
                gunung1.put("tinggi", "3,078 m");
                gunung1.put("deskripsi", "Gunung Ciremai adalah gunung tertinggi di Jawa Barat yang terletak di Kabupaten Kuningan dan Majalengka. Gunung ini terkenal dengan jalur pendakian yang menantang dan panorama alam yang indah.");
                dataGunung.add(gunung1);

                // Menambahkan data gunung kedua
                Map<String, String> gunung2 = new HashMap<>();
                gunung2.put("nama", "Gunung Gede");
                gunung2.put("tinggi", "2,958 m");
                gunung2.put("deskripsi", "Gunung Gede merupakan bagian dari Taman Nasional Gunung Gede Pangrango. Gunung ini menawarkan keindahan alam berupa air terjun, padang edelweiss, dan pemandangan kawah yang menakjubkan.");
                dataGunung.add(gunung2);
            }else if (provinsi.equals("Jawa Tengah")) {
            }
        }
        InProvinsiAdapter adapter = new InProvinsiAdapter(dataGunung,this);
        recycleView.setAdapter(adapter);


    }

    @Override
    public void onItemClick(Map<String, String> d) {
        Intent intent = new Intent(MountainInProvinceActivity.this, DetailGunungActivity.class);
        intent.putExtra("nama", d.get("nama"));
        intent.putExtra("tinggi", d.get("tinggi"));
        intent.putExtra("deskripsi", d.get("deskripsi"));
        startActivity(intent);
    }
}