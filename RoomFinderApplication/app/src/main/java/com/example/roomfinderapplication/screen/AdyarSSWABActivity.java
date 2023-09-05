package com.example.roomfinderapplication.screen;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.roomfinderapplication.R;

public class AdyarSSWABActivity extends AppCompatActivity {

    ImageView btn;
    private ImageView home,home1,home2,home3,home4,home5;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adyar_sswabactivity);
        home=findViewById(R.id.sswab7);
        home1=findViewById(R.id.sswab8);
        home2=findViewById(R.id.sswab9);
        home3=findViewById(R.id.sswab10);
        home4=findViewById(R.id.sswab11);
        home5=findViewById(R.id.sswab12N);

        btn=findViewById(R.id.backButtonsswab);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdyarSSWABActivity.this, HomeSSWABActivity.class);
                startActivity(intent);
            }
        });
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdyarSSWABActivity.this, SSWABsevenDActivity.class);
                startActivity(intent);
            }
        });
        home1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdyarSSWABActivity.this, SSWABeightDActivity.class);
                startActivity(intent);
            }
        });
        home2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdyarSSWABActivity.this, SSWABnineDActivity.class);
                startActivity(intent);
            }
        });
        home3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdyarSSWABActivity.this, SSWABtenDActivity.class);
                startActivity(intent);
            }
        });
        home4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdyarSSWABActivity.this, SSWABeleevenDActivity.class);
                startActivity(intent);
            }
        });
        home5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdyarSSWABActivity.this, SSWABtwelveDActivity.class);
                startActivity(intent);
            }
        });
    }
}
