package com.example.seucinemaapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AA_RecyclerViewAdapter extends RecyclerView.Adapter<AA_RecyclerViewAdapter.MyViewHolder> {

    Context context;
    ArrayList<MovieModel> movieModels;

    public AA_RecyclerViewAdapter (Context context, ArrayList<MovieModel> movieModels ){
        this.context = context;
        this.movieModels = movieModels;

    }
    @NonNull
    @Override
    public AA_RecyclerViewAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.recycler_view_row, parent, false);
        return new AA_RecyclerViewAdapter.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AA_RecyclerViewAdapter.MyViewHolder holder, int position) {

        holder.tvName.setText(movieModels.get(position).getMovieName());
        holder.tv3letter.setText(movieModels.get(position).getMovieAbbreviation());
        holder.tv1letter.setText(movieModels.get(position).getMovieAbbreviationSmall());
        holder.imageView.setImageResource(movieModels.get(position).getImage());

    }

    @Override
    public int getItemCount() {
        return movieModels.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView tvName, tv3letter, tv1letter;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.imageView9);
            tvName = itemView.findViewById(R.id.textView19);
            tv3letter = itemView.findViewById(R.id.textView11);
            tv1letter = itemView.findViewById(R.id.textView23);
        }
    }
}
