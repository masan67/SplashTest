package com.marioapps.splashtest;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import maes.tech.intentanim.CustomIntent;

public class SplashActivity extends AppCompatActivity {

    ImageView imageViewLogo;
    View viewRedBackground;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        imageViewLogo = findViewById(R.id.logo);
        viewRedBackground = findViewById(R.id.red_background);

        ObjectAnimator fadeAnimLogo = ObjectAnimator.ofFloat(imageViewLogo, "alpha", 1f, 0f);
        fadeAnimLogo.setStartDelay(1500);
        fadeAnimLogo.setDuration(1500);
        fadeAnimLogo.start();

        fadeAnimLogo.addListener(new AnimatorListenerAdapter() {
                                     @Override
                                     public void onAnimationEnd(Animator animation) {
                                         ObjectAnimator animationBackground = ObjectAnimator.ofFloat(viewRedBackground, "translationY", -450);
                                         animationBackground.setDuration(3000);
                                         animationBackground.start();

                                         animationBackground.addListener(new AnimatorListenerAdapter() {
                                             @Override
                                             public void onAnimationEnd(Animator animation) {

//                                                 ObjectAnimator fadeTransition = ObjectAnimator.ofFloat(viewRedBackground, "alpha", 1f, 0f);
//                                                 fadeTransition.setDuration(1500);
//                                                 fadeTransition.start();
//
//                                                 fadeTransition.addListener(new AnimatorListenerAdapter() {
//                                                     @Override
//                                                     public void onAnimationEnd(Animator animation) {
//                                                         Intent i =  new Intent();
//                                                         i.setClass(getApplicationContext(), MainActivity.class);
//                                                         startActivity(i);
//                                                     }
//                                                 });
                                                 Intent i =  new Intent();
                                                 i.setClass(getApplicationContext(), MainActivity.class);
                                                 startActivity(i);
                                             }
                                         });

                                     }
                                 });

    }
}
