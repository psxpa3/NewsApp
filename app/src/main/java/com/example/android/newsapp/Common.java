package com.example.android.newsapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;
/**
 * Class to retrieve data related to category of clicked button.
 */
public class Common extends AppCompatActivity {
    /**
     * Creation of arrayList to retrieve data related to domain of clicked button.
     */
    DataClass dataClassContent;
    ArrayList<String> contentList = new ArrayList<>();
    ArrayList<String> contentListLink = new ArrayList<>();
    ArrayList<String> dataList = new ArrayList<>();

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.common);
        Bundle extra = getIntent().getExtras();

        if(extra!=null && extra.containsKey("sendingArray")){
            dataClassContent = extra.getParcelable("sendingArray");
        }

        int imageId = dataClassContent.getImageId();
        contentList = dataClassContent.getContentList();
        contentListLink = dataClassContent.getContentLinkList();

        ImageView imageView = (ImageView) findViewById(R.id.image_view);
        imageView.setImageResource(imageId);

        ListView listView = (ListView) findViewById(R.id.list_view);
        ListViewAdapter listAdapter = new ListViewAdapter(contentList,this, contentListLink);
        listView.setAdapter(listAdapter);
    }
}
