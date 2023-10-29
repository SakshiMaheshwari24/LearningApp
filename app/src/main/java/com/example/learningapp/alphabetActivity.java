package com.example.learningapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.GridLayout;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

public class alphabetActivity extends AppCompatActivity {
    int[] alphabetImage = {R.drawable.a, R.drawable.b, R.drawable.c, R.drawable.d, R.drawable.e, R.drawable.f, R.drawable.g, R.drawable.h, R.drawable.i,R.drawable.j,R.drawable.k,R.drawable.l,R.drawable.m,R.drawable.n,R.drawable.o,R.drawable.p,R.drawable.q,R.drawable.r,R.drawable.s,R.drawable.t,R.drawable.u,R.drawable.v,R.drawable.w,R.drawable.x,R.drawable.y,R.drawable.z};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alphabet);
        ImageView aImageView = findViewById(R.id.a);
        ImageView bImageView = findViewById(R.id.b);
        ImageView cImageView = findViewById(R.id.c);
        ImageView dImageView = findViewById(R.id.d);
        ImageView eImageView = findViewById(R.id.e);
        ImageView fImageView = findViewById(R.id.f);
        ImageView gImageView = findViewById(R.id.g);
        ImageView hImageView = findViewById(R.id.h);
        ImageView iImageView = findViewById(R.id.i);
        ImageView jImageView = findViewById(R.id.j);
        ImageView kImageView = findViewById(R.id.k);
        ImageView lImageView = findViewById(R.id.l);
        ImageView mImageView = findViewById(R.id.m);
        ImageView nImageView = findViewById(R.id.n);
        ImageView oImageView = findViewById(R.id.o);
        ImageView pImageView = findViewById(R.id.p);
        ImageView qImageView = findViewById(R.id.q);
        ImageView rImageView = findViewById(R.id.r);
        ImageView sImageView = findViewById(R.id.s);
        ImageView tImageView = findViewById(R.id.t);
        ImageView uImageView = findViewById(R.id.u);
        ImageView vImageView = findViewById(R.id.v);
        ImageView wImageView = findViewById(R.id.w);
        ImageView xImageView = findViewById(R.id.x);
        ImageView yImageView = findViewById(R.id.y);
        ImageView zImageView = findViewById(R.id.z);



        aImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAlphabetDetailActivity("a");
            }
        });
        bImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAlphabetDetailActivity("b");
            }
        });
        cImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAlphabetDetailActivity("c");
            }
        });
        dImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAlphabetDetailActivity("d");
            }
        });
        eImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAlphabetDetailActivity("e");
            }
        });
        fImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAlphabetDetailActivity("b");
            }
        });
        gImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAlphabetDetailActivity("a");
            }
        });
        hImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAlphabetDetailActivity("b");
            }
        });
        iImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAlphabetDetailActivity("a");
            }
        });
        jImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAlphabetDetailActivity("b");
            }
        });
        kImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAlphabetDetailActivity("a");
            }
        });
        lImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAlphabetDetailActivity("b");
            }
        });
        mImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAlphabetDetailActivity("a");
            }
        });
        nImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAlphabetDetailActivity("b");
            }
        });
        oImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAlphabetDetailActivity("a");
            }
        });
        pImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAlphabetDetailActivity("b");
            }
        });
        qImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAlphabetDetailActivity("a");
            }
        });
        rImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAlphabetDetailActivity("b");
            }
        });
        sImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAlphabetDetailActivity("a");
            }
        });
        tImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAlphabetDetailActivity("b");
            }
        });
        uImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAlphabetDetailActivity("a");
            }
        });
        vImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAlphabetDetailActivity("b");
            }
        });
        wImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAlphabetDetailActivity("a");
            }
        });
        xImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAlphabetDetailActivity("b");
            }
        });
        yImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAlphabetDetailActivity("a");
            }
        });
        zImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAlphabetDetailActivity("b");
            }
        });




    }

    private void openAlphabetDetailActivity(String imageId) {
        Intent intent = new Intent(this, alphabetDetailActivity.class);
        intent.putExtra("imageId", imageId); // Pass the clicked ImageView's ID
        startActivity(intent);
    }
}