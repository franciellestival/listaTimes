package com.example.listatimes.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.listatimes.R;
import com.example.listatimes.model.Clube;

import java.util.List;

public class AdapterClubes extends RecyclerView.Adapter<AdapterClubes.MyViewHolder> {
    private List<Clube> listaClubes;

    public AdapterClubes(List<Clube> listaClubes) {
        this.listaClubes = listaClubes;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View listItem = LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_lista_clubes, parent, false);
        return new MyViewHolder(listItem);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Clube obj = listaClubes.get(position);
        holder.nome.setText(obj.getNome());
        holder.local.setText(obj.getLocal());
        holder.escudo.setImageResource(obj.getEscudo());
    }

    @Override
    public int getItemCount() {
        return listaClubes.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView nome, local;
        ImageView escudo;

        public MyViewHolder(View itemView) {
            super(itemView);
            nome = itemView.findViewById(R.id.textViewNome);
            local = itemView.findViewById(R.id.textViewLocal);
            escudo = itemView.findViewById(R.id.imageViewEscudo);
        }
    }
}
