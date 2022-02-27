package com.example.hw34;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class NameAdapter extends RecyclerView.Adapter<NameAdapter.NameViewHolder> {
    private ArrayList<String> data;
    private TextView TV;
    public NameAdapter (ArrayList<String> data){
        this.data = data;
    }
    @NonNull
    @Override
    public NameViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new NameViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_name, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull NameViewHolder holder, int position) {
        holder.bind(data.get(position));
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    class NameViewHolder extends RecyclerView.ViewHolder{
        public NameViewHolder(@NonNull View itemView) {
            super(itemView);
            TV = itemView.findViewById(R.id.TV);

        }

        public void bind(String name) {
            TV.setText(name);
        }
    }
}
