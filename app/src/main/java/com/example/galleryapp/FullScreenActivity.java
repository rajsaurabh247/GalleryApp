package com.example.galleryapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class FullScreenActivity extends AppCompatActivity {

    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full_screen);

        imageView=findViewById(R.id.image_vview);

        getSupportActionBar().hide();
        getSupportActionBar().setTitle("Full Screen Image");

        Intent i=getIntent();
        int position=i.getExtras().getInt("id");
        Image_adapter image_adapter=new Image_adapter(this);

        imageView.setImageResource(image_adapter.imageArray[position]);
    }
}