package com.example.tugasreclerview4grid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {
    ImageView imghome;
    TextView tvhome;
    TextView tvhomee;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        imghome = findViewById(R.id.img_detailll);
        tvhome = findViewById(R.id.detail);
        tvhomee = findViewById(R.id.detaill);

        tvhome.setText(getIntent().getStringExtra("namahome"));
        tvhomee.setText(getIntent().getStringExtra("harganya"));
        imghome.setImageResource(getIntent().getIntExtra("gambarhome",1));
    }
}
