package com.example.tugasreclerview4grid;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.tugasreclerview4grid.Fragment.FragmentHome;

public class MainActivity extends AppCompatActivity {
FragmentManager fm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fm = getSupportFragmentManager();
        fm.beginTransaction().add(R.id.contener, new FragmentHome()).addToBackStack("").commit();
    }
}
