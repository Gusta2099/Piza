package com.example.pizzahu2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PizzaMaker extends AppCompatActivity {

    Button pre,ovo,milho,peperoni,abacaxi,frango, montar;
    String preb = "",ovob = "",milhob = "",peperonib = "",abacaxib = "",frangob = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pizza_maker);
        preb = "";ovob = "";milhob = "";peperonib = ""; abacaxib = ""; frangob = "";
        pre = (Button) findViewById(R.id.presunto);
        ovo = (Button) findViewById(R.id.ovo);
        milho = (Button) findViewById(R.id.milho);
        frango = (Button) findViewById(R.id.frang);
        peperoni = (Button) findViewById(R.id.peperoni);
        abacaxi = (Button) findViewById(R.id.abacaxi);
        montar = (Button) findViewById(R.id.buttonCriarPizza);
        Intent intent = new Intent(this, ConfirmarPizza.class);
        pre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preb = "Presunto";
            }
        });
        ovo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ovob = "Ovo";
            }
        });
        milho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                milhob = "Milho";
            }
        });
        frango.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                frangob = "Frango";
            }
        });
        abacaxi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abacaxib = "Abacaxi";
            }
        });
        peperoni.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                peperonib = "Peperoni";

            }
        });
        montar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.putExtra("Peperoni",peperonib);
                intent.putExtra("Abacaxi",abacaxib);
                intent.putExtra("Ovo",ovob);
                intent.putExtra("Frango",frangob);
                intent.putExtra("Presunto",preb);
                intent.putExtra("Milho",milhob);

                startActivity(intent);
            }
        });

    }
}