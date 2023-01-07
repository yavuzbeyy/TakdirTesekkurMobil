package com.yavuz.takdirtesekkur;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class empty extends AppCompatActivity {

    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_empty);
    }
    public void gazla(View view){
        Intent intent = new Intent(empty.this,MainActivity2.class);
        startActivity(intent);

        mediaPlayer = MediaPlayer.create(this,R.raw.gecisefekti);
        mediaPlayer.start();
    }
}