package com.example.arrayadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView=findViewById(R.id.listView);

        ArrayList<String> arrayList=new ArrayList<>();
        arrayList.add("Infinix");
        arrayList.add("Vivo");
        arrayList.add("Oppo");

        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<String>(this,R.layout.activity_main,arrayList);
        listView.setAdapter(arrayAdapter);
    }
}