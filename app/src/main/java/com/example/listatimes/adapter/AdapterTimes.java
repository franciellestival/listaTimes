package com.example.listatimes.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.listatimes.R;
import com.example.listatimes.model.Time;

import java.util.List;

public class AdapterTimes extends RecyclerView.Adapter<AdapterTimes.MyViewHolder> {
    private List<Time> listaTimes;

    public AdapterTimes(List<Time> listaTimes) {
        this.listaTimes = listaTimes;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View listItem = LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_lista_times, parent, false);
        return new MyViewHolder(listItem);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Time obj = listaTimes.get(position);
        holder.nome.setText(obj.getNome());
        holder.local.setText(obj.getLocal());
        holder.escudo.setImageResource(obj.getEscudo());
    }

    @Override
    public int getItemCount() {
        return listaTimes.size();
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
