package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button botoncero, boton1, boton2, boton3, boton4, boton5, boton6, boton7, boton8,boton9,
            botonmas, botonresta, botonpor,clear, borra, botondividir, Punto, Igual;
    TextView Resultado;
    double resultado1;
    String signo, textoperacion , numguardado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        botoncero = (Button)findViewById(R.id.cero);
        boton1 = (Button)findViewById(R.id.numero1);
        boton2 = (Button)findViewById(R.id.numero2);
        boton3 = (Button)findViewById(R.id.numero3);
        boton4 = (Button)findViewById(R.id.numero4);
        boton5 = (Button)findViewById(R.id.numero5);
        boton6 = (Button)findViewById(R.id.numero6);
        boton7 = (Button)findViewById(R.id.numero7);
        boton8 = (Button)findViewById(R.id.numero8);
        boton9 = (Button)findViewById(R.id.numero9);
        botonmas = (Button)findViewById(R.id.signo_mas);
        botonresta = (Button)findViewById(R.id.signo_menos);
        botonpor = (Button)findViewById(R.id.signo_por);
        clear = (Button)findViewById(R.id.clean);
        borra = (Button)findViewById(R.id.borrar);
        botondividir = (Button)findViewById(R.id.signo_division);
        Resultado = (TextView)findViewById(R.id.resultado);
        Punto = (Button)findViewById(R.id.punto);
        Igual = (Button)findViewById(R.id.signo_igual);

        boton1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                textoperacion = Resultado.getText().toString();
                textoperacion = textoperacion + "1";
                Resultado.setText(textoperacion);
            }
        });

        boton2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                textoperacion = Resultado.getText().toString();
                textoperacion = textoperacion + "2";
                Resultado.setText(textoperacion);
            }
        });

        boton3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                textoperacion = Resultado.getText().toString();
                textoperacion = textoperacion + "3";
                Resultado.setText(textoperacion);
            }
        });

        boton4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                textoperacion = Resultado.getText().toString();
                textoperacion = textoperacion + "4";
                Resultado.setText(textoperacion);
            }
        });

        boton5.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                textoperacion = Resultado.getText().toString();
                textoperacion = textoperacion + "5";
                Resultado.setText(textoperacion);
            }
        });

        boton6.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                textoperacion = Resultado.getText().toString();
                textoperacion = textoperacion + "6";
                Resultado.setText(textoperacion);
            }
        });

        boton7.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                textoperacion = Resultado.getText().toString();
                textoperacion = textoperacion + "7";
                Resultado.setText(textoperacion);
            }
        });

        boton8.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                textoperacion = Resultado.getText().toString();
                textoperacion = textoperacion + "8";
                Resultado.setText(textoperacion);
            }
        });

        boton9.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                textoperacion = Resultado.getText().toString();
                textoperacion = textoperacion + "9";
                Resultado.setText(textoperacion);
            }
        });

        botonmas.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                numguardado = Resultado.getText().toString();
                signo = "+";
                Resultado.setText("");
            }
        });

        botonresta.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                numguardado = Resultado.getText().toString();
                signo = "-";
                Resultado.setText("");
            }
        });

        botonpor.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                numguardado = Resultado.getText().toString();
                signo = "*";
                Resultado.setText("");
            }
        });

        botondividir.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                numguardado = Resultado.getText().toString();
                signo = "÷";
                Resultado.setText("");
            }
        });

        Punto.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                textoperacion = Resultado.getText().toString();
                textoperacion = textoperacion + ".";
                Resultado.setText(textoperacion);
            }
        });

        clear.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                textoperacion = "";
                Resultado.setText(textoperacion);
                numguardado = "";
                signo = "";
            }
        });

        borra.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                textoperacion = Resultado.getText().toString();
                textoperacion = textoperacion.substring(0,textoperacion.length()-1);
                Resultado.setText(textoperacion);
            }
        });

        Igual.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                textoperacion = Resultado.getText().toString();
                textoperacion = textoperacion + "1";
                if(signo.equals("+")){
                    resultado1 = Double.parseDouble(numguardado) + Double.parseDouble(Resultado.getText().toString());
                    Resultado.setText(String.valueOf(resultado1));
                }

                if(signo.equals("-")){
                    resultado1 = Double.parseDouble(numguardado) - Double.parseDouble(Resultado.getText().toString());
                    Resultado.setText(String.valueOf(resultado1));
                }

                if(signo.equals("*")){
                    resultado1 = Double.parseDouble(numguardado) * Double.parseDouble(Resultado.getText().toString());
                    Resultado.setText(String.valueOf(resultado1));
                }

                if(signo.equals("÷")){
                    resultado1 = Double.parseDouble(numguardado) / Double.parseDouble(Resultado.getText().toString());
                    Resultado.setText(String.valueOf(resultado1));
                }

            }
        });

    }
}