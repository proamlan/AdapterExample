package com.yml.listdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.yml.listdemo.adapter.MyArrayAdapter;
import com.yml.listdemo.adapter.MyCustomAdapter;
import com.yml.listdemo.adapter.ViewHolderAdapter;
import com.yml.listdemo.model.Data;

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

        List<Data> dataList = new ArrayList<>();
        for(int i=0;i<1000;i++){
            
            for(String s : names){
                Data data = new Data();
                data.setName(s);
                if (s.equalsIgnoreCase("amlan")) {
                   data.setImageResurceId(R.drawable.jurrasic_park);
                } else if (s.equalsIgnoreCase("praveen")) {
                   data.setImageResurceId(R.drawable.tiger);
                } else if (s.equalsIgnoreCase("Eshwar")) {
                   data.setImageResurceId(R.drawable.jaguar);
                } else if (s.equalsIgnoreCase("Sudha")) {
                   data.setImageResurceId(R.drawable.cat);
                } else if (s.equalsIgnoreCase("Nisha")) {
                   data.setImageResurceId(R.drawable.rabbit);
                } else if (s.equalsIgnoreCase("Ayush")) {
                   data.setImageResurceId(R.drawable.wolf);
                } else if (s.equalsIgnoreCase("Ankit")) {
                   data.setImageResurceId(R.drawable.dog);
                }

                dataList.add(data);
            }
        }

//        ArrayAdapter<s> adapter = new ArrayAdapter<s>(MainActivity.this , R.layout.list_item , sList);

        ViewHolderAdapter adapter = new ViewHolderAdapter(MainActivity.this , dataList);
//        MyCustomAdapter adapter= new MyCustomAdapter(MainActivity.this , sList);

//        MyArrayAdapter adapter = new MyArrayAdapter(MainActivity.this, 0,dataList);
        listView.setAdapter(adapter);
    }
}
