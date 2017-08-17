package com.nyc.justinstanger.vinylcollector;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = "MainActivity";
    public static final String BASE_URL = "https://api.discogs.com/artists/1/releases";
    //Discogs API

    RecyclerView mRecyclerView;
    RecyclerViewAdapter adapter;
    List<AlbumObject> albums;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayoutManager linearLayoutManager =
                new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        mRecyclerView.setLayoutManager(linearLayoutManager);

        adapter = new RecyclerViewAdapter(albums);
        mRecyclerView.setAdapter(adapter);

    }
}
