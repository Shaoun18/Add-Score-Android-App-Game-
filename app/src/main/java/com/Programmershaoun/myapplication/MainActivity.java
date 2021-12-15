package com.Programmershaoun.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private final String Tag = "Lifecycle";
    private int score;
    private TextView scoretextview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(Tag, "onCreate called");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        scoretextview = findViewById(R.id.scoreTV);
        if (savedInstanceState != null){
                score = savedInstanceState.getInt("score");
                scoretextview.setText(""+score);
        }else{
            score = 0;
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(Tag, "onStart called");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(Tag, "onRestart called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(Tag, "onStop called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(Tag, "onResume called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(Tag, "onPause called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(Tag, "onDestroy called");
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        outState.putInt("score",score);
        super.onSaveInstanceState(outState);
    }

    public void changeScore(View view) {
        score++;
        scoretextview.setText(""+score);
    }
}
