package com.example.bernh.cptshipmatecrew;

import android.annotation.SuppressLint;

import java.util.Random;

public class ShipDriver extends MainActivity implements Runnable {
    int dieIndex;
    Random random;
    int rolled;


    public ShipDriver(int dieIndex) {
        this.dieIndex = dieIndex; //why do we declare this. Is this shipdriver obj or MainObj


    }

    @SuppressLint("ResourceType")
    @Override
    public void run() {
        Random random = new Random();


        rolled = random.nextInt(6) + 1;

        for (int i = 0; i < 30; i++) {
            if (dieIndex == 0) {
                mainHandler.post(new Runnable() {
                    @Override
                    public void run() {
                        switch (rolled) {
                            case 1:
                                MainActivity.imageView.setImageResource(R.drawable.die1);
                            case 2:
                                MainActivity.imageView.setImageResource(R.drawable.die2);
                            case 3:
                                MainActivity.imageView.setImageResource(R.drawable.die3);
                            case 4:
                                MainActivity.imageView.setImageResource(R.drawable.die4);
                            case 5:
                                MainActivity.imageView.setImageResource(R.drawable.die5);
                            case 6:
                                MainActivity.imageView.setImageResource(R.drawable.die6);

                        }
                    }
                });
            }
            if (dieIndex == 1) {
                mainHandler.post(new Runnable() {
                    @Override
                    public void run() {
                        switch (rolled) {
                            case 1:
                                MainActivity.imageView.setImageResource(R.drawable.die1);
                            case 2:
                                MainActivity.imageView.setImageResource(R.drawable.die2);
                            case 3:
                                MainActivity.imageView.setImageResource(R.drawable.die3);
                            case 4:
                                MainActivity.imageView.setImageResource(R.drawable.die4);
                            case 5:
                                MainActivity.imageView.setImageResource(R.drawable.die5);
                            case 6:
                                MainActivity.imageView.setImageResource(R.drawable.die6);

                        }
                    }

                });
            }
            if (dieIndex == 2) {
                mainHandler.post(new Runnable() {
                    @Override
                    public void run() {
                        switch (rolled) {
                            case 1:
                                MainActivity.imageView.setImageResource(R.drawable.die1);
                            case 2:
                                MainActivity.imageView.setImageResource(R.drawable.die2);
                            case 3:
                                MainActivity.imageView.setImageResource(R.drawable.die3);
                            case 4:
                                MainActivity.imageView.setImageResource(R.drawable.die4);
                            case 5:
                                MainActivity.imageView.setImageResource(R.drawable.die5);
                            case 6:
                                MainActivity.imageView.setImageResource(R.drawable.die6);

                        }
                    }

                });
            }
            if (dieIndex == 3) {
                mainHandler.post(new Runnable() {
                    @Override
                    public void run() {
                        switch (rolled) {
                            case 1:
                                MainActivity.imageView.setImageResource(R.drawable.die1);
                            case 2:
                                MainActivity.imageView.setImageResource(R.drawable.die2);
                            case 3:
                                MainActivity.imageView.setImageResource(R.drawable.die3);
                            case 4:
                                MainActivity.imageView.setImageResource(R.drawable.die4);
                            case 5:
                                MainActivity.imageView.setImageResource(R.drawable.die5);
                            case 6:
                                MainActivity.imageView.setImageResource(R.drawable.die6);

                        }
                    }

                });
            }
            if (dieIndex == 4) {
                mainHandler.post(new Runnable() {
                    @Override
                    public void run() {
                        switch (rolled) {
                            case 1:
                                MainActivity.imageView.setImageResource(R.drawable.die1);
                            case 2:
                                MainActivity.imageView.setImageResource(R.drawable.die2);
                            case 3:
                                MainActivity.imageView.setImageResource(R.drawable.die3);
                            case 4:
                                MainActivity.imageView.setImageResource(R.drawable.die4);
                            case 5:
                                MainActivity.imageView.setImageResource(R.drawable.die5);
                            case 6:
                                MainActivity.imageView.setImageResource(R.drawable.die6);

                        }
                    }

                });
            }

        }
    }
}
