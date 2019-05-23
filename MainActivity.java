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

    public static ImageView imageView1, imageView2, imageView3, imageView4, imageView5;
    public static Handler mainHandler = new Handler();
    Button rollDie;


    @SuppressLint("ResourceType")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView1 = (ImageView) findViewById(R.id.imageView1);
        imageView2 = (ImageView) findViewById(R.id.imageView2);
        imageView3 = (ImageView) findViewById(R.id.imageView3);
        imageView4 = (ImageView) findViewById(R.id.imageView4);
        imageView5 = (ImageView) findViewById(R.id.imageView5);

        //need a counter to track 3 roll attempts; end game; total points
        rollDie = findViewById(R.id.rollDie);
        rollDie.setOnClickListener( new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Runnable die1 = new ShipDriver(0);
                Runnable die2 = new ShipDriver(1);
                Runnable die3 = new ShipDriver(2);
                Runnable die4 = new ShipDriver(3);
                Runnable die5 = new ShipDriver(4);
                die1.run();
                die2.run();
                die3.run();
                die4.run();
                die5.run();


            }
        });
    }
}
