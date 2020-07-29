package com.example.alianca_medicos;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.MiViewHolder> {
    ArrayList<Pedidos> arrayList = new ArrayList<>();

    public RecyclerAdapter(ArrayList<Pedidos> arrayList){
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public MiViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from (parent.getContext()).inflate(R.layout.layout_modelo_recyclerview,parent,false);
        MiViewHolder miviewholder = new MiViewHolder(view);
        return miviewholder;
    }

    @Override
    public void onBindViewHolder(@NonNull MiViewHolder holder, int position) {
        holder.titulo.setText(arrayList.get(position).getTitulo());
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class MiViewHolder extends  RecyclerView.ViewHolder {

        TextView titulo;

        public MiViewHolder(@NonNull View itemView) {
            super(itemView);

            titulo = itemView.findViewById(R.id.idtitulo);
        }
    }
}
