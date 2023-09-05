package com.example.roomfinderapplication.screen;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.roomfinderapplication.R;

public class AdyarKatteActivity extends AppCompatActivity {

    ImageView btn2;
    private ImageView home,home1,home2,home3,home4,home5;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adyar_katte);
        btn2=findViewById(R.id.backButtonas);
        home=findViewById(R.id.ssr7);
        home1=findViewById(R.id.ssr8);
        home2=findViewById(R.id.ssr9);
        home3=findViewById(R.id.ssr10);
        home4=findViewById(R.id.ssr11);
        home5=findViewById(R.id.ssr12);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdyarKatteActivity.this, SSRsevenDActivity.class);
                startActivity(intent);
            }
        });
        home1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdyarKatteActivity.this, SSREigthDActivity.class);
                startActivity(intent);
            }
        });
        home2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdyarKatteActivity.this, SSRnineDActivity.class);
                startActivity(intent);
            }
        });
        home3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdyarKatteActivity.this, SSRtenDActivity.class);
                startActivity(intent);
            }
        });
        home4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdyarKatteActivity.this, SSRelevenDActivity.class);
                startActivity(intent);
            }
        });
        home5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdyarKatteActivity.this, SSRtwelveDActivity.class);
                startActivity(intent);
            }
        });
    }
}