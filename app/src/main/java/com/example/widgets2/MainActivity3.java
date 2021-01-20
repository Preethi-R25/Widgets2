package com.example.widgets2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity3 extends AppCompatActivity {

    Spinner spinner;
    ArrayList arrayList;
    ArrayAdapter arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        spinner=findViewById(R.id.spinner);
        arrayList=new ArrayList();

        arrayList.add("Preethi");
        arrayList.add("Jungkook");
        arrayList.add("Vincy");
        arrayList.add("V");
        arrayList.add("Nisha");
        arrayList.add("Jimin");
        arrayList.add("RM");
        arrayList.add("Hoseok");
        arrayList.add("Suga");
        arrayList.add("Jin");
        arrayList.add("Karthik");
        arrayList.add("Lisa");
        arrayList.add("Jennie");
        arrayList.add("Jisoo");
        arrayList.add("Rose");

        arrayAdapter=new ArrayAdapter(MainActivity3.this, android.R.layout.simple_list_item_1, arrayList);
        spinner.setAdapter(arrayAdapter);
         }

    }
