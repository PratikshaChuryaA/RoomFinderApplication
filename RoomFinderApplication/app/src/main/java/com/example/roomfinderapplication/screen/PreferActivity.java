package com.example.roomfinderapplication.screen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.roomfinderapplication.R;

public class PreferActivity extends AppCompatActivity {
    ImageView s1,s2,d1,d2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prefer);
        s1=findViewById(R.id.single_a);
        s2=findViewById(R.id.single_na);
        d1=findViewById(R.id.double_a);
        d2=findViewById(R.id.double_na);
        s1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(PreferActivity.this, HomeSSWABActivity.class);
                startActivity(intent);
            }
        });
        s2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(PreferActivity.this, HomeSSRActivity.class);
                startActivity(intent);
            }
        });
        d1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(PreferActivity.this, HomeDSWABActivity.class);
                startActivity(intent);
            }
        });
        d2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(PreferActivity.this, HomeDSRActivity.class);
                startActivity(intent);
            }
        });
    }
}