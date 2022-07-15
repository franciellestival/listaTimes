package com.example.listatimes.controller;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import com.example.listatimes.R;
import com.example.listatimes.adapter.AdapterTimes;
import com.example.listatimes.model.Time;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerViewTimes;
    private List<Time> listaTimes = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerViewTimes = findViewById(R.id.recyclerViewTimes);

        this.createTime();
        AdapterTimes adapter = new AdapterTimes(listaTimes);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerViewTimes.setLayoutManager(layoutManager);
        recyclerViewTimes.setHasFixedSize(true);
        recyclerViewTimes.addItemDecoration(new DividerItemDecoration(this, LinearLayout.VERTICAL));
        recyclerViewTimes.setAdapter(adapter);
    }

    public void createTime() {
        Time obj = new Time(R.drawable.corinthians, "Corinthians", "São Paulo/SP", null);
        listaTimes.add(obj);
        obj = new Time(R.drawable.internacional, "Internacional", "Porto Alegre/RS", null);
        listaTimes.add(obj);
        obj = new Time(R.drawable.coritiba, "Coritiba", "Curitiba/PR", null);
        listaTimes.add(obj);
        obj = new Time(R.drawable.athletico, "Athlético", "Curitiba/PR", null);
        listaTimes.add(obj);
    }
}