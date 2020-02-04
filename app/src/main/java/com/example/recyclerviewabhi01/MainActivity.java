package com.example.recyclerviewabhi01;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    String[] personNames = {"Person 1", "Person 2", "Person 3", "Person 4",
            "Person 5", "Person 6", "Person 7","Person 8", "Person 9", "Person 10", "Person 11", "Person 12",
            "Person 13", "Person 14"};
    int[] personImages = {R.drawable.person1, R.drawable.person2, R.drawable.person3,
            R.drawable.person4, R.drawable.person5, R.drawable.person6, R.drawable.person7,R.drawable.person8, R.drawable.person9,
            R.drawable.person10, R.drawable.person11, R.drawable.person12, R.drawable.person13};

    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recyclerView);

        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(linearLayoutManager);

        CustomAdapter customAdapter=new CustomAdapter(this,personNames,personImages);
        recyclerView.setAdapter(customAdapter);
    }
}
