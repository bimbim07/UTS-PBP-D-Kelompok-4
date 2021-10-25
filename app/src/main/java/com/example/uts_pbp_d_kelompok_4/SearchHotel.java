package com.example.uts_pbp_d_kelompok_4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;

public class SearchHotel extends AppCompatActivity implements RvHotelAdapter.OnHotelListener{
    private RecyclerView recyclerView;
    private RvHotelAdapter adapter;
    private RecyclerView.LayoutManager manager;

    private ArrayList<HotelAdapter> mHotelAdapter = new ArrayList();
    private RvHotelAdapter.OnHotelListener mOnHotelListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_hotel);

        ArrayList<HotelAdapter> mHotelAdapter = new ArrayList<>();
        mHotelAdapter.add(new HotelAdapter(R.drawable.horison, "Horison Ultima Banung","Lengkong, Bandung", "Rp.418.000"));
        mHotelAdapter.add(new HotelAdapter(R.drawable.grand, "Grand Tjokro Bandung","Cihampelas, Bandung", "Rp.968.000"));
        mHotelAdapter.add(new HotelAdapter(R.drawable.papandayan, "The Papandayan","Lengkong, Bandung", "Rp.1.418.000"));
        mHotelAdapter.add(new HotelAdapter(R.drawable.pasundan, "Grand Pasundan Convension","Pasir Koja, Bandung", "Rp.418.000"));

        recyclerView = findViewById(R.id.rvHotel);
        recyclerView.setHasFixedSize(true);
        manager = new LinearLayoutManager(this);
        adapter = new RvHotelAdapter(mHotelAdapter, this);

        recyclerView.setLayoutManager(manager);
        recyclerView.setAdapter(adapter);
    }

    @Override
    public void onHotelClick(int position) {
        Intent intent = new Intent(this, Payment.class);
        startActivity(intent);
    }
}