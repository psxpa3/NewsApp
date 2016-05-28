package com.example.android.newsapp;

import android.app.Activity;
import android.app.ListActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class Common extends AppCompatActivity {
    String[] retrievedString;
    String stringEachValue;
    ArrayList<String> dataList = new ArrayList<>();
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.common);
        Bundle extra = getIntent().getExtras();
        if(extra!=null && extra.containsKey("sendingArray")){
            retrievedString = extra.getStringArray("sendingArray");
        }

        for (int i=0;i<retrievedString.length;i++){
            dataList.add(retrievedString[i]);

        }
        ListView listView = (ListView) findViewById(R.id.list_view);
        ListViewAdapter listAdapter = new ListViewAdapter(dataList,this);
        listView.setAdapter(listAdapter);
    }
}
