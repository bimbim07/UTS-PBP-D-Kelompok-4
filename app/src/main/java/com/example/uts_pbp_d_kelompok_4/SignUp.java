package com.example.uts_pbp_d_kelompok_4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class SignUp extends AppCompatActivity {

    TextView masuk;
    EditText email, fullname, username, password;
    Button daftar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        masuk       = findViewById(R.id.tvMasuk);
        email       = findViewById(R.id.edEmail);
        fullname    = findViewById(R.id.edFullname);
        username    = findViewById(R.id.edUsernamereg);
        password    = findViewById(R.id.edPasswordreg);
        daftar      = findViewById(R.id.btnDaftar);

        daftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent daftar = new Intent(SignUp.this, MainActivity.class);
                startActivity(daftar);
            }
        });

    }
}