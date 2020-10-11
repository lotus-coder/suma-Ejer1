package com.example.holamundo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ejer3 extends AppCompatActivity {

    private Button btnDni;
    private EditText numeroDNI,letraDNI;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejer3);
        btnDni = (Button) findViewById(R.id.BotonDNI);
        numeroDNI = (EditText) findViewById(R.id.NumeroDni);
        letraDNI = (EditText) findViewById(R.id.LetraDni);
        escuchador();
    }



    public void escuchador(){
        btnDni.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num = Integer.parseInt(numeroDNI.getText().toString());
                letraDNI.setText(letraDni(num));
            }
        });
    }

    public String letraDni(int dni) {
        String juegoCaracteres = "TRWAGMYFPDXBNJZSQVHLCKE";
        int modulo = dni % 23;
        String letra = ""+juegoCaracteres.charAt(modulo);
        return letra;
    }
}