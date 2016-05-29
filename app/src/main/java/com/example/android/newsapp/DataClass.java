package com.example.android.newsapp;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
/**
 * This class implements Parcelable interface for consolidation of various data to be sent to another activity on clicking of particular category button (ex. Science, Sports)
 */
public class DataClass implements Parcelable {
    private int imageId;
    private ArrayList <String> contentList;
    private ArrayList <String> contentListLink;

    public DataClass(int imageId, ArrayList<String> list, ArrayList<String> listLink) {
        this.imageId = imageId;
        this.contentList = list;
        this.contentListLink = listLink;
    }

    public DataClass(Parcel source) {
        imageId = source.readInt();
        contentList = source.createStringArrayList();
        contentListLink = source.createStringArrayList();
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(imageId);
        dest.writeStringList(contentList);
        dest.writeStringList(contentListLink);
    }

    public int getImageId() {
        return imageId;
    }
    /**
     *  This method is responsible for providing all the titles in specific category (ex. Science, techonoly, national etc.)
     * @return the ArrayList of new Titles
     */
    public ArrayList<String> getContentList() {
        if (!(contentList == null)) {
            return contentList;
        }
        return null;
    }

    /**
     *  This method is responsible for providing all the links for the titles in specific category (ex. Science, techonoly, national etc.)
     * @return the ArrayList of new Titles
     */
    public ArrayList<String> getContentLinkList() {
        if (!(contentListLink == null)) {
            return contentListLink;
        }
        return null;
    }

    public static final Creator<DataClass> CREATOR = new Creator<DataClass>() {
        @Override
        public DataClass[] newArray(int size) {
            return new DataClass[size];
        }

        @Override
        public DataClass createFromParcel(Parcel source) {
            return new DataClass(source);
        }
    };
}
