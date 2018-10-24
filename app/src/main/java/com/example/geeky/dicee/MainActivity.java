package com.example.geeky.dicee;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

/**
 * Created by Geeky Kelvin on 10/24/2018.
 * Email: Kelvinator4leo@gmail.com
 */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Links the views in the Layout XML file to Java Code
        Button rollButton;
        rollButton = findViewById(R.id.rollButton);

        final ImageView leftDice;
        leftDice = findViewById(R.id.image_leftDice);

        final ImageView rightDice;
        rightDice = findViewById(R.id.image_rightDice);

        // Stores dice images in an array called diceArray
        final int [] diceArray = {R.drawable.dice1,
                R.drawable.dice2,
                R.drawable.dice3,
                R.drawable.dice4,
                R.drawable.dice5,
                R.drawable.dice6
        };

        // Tells the RollButton to listen for Clicks
        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Executed When Roll Button Is Clicked

                // Generates Random Number
                Random randomNumber = new Random();

                int number = randomNumber.nextInt(6);

                // Grabs a random dice image from diceArray and Displays on Left Dice
                leftDice.setImageResource(diceArray[number]);

                // Creates a new random Number
                number = randomNumber.nextInt(6);

                // Grabs a dice image from diceArray and Displays on Right Dice
                rightDice.setImageResource(diceArray[number]);

            }
        });
    }
}
