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
public class ViewHolderAdapter extends BaseAdapter {
    private Context context;
    private List<String> stringList;
    private LayoutInflater inflater;

    public ViewHolderAdapter(Context context, List<String> stringList) {
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
        ViewHolder holder;
        if(view == null) {
            holder = new ViewHolder();
            view = inflater.inflate(R.layout.my_first_custom_row, viewGroup, false);
            holder.imageView = (ImageView) view.findViewById(R.id.profile_image);
            holder.textView = (TextView) view.findViewById(R.id.profile_name);
            view.setTag(holder);
        }else{
            holder = (ViewHolder) view.getTag();
        }

        String string = stringList.get(i);
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

        return view;
    }

    private static class  ViewHolder{
        ImageView imageView;
        TextView textView;
    }
}
