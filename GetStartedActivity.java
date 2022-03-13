package com.example.stopwatch;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.ImageView;

public class GetStartedActivity extends AppCompatActivity {


    Button btnstart,btnstop;
    ImageView imageView3;
    Animation rounding;
    Chronometer timer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_started);

        btnstart = findViewById(R.id.btnstart);
        btnstop = findViewById(R.id.btnstop);
        imageView3 = findViewById(R.id.imageView3);
        timer = findViewById(R.id.timer);

        //create animation
        btnstop.setAlpha(0);
        boolean running;
        //load animations
        rounding = AnimationUtils.loadAnimation(this, R.anim.rounding);

        btnstart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //passing animation
                imageView3.startAnimation(rounding);
                btnstop.animate().alpha(1).translationY(-80).setDuration(300).start();
                btnstart.animate().alpha(0).setDuration(300).start();
                //Timer
                timer.setBase(SystemClock.elapsedRealtime());
                timer.start();

            }
        });

    }
}