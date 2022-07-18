package com.example.listatimes.controller;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.example.listatimes.R;
import com.example.listatimes.model.Clube;


public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        Intent it = getIntent();
        Clube obj = (Clube) it.getSerializableExtra("clube");

        TextView nomeClube = findViewById(R.id.textViewDtNome);
        TextView localClube = findViewById(R.id.textViewDtLocal);
        TextView titulosClube = findViewById(R.id.textViewDtTitulos);
        ImageView escudoClube = findViewById(R.id.imageViewDtEscudo);

        nomeClube.setText(obj.getNome());
        localClube.setText(obj.getLocal());
        titulosClube.setText(String.join("\n", obj.getTitulos()));
        titulosClube.setMovementMethod(new ScrollingMovementMethod());
        escudoClube.setImageResource(obj.getEscudo());
    }
}