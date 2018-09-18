package com.example.critical_roll;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private ImageView imageViewDice;
    private Random rng = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageViewDice = findViewById(R.id.image_View_Dice);
        imageViewDice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rollDice();
            }
        });
    }

    private void rollDice() {
        int randomNumber = rng.nextInt(20) + 1;

        switch (randomNumber){
            case 1:
                imageViewDice.setImageResource(R.drawable.die_base_copy);
                break;
            case 2:
                imageViewDice.setImageResource(R.drawable.die_base_copy2);
                break;
            case 3:
                imageViewDice.setImageResource(R.drawable.die_base_copy3);
                break;
            case 4:
                imageViewDice.setImageResource(R.drawable.die_base_copy4);
                break;
            case 5:
                imageViewDice.setImageResource(R.drawable.die_base_copy5);
                break;
            case 6:
                imageViewDice.setImageResource(R.drawable.die_base_copy6);
                break;
            case 7:
                imageViewDice.setImageResource(R.drawable.die_base_copy7);
                break;
            case 8:
                imageViewDice.setImageResource(R.drawable.die_base_copy8);
                break;
            case 9:
                imageViewDice.setImageResource(R.drawable.die_base_copy9);
                break;
            case 10:
                imageViewDice.setImageResource(R.drawable.die_base_copy10);
                break;
            case 11:
                imageViewDice.setImageResource(R.drawable.die_base_copy11);
                break;
            case 12:
                imageViewDice.setImageResource(R.drawable.die_base_copy12);
                break;
            case 13:
                imageViewDice.setImageResource(R.drawable.die_base_copy13);
                break;
            case 14:
                imageViewDice.setImageResource(R.drawable.die_base_copy14);
                break;
            case 15:
                imageViewDice.setImageResource(R.drawable.die_base_copy15);
                break;
            case 16:
                imageViewDice.setImageResource(R.drawable.die_base_copy16);
                break;
            case 17:
                imageViewDice.setImageResource(R.drawable.die_base_copy17);
                break;
            case 18:
                imageViewDice.setImageResource(R.drawable.die_base_copy18);
                break;
            case 19:
                imageViewDice.setImageResource(R.drawable.die_base_copy19);
                break;
            case 20:
                imageViewDice.setImageResource(R.drawable.die_base_copy20);
                break;
        }
    }
}
