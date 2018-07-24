package com.example.android.viladocondeguide;

import android.app.Activity;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class PlaceAdapter extends ArrayAdapter<Place> {

    /**
     * Resource ID for background color
     */
    private int mColorResourceId;

    /**
     * Place costum constructor
     *
     * @param context The current context..
     * @param places List of Places objects
     */
    public PlaceAdapter(Activity context, ArrayList<Place> places, int colorResourceId) {
        // Initialize the ArrayAdapter
        super(context, 0, places);
        mColorResourceId = colorResourceId;
    }

    /**
     * Provides a view for an AdapterView
     *
     * @param position The position in the list.
     * @param convertView The recycled view to populate.
     * @param parent The parent ViewGroup that is used for inflation.
     * @return The View for the position in the AdapterView.
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listPlaceView = convertView;
        if (listPlaceView == null) {
            listPlaceView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_place, parent, false);
        }

        // Get the position {@link Place} object
        Place currentPlace = getItem(position);

        // Find the TextView for Name in the list_place.xml
        TextView placeName = (TextView) listPlaceView.findViewById(R.id.name_text_view);
        // Get Place name from current object
        placeName.setText(currentPlace.getPlaceName());

        // Find the ImageView in the list_place.xml
        ImageView imageView = (ImageView) listPlaceView.findViewById(R.id.image);
        // Display the provided image based on the resource ID
        imageView.setImageResource(currentPlace.getImageResourceId());

        // Set the theme color for the list item
        View textContainer = listPlaceView.findViewById(R.id.text_container);
        // Find the color
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        // Set the background color
        textContainer.setBackgroundColor(color);

        // Return the whole list item layout
        return listPlaceView;
    }
}
