package com.example.holamundo;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.text.style.BackgroundColorSpan;
import android.view.View;
import android.widget.Button;

public class cambiaFondo extends AppCompatActivity {

    private Button endender,apagar;
    private View vista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cambia_fondo);
        endender = (Button) findViewById(R.id.button2);
        apagar = (Button) findViewById(R.id.button);
        vista = this.getWindow().getDecorView();
        eventos();
    }

    public void eventos() {
    endender.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            vista.setBackgroundColor(Color.BLUE);
        }
    });
    apagar.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            vista.setBackgroundColor(Color.WHITE);
        }
    });
    }
}