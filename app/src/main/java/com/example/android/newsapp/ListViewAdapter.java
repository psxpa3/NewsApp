package com.example.android.newsapp;

import android.content.Context;
import android.content.Intent;
import android.database.DataSetObserver;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by pinnacle on 28/5/16.
 */
public class ListViewAdapter implements ListAdapter {

    ArrayList<String> data;
    Context context;

    public ListViewAdapter(ArrayList<String> data, Context context) {
        this.data = data;
        this.context = context;
    }

    @Override
    public boolean areAllItemsEnabled() {
        return false;
    }

    @Override
    public boolean isEnabled(int i) {
        return false;
    }

    @Override
    public void registerDataSetObserver(DataSetObserver dataSetObserver) {

    }

    @Override
    public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {

    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if(view == null){
            LayoutInflater inflater = LayoutInflater.from(context);
            view = inflater.inflate(R.layout.list_item,null);
            setData(view,i);
        }else {
            setData(view,i);
        }

        return view;
    }

    public void setData(View view, final int i){
        TextView textView = (TextView) view.findViewById(R.id.textview);
        textView.setText(data.get(i));
        textView.setOnClickListener(textListener);
    }

    View.OnClickListener textListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            // code executes when some one click on textview.
            String urlString="http://www.google.com";
            Intent intent=new Intent(Intent.ACTION_VIEW,Uri.parse(urlString));
            context.startActivity(intent);
        }
    };

    @Override
    public int getItemViewType(int i) {
        return 0;
    }

    @Override
    public int getViewTypeCount() {
        return data.size();
    }

    @Override
    public boolean isEmpty() {
        return false;
    }
}
