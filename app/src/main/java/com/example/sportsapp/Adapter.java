package com.example.sportsapp;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<ViewHolder> {

    public Adapter(ArrayList<SportData> sportDatas) {
        this.sportDatas = sportDatas;
    }

    ArrayList<SportData> sportDatas;

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater
                .from(parent.getContext())
                .inflate(R.layout.carditem_layout, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        SportData sportData = sportDatas.get(position);

        int imageResId = holder.imageView.getContext().getResources().getIdentifier(sportData.getImageName(), "drawable", holder.imageView.getContext().getPackageName());
        holder.imageView.setImageResource(imageResId);
        holder.textView.setText(sportData.getName());
    }

    @Override
    public int getItemCount() {
        return sportDatas.size();
    }
}
