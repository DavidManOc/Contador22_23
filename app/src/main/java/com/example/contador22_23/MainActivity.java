package com.example.contador22_23;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int cont ;
    TextView txt_contador1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cont = 0;
        //hay que enlacar la variable contador con la pantalla view
        txt_contador1 = findViewById(R.id.txt_contador);
    }

    public void resetearContador(View view) {
        cont = 0;
        txt_contador1.setText(String.valueOf(cont));

    }

    public void contarNumero(View view) {
        cont++;
        //volcer a pintar txt_contador
        txt_contador1.setText(String.valueOf(cont));
    }

    public void mostrarMensaje(View view) {

        Toast.makeText(this, "BIENVENIDOS", Toast.LENGTH_SHORT).show();


    }
}