package com.alexaguilar.botonatrasactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Segundo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segundo);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


    }
}
