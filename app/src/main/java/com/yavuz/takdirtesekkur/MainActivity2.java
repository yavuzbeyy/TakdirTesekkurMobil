package com.yavuz.takdirtesekkur;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

public class MainActivity2 extends AppCompatActivity {

    private AdView mAdView;

    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });
        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
    }

    public void altiya(View view){
        mediaPlayer = MediaPlayer.create(this,R.raw.gecisefekti);
        mediaPlayer.start();
        Intent intent = new Intent(MainActivity2.this,alti.class);
        startActivity(intent);

    }
    public void yediye(View view){
        mediaPlayer = MediaPlayer.create(this,R.raw.gecisefekti);
        mediaPlayer.start();
        Intent intent = new Intent(MainActivity2.this,yedi.class);
        startActivity(intent);
    }
    public void sekize(View view){
        mediaPlayer = MediaPlayer.create(this,R.raw.gecisefekti);
        mediaPlayer.start();
        Intent intent = new Intent(MainActivity2.this,sekiz.class);
        startActivity(intent);
    }
    public void lise(View view){
        mediaPlayer = MediaPlayer.create(this,R.raw.gecisefekti);
        mediaPlayer.start();
        Intent intent = new Intent(MainActivity2.this,lise.class);
        startActivity(intent);
    }
}