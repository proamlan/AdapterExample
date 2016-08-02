package com.yml.listdemo.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.yml.listdemo.R;

import java.util.List;

/**
 * Created by YML on 02/08/16.
 */
public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {

    private Context context;
    private List<String> stringList;

    public RecyclerViewAdapter(Context context, List<String> stringList) {
        this.context = context;
        this.stringList = stringList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.my_first_custom_row , parent , false);

        MyViewHolder viewHolder = new MyViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

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
    }

    @Override
    public int getItemCount() {
        return stringList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView textView;

        public MyViewHolder(View itemView) {
            super(itemView);
            imageView = (ImageView) itemView.findViewById(R.id.profile_image);
            textView = (TextView) itemView.findViewById(R.id.profile_name);
        }
    }

    ;
}
