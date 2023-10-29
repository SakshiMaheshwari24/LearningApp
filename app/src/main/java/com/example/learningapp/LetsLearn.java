package com.example.learningapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class LetsLearn extends AppCompatActivity {
    ImageButton alphabetLearn,numbersLearn;
    ImageButton coloursLearn,shapeButton,animalLearn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lets_learn);
        alphabetLearn = (ImageButton) findViewById(R.id.alphabetLearn);
        alphabetLearn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LetsLearn.this,alphabetActivity.class);
                startActivity(intent);
            }
        });
        numbersLearn = (ImageButton) findViewById(R.id.numbersLearn);
        numbersLearn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LetsLearn.this,numberActivity.class);
                startActivity(intent);
            }
        });
        coloursLearn = (ImageButton) findViewById(R.id.coloursLearn);
        coloursLearn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LetsLearn.this,colourActivity.class);
                startActivity(intent);
            }
        });
        shapeButton = (ImageButton) findViewById(R.id.shapeButton);
        shapeButton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LetsLearn.this,shapesActivity.class);
                startActivity(intent);
            }
        });
        animalLearn = (ImageButton) findViewById(R.id.animalLearn);
        animalLearn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LetsLearn.this, animalsActivity.class);
                startActivity(intent);
            }
        });
    }
}