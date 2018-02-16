package com.pace.cs639spring.hw2;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;


class singleRow {

    String mDescription;
    int mImage;

}


public class AnimalDisplayListViewAdapter extends BaseAdapter {
    Context mContext;
    ArrayList<singleRow> mList;

    AnimalDisplayListViewAdapter(Context context) {
        mList = new ArrayList<singleRow>();
        mContext = context;
        String[] animals; = {"bat_description", "bird", "butterfly", "cat", "deer", "dog", "duck", "frog", "horse", "rabbit", "whale"};

        Resources res = context.getResources();
        String[] descriptions = res.getStringArray(R.array.);
        int[] images = {R.drawable.ic_bat, R.drawable.ic_bird, R.drawable.ic_butterfly, R.drawable.ic_cat, R.drawable.ic_deer, R.drawable.ic_dog, R.drawable.ic_duck, R.drawable.ic_frog, R.drawable.ic_horse, R.drawable.ic_rabbit, R.drawable.ic_whale};
        for (int i = 0; i < 11; i++) {
            mList.add(new singleRow(descriptions[i], images[i]));
        }
        /*
        * 1. get values from xml
        *
        */
    }


    @Override
    public int getCount() {
        return mList.size();
    }

    @Override
    public Object getItem(int position) {
        return mList.get(position);
    }
    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        /*
        * 1. get the root view.
        *
        *
        *
        *
        */






        return null;
    }
}


public class TestAdapter extends BaseAdapter {

    Context mContext;
    List<ExampleObject> mExamples;

    TestAdapter(Context context, List<ExampleObject> exampleObjectList) {
        mContext = context;
        mExamples = exampleObjectList;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = View.inflate(mContext, R.layout.list_item, null);
            ViewHolder viewHolder = new ViewHolder((ImageView) convertView.findViewById(R.id.image),
                    (TextView) convertView.findViewById(R.id.text));
            convertView.setTag(viewHolder);
        }

        ExampleObject object = (ExampleObject) getItem(position);
        ViewHolder viewHolder = (ViewHolder) convertView.getTag();

        viewHolder.mImageView.setBackgroundColor(object.mColor);
        viewHolder.mTextView.setText(object.mName);
        return convertView;
    }

    @Override
    public int getCount() {
        return mExamples.size();
    }

    @Override
    public Object getItem(int position) {
        return mExamples.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    static class ViewHolder {
        ImageView mImageView;
        TextView mTextView;

        ViewHolder(ImageView imageView, TextView textView) {
            mImageView = imageView;
            mTextView = textView;
        }

    }
}
