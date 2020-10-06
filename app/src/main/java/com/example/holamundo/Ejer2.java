package com.example.holamundo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Ejer2 extends AppCompatActivity {

    private Button bSuma,bResta,bDivision,bMultiplica;
    private EditText num1,num2;
    private TextView resul;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejer2);
        bSuma = (Button) findViewById(R.id.BotonSuma);
        bResta = (Button) findViewById(R.id.BotonResta);
        bMultiplica = (Button) findViewById(R.id.BotonMultiplica);
        bDivision = (Button) findViewById(R.id.BotonDivision);
        num1 = (EditText)findViewById(R.id.editTextSuma1);
        num2 = (EditText)findViewById(R.id.editTextSuma2);
        resul = (TextView) findViewById(R.id.TextViewResultado);
        ponEventos();
    }

    private void ponEventos() {
        bSuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int nume1 = Integer.parseInt(num1.getText().toString());
                int nume2 = Integer.parseInt(num2.getText().toString());
                resul.setText(""+(nume1+nume2));
            }
        });
        bResta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int nume1 = Integer.parseInt(num1.getText().toString());
                int nume2 = Integer.parseInt(num2.getText().toString());
                resul.setText(""+(nume1-nume2));
            }
        });
        bMultiplica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int nume1 = Integer.parseInt(num1.getText().toString());
                int nume2 = Integer.parseInt(num2.getText().toString());
                //int resultado = nume1*nume2;
                //resul.setText(""+resultado);
                resul.setText(""+(nume1 * nume2));
            }
        });
        bDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int nume1 = Integer.parseInt(num1.getText().toString());
                int nume2 = Integer.parseInt(num2.getText().toString());
                resul.setText(""+(nume1/nume2));
            }
        });
    }


}