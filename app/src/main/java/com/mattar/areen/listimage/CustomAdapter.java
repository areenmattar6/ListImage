package com.mattar.areen.listimage;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Hp1 on 10/10/2018.
 */

public class CustomAdapter extends ArrayAdapter {

    String[] names;
    int[] images;


    public CustomAdapter(Context context,String[] names,int[] images) {
        super(context, R.layout.custom_view,names);
        this.names=names;
        this.images=images;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater layoutInflater=LayoutInflater.from(getContext());
        View customView=layoutInflater.inflate( R.layout.custom_view,parent,false);
        TextView textView=(TextView) customView.findViewById(R.id.textView2);
        ImageView image=(ImageView)customView.findViewById(R.id.imageView);
        textView.setText(names[position]);
        image.setImageResource(images[position]);
        return customView;
    }
}
