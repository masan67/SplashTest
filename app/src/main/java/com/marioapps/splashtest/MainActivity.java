package com.marioapps.splashtest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.animation.ObjectAnimator;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import maes.tech.intentanim.CustomIntent;

public class MainActivity extends AppCompatActivity {

    Button button;
    ConstraintLayout content;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        content = findViewById(R.id.content);

        ObjectAnimator screenFadeIn = ObjectAnimator.ofFloat(content, "alpha", 0f, 1f);
        screenFadeIn.setDuration(1000);
        screenFadeIn.start();


        button = findViewById(R.id.boton);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =  new Intent();
                i.setClass(getApplicationContext(), SplashActivity.class);
                startActivity(i);
                CustomIntent.customType(MainActivity.this, "rotateout-to-rotatein");
            }
        });
    }
}
