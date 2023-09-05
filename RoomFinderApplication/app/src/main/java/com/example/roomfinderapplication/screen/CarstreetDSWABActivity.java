package com.example.roomfinderapplication.screen;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.roomfinderapplication.R;

public class CarstreetDSWABActivity extends AppCompatActivity {

    ImageView btn;
    ImageView home,home1,home2,home3,home4,home5;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carstreet_dswabactivity);
        home=findViewById(R.id.dswab7);
        home1=findViewById(R.id.dswab8);
        home2=findViewById(R.id.dswab9);
        home3=findViewById(R.id.dswab10);
        home4=findViewById(R.id.dswab11);
        home5=findViewById(R.id.dswab12);

        btn=findViewById(R.id.backButtondsaw);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CarstreetDSWABActivity.this, DSWABsevenDActivity.class);
                startActivity(intent);
            }
        });
        home1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CarstreetDSWABActivity.this, DSWABeigthDActivity.class);
                startActivity(intent);
            }
        });
        home2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CarstreetDSWABActivity.this, DSWABnineDActivity.class);
                startActivity(intent);
            }
        });
        home3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CarstreetDSWABActivity.this, DSWABtenDActivity.class);
                startActivity(intent);
            }
        });
        home4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CarstreetDSWABActivity.this, DSWABelevenDActivity.class);
                startActivity(intent);
            }
        });
        home5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CarstreetDSWABActivity.this, DSWABtwelveDActivity.class);
                startActivity(intent);
            }
        });
    }
}