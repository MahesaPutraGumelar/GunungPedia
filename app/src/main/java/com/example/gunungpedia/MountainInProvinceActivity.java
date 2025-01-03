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
                addMountain(dataGunung, "Gunung Ciremai", "Tinggi 3,078 m", "Gunung tertinggi di Jawa Barat", "GunungCiremai.jpg");
                addMountain(dataGunung, "Gunung Gede", "2,958 m", "Bagian dari Taman Nasional Gunung Gede Pangrango", "GunungGede.jpg");
                addMountain(dataGunung, "Gunung Pangrango", "3,019 m", "Pemandangan indah dan padang edelweiss", "GunungPangrango.jpg");
                addMountain(dataGunung, "Gunung Papandayan", "2,665 m", "Kawah belerang aktif", "GunungPapandayan.jpg");
                addMountain(dataGunung, "Gunung Tangkuban Perahu", "2,084 m", "Gunung bersejarah dengan kawah unik", "GunungTangkubanPerahu.jpg");
                addMountain(dataGunung, "Gunung Burangrang", "2,050 m", "Pemandangan hijau dan udara segar", "GunungBurangrang.jpg");
                addMountain(dataGunung, "Gunung Malabar", "2,343 m", "Destinasi wisata alam pegunungan", "GunungMalabar.jpg");

            } else if (provinsi.equals("Jawa Tengah")) {
                addMountain(dataGunung, "Gunung Merbabu", "3,145 m", "Gunung favorit dengan jalur pendakian cantik", "GunungMerbabu.jpg");
                addMountain(dataGunung, "Gunung Merapi", "2,930 m", "Gunung berapi aktif dengan panorama menawan", "GunungMerapi.jpg");
                addMountain(dataGunung, "Gunung Slamet", "3,428 m", "Gunung tertinggi di Jawa Tengah", "GunungSlamet.jpg");
                addMountain(dataGunung, "Gunung Sindoro", "3,136 m", "Keindahan sunrise yang memukau", "GunungSindoro.jpg");
                addMountain(dataGunung, "Gunung Sumbing", "3,371 m", "Gunung dengan jalur pendakian menantang", "GunungSumbing.jpg");
                addMountain(dataGunung, "Gunung Ungaran", "2,050 m", "Pemandangan kota Semarang dari atas", "GunungUngaran.jpg");
                addMountain(dataGunung, "Gunung Prau", "2,565 m", "Pemandangan Bukit Teletubbies yang terkenal", "GunungPrau.jpg");

            } else if (provinsi.equals("Jawa Timur")) {
                addMountain(dataGunung, "Gunung Semeru", "3,676 m", "Gunung tertinggi di Pulau Jawa", "GunungSemeru.jpg");
                addMountain(dataGunung, "Gunung Bromo", "2,329 m", "Gunung ikonik dengan hamparan pasir luas", "GunungBromo.jpg");
                addMountain(dataGunung, "Gunung Arjuno", "3,339 m", "Gunung dengan jalur pendakian yang asri", "GunungArjuno.jpg");
                addMountain(dataGunung, "Gunung Welirang", "3,156 m", "Gunung dengan aktivitas vulkanik aktif", "GunungWelirang.jpg");
                addMountain(dataGunung, "Gunung Raung", "3,344 m", "Gunung dengan kaldera terbesar kedua di Indonesia", "GunungRaung.jpg");
                addMountain(dataGunung, "Gunung Ijen", "2,769 m", "Dikenal dengan fenomena api biru", "GunungIjen.jpg");
                addMountain(dataGunung, "Gunung Kawi", "2,551 m", "Pusat wisata spiritual di Jawa Timur", "GunungKawi.jpg");

            } else if (provinsi.equals("Kalimantan Barat")) {
                addMountain(dataGunung, "Gunung Poteng", "1,220 m", "Gunung kecil dengan keanekaragaman hayati", "GunungPoteng.jpg");
                addMountain(dataGunung, "Gunung Saran", "1,000 m", "Destinasi trekking di Kalimantan Barat", "GunungSaran.jpg");
                addMountain(dataGunung, "Gunung Niut", "1,701 m", "Gunung tertinggi di Kalimantan Barat", "GunungNiut.jpg");
                addMountain(dataGunung, "Gunung Kelam", "1,002 m", "Gunung batuan granit terbesar", "GunungKelam.jpg");
                addMountain(dataGunung, "Gunung Bawang", "1,650 m", "Pemandangan pegunungan asri", "GunungBawang.jpg");
                addMountain(dataGunung, "Gunung Lawit", "1,767 m", "Keindahan alam Kalimantan Barat", "GunungLawit.jpg");
                addMountain(dataGunung, "Gunung Sayan", "1,100 m", "Destinasi hiking menarik", "GunungSayan.jpg");

            } else if (provinsi.equals("Kalimantan Selatan")) {
                addMountain(dataGunung, "Gunung Besar", "1,901 m", "Gunung tertinggi di Kalimantan Selatan", "GunungBesar.jpg");
                addMountain(dataGunung, "Gunung Halau-Halau", "1,901 m", "Destinasi favorit pendaki", "GunungHalauHalau.jpg");
                addMountain(dataGunung, "Gunung Meratus", "1,100 m", "Pemandangan khas Pegunungan Meratus", "GunungMeratus.jpg");
                addMountain(dataGunung, "Gunung Besar Kandangan", "1,200 m", "Hutan tropis yang masih asri", "GunungBesarKandangan.jpg");
                addMountain(dataGunung, "Gunung Batu Titi", "800 m", "Gunung batu unik di Kalimantan Selatan", "GunungBatuTiti.jpg");
                addMountain(dataGunung, "Gunung Liangbangkai", "1,200 m", "Wisata pegunungan alami", "GunungLiangbangkai.jpg");
                addMountain(dataGunung, "Gunung Bawakan", "1,050 m", "Gunung dengan hutan hujan tropis", "GunungBawakan.jpg");
            }
        }

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

    @Override
    public void onItemClick(Map<String, String> d) {
        Intent intent = new Intent(MountainInProvinceActivity.this, DetailGunungActivity.class);
        intent.putExtra("img", d.get("img"));
        intent.putExtra("nama", d.get("nama"));
        intent.putExtra("tinggi", d.get("tinggi"));
        intent.putExtra("deskripsi", d.get("deskripsi"));
        startActivity(intent);
    }
    public void profile (View view) {
        Intent intent = new Intent(MountainInProvinceActivity.this, ProfileActivity.class);
        startActivity(intent);
    }
    public void aboutus (View view) {
        Intent intent = new Intent(MountainInProvinceActivity.this, AboutUsActivity.class);
        startActivity(intent);
    }
    public void home (View view) {
        Intent intent = new Intent(MountainInProvinceActivity.this, DashboardActivity.class);
        startActivity(intent);
    }
    public void help (View view) {
        Intent intent = new Intent(MountainInProvinceActivity.this, Help.class);
        startActivity(intent);
    }
    public void favorite (View view) {
        Intent intent = new Intent(MountainInProvinceActivity.this, FavoriteActivity.class);
        startActivity(intent);
    }
}
