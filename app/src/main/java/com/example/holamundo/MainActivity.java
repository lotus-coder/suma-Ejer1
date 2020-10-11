package com.example.holamundo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button boton;
    private EditText caja1,caja2;
    private TextView resul;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        boton = (Button)findViewById(R.id.BotonSuma);
        caja1 = (EditText) findViewById(R.id.editTextSuma1);
        caja2 = (EditText) findViewById(R.id.editTextSuma2);
        resul = (TextView) findViewById(R.id.TextViewResultado);
        aniadeEventos();
    }

    public void aniadeEventos(){
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1,num2;
                num1 = Integer.parseInt(caja1.getText().toString());
                num2 = Integer.parseInt(caja2.getText().toString());
                resul.setText(""+(num1+num2));
            }
        });
    }




}