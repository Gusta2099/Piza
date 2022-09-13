package com.example.pizzahu2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ConfirmarPizza extends AppCompatActivity {
    public TextView abacaxi, peperoni, milho, presunto, ovo, frango;
    public Button bt, bt2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_confirmar_pizza);
        abacaxi = (TextView) findViewById(R.id.abacaxitxt);
        frango = (TextView) findViewById(R.id.frangotct);
        ovo = (TextView) findViewById(R.id.ovotxt);
        presunto = (TextView) findViewById(R.id.presuntotxt);
        milho = (TextView) findViewById(R.id.milhotxt);
        peperoni = (TextView) findViewById(R.id.peperonitxt);
        Intent inte = getIntent();

        abacaxi.setText(inte.getStringExtra("Abacaxi"));
        ovo.setText(inte.getStringExtra("Ovo"));
        frango.setText(inte.getStringExtra("Frango"));
        presunto.setText(inte.getStringExtra("Presunto"));
        milho.setText(inte.getStringExtra("Milho"));
        peperoni.setText(inte.getStringExtra("Peperoni"));
        Intent intente = new Intent(this,Mapa.class);
        Intent intente2 = new Intent(this,PizzaMaker.class);
        bt = (Button) findViewById(R.id.btnPizzaFact);
        bt2 = (Button) findViewById(R.id.btnDescartar);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intente);
            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abacaxi.setText(inte.getStringExtra(""));
                ovo.setText(inte.getStringExtra(""));
                frango.setText(inte.getStringExtra(""));
                presunto.setText(inte.getStringExtra(""));
                milho.setText(inte.getStringExtra(""));
                peperoni.setText(inte.getStringExtra(""));
                startActivity(intente2);
            }
        });

    }
}