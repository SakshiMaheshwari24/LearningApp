package com.example.learningapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class shapesActivity extends AppCompatActivity {
    int[] numberImage = {R.drawable.no1, R.drawable.no2, R.drawable.no3, R.drawable.no4, R.drawable.no5, R.drawable.no6, R.drawable.no7, R.drawable.no8, R.drawable.no9};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shapes);
        ImageView imageView1 = findViewById(R.id.square);
        ImageView imageView2 = findViewById(R.id.circle);
        ImageView imageView3 = findViewById(R.id.rectangle);
        ImageView imageView4 = findViewById(R.id.triangle);
        ImageView imageView5 = findViewById(R.id.star);
        ImageView imageView6 = findViewById(R.id.heart);
        ImageView imageView7 = findViewById(R.id.rhombus);
        ImageView imageView8 = findViewById(R.id.oval);
        ImageView imageView9 = findViewById(R.id.elipse);
        ImageView imageView10 = findViewById(R.id.pentagon);
        ImageView imageView11= findViewById(R.id.hexagon);
        ImageView imageView12 = findViewById(R.id.heptogon);
        ImageView imageView13 = findViewById(R.id.parallelogram);
        ImageView imageView14 = findViewById(R.id.trapezium);
        ImageView imageView15 = findViewById(R.id.kite);
        ImageView imageView16 = findViewById(R.id.cross);
        ImageView imageView17 = findViewById(R.id.arrow);
        ImageView imageView18 = findViewById(R.id.crescent);






        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openShapesDetailActivity("one");
            }
        });
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openShapesDetailActivity("one");
            }
        });
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openShapesDetailActivity("one");
            }
        });imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openShapesDetailActivity("one");
            }
        });
        imageView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openShapesDetailActivity("one");
            }
        });
        imageView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openShapesDetailActivity("one");
            }
        });
        imageView7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openShapesDetailActivity("one");
            }
        });
        imageView8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openShapesDetailActivity("one");
            }
        });
        imageView9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openShapesDetailActivity("one");
            }
        });
        imageView10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openShapesDetailActivity("one");
            }
        });
        imageView11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openShapesDetailActivity("one");
            }
        });
        imageView12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openShapesDetailActivity("one");
            }
        });
        imageView13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openShapesDetailActivity("one");
            }
        });
        imageView14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openShapesDetailActivity("one");
            }
        });
        imageView15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openShapesDetailActivity("one");
            }
        });
        imageView16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openShapesDetailActivity("one");
            }
        });
        imageView17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openShapesDetailActivity("one");
            }
        });
        imageView18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openShapesDetailActivity("one");
            }
        });


    }

    private void openShapesDetailActivity(String imageId) {
        Intent intent = new Intent(this, shapesDetailActivity.class);
        intent.putExtra("imageId", imageId); // Pass the clicked ImageView's ID
        startActivity(intent);
    }
}