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
public class EatFragment extends Fragment {


    public EatFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.place_list, container, false);

        // Create List of Places
        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(R.string.eat01, R.drawable.eat_adega, R.string.eat01d));
        places.add(new Place(R.string.eat02, R.drawable.eat_villazur, R.string.eat02d));
        places.add(new Place(R.string.eat03, R.drawable.eat_romando, R.string.eat03d));
        places.add(new Place(R.string.eat04, R.drawable.eat_cangalho, R.string.eat04d));
        places.add(new Place(R.string.eat05, R.drawable.eat_republika, R.string.eat05d));
        places.add(new Place(R.string.eat06, R.drawable.eat_doca, R.string.eat06d));
        places.add(new Place(R.string.eat07, R.drawable.eat_praca_velha, R.string.eat07d));
        places.add(new Place(R.string.eat08, R.drawable.eat_mestre, R.string.eat08d));


        // Create an PlaceAdapter
        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places, R.color.list_eat);

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

