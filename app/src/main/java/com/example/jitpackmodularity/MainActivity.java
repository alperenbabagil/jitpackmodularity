package com.example.jitpackmodularity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.loglibrary.MyLogger;

import java.util.logging.Logger;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new MyLogger().LogError("d");

    }
}
