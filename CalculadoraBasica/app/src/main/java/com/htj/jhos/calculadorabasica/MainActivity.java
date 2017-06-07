package com.htj.jhos.calculadorabasica;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText Num1;
    EditText Num2;
    Button btnSuma, btnResta, btnMultiplicacion, btnDividir;
    TextView Resultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Num1=(EditText) findViewById(R.id.Num1);
        Num2=(EditText) findViewById(R.id.Num2);
        btnSuma=(Button) findViewById(R.id.btnSuma);
        btnResta=(Button) findViewById(R.id.btnResta);
        btnMultiplicacion=(Button) findViewById(R.id.btnMultiplicacion);
        btnDividir=(Button) findViewById(R.id.btnDiv);
        Resultado=(TextView) findViewById(R.id.Resultado);


        btnSuma.setOnClickListener(this);
        btnResta.setOnClickListener(this);
        btnMultiplicacion.setOnClickListener(this);
        btnDividir.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String n1= Num1.getText().toString();
        String n2=Num2.getText().toString();

        int rs=0;

        int entero1=Integer.parseInt(n1);
        int entero2=Integer.parseInt(n2);

        switch (v.getId( )){
            case R.id.btnSuma:
                rs=entero1+entero2;
                break;
            case R.id.btnResta:
                rs=entero1-entero2;
                break;
            case R.id.btnMultiplicacion:
                rs=entero1*entero2;

                break;
            case R.id.btnDiv:
                rs=entero1/entero2;
                break;
        }
        Resultado.setText(" "+rs);

    }
}
