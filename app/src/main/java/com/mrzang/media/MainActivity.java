package com.mrzang.media;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.mrzang.medialibrary.loader.MediaLoader;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MediaLoader mediaLoader = MediaLoader.getInstance(this);
    }
}
