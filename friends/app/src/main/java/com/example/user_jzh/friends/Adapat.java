package com.example.user_jzh.friends;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;
public class Adapat extends ArrayAdapter {

    private int resourceId;

    Adapat(Context context,int resource,List objects){
        super(context,resource,objects);
        this.resourceId=resource;

    }



    public View getView(int postion,
                        View convertView,
                        ViewGroup parent){
        String data = (String) getItem(postion);
        View view=LayoutInflater.from(getContext()).
                inflate(resourceId,parent,false);
        TextView textView=view.findViewById(R.id.tex);
        textView.setText(data);
        return view;
    }
}
