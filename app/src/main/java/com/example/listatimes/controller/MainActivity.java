package com.example.listatimes.controller;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.example.listatimes.R;
import com.example.listatimes.adapter.AdapterClubes;
import com.example.listatimes.adapter.RecyclerItemClickListener;
import com.example.listatimes.model.Clube;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerViewClubes;
    private List<Clube> listaClubes = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerViewClubes = findViewById(R.id.recyclerViewTimes);

        this.createClube();
        AdapterClubes adapter = new AdapterClubes(listaClubes);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerViewClubes.setLayoutManager(layoutManager);
        recyclerViewClubes.setHasFixedSize(true);
        recyclerViewClubes.addItemDecoration(new DividerItemDecoration(this, LinearLayout.VERTICAL));
        recyclerViewClubes.setAdapter(adapter);
        recyclerViewClubes.addOnItemTouchListener(
                new RecyclerItemClickListener(
                        getApplicationContext(),
                        recyclerViewClubes,
                        new RecyclerItemClickListener.OnItemClickListener() {
                            @Override
                            public void onItemClick(View view, int position) {
                                Intent it = new Intent(getApplicationContext(), DetailActivity.class);
                                Clube obj = listaClubes.get(position);
                                it.putExtra("clube", obj);
                                startActivity(it);
                            }

                            @Override
                            public void onLongItemClick(View view, int position) {
                                onItemClick(view, position);
                            }

                            @Override
                            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                            }
                        }
                )
        );
    }

    public void createClube() {
        List<String> titulos = new ArrayList<>(Arrays.asList("2 Mundiais de Clubes da FIFA (2000, 2012)",
                "1 Copa Libertadores da América (2012)",
                "1 Recopa Sul-Americana (2013)",
                "7 Campeonatos Brasileiros (1990, 1998, 1999, 2005, 2011, 2015, 2017)",
                "3 Copas do Brasil (1995, 2002, 2009)",
                "1 Supercopa do Brasil (1991)",
                "1 Campeonato Brasileiro - Série B (2008)",
                "30 Campeonatos Paulistas (1914, 1916, 1922, 1923, 1924, 1928, 1929, 1930, 1937, 1938, 1939, 1941, 1951, 1952, 1954, 1977, 1979, 1982, 1983, 1988, 1995, 1997, 1999, 2001, 2003, 2009, 2013, 2017, 2018, 2019)"));

        Clube obj = new Clube(R.drawable.corinthians, "Sport Clube Corinthians Paulista", "São Paulo/SP", titulos);
        listaClubes.add(obj);

        titulos = new ArrayList<>(Arrays.asList("1 Mundial de Clubes da FIFA (2006)",
                "2 Copa Libertadores da América (2006, 2010)",
                "3 Campeonatos Brasileiros (1975, 1976, 1979)",
                "1 Copa do Brasil (1992)",
                "2 Recopa Sul-Americana (2007, 2011)",
                "1 Copa Sul-Americana (2008)",
                "40 Campeonatos Gaúchos (1927, 1934, 1940, 1941, 1942, 1943, 1944, 1945, 1947, 1948, 1950, 1951, 1952, 1953, 1955, 1961, 1969, 1970, 1971, 1972, 1973, 1974, 1975, 1976, 1978, 1981, 1982, 1983, 1984, 1991, 1992, 1994, 1997, 2003, 2004, 2005, 2008, 2009, 2011)"));
        obj = new Clube(R.drawable.internacional, "Sport Club Internacional", "Porto Alegre/RS", titulos);
        listaClubes.add(obj);

        titulos = new ArrayList<>(Arrays.asList("1 Campeonato Brasileiro (1985)",
                "2 Campeonatos Brasileiros - Série B (2007, 2010)",
                "39 Campeonatos Paranaenses (1916, 1927, 1931, 1933, 1935, 1939, 1941, 1942, 1946, 1947, 1951, 1952, 1954, 1956, 1957, 1959, 1960, 1968, 1969, 1971, 1972, 1973, 1974, 1975, 1976, 1978, 1979, 1986, 1989, 1999, 2003, 2004, 2008, 2010, 2011, 2012, 2013, 2017, 2022)"));
        obj = new Clube(R.drawable.coritiba, "Coritiba Foot Ball Club", "Curitiba/PR", titulos);
        listaClubes.add(obj);

        titulos = new ArrayList<>(Arrays.asList("1 Levain Cup/CONMEBOL (2019)",
                "2 Copas Sul-Americanas (2018, 2021)",
                "1 Copa do Brasil (2019)",
                "1 Campeonato Brasileiro (2001)",
                "1 Campeonato Brasileiro - Série B (1995)",
                "26 Campeonatos Paranaenses (1925, 1929, 1930, 1934, 1936, 1940, 1943, 1945, 1949, 1958, 1970, 1982, 1983, 1985, 1988, 1990, 1998, 2000, 2001, 2002, 2005, 2009, 2016, 2018, 2019 e 2020)"));

        obj = new Clube(R.drawable.athletico, "Club Athletico Paranaense", "Curitiba/PR", titulos);
        listaClubes.add(obj);
    }
}