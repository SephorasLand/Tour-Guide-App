package com.example.project.tourguideapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class GalleryActivity extends AppCompatActivity {
    private static final String TAG = "GalleryActivity";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);
        Intent intent = getIntent();
        ArrayList<String> data = (ArrayList<String>)intent.getExtras().get("data");
        ((TextView)findViewById(R.id.description)).setText(data.get(2));
        ((TextView)findViewById(R.id.place_name)).setText(data.get(1));
        ((ImageView)findViewById(R.id.image)).setImageDrawable(getResources().getDrawable(Integer.valueOf(data.get(3))));
    }

}
