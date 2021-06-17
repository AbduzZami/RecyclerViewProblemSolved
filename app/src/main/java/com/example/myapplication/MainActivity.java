package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerViewAdapter recyclerViewAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recview);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));

        ArrayList<Item> listy = new ArrayList<>();

        listy.add(new Item("dadad"));
        listy.add(new Item("sfs"));
        listy.add(new Item("dfgsdfg"));
        listy.add(new Item("dfs"));
        listy.add(new Item("sdfsdf"));
        listy.add(new Item("sfsd"));
        listy.add(new Item("daddfsfdad"));
        listy.add(new Item("fgf"));
        listy.add(new Item("dfdf"));
        listy.add(new Item("dgfd"));
        listy.add(new Item("ggf"));
        listy.add(new Item("rssd"));
        listy.add(new Item("sdfds"));



        recyclerViewAdapter = new RecyclerViewAdapter(getApplicationContext(),listy);
        recyclerView.setAdapter(recyclerViewAdapter);


    }
}