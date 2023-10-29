package com.example.learningapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class numberDigitActivity extends AppCompatActivity {
ImageView image;

    String[] spelling = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    int[] numberImage = {R.drawable.no1, R.drawable.no2, R.drawable.no3, R.drawable.no4, R.drawable.no5, R.drawable.no6, R.drawable.no7, R.drawable.no8, R.drawable.no9};
    private ViewGroup ImageView;


    @Override
    
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number_digit);
   //   spelling=findViewById(R.id.spellingTextView);
//        image=findViewById(R.id.imageNumber);
        String imageId = getIntent().getStringExtra("imageId");

        ImageView alphabetImageView = findViewById(R.id.imageNumber);


        // Set the image in ased on the ImageView ID
        int resourceId = getResources().getIdentifier(imageId, "drawable", getPackageName());
        alphabetImageView.setImageResource(resourceId);

//        TextView  spelllingNumber=findViewById(R.id.numberSpelling);
//        int imageIndex = -1;
//        for (int i = 0; i < numberImage.length; i++) {
//            if (numberImage[i] == resourceId) {
//                imageIndex = i;
//                break;
//            }
//        }
//
//        if (imageIndex >= 0 && imageIndex < spelling.length) {
//            spelllingNumber.setText(spelling[imageIndex]);
//        }
//
        }


    }

