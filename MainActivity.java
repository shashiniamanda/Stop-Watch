package com.example.stopwatch;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity<textView> extends AppCompatActivity {

    Button btnget;
    TextView textView, textView2;
    ImageView imageView;
    Animation atg, btg1, btg2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnget = findViewById(R.id.btnget);
        imageView = findViewById(R.id.imageView);
        textView = findViewById(R.id.textView);


        //Load Animations
        atg = AnimationUtils.loadAnimation(this,R.anim.atg);
        btg1 = AnimationUtils.loadAnimation(this,R.anim.btg1);
        btg2 = AnimationUtils.loadAnimation(this, R.anim.btg2);

        //passing Animation
        imageView.startAnimation(atg);
        textView. startAnimation(btg1);
        btnget.startAnimation(btg2);


        //passing event
        btnget.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, GetStartedActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(intent);
            }
        });




    }
}
