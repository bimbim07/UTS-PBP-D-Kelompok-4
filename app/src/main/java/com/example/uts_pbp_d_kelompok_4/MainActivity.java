package com.example.uts_pbp_d_kelompok_4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputLayout;

import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {

    EditText edusername, edpassword;
    Button btnsubmit;
    TextView eddaftar;
    boolean isUsernameValid, isPasswordValid;
    TextInputLayout usernameError, passwordError;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edusername = findViewById(R.id.edusername);
        edpassword = findViewById(R.id.edpassword);
        btnsubmit  = findViewById(R.id.btnsubmit);
        eddaftar   = findViewById(R.id.textdaftar);
        usernameError = findViewById(R.id.usernameError);
        passwordError = findViewById(R.id.passwordError);

        btnsubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SetValidation();
            }
        });
        eddaftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent daftar = new Intent(MainActivity.this, SignUp.class);
                startActivity(daftar);
            }
        });
    }

    public void SetValidation() {
        if (edusername.getText().toString().isEmpty()) {
            usernameError.setError(getResources().getString(R.string.username_error));
            isUsernameValid = false;
//        } else if(edusername.){
        } else {
            isUsernameValid = true;
            usernameError.setErrorEnabled(false);
        }

        if (edpassword.getText().toString().isEmpty()) {
            passwordError.setError(getResources().getString(R.string.password_error));
            isPasswordValid = false;
        } else {
            isPasswordValid = true;
            passwordError.setErrorEnabled(false);
        }

        if (isUsernameValid && isPasswordValid) {
            Toast.makeText(getApplicationContext(), "Successfully", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(MainActivity.this, HalamanUtama.class);
            startActivity(intent);
            finish();
        }
    }
}