package com.rajat.simplerecyclerviewwithoutfragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
//https://stackoverflow.com/questions/40584424/simple-android-recyclerview-example
    MyAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("RECYCLERVIEW","in onCreate of mainactivity...");
        setContentView(R.layout.activity_main);
        //
        //Data to populate the RecyclerView with
        ArrayList<String> animalNames = new ArrayList<>();
        animalNames.add("Horse");
        animalNames.add("Cow");
        animalNames.add("Camel");
        animalNames.add("Sheep");
        animalNames.add("Goat");
        animalNames.add("Donkey");
        animalNames.add("Cat");
        animalNames.add("Dog");
        animalNames.add("Tiger");
        animalNames.add("Leopard");
        animalNames.add("Penguin");
        animalNames.add("Bison");
        //Now Setup the RecyclerView
        RecyclerView recyclerView = findViewById(R.id.rvAnimals);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        //construct the adapter class and pass the ArrayList to it's constructor
        adapter = new MyAdapter(this,animalNames);
        //now set the adapter into recyclerview
        recyclerView.setAdapter(adapter);
    }
}