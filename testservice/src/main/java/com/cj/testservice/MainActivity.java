package com.cj.testservice;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import android.widget.TextView;

import java.util.logging.Logger;

public class MainActivity extends AppCompatActivity {
   TextView tv;
   FrameLayout fl;
    FragmentManager supportFragmentManager;
    Fragment1 fragment1;
    Fragment2 fragment2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = findViewById(R.id.tv);
        fl = findViewById(R.id.fl);
        supportFragmentManager = getSupportFragmentManager();
        fragment1 = new Fragment1();
        fragment2 = new Fragment2();
        supportFragmentManager.beginTransaction().add(R.id.fl,fragment1).commit();
    }
    int count = 0;
    public void click(View view) {
        Log.d("junchen", "click: start");
        if (fragment1.isVisible()){
            Log.d("junchen", "1111111111click: start");
            supportFragmentManager.beginTransaction().hide(fragment1).commit();
        }else{
            Log.d("junchen", "222222222222click: start");
            supportFragmentManager.beginTransaction().show(fragment1).commit();
        }
        //supportFragmentManager.beginTransaction().replace(R.id.fl,count++%2==0?fragment1:fragment2).commit();
    }

    public void click1(View view) {
        //supportFragmentManager.beginTransaction().remove(fragment1).commit();
    }
}
