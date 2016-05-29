package com.example.android.newsapp;

import android.content.Context;
import android.content.Intent;
import android.database.DataSetObserver;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.TextView;
import java.util.ArrayList;

/**
 * This class implements ListAdapter.
 */
public class ListViewAdapter implements ListAdapter {

    private ArrayList<String> contentListLink;
    private ArrayList<String> data;
    private Context context;

    public ListViewAdapter(ArrayList<String> data, Context context, ArrayList<String> contentListLink) {
        this.data = data;
        this.context = context;
        this.contentListLink = contentListLink;
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

    /**
     * This function is responsible for inflating of the list with.
     * @param i denotes index of the dataList.
     * @param view inflates list view.
     * @param viewGroup
     * @return list view
     */
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

    /**
     * This function is responsible for setting the retrieved data to text view
     * Along with this it sets listener on the created link named "more".
     * @param view retrieves text view.
     * @param i index of the link retrieved from contentListLink arrayList.
     */
    public void setData(View view, final int i){
        TextView textView = (TextView) view.findViewById(R.id.textview);
        textView.setText(data.get(i));

        TextView moreText = (TextView) view.findViewById(R.id.more);
        moreText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String urlString=contentListLink.get(i);
                Intent intent=new Intent(Intent.ACTION_VIEW,Uri.parse(urlString));
                context.startActivity(intent);
            }
        });
    }

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
