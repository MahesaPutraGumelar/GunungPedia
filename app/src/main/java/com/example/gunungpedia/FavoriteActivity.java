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
        addMountain(
                dataGunung,
                "Gunung Gede",
                "Tinggi 2,958 m",
                "Gunung Gede, dengan ketinggian 2.958 mdpl, merupakan bagian dari Taman Nasional Gunung Gede Pangrango yang mencakup wilayah Kabupaten Cianjur dan Sukabumi. Gunung ini terkenal dengan keanekaragaman hayati yang tinggi, termasuk berbagai spesies flora dan fauna endemik. Jalur pendakian yang populer, seperti Cibodas dan Gunung Putri, menawarkan pemandangan alam yang menakjubkan, termasuk alun-alun Suryakencana yang dipenuhi bunga edelweiss. Aktivitas vulkanik Gunung Gede masih terpantau, sehingga pendakian harus memperhatikan status gunung yang dikeluarkan oleh otoritas terkait.",
                "gununggede"
        );

        addMountain(
                dataGunung,
                "Gunung Pangrango",
                "Tinggi 3,019 m",
                "Gunung Pangrango, dengan ketinggian 3.019 mdpl, merupakan gunung tertinggi kedua di Jawa Barat setelah Gunung Ciremai. Terletak bersebelahan dengan Gunung Gede, keduanya membentuk kawasan Taman Nasional Gunung Gede Pangrango. Puncak Gunung Pangrango dikenal dengan nama Mandalawangi, yang menawarkan pemandangan alam yang indah dan padang edelweiss yang luas. Meskipun tidak seaktif Gunung Gede, pendakian ke Gunung Pangrango memerlukan persiapan fisik yang baik dan izin dari pihak taman nasional.",
                "gunungpangrango"
        );

        addMountain(
                dataGunung,
                "Gunung Papandayan",
                "Tinggi 2,665 m",
                "Gunung Papandayan, dengan ketinggian 2.665 mdpl, terletak di Kecamatan Cisurupan, Kabupaten Garut. Gunung berapi ini terkenal dengan kawah belerang yang masih aktif dan pemandangan alam yang menakjubkan. Terdapat beberapa kawah yang dapat dikunjungi, seperti Kawah Mas, Kawah Baru, dan Kawah Nangklak. Selain itu, terdapat area hutan mati yang menjadi daya tarik bagi wisatawan dan fotografer. Meskipun jalur pendakian relatif ramah bagi pendaki pemula, tetap diperlukan kewaspadaan terhadap aktivitas vulkanik dan kondisi cuaca.",
                "gunungpapandayan"
        );

        addMountain(
                dataGunung,
                "Gunung Tangkuban Perahu",
                "Tinggi 2,084 m",
                "Gunung Tangkuban Perahu, dengan ketinggian 2.084 mdpl, terletak di wilayah Lembang, Kabupaten Bandung Barat. Gunung ini memiliki bentuk yang unik dan legenda Sangkuriang yang melekat kuat dalam budaya Sunda. Terdapat beberapa kawah yang menjadi objek wisata, seperti Kawah Ratu, Kawah Domas, dan Kawah Upas. Meskipun merupakan destinasi wisata populer, Gunung Tangkuban Perahu masih aktif, sehingga pengunjung harus mematuhi peraturan dan memperhatikan status aktivitas gunung yang dikeluarkan oleh otoritas setempat.",
                "gunungtangkubanperahu"
        );
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
        Intent intent = new Intent(FavoriteActivity.this, DetailGunungActivity.class);
        intent.putExtra("img", d.get("img"));
        intent.putExtra("nama", d.get("nama"));
        intent.putExtra("tinggi", d.get("tinggi"));
        intent.putExtra("deskripsi", d.get("deskripsi"));
        startActivity(intent);
    }
}