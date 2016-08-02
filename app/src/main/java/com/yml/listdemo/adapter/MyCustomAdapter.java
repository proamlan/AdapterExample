package com.yml.listdemo.adapter;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.yml.listdemo.R;

import java.util.List;

/**
 * Created by YML on 02/08/16.
 */
public class MyCustomAdapter extends BaseAdapter {
    private Context context;
    private List<String> stringList;
    private LayoutInflater inflater;

    public MyCustomAdapter(Context context, List<String> stringList) {
        this.context = context;
        this.stringList = stringList;

        inflater = LayoutInflater.from(context);
    }


    @Override
    public int getCount() {
        return stringList.size();
    }

    @Override
    public Object getItem(int i) {
        return stringList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        Log.d("amlan", "get View called....." + i + "  " + view);
        View row;
        if (view == null) {
            row = inflater.inflate(R.layout.my_first_custom_row, viewGroup, false);
        } else {
            row = view;
        }
        ImageView imageView = (ImageView) row.findViewById(R.id.profile_image);
        TextView textView = (TextView) row.findViewById(R.id.profile_name);

        String string = stringList.get(i);
        if (string.equalsIgnoreCase("amlan")) {
            imageView.setImageResource(R.drawable.jurrasic_park);
        } else if (string.equalsIgnoreCase("praveen")) {
            imageView.setImageResource(R.drawable.tiger);
        } else if (string.equalsIgnoreCase("Eshwar")) {
            imageView.setImageResource(R.drawable.jaguar);
        } else if (string.equalsIgnoreCase("Sudha")) {
            imageView.setImageResource(R.drawable.cat);
        } else if (string.equalsIgnoreCase("Nisha")) {
            imageView.setImageResource(R.drawable.rabbit);
        } else if (string.equalsIgnoreCase("Ayush")) {
            imageView.setImageResource(R.drawable.wolf);
        } else if (string.equalsIgnoreCase("Ankit")) {
            imageView.setImageResource(R.drawable.dog);
        }

        textView.setText(string);

        return row;
    }
}
