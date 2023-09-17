package com.example.animation_rotate_fade_in_fadout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.ScaleAnimation;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void funRotate(View view) {
        Animation animation= AnimationUtils.loadAnimation(this,R.anim.rotate);
        ImageView imageView=findViewById(R.id.img1);
        imageView.startAnimation(animation);
    }
    public void scaleIn(View view) {
        Animation animation= AnimationUtils.loadAnimation(this,R.anim.scale_up);
        ImageView imageView=findViewById(R.id.img1);
        imageView.startAnimation(animation);



    }
    public void scaleInCode(View view) {


        ScaleAnimation scale = new ScaleAnimation(1.0f, 100.0f, 1.0f,
                50.0f, Animation.RELATIVE_TO_SELF, 0.5f,
                Animation.RELATIVE_TO_SELF, 0.5f);
        scale.setDuration(2000);
        ImageView imageView=findViewById(R.id.img1);
        imageView.startAnimation(scale);



    }

    public void fadeIn(View view) {
        Animation animation= AnimationUtils.loadAnimation(this,R.anim.fade_in);
        ImageView imageView=findViewById(R.id.img1);
        imageView.startAnimation(animation);

    }
    public void fadeOut(View view) {
        Animation animation= AnimationUtils.loadAnimation(this,R.anim.fade_out);
        ImageView imageView=findViewById(R.id.img1);
        imageView.startAnimation(animation);
    }


}