package com.example.l11_customized_list;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<Students> studentArrayList = new ArrayList<Students>();
        studentArrayList.add(new Students("Ali", "IT", "519", R.drawable.a1));
       studentArrayList.add(new Students("Saad", "CS", "567", R.drawable.a2));
        studentArrayList.add(new Students("Aila", "SE", "589", R.drawable.a3));
       studentArrayList.add(new Students("Aiman", "DS", "534", R.drawable.a2));
        MyAdapter adapter = new MyAdapter(this, studentArrayList);
        ListView listView = findViewById(R.id.listview);
        listView.setAdapter(adapter);
    }

}