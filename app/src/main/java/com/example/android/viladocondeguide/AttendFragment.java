package com.example.android.viladocondeguide;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class AttendFragment extends Fragment {


    public AttendFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.place_list, container, false);

        // Create List of Places
        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(R.string.attend01, R.drawable.curtas, R.string.attend01d));
        places.add(new Place(R.string.attend02, R.drawable.sao_joao, R.string.attend02d));
        places.add(new Place(R.string.attend03, R.drawable.artesanato, R.string.attend03d));
        places.add(new Place(R.string.attend04, R.drawable.gastronomia, R.string.attend04d));
        places.add(new Place(R.string.attend05, R.drawable.rural, R.string.attend05d));
        places.add(new Place(R.string.attend06, R.drawable.tapetes, R.string.attend06d));

        // Create an PlaceAdapter
        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places, R.color.list_attend);

        // Get ListView
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Add PlaceAdapter to ListView
        listView.setAdapter(adapter);

        // Set a click listener to play the place when is clicked on
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                // Get the {@link Place} object at the given position the user clicked on
                Place placeItem = places.get(position);

                // Create intent to open {@link DetailsActivity}
                Intent DetailsIntent = new Intent(getActivity(), DetailsActivity.class);
                // Add Place Item Object to Intent
                DetailsIntent.putExtra("placeItem", placeItem);
                // Start the activity
                startActivity(DetailsIntent);

            }
        });

        return rootView;
    }

}

