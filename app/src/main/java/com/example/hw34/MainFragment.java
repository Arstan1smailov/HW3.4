package com.example.hw34;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class MainFragment extends Fragment {
private ArrayList<String> Names;
private RecyclerView recyclerView;
private  NameAdapter nameAdapter;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_main, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        loadData();
        recyclerView = view.findViewById(R.id.recycler);
        nameAdapter = new NameAdapter(Names);
        recyclerView.setAdapter(nameAdapter);
    }
    public void  loadData(){
        Names = new ArrayList<>();
        Names.add("Name087");
        while (Names.size() < 30){
            Names.add("Name");
        }
    }
}