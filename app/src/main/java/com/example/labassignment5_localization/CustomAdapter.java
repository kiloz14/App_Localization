package com.example.labassignment5_localization;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter{

    private Context context;
    String color[] , background[];



        // new String[]{"blue","magenta","red","yellow", "green", "black","darkgray","cyan","lightgray", "gray" };


    public CustomAdapter(Context context, String[] color, String[] background){
        this.color = color;
        this.background = background;
        this.context = context;
    }

    @Override
    public int getCount(){
        return color.length;
    }

    @Override
    public Object getItem(int position) {
        return color[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final TextView textView = new TextView(context);
        textView.findViewById(R.id.spinner);
        String colorName = (String) getItem(position);
        textView.setText(colorName.toUpperCase());
        textView.setBackgroundColor(Color.parseColor(background[position]));

        return textView;
    }

}