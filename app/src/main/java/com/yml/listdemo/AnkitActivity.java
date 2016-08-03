package com.yml.listdemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageView;

import com.yml.listdemo.adapter.RecyclerViewAdapter;
import com.yml.listdemo.callback.ImageClickedCallback;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by YML on 02/08/16.
 */
public class AnkitActivity extends AppCompatActivity implements ImageClickedCallback {

    private String names[] = new String[]{"amlan", "praveen", "Ankit", "Ayush", "Nisha", "Sudha", "Eshwar"};

    private RecyclerView recyclerView;
    private ImageView imageView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_ankit);


        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        imageView = (ImageView) findViewById(R.id.selected_image);


        recyclerView.setHasFixedSize(true);

        LinearLayoutManager layoutManager
                = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);

        recyclerView.setLayoutManager(layoutManager);

        List<String> stringList = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            stringList.addAll(Arrays.asList(names));
        }

        RecyclerViewAdapter adapter = new RecyclerViewAdapter(AnkitActivity.this, stringList, this);
        recyclerView.setAdapter(adapter);

    }

    @Override
    public void onImageClicked(int position) {
        switch (position % 7) {
            case 0:
                imageView.setImageResource(R.drawable.jurrasic_park);
                break;
            case 1:
                imageView.setImageResource(R.drawable.tiger);
                break;
            case 2:
                imageView.setImageResource(R.drawable.dog);
                break;
            case 3:
                imageView.setImageResource(R.drawable.wolf);
                break;
            case 4:
                imageView.setImageResource(R.drawable.rabbit);
                break;
            case 5:
                imageView.setImageResource(R.drawable.cat);
                break;
            case 6:
                imageView.setImageResource(R.drawable.jaguar);
                break;
        }

    }
}
