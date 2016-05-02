package com.nz.alexbutenko.dailyselfie;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;

public class DetailActivity extends AppCompatActivity {

    public static final String IMAGE_FILE_PATH = "image_file_path";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ImageView imageView = (ImageView) findViewById(R.id.imageDetail);
        ImageUtils.setPic(imageView, getIntent().getStringExtra(IMAGE_FILE_PATH));
    }
}
