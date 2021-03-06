package com.udayaproject.pat;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by DETECTIVE7 on 01-04-2016.
 */
public class DataAdapter extends ArrayAdapter {

    Context mContext;
    List<String> colleges = new ArrayList<>();

    public DataAdapter(Context context, int resource) {
        super(context, resource);
    }

    public DataAdapter(Context context, List<String> colleges) {
        super(context, R.layout.spinner_item, colleges);
        mContext = context;
        this.colleges = colleges;
    }

    @Override
    public View getDropDownView(int position, View convertView, ViewGroup parent) {
        return getCustomView(position, convertView, parent);
    }


    @Override
    public int getCount() {
        return colleges.size();
    }

    public View getCustomView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflator = LayoutInflater.from(mContext);
        convertView = inflator.inflate(R.layout.spinner_item, null);
        TextView tv = (TextView) convertView.findViewById(R.id.spinner_text);
        tv.setText(colleges.get(position));
        return convertView;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return getCustomView(position, convertView, parent);
    }

}


