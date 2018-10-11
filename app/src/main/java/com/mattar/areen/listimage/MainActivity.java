package com.mattar.areen.listimage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    String[] words={"coloseom","dog","duck"};
    int[] images={R.mipmap.coloseom,R.mipmap.dog,R.mipmap.duck};
    ListView listView;
    CustomAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=(ListView)findViewById(R.id.lv);
        myAdapter=new CustomAdapter(this,words,images);
        listView.setAdapter(myAdapter);
        // test1

    }
}
