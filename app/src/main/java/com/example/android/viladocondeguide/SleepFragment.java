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
public class SleepFragment extends Fragment {

    public SleepFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.place_list, container, false);

        // Create List of Places
        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(R.string.sleep01, R.drawable.sleep_santana, R.string.sleep01d));
        places.add(new Place(R.string.sleep02, R.drawable.sleep_villa_c, R.string.sleep02d));
        places.add(new Place(R.string.sleep03, R.drawable.sleep_brazao, R.string.sleep03d));
        places.add(new Place(R.string.sleep04, R.drawable.sleep_autor, R.string.sleep04d));
        places.add(new Place(R.string.sleep05, R.drawable.sleep_rio_charm, R.string.sleep05d));
        places.add(new Place(R.string.sleep06, R.drawable.sleep_erva_doce, R.string.sleep06d));
        places.add(new Place(R.string.sleep07, R.drawable.sleep_princesa_ave, R.string.sleep07d));
        places.add(new Place(R.string.sleep08, R.drawable.sleep_lapa, R.string.sleep08d));

        // Create an PlaceAdapter
        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places, R.color.list_sleep);

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
