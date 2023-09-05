package com.example.roomfinderapplication.screen;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.roomfinderapplication.R;

public class AdyarDSRActivity extends AppCompatActivity {

    ImageView btn;
    private ImageView home,home1,home2,home3,home4,home5;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adyar_dsractivity);
        home=findViewById(R.id.dsr7);
        home1=findViewById(R.id.dsr8);
        home2=findViewById(R.id.dsr9);
        home3=findViewById(R.id.dsr10);
        home4=findViewById(R.id.dsr11);
        home5=findViewById(R.id.dsr12);

        btn=findViewById(R.id.backButtondsr);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdyarDSRActivity.this, HomeDSRActivity.class);
                startActivity(intent);
            }
        });
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdyarDSRActivity.this, DSRsevenDActivity.class);
                startActivity(intent);
            }
        });
        home1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdyarDSRActivity.this, DSReightDActivity.class);
                startActivity(intent);
            }
        });
        home2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdyarDSRActivity.this, DSRnineDActivity.class);
                startActivity(intent);
            }
        });
        home3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdyarDSRActivity.this, DSRtenDActivity.class);
                startActivity(intent);
            }
        });
        home4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdyarDSRActivity.this, DSRelevenDActivity.class);
                startActivity(intent);
            }
        });
        home5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdyarDSRActivity.this, DSRtwelveDActivity.class);
                startActivity(intent);
            }
        });
    }
}






