package com.example.android.viladocondeguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        // Get intent
        Bundle placeItem = getIntent().getExtras();

        // Get Place object class from intent
        Place place = (Place) placeItem.getParcelable("placeItem");

        // Get & Add Place Name to TextView
        TextView detailsPlaceName = (TextView) findViewById(R.id.placeName);
        detailsPlaceName.setText(place.getPlaceName());

        // Get & Add the Place image to ImageView
        ImageView imageView = (ImageView) findViewById(R.id.placeImage);
        imageView.setImageResource(place.getImageResourceId());

        // Get & Add Place Description to TextView
        TextView detailsMusicAuthor = (TextView) findViewById(R.id.placeDescription);
        detailsMusicAuthor.setText(place.getPlaceDescription());
    }
}