package com.example.roomfinderapplication.screen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.roomfinderapplication.R;

public class DetailsActivity extends AppCompatActivity {

    private ImageView imageView;
    private TextView price, shortDescription, description;

    String pri, des, shdes, img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        imageView = findViewById(R.id.imageView);
        price = findViewById(R.id.price);
        shortDescription = findViewById(R.id.short_description);
        description = findViewById(R.id.description);

        pri = getIntent().getStringExtra("price");
        des = getIntent().getStringExtra("description");
        img = getIntent().getStringExtra("image");
        shdes = getIntent().getStringExtra("shortDescription");

        price.setText("Rs." + pri);
        description.setText(des);
        shortDescription.setText(shdes);

        Glide.with(this)
                .load(img)
                .centerCrop()
                .placeholder(R.drawable.ic_home)
                .into(imageView);

        // Set click listener for the "Back" Button
        ImageView backButton = findViewById(R.id.backButton11);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }
}
