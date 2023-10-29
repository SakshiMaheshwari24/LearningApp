package com.example.learningapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class colourActivity extends AppCompatActivity {
    int[] numberImage = {R.drawable.black, R.drawable.blue, R.drawable.brown, R.drawable.green, R.drawable.orange, R.drawable.pink, R.drawable.purple, R.drawable.red, R.drawable.violet,R.drawable.yellow};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colour);
        ImageView imageView1 = findViewById(R.id.black);
        ImageView imageView2 = findViewById(R.id.blue);
        ImageView imageView3= findViewById(R.id.brown);
        ImageView imageView4 = findViewById(R.id.green);
        ImageView imageView5= findViewById(R.id.yellow);
        ImageView imageView6 = findViewById(R.id.orange);
        ImageView imageView7 = findViewById(R.id.pink);
        ImageView imageView8 = findViewById(R.id.purple);
        ImageView imageView9 = findViewById(R.id.red);
        ImageView imageView10 = findViewById(R.id.violet);
        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openColourDetailActivity("one");
            }
        });
        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openColourDetailActivity("one");
            }
        });
        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openColourDetailActivity("one");
            }
        });
        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openColourDetailActivity("one");
            }
        });
        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openColourDetailActivity("one");
            }
        });
        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openColourDetailActivity("one");
            }
        });
        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openColourDetailActivity("one");
            }
        });
        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openColourDetailActivity("one");
            }
        });
        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openColourDetailActivity("one");
            }
        });
        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openColourDetailActivity("one");
            }
        });


    }
    private void openColourDetailActivity(String imageId) {
        Intent intent = new Intent(this, colourDetailActivity.class);
        intent.putExtra("imageId", imageId); // Pass the clicked ImageView's ID
        startActivity(intent);
    }

}