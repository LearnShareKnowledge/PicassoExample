package com.learnshare.picassoexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {


    private String url = "http://i.imgur.com/DvpvklR.png%22";

    private ImageView ivImageView ;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        ivImageView = (ImageView) findViewById(R.id.ivImageView);

        Picasso.with(this).load(url).resize(50,50).centerCrop().into(ivImageView);

    }
}
