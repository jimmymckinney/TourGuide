package com.example.android.tourguide;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

public class DiningActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dining);

        // Find the view pager that will allow the user to swipe between fragments
        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager_dining);

        // Create an adapter that knows which fragment should be shown on each page
        CategoryPagerAdapter adapter = new CategoryPagerAdapter(this, getSupportFragmentManager(), 3, new RestaurantsFragment(), new FastFoodFragment(), new GroceryFragment(), this.getString(R.string.fragment_restaurants), this.getString(R.string.fragment_fast_food), this.getString(R.string.fragment_grocery));

        // Set the adapter onto the view pager
        viewPager.setAdapter(adapter);

        // Give the TabLayout the ViewPager
        TabLayout tabLayout = (TabLayout) findViewById(R.id.sliding_tabs_dining);
        tabLayout.setupWithViewPager(viewPager);
    }
}