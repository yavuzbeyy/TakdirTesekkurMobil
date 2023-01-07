package com.yavuz.takdirtesekkur;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void devam(View view){

        mediaPlayer = MediaPlayer.create(this,R.raw.gecisefekti);
        mediaPlayer.start();


        Intent intent = new Intent(MainActivity.this,empty.class);
        startActivity(intent);
    }
}