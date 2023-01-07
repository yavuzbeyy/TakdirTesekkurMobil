package com.yavuz.takdirtesekkur;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;

public class sekiz extends AppCompatActivity {

    float turkce,matematik,fen,sosyal,ingilizce,din,resim,music,beden,bilisim,sec1,sec2,ortalama;
    int x,y;
    private InterstitialAd mInterstitialAd;
    EditText editText;
    EditText editText2;
    EditText editText3;
    EditText editText4;
    EditText editText5;
    EditText editText6;
    EditText editText7;
    EditText editText8;
    EditText editText9;
    EditText editText10;
    EditText saat;
    EditText saat2;
    EditText secmeli;
    EditText secmeli2;
    Boolean kaldinmi;
    MediaPlayer mediaPlayer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sekiz);

        editText = findViewById(R.id.textView24);
        editText2 = findViewById(R.id.textView25);
        editText3 = findViewById(R.id.textView26);
        editText4 = findViewById(R.id.textView27);
        editText5 = findViewById(R.id.textView28);
        editText6 = findViewById(R.id.textView29);
        editText7 = findViewById(R.id.textView30);
        editText8 = findViewById(R.id.textView31);
        editText9 = findViewById(R.id.textView32);
        editText10 = findViewById(R.id.textView33);
        saat = findViewById(R.id.ix);
        saat2 = findViewById(R.id.iy);
        secmeli = findViewById(R.id.textView345);
        secmeli2 = findViewById(R.id.textView35);

        mInterstitialAd = new InterstitialAd(this);
        mInterstitialAd.setAdUnitId("ca-app-pub-4812352403081392/6756589237");
        mInterstitialAd.loadAd(new AdRequest.Builder().build());

    }
    public  void  ortalama(View view){

        if (editText.getText().toString().isEmpty()){
            editText.setText("0");}
        if (editText2.getText().toString().isEmpty()){
            editText2.setText("0");}
        if (editText3.getText().toString().isEmpty()){
            editText3.setText("0");}
        if (editText4.getText().toString().isEmpty()){
            editText4.setText("0");}
        if (editText5.getText().toString().isEmpty()){
            editText5.setText("0");}
        if (editText6.getText().toString().isEmpty()){
            editText6.setText("0");}
        if (editText7.getText().toString().isEmpty()){
            editText7.setText("0");}
        if (editText8.getText().toString().isEmpty()){
            editText8.setText("0");}
        if (editText9.getText().toString().isEmpty()){
            editText9.setText("0");}
        if (editText10.getText().toString().isEmpty()){
            editText10.setText("0");}
        if (secmeli.getText().toString().isEmpty()){
            secmeli.setText("0");}
        if (secmeli2.getText().toString().isEmpty()){
            secmeli2.setText("0");}
        if (saat.getText().toString().isEmpty()){
            saat.setText("0");}
        if (saat2.getText().toString().isEmpty()){
            saat2.setText("0");}

        turkce = Float.parseFloat(editText.getText().toString());
        matematik = Float.parseFloat(editText2.getText().toString());
        fen = Float.parseFloat(editText3.getText().toString());
        sosyal = Float.parseFloat(editText4.getText().toString());
        ingilizce = Float.parseFloat(editText5.getText().toString());
        din = Float.parseFloat(editText6.getText().toString());
        resim = Float.parseFloat(editText7.getText().toString());
        music = Float.parseFloat(editText8.getText().toString());
        beden = Float.parseFloat(editText9.getText().toString());
        bilisim = Float.parseFloat(editText10.getText().toString());
        sec1 = Float.parseFloat(secmeli.getText().toString());
        sec2 = Float.parseFloat(secmeli2.getText().toString());
        x = Integer.parseInt(saat.getText().toString());
        y = Integer.parseInt(saat2.getText().toString());

        if (turkce<55 || matematik<45 || fen<45|| sosyal<45|| ingilizce<45|| din<45|| resim<45||
                music<45|| beden <45|| bilisim<45){
            kaldinmi = true;
        } else {
            kaldinmi = false;
        }

        ortalama = ((turkce*6)+(matematik*5)+(fen*4)+(sosyal*3)+(ingilizce*3)+(din*2)+(resim)+(music)+(beden*2)+(bilisim*2)+(sec1*x)+(sec2*y))/(29+x+y);
        Intent git = new Intent(sekiz.this,sonuc.class);
        git.putExtra("bakbunuburdanalin",ortalama);
        git.putExtra("kalma",kaldinmi);

        mediaPlayer = MediaPlayer.create(this,R.raw.gecisefekti);
        mediaPlayer.start();

        startActivity(git);
        if (mInterstitialAd.isLoaded()) {
            mInterstitialAd.show();
        }

        return;
    }
}