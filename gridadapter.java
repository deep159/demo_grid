package com.example.hi.grid;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import java.util.ArrayList;

/**
 * Created by Hi on 11-03-2017.
 */



public class gridadapter extends BaseAdapter {
    Context context;
    ArrayList<Integer> items;
    LayoutInflater inflater;
    public gridadapter(MainActivity mainActivity, ArrayList flag) {
        context=mainActivity;
        items=flag;
        inflater=inflater.from(context);
    }

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Object getItem(int i) {
        return i;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View convertView, ViewGroup viewGroup) {
        ImageView mimageview;
        convertView=inflater.inflate(R.layout.gridview,null);
        mimageview= (ImageView) convertView.findViewById(R.id.img);
        mimageview.setImageResource(items.get(i));
        return convertView;
    }
}
