package com.example.falcon.seochecklist.activities;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.TextView;

import com.example.falcon.seochecklist.R;


public class MyListAdapter extends ArrayAdapter<Item> {
    private Item[] items = null;
    private Context mContext;

    public MyListAdapter(Context context, int textViewResourceId, Item[] items) {

        super(context, textViewResourceId, items);

        mContext = context;
        this.items = items;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = inflater.inflate(R.layout.list_item, parent, false);
        TextView name = (TextView) convertView.findViewById(R.id.tvListItemText);
        CheckBox cb = (CheckBox) convertView.findViewById(R.id.cbListItemCheckbox);
        name.setText(items[position].getName());
        if(items[position].getValue() == 1)
            cb.setChecked(true);
        else
            cb.setChecked(false);
        return convertView;
    }
}
