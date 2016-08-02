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
import com.yml.listdemo.model.Data;

import java.util.List;

/**
 * Created by YML on 02/08/16.
 */
public class ViewHolderAdapter extends BaseAdapter {
    private Context context;
    private List<Data> dataList;
    private LayoutInflater inflater;

    public ViewHolderAdapter(Context context, List<Data> stringList) {
        this.context = context;
        this.dataList = stringList;

        inflater = LayoutInflater.from(context);
    }


    @Override
    public int getCount() {
        return dataList.size();
    }

    @Override
    public Object getItem(int i) {
        return dataList.get(i);
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

        Data data = dataList.get(i);


        holder.textView.setText(data.getName());
        holder.imageView.setImageResource(data.getImageResurceId());

        return view;
    }

    private static class  ViewHolder{
        ImageView imageView;
        TextView textView;
    }
}
