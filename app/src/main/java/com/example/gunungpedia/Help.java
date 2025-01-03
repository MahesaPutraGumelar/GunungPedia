package com.example.gunungpedia;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Help extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_help);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    public void profile (View view){
        Intent intent = new Intent(Help.this, ProfileActivity.class);
        startActivity(intent);

    }public void aboutus (View view){
        Intent intent = new Intent(Help.this, AboutUsActivity.class);
        startActivity(intent);
    }
    public void home (View view){
        Intent intent = new Intent(Help.this, DashboardActivity.class);
        startActivity(intent);
    }
    public void help (View view){
        Intent intent = new Intent(Help.this, Help.class);
        startActivity(intent);
    }
}