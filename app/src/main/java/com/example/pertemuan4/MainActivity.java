package com.example.pertemuan4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private MahasiswaAdapter adapter;
    private ArrayList<Mahasiswa> mahasiswaArrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addData();
        recyclerView =
                (RecyclerView)findViewById(R.id.recycleview);
        adapter = new MahasiswaAdapter(mahasiswaArrayList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }
    private void addData() {
        mahasiswaArrayList = new ArrayList<>();
        mahasiswaArrayList.add(new Mahasiswa("Yudha Rahman", "1918123",
                "2019"));
        mahasiswaArrayList.add(new Mahasiswa("Ari Widiantoro", "1918321",
                "2018"));
        mahasiswaArrayList.add(new Mahasiswa("Muhammad Muklis", "1918234",
                "2021"));
        mahasiswaArrayList.add(new Mahasiswa("Khusdya Hariyudho", "1819076",
                "2018"));
        mahasiswaArrayList.add(new Mahasiswa("Barok Ahmad Royan", "1718087",
                "2017"));
        mahasiswaArrayList.add(new Mahasiswa("Dedik Setiawan", "1618065",
                "2016"));
    }
}
