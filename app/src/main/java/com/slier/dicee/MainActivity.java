package com.slier.dicee;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button rollButton = findViewById(R.id.button_roll);
        final ImageView leftDice = findViewById(R.id.image_left_dice);
        final ImageView rightDice = findViewById(R.id.image_right_dice);

        final int[] dices = {
                R.drawable.dice1,
                R.drawable.dice2,
                R.drawable.dice3,
                R.drawable.dice4,
                R.drawable.dice5,
                R.drawable.dice6
        };

        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("Dicee", "Ze button has been pressed");

                Random rng = new Random();

                int randomNumber = rng.nextInt(6);
                leftDice.setImageResource(dices[randomNumber]);

                randomNumber = rng.nextInt(6);
                rightDice.setImageResource(dices[randomNumber]);
            }
        });
    }
}
