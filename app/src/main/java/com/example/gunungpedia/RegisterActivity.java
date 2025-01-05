package com.example.gunungpedia;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class RegisterActivity extends AppCompatActivity {

    private EditText nama,email,pass;
    private Button register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_register);
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
    public void register(View view) {
        nama = findViewById(R.id.nama);
        email = findViewById(R.id.email);
        pass = findViewById(R.id.pass);
        register = findViewById(R.id.Register);

        if (nama.getText().toString().isEmpty() || email.getText().toString().isEmpty() || pass.getText().toString().isEmpty()) {
            nama.setError("Nama harus diisi");
            email.setError("Email harus diisi");
            pass.setError("Password harus diisi");
        }else {
            Toast.makeText(this, "Register berhasil", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent ( RegisterActivity.this, LoginActivity.class);
            startActivity(intent);
        }
    }
    public void login(View view) {
        Intent intent = new Intent(RegisterActivity.this, LoginActivity.class);
        startActivity(intent);
    }
}