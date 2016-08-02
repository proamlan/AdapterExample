package com.yml.listdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.yml.listdemo.adapter.MyArrayAdapter;
import com.yml.listdemo.adapter.MyCustomAdapter;
import com.yml.listdemo.adapter.ViewHolderAdapter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private String names[] = new String[]{"amlan","praveen","Ankit","Ayush","Nisha","Sudha","Eshwar"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        listView  = (ListView) findViewById(R.id.listview);

        List<String> stringList = new ArrayList<>();
        for(int i=0;i<1000;i++){
            stringList.addAll(Arrays.asList(names));
        }

//        ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity.this , R.layout.list_item , stringList);

//        ViewHolderAdapter adapter = new ViewHolderAdapter(MainActivity.this , stringList);
//        MyCustomAdapter adapter= new MyCustomAdapter(MainActivity.this , stringList);

        MyArrayAdapter adapter = new MyArrayAdapter(MainActivity.this, 0,stringList);
        listView.setAdapter(adapter);
    }
}
