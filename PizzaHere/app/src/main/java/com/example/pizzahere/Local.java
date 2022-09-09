package com.example.pizzahere;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Local extends AppCompatActivity {

    Button Sair,Local;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_local);
        Sair = (Button) findViewById(R.id.Voltar);
        Local = (Button) findViewById(R.id.btnpos);
        Intent voltar = new Intent(this,MainActivity.class);
        Sair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(voltar);
            }
        });
        Intent intent = new Intent(Intent.ACTION_VIEW);

        Local.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.setData(Uri.parse("geo:37.129192, -121.500116"));
            }
        });
    }
}