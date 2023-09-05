package com.example.roomfinderapplication.screen;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.ImageView;

import com.example.roomfinderapplication.R;

public class HomeSSRActivity extends AppCompatActivity {

    private Button btn;
    ImageView back;
    AutoCompleteTextView spinner;
    String[] place = {"Adyar","PVS","Carstreet","Farangipete","Adyar Katte"};

    private ImageView home,home1,home2,home3,home4,home5;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_ssractivity);
        btn = findViewById(R.id.button);
        back=findViewById(R.id.back);
        home=findViewById(R.id.ssr1);
        home1=findViewById(R.id.ssr2);
        home2=findViewById(R.id.ssr3);
        home3=findViewById(R.id.ssr4);
        home4=findViewById(R.id.ssr5);
        home5=findViewById(R.id.ssr6);
        spinner=findViewById(R.id.auto_complete_text3);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(HomeSSRActivity.this, android.R.layout.simple_spinner_item,place);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String selectedPlace = (String) parent.getItemAtPosition(position);

                if (selectedPlace.equals("Adyar")) {
                    Intent intent = new Intent(HomeSSRActivity.this, AdyarActivity.class);
                    startActivity(intent);
                } else if (selectedPlace.equals("PVS")) {
                    Intent intent = new Intent(HomeSSRActivity.this, PVSActivity.class);
                    startActivity(intent);
                } else if (selectedPlace.equals("Carstreet")) {
                    Intent intent = new Intent(HomeSSRActivity.this, CarstreetActivity.class);
                    startActivity(intent);
                } else if (selectedPlace.equals("Farangipete")) {
                    Intent intent = new Intent(HomeSSRActivity.this, FarangipeteActivity.class);
                    startActivity(intent);
                } else if (selectedPlace.equals("Adyar Katte")) {
                    Intent intent = new Intent(HomeSSRActivity.this, AdyarKatteActivity.class);
                    startActivity(intent);
                }
            }
        });

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeSSRActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeSSRActivity.this, PreferActivity.class);
                startActivity(intent);
            }
        });
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeSSRActivity.this, SSRfDActivity.class);
                startActivity(intent);
            }
        });
        home1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeSSRActivity.this, SSRtDActivity.class);
                startActivity(intent);
            }
        });
        home2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeSSRActivity.this, SSRsDActivity.class);
                startActivity(intent);
            }
        });
        home3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeSSRActivity.this, SSRfourthDActivityActivity.class);
                startActivity(intent);
            }
        });
        home4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeSSRActivity.this, SSRfifthDActivity.class);
                startActivity(intent);
            }
        });
        home5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeSSRActivity.this, SSRsixxDActivity.class);
                startActivity(intent);
            }
        });


    }
}