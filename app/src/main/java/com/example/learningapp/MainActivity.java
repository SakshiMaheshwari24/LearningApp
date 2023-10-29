package com.example.learningapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    ImageView wishImage;
    ImageButton letsLearn,videoLearn,lookChoose,listenGuess;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        wishImage = findViewById(R.id.wishImage);
        Calendar calendar = Calendar.getInstance();
        int hourOfDay = calendar.get(Calendar.HOUR_OF_DAY);
        if (hourOfDay >= 4 && hourOfDay < 12) {
            // Morning (6 AM to 12 PM)
            wishImage.setImageResource(R.drawable.morning_image);

        } else if (hourOfDay >= 12 && hourOfDay < 16) {
            // Afternoon (12 PM to 6 PM)
            wishImage.setImageResource(R.drawable.afternoon_image);

        } else if(hourOfDay >= 16 && hourOfDay < 24){

            wishImage.setImageResource(R.drawable.evening_image);

        }
        letsLearn = (ImageButton) findViewById(R.id.letsLearn);
        letsLearn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,LetsLearn.class);
                startActivity(intent);
            }
        });
    }

    void letsLearn(View view)
    {

    }
    void videoLearn(View view)
    {

    }
    void lookChoose(View view)
    {

    }
    void listenGuess(View view)
    {

    }

}