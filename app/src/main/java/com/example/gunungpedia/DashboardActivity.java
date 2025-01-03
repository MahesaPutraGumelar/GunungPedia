package com.example.gunungpedia;

import static com.example.gunungpedia.R.*;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class DashboardActivity extends AppCompatActivity implements ProvinsiAdapter.OnItemClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_dashboard);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        RecyclerView recycleView = findViewById(R.id.listG);
        recycleView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        List<String> data = new ArrayList<>();
        data.add("Jawa Barat");
        data.add("Jawa Tengah");
        data.add("Jawa Timur");
        data.add("Kalimantan Barat");
        data.add("Kalimantan Selatan");
        data.add("Kalimantan Tengah");
        ProvinsiAdapter adapter = new ProvinsiAdapter(data, this);
        recycleView.setAdapter(adapter);

    }
    public void profile (View view){
        Intent intent = new Intent(DashboardActivity.this, ProfileActivity.class);
        startActivity(intent);
    }public void aboutus (View view){
        Intent intent = new Intent(DashboardActivity.this, AboutUsActivity.class);
        startActivity(intent);
    }
    public void home (View view){
        Intent intent = new Intent(DashboardActivity.this, DashboardActivity.class);
        startActivity(intent);
    }
    public void help (View view){
        Intent intent = new Intent(DashboardActivity.this, Help.class);
        startActivity(intent);
    }

    @Override
    public void onItemClick(String d) {
        Intent intent = new Intent(DashboardActivity.this, MountainInProvinceActivity.class);
        intent.putExtra("provinsi", d);
        startActivity(intent);

    }
}