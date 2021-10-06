package com.example.clicker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.clicker.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    int contador = 0;
    //TextView contadorDeClics;
    //Button augmentarElContador;
    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((binding = ActivityMainBinding.inflate(getLayoutInflater())).getRoot());

        //contadorDeClics = findViewById(R.id.textoContador);
        //augmentarElContador = findViewById(R.id.botonClick);
        contador = 0;

        binding.botonClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contador++;
                binding.textoContador.setText("Has clicado " + contador + " veces");
            }
        });
    }
}