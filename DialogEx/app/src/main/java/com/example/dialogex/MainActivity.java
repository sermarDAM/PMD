package com.example.dialogex;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public abstract class MainActivity extends FragmentActivity implements FragmentoDialogo.NoticeDialogListener{

    Button miBoton;
    TextView miResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        miBoton = (Button) findViewById(R.id.boton);
        miBoton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ConfirmarPago();
            }
        });
    }

    public void ConfirmarPago(){
        DialogFragment newFragment = new FragmentoDialogo();
        newFragment.show(getSupportFragmentManager(),"pago");
    }

    public void onPositiveButtonClick(DialogFragment dialog){
        miResultado = (TextView) findViewById(R.id.resultado);
        miResultado.setText("Has efectuado el pago");
    }

    public void onNegativeButtonClick(DialogFragment dialog){
        miResultado = (TextView) findViewById(R.id.resultado);
        miResultado.setText("Has cancelado el pago");
    }


}