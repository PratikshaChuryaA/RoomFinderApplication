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

public class HomeDSRActivity extends AppCompatActivity {

    private Button btn;
    ImageView back;
    AutoCompleteTextView spinner;
    String[] place = {"Adyar","PVS","Carstreet","Farangipete","Adyar Katte"};

    private ImageView home,home1,home2,home3,home4,home5;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dsr);
        btn = findViewById(R.id.button);
        back=findViewById(R.id.back);
        home=findViewById(R.id.dsr1);
        home1=findViewById(R.id.dsr2);
        home2=findViewById(R.id.dsr3);
        home3=findViewById(R.id.dsr4);
        home4=findViewById(R.id.dsr5);
        home5=findViewById(R.id.dsr6);


        spinner=findViewById(R.id.auto_complete_text2);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(HomeDSRActivity.this, android.R.layout.simple_spinner_item,place);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String selectedPlace = (String) parent.getItemAtPosition(position);

                if (selectedPlace.equals("Adyar")) {
                    Intent intent = new Intent(HomeDSRActivity.this, AdyarDSRActivity.class);
                    startActivity(intent);
                } else if (selectedPlace.equals("PVS")) {
                    Intent intent = new Intent(HomeDSRActivity.this, PVSDSRActivity.class);
                    startActivity(intent);
                } else if (selectedPlace.equals("Carstreet")) {
                    Intent intent = new Intent(HomeDSRActivity.this, CarstreetDSRActivity.class);
                    startActivity(intent);
                } else if (selectedPlace.equals("Farangipete")) {
                    Intent intent = new Intent(HomeDSRActivity.this, FarangipeteDSRActivity.class);
                    startActivity(intent);
                } else if (selectedPlace.equals("Adyar Katte")) {
                    Intent intent = new Intent(HomeDSRActivity.this, AdyarKatteDSRActivity.class);
                    startActivity(intent);
                }
            }
        });




        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeDSRActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeDSRActivity.this, PreferActivity.class);
                startActivity(intent);
            }
        });
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeDSRActivity.this, DSRoneDActivity.class);
                startActivity(intent);
            }
        });
        home1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeDSRActivity.this, DSRtwoDActivity.class);
                startActivity(intent);
            }
        });
        home2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeDSRActivity.this, DSRthreeDActivity.class);
                startActivity(intent);
            }
        });
        home3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeDSRActivity.this, DSRfourDActivity.class);
                startActivity(intent);
            }
        });
        home4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeDSRActivity.this, DSRfiveDActivity.class);
                startActivity(intent);
            }
        });
        home5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeDSRActivity.this, DSRsixDActivity.class);
                startActivity(intent);
            }
        });


    }
}