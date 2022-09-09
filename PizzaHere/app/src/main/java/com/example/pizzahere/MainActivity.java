package com.example.pizzahere;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements SensorEventListener {


    Button local;
    Button start;
    ImageView Pizza;
    float x,y,z;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        start = (Button) findViewById(R.id.btnStart);
        local = (Button)findViewById(R.id.btnLocalPizzaria);
        Pizza = (ImageView) findViewById(R.id.ivPizza);
        SensorManager sensorManager = (SensorManager) getSystemService(SENSOR_SERVICE);
        Intent intente = new Intent(this, PizzaMaker.class);
        Sensor sensorGiroscopic = sensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);


        SensorEventListener sensorEventListener = new SensorEventListener() {
            @Override
            public void onSensorChanged(SensorEvent event) {


                        x= event.values[0];
                        y = event.values[1];
                        z = event.values[2];
                Rotar(z*10,x,y);



            }

            @Override
            public void onAccuracyChanged(Sensor sensor, int accuracy) {

            }
        };

        sensorManager.registerListener(sensorEventListener, sensorGiroscopic, sensorManager.SENSOR_DELAY_GAME);

        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intente);
            }
        });
        Intent intent2 = new Intent(this,Local.class);

        local.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intent2);
            }
        });

    }

    @Override
    public void onSensorChanged(SensorEvent event) {

    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy) {

    }

    void Rotar(float x, float y, float z)
    {
        Pizza.setRotation(z);
    }

}