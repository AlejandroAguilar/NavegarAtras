package com.alexaguilar.botonatrasactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void irSegundaActivudad(View v){
        Intent  intent = new Intent(this, Segundo.class);
        startActivity(intent);
    }



}
