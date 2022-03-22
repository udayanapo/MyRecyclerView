package com.example.myrecyclerview;

import static java.util.Collections.addAll;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {
    private RecyclerView rvCategory;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvCategory= findViewById(R.id.rv_category);
        rvCategory.setHasFixedSize(true);

        MakananData.getListData().addAll(MakananData.getListData());
        showRecyclerList();

    }
    private void showRecyclerList(){
        rvCategory.setLayoutManager(new LinearLayoutManager(this));
        ListMakananAdapter listPresidentAdapter = new ListMakananAdapter(this);
        listPresidentAdapter.setListMakanan( MakananData.getListData());
        rvCategory.setAdapter(listPresidentAdapter);
    }



}