package com.example.learningapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class animalsActivity extends AppCompatActivity {
    int[] numberImage = {R.drawable.cat, R.drawable.dog, R.drawable.cow, R.drawable.buffalo, R.drawable.crocodile,R.drawable.bear,
            R.drawable.deer, R.drawable.donkey, R.drawable.fox,R.drawable.camel, R.drawable.elephant,R.drawable.giraff,
            R.drawable.racoon,R.drawable.monkey,R.drawable.goat,R.drawable.wolf,R.drawable.horse,
            R.drawable.pig,R.drawable.rhinoceros,R.drawable.sheep,R.drawable.kangaroo,R.drawable.panda,
            R.drawable.tiger,R.drawable.leopard,R.drawable.lion,R.drawable.zebra};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animals);
        ImageView imageView1 = findViewById(R.id.cat);
        ImageView imageView2 = findViewById(R.id.dog);
        ImageView imageView3 = findViewById(R.id.cow);
        ImageView imageView4 = findViewById(R.id.buffalo);
        ImageView imageView5 = findViewById(R.id.crocodile);
        ImageView imageView6 = findViewById(R.id.bear);
        ImageView imageView7 = findViewById(R.id.deer);
        ImageView imageView8 = findViewById(R.id.donkey);
        ImageView imageView9 = findViewById(R.id.fox);
        ImageView imageView10 = findViewById(R.id.camel);
        ImageView imageView11 = findViewById(R.id.elephant);
        ImageView imageView12 = findViewById(R.id.giraff);
        ImageView imageView13 = findViewById(R.id.racoon);
        ImageView imageView14 = findViewById(R.id.monkey);
        ImageView imageView15 = findViewById(R.id.goat);
        ImageView imageView16 = findViewById(R.id.wolf);
        ImageView imageView17 = findViewById(R.id.horse);
        ImageView imageView18 = findViewById(R.id.pig);

        ImageView imageView19 = findViewById(R.id.rhinoceros);
        ImageView imageView20 = findViewById(R.id.sheep);
        ImageView imageView21= findViewById(R.id.kangaroo);
        ImageView imageView22 = findViewById(R.id.tiger);
        ImageView imageView23 = findViewById(R.id.leopard);
        ImageView imageView24 = findViewById(R.id.lion);
        ImageView imageView25 = findViewById(R.id.zebra);







        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAnimalsDetailActivity("one");
            }
        });
    }
    private void openAnimalsDetailActivity(String imageId) {
        Intent intent = new Intent(this, animalsDetailActivity.class);
        intent.putExtra("imageId", imageId); // Pass the clicked ImageView's ID
        startActivity(intent);
    }
}