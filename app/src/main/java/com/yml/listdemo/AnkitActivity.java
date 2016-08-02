package com.yml.listdemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.yml.listdemo.adapter.RecyclerViewAdapter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by YML on 02/08/16.
 */
public class AnkitActivity extends AppCompatActivity {

    private String names[] = new String[]{"amlan","praveen","Ankit","Ayush","Nisha","Sudha","Eshwar"};

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_ankit);


        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        recyclerView.setHasFixedSize(true);

        LinearLayoutManager layoutManager
                = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);

        recyclerView.setLayoutManager(layoutManager);

        List<String> stringList = new ArrayList<>();
        for(int i=0;i<1000;i++){
            stringList.addAll(Arrays.asList(names));
        }

        RecyclerViewAdapter adapter = new RecyclerViewAdapter(AnkitActivity.this , stringList);
        recyclerView.setAdapter(adapter);

    }
}
