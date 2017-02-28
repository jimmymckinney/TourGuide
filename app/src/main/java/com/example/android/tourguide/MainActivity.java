package com.example.android.tourguide;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // onClickListener setting the Content View to AttractionsActivity
        View attractions = findViewById(R.id.attractions);
        attractions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create a new intent to open the {@link AttractionsActivity}
                Intent attractionsIntent = new Intent(MainActivity.this, AttractionsActivity.class);

                // Start the new activity
                startActivity(attractionsIntent);
            }
        });

        // onClickListener setting the Content View to DiningActivity
        View dining = findViewById(R.id.dining);
        dining.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create a new intent to open the {@link DiningActivity}
                Intent diningIntent = new Intent(MainActivity.this, DiningActivity.class);

                // Start the new activity
                startActivity(diningIntent);
            }
        });

        // onClickListener setting the Content View to ShoppingActivity
        View shopping = findViewById(R.id.shopping);
        shopping.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create a new intent to open the {@link ShoppingActivity}
                Intent shoppingIntent = new Intent(MainActivity.this, ShoppingActivity.class);

                // Start the new activity
                startActivity(shoppingIntent);
            }
        });

        // onClickListener setting the Content View to AccomodationsActivity
        View accommodations = findViewById(R.id.accommodations);
        accommodations.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create a new intent to open the {@link ShoppingActivity}
                Intent accommodationsIntent = new Intent(MainActivity.this, AccommodationsActivity.class);

                // Start the new activity
                startActivity(accommodationsIntent);
            }
        });
    }
}
