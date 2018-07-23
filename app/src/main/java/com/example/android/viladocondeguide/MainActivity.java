package com.example.android.viladocondeguide;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Get the view pager
        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);

        // Create the adapter
        PlaceListAdapter adapter = new PlaceListAdapter(this, getSupportFragmentManager());

        // Set the adapter onto the view pager
        viewPager.setAdapter(adapter);

        // Get layout that shows the tabs
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);

        // Connect tab layout with view pager.
        tabLayout.setupWithViewPager(viewPager);
    }
}
