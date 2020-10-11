package com.example.holamundo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.ToggleButton;

public class ejer6 extends AppCompatActivity {
    private ImageView luzOn1,luzOn2,luzOf1,luzOf2,camara1,camara2,persianaAb,persianaCer;
    private ToggleButton btnCamara2,btnLuz2;
    private Switch  swtCamara1,swtLuz1,swtPersiana;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejer6);
        btnCamara2 =(ToggleButton)findViewById(R.id.toggleCamara2);
        btnLuz2 =(ToggleButton)findViewById(R.id.toggleLuz2);
        swtCamara1 = (Switch) findViewById(R.id.switch1);
        swtLuz1 = (Switch) findViewById(R.id.switch2);
        swtPersiana = (Switch) findViewById(R.id.switchVentana);
        luzOn1 = (ImageView) findViewById(R.id.imageBombillaon1);
        luzOn2 = (ImageView) findViewById(R.id.imageBombillaon2);
        persianaAb = (ImageView) findViewById(R.id.imagePersianaAbierta);
        persianaCer = (ImageView) findViewById(R.id.imagePersianaCerrada);
        luzOf1 = (ImageView) findViewById(R.id.imageBombillaoff1);
        luzOf2 = (ImageView) findViewById(R.id.imageBombillaoff2);
        camara1 = (ImageView) findViewById(R.id.imageCamara2);
        camara2 = (ImageView) findViewById(R.id.imageCamara1);
        eventos();
    }

    private void eventos(){
        btnCamara2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(btnCamara2.isChecked()){
                    camara2.setVisibility(View.VISIBLE);
                }else {
                    camara2.setVisibility(View.INVISIBLE);
                }
            }
        });
        btnLuz2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(btnLuz2.isChecked()){
                    luzOn2.setVisibility(View.VISIBLE);
                    luzOf2.setVisibility(View.INVISIBLE);
                }else {
                    luzOn2.setVisibility(View.INVISIBLE);
                    luzOf2.setVisibility(View.VISIBLE);
                }
            }
        });
        swtCamara1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(swtCamara1.isChecked()){
                    camara1.setVisibility(View.VISIBLE);
                }else {
                    camara1.setVisibility(View.INVISIBLE);
                }
            }
        });
        swtLuz1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(swtLuz1.isChecked()){
                    luzOn1.setVisibility(View.VISIBLE);
                    luzOf1.setVisibility(View.INVISIBLE);
                }else {
                    luzOn1.setVisibility(View.INVISIBLE);
                    luzOf1.setVisibility(View.VISIBLE);
                }
            }
        });
        swtPersiana.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(swtPersiana.isChecked()){
                    persianaAb.setVisibility(View.VISIBLE);
                    persianaCer.setVisibility(View.INVISIBLE);
                }else {
                    persianaAb.setVisibility(View.INVISIBLE);
                    persianaCer.setVisibility(View.VISIBLE);
                }
            }
        });
    }


}