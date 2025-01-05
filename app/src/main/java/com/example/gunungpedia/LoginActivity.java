package com.example.gunungpedia;

import android.os.Bundle;
import android.text.style.TtsSpan;
import android.widget.EditText;
import android.widget.Button;
import android.view.View;
import android.content.Intent;
import android.widget.ImageView;
import android.net.Uri;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class LoginActivity extends AppCompatActivity {

    private EditText email,pass;
    private Button login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login);

        ImageView google = findViewById(R.id.google);
        ImageView twiter = findViewById(R.id.twitter);
        ImageView facebook = findViewById(R.id.facebook);

        google.setOnClickListener(v -> {
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("https://accounts.google.com/sigin"));
            startActivity(intent);
        });

        twiter.setOnClickListener(v -> {
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("https://twitter.com/login"));
            startActivity(intent);
        });

        facebook.setOnClickListener(v -> {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse("https://facebook.com/login"));
                    startActivity(intent);
                });
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    public void login(View view) {
        email = findViewById(R.id.email);
        pass = findViewById(R.id.pass);
        login = findViewById(R.id.Login);

        if (email.getText().toString().equals("admin@gmail.com") && pass.getText().toString().equals("admin")){
            Intent intent = new Intent ( LoginActivity.this, DashboardActivity.class);
            startActivity(intent);
        }
        else {
            email.setError("Email atau password salah");
            pass.setError("Email atau pass Salah");
        }
    }
    public void register(View view) {
        Intent intent = new Intent ( LoginActivity.this, RegisterActivity.class);
        startActivity(intent);
    }
}