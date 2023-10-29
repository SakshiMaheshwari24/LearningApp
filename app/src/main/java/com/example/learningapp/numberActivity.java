package com.example.learningapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;


public class numberActivity extends AppCompatActivity {
    //String[] spelling = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    int[] numberImage = {R.drawable.no1, R.drawable.no2, R.drawable.no3, R.drawable.no4, R.drawable.no5, R.drawable.no6, R.drawable.no7, R.drawable.no8, R.drawable.no9};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number);
        ImageView imageView1 = findViewById(R.id.n1);
        ImageView imageView2 = findViewById(R.id.n2);
        ImageView imageView3 = findViewById(R.id.n3);
        ImageView imageView4 = findViewById(R.id.n4);
        ImageView imageView5 = findViewById(R.id.n5);
        ImageView imageView6 = findViewById(R.id.n6);
        ImageView imageView7 = findViewById(R.id.n7);
        ImageView imageView8 = findViewById(R.id.n8);
        ImageView imageView9 = findViewById(R.id.n9);
        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNumberDetailActivity("one");
            }
        });
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNumberDetailActivity("two");
            }
        });
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNumberDetailActivity("three");
            }
        });
        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNumberDetailActivity("four");
            }
        });
        imageView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNumberDetailActivity("five");
            }
        });
        imageView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNumberDetailActivity("six");
            }
        });
        imageView7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNumberDetailActivity("seven");
            }
        });
        imageView8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNumberDetailActivity("eight");
            }
        });
        imageView9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNumberDetailActivity("nine");
            }
        });


        }
    private void openNumberDetailActivity(String imageId) {
        Intent intent = new Intent(this, numberDigitActivity.class);
        intent.putExtra("imageId", imageId); // Pass the clicked ImageView's ID
        startActivity(intent);
    }
}
