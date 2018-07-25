package com.example.android.viladocondeguide;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class VisitFragment extends Fragment {


    public VisitFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.place_list, container, false);

        // Create List of Places
        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(R.string.visit01, R.drawable.most_st_clara, R.string.visit01d));
        places.add(new Place(R.string.visit02, R.drawable.aqueduto, R.string.visit02d));
        places.add(new Place(R.string.visit03, R.drawable.igreja_st_clara, R.string.visit03d));
        places.add(new Place(R.string.visit04, R.drawable.matriz, R.string.visit04d));
        places.add(new Place(R.string.visit05, R.drawable.senhora_guia, R.string.visit05d));
        places.add(new Place(R.string.visit06, R.drawable.capela_socorro, R.string.visit06d));
        places.add(new Place(R.string.visit07, R.drawable.lapa, R.string.visit07d));

        // Create an PlaceAdapter
        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places, R.color.list_visit);

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
