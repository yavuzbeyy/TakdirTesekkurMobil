package com.yavuz.takdirtesekkur;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class sonuc extends AppCompatActivity {


     @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sonuc);

        Intent bunuburdanaldim = getIntent();
        Intent kaldinmi = getIntent();


        TextView ortalama = findViewById(R.id.ortalama);
        TextView basari = findViewById(R.id.basari);

        Float notortalamasi = bunuburdanaldim.getFloatExtra("bakbunuburdanalin",0);
        ortalama.setText("Karne Ortalamanız = " + notortalamasi.toString());

        Boolean kontrol = kaldinmi.getBooleanExtra("kalma",true);


        if(notortalamasi>84.99 && kontrol == false){
        basari.setText("Tebrikler Takdir Belgesi Almaya Hak Kazandınız !");

        }else if (notortalamasi>69.99 && kontrol == false){
            basari.setText("Tebrikler Teşekkür Belgesi Almaya Hak Kazandınız !");
}

        else if (notortalamasi<69.99){
            basari.setText("Ortalamanız düşük olduğu için bir belge alamadınız !");
        }

        else if (notortalamasi>69.99 && kontrol == true){
            basari.setText("Ortalamanız yüksek ancak bazı derslerden kaldığınız için belge alamadınız !");
        }
        else if (notortalamasi>84.99 && kontrol == true){
            basari.setText("Ortalamanız yüksek ancak bazı derslerden kaldığınız için belge alamadınız !");
        }

     }
   public void menu(View view){
         Intent intent = new Intent(sonuc.this,MainActivity2.class);
         startActivity(intent);
   }

}
