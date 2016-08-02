package com.yml.listdemo.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.yml.listdemo.R;

import java.util.List;

/**
 * Created by YML on 02/08/16.
 */
public class MyArrayAdapter extends ArrayAdapter<String> {


    private List<String> stringList ;
    private Context context;
    private int resource;
    private LayoutInflater inflater;

    public MyArrayAdapter(Context context, int resource, List<String> objects) {
        super(context, resource, objects);
        this.resource = resource;
        inflater = LayoutInflater.from(context);
        this.stringList = objects;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if(convertView == null) {
            holder = new ViewHolder();
            convertView = inflater.inflate(R.layout.my_first_custom_row, parent, false);
            holder.imageView = (ImageView) convertView.findViewById(R.id.profile_image);
            holder.textView = (TextView) convertView.findViewById(R.id.profile_name);
            convertView.setTag(holder);
        }else{
            holder = (ViewHolder) convertView.getTag();
        }

        String string = stringList.get(position);
        if (string.equalsIgnoreCase("amlan")) {
            holder.imageView.setImageResource(R.drawable.jurrasic_park);
        } else if (string.equalsIgnoreCase("praveen")) {
            holder.imageView.setImageResource(R.drawable.tiger);
        } else if (string.equalsIgnoreCase("Eshwar")) {
            holder.imageView.setImageResource(R.drawable.jaguar);
        } else if (string.equalsIgnoreCase("Sudha")) {
            holder.imageView.setImageResource(R.drawable.cat);
        } else if (string.equalsIgnoreCase("Nisha")) {
            holder.imageView.setImageResource(R.drawable.rabbit);
        } else if (string.equalsIgnoreCase("Ayush")) {
            holder.imageView.setImageResource(R.drawable.wolf);
        } else if (string.equalsIgnoreCase("Ankit")) {
            holder.imageView.setImageResource(R.drawable.dog);
        }

        holder.textView.setText(string);

        return convertView;
    }

    private static class  ViewHolder{
        ImageView imageView;
        TextView textView;
    }
}
