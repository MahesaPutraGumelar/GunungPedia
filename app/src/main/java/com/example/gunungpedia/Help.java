package com.example.gunungpedia;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class Help extends AppCompatActivity {

    private CardView gmail, whatsapp, instagram;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);

        // Initialize views
        gmail = findViewById(R.id.gmail);
        whatsapp = findViewById(R.id.whatsapp);
        instagram = findViewById(R.id.instagram);

        // Set onClick listeners for contact options
        gmail.setOnClickListener(v -> openUrl("mailto:support@gunungpedia.com"));
        whatsapp.setOnClickListener(v -> openUrl("https://wa.me/6281234567890"));
        instagram.setOnClickListener(v -> openUrl("https://www.instagram.com/gunungpedia/"));

    }

    private void openUrl(String url) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        startActivity(intent);
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


}
