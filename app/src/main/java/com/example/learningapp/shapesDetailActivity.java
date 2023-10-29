package com.example.learningapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class shapesDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shapes_detail);
        String imageId = getIntent().getStringExtra("imageId");

        ImageView alphabetImageView = findViewById(R.id.shapeImage); // The ImageView in AlphabetDetailActivity

        // Set the image in AlphabetDetailActivity based on the ImageView ID
        int resourceId = getResources().getIdentifier(imageId, "drawable", getPackageName());
        alphabetImageView.setImageResource(resourceId);
    }
}