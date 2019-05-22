package com.example.dice;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
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

        Button rollButton;
                   rollButton=  findViewById(R.id.rollbutton);
      final ImageView leftdice=    findViewById(R.id.Dice_1);
      final ImageView rightdice=     findViewById(R.id.Dice_2);

      final int[]  diceArray=
              {
      R.drawable.dice1,
      R.drawable.dice2,
      R.drawable.dice3,
      R.drawable.dice4,
      R.drawable.dice5,
      R.drawable.dice6
      };

        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
             Log.d("Dice","Ze the button has been pressed");

             Random randomNumberGenerator=new Random();

             int number=randomNumberGenerator.nextInt(6);
            int number1=randomNumberGenerator.nextInt(6);
             Log.d("Dice","The random number is: "+number+" And the second random number is: "+number1);

             leftdice.setImageResource(diceArray[number]);

             rightdice.setImageResource(diceArray[number1]);
            }
        });
    }
}
