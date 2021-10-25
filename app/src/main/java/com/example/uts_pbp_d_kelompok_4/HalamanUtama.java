package com.example.uts_pbp_d_kelompok_4;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.TextView;

import java.util.Calendar;

public class HalamanUtama extends AppCompatActivity {

    TextView tglCheckin, getTglCheckout,btn_Hotel;
    DatePickerDialog pickerDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman_utama);

        tglCheckin = findViewById(R.id.tanggalCheckin);
        getTglCheckout = findViewById(R.id.tanggalCheckout);
        btn_Hotel = findViewById(R.id.btnHotel);

        tglCheckin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final Calendar calendar = Calendar.getInstance();
                final int day = calendar.get(Calendar.DAY_OF_MONTH);
                int month = calendar.get(Calendar.MONTH);
                int year = calendar.get(Calendar.YEAR);

                pickerDialog = new DatePickerDialog(HalamanUtama.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker datePicker, int years, int months, int days) {
                        tglCheckin.setText(days + "/"+(months+1)+"/"+years);
                    }
                }, year, month, day);
                pickerDialog.show();
            }
        });
        getTglCheckout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final Calendar calendar = Calendar.getInstance();
                final int day = calendar.get(Calendar.DAY_OF_MONTH);
                int month = calendar.get(Calendar.MONTH);
                int year = calendar.get(Calendar.YEAR);

                pickerDialog = new DatePickerDialog(HalamanUtama.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker datePicker, int years, int months, int days) {
                        getTglCheckout.setText(days + "/"+(months+1)+"/"+years);
                    }
                }, year, month, day);
                pickerDialog.show();
            }
        });

        btn_Hotel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent HotelIntent = new Intent(HalamanUtama.this, SearchHotel.class);
                startActivity(HotelIntent);
            }
        });

    }
}