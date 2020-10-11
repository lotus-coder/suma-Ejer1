package com.example.holamundo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Binder;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class ejer4 extends AppCompatActivity {

    private Button btnGoogle,btnYahoo,btnBing;
    private ImageView imgGoogle,imgYahoo,imgBing;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejer4);
        btnBing = (Button) findViewById(R.id.buttonBing);
        btnGoogle = (Button) findViewById(R.id.buttonGoog);
        btnYahoo = (Button) findViewById(R.id.buttonYah);
        imgBing = (ImageView) findViewById(R.id.imageBing);
        imgGoogle = (ImageView) findViewById(R.id.imageGoogle);
        imgYahoo = (ImageView) findViewById(R.id.imageYahoo);
        aniadeEventos();
    }





    public void aniadeEventos(){
        btnYahoo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgBing.setVisibility(View.INVISIBLE);
                imgGoogle.setVisibility(View.INVISIBLE);
                imgYahoo.setVisibility(View.VISIBLE);
            }
        });
        btnGoogle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgBing.setVisibility(View.INVISIBLE);
                imgGoogle.setVisibility(View.VISIBLE);
                imgYahoo.setVisibility(View.INVISIBLE);
            }
        });
        btnBing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgBing.setVisibility(View.VISIBLE);
                imgGoogle.setVisibility(View.INVISIBLE);
                imgYahoo.setVisibility(View.INVISIBLE);
            }
        });
    }







}