package com.example.atividade2.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.atividade2.R;
import com.example.atividade2.model.Filme;

import java.util.List;

public class FilmeAdapter extends RecyclerView.Adapter<FilmeAdapter.FilmeViewHolder> {

    private List<Filme> filmes;

    public FilmeAdapter(List<Filme> filmes) {
        this.filmes = filmes;
    }

    @NonNull
    @Override
    public FilmeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_filme, parent, false);
        return new FilmeViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FilmeViewHolder holder, int position) {
        Filme filme = filmes.get(position);
        holder.tituloTextView.setText(filme.getTitulo());
        holder.anoTextView.setText(String.valueOf(filme.getAno()));
        holder.diretorTextView.setText(filme.getDiretor());
        holder.posterImageView.setImageResource(filme.getPosterId());
    }

    @Override
    public int getItemCount() {
        return filmes.size();
    }

    public static class FilmeViewHolder extends RecyclerView.ViewHolder {
        TextView tituloTextView;
        TextView anoTextView;
        TextView diretorTextView;
        ImageView posterImageView;
        Button verSinopseButton;

        public FilmeViewHolder(@NonNull View itemView) {
            super(itemView);
            tituloTextView = itemView.findViewById(R.id.tvTitulo);
            anoTextView = itemView.findViewById(R.id.tvAno);
            diretorTextView = itemView.findViewById(R.id.tvDiretor);
            posterImageView = itemView.findViewById(R.id.ivPoster);
            verSinopseButton = itemView.findViewById(R.id.btnVerSinopse);
        }
    }
}
