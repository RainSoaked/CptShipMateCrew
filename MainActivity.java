package com.example.bernh.cptshipmatecrew;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Switch;


import java.util.Random;

public class MainActivity extends AppCompatActivity {

    public static ImageView imageView1;
    public static Handler mainHandler = new Handler();
    Button rollDie;


    @SuppressLint("ResourceType")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView1 = (ImageView) findViewById(R.id.imageView1);

        rollDie = findViewById(R.id.rollDie);
        rollDie.setOnClickListener( new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Runnable die1 = new ShipDriver(0);
                die1.run();


            }
        });
    }
}
