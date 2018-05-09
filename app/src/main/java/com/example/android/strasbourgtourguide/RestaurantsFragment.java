package com.example.android.strasbourgtourguide;


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
public class RestaurantsFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        // Create a list of places
        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(R.string.restaurants_gavroche, R.string.place_address, R.string.restaurants_description, R.drawable.restaurants_image_one));
        places.add(new Place(R.string.restaurants_la_coccinelle, R.string.place_address, R.string.restaurants_description, R.drawable.restaurants_image_two));
        places.add(new Place(R.string.restaurants_au_crocodile, R.string.place_address, R.string.restaurants_description, R.drawable.restaurants_image_three));
        places.add(new Place(R.string.restaurants_la_cambuse, R.string.place_address, R.string.restaurants_description, R.drawable.restaurants_image_two));
        places.add(new Place(R.string.restaurants_le_schnockeloch, R.string.place_address, R.string.restaurants_description, R.drawable.restaurants_image_one));
        places.add(new Place(R.string.restaurants_le_baeckeoffe, R.string.place_address, R.string.restaurants_description, R.drawable.restaurants_image_three));
        places.add(new Place(R.string.restaurants_chez_yvonne, R.string.place_address, R.string.restaurants_description, R.drawable.restaurants_image_one));
        places.add(new Place(R.string.restaurants_le_tire_bouchon, R.string.place_address, R.string.restaurants_description, R.drawable.restaurants_image_three));
        places.add(new Place(R.string.restaurants_au_dauphin, R.string.place_address, R.string.restaurants_description, R.drawable.restaurants_image_two));

        // Create an {@link PlaceAdapter}, whose data source is a list of {@link Place}s. The
        // adapter knows how to create list items for each item in the list.
        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // place_list.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link PlaceAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Place} in the list.
        listView.setAdapter(adapter);

        // Set a click listener to open a {@link PlaceDetailsActivity} when the list item is clicked on
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {


                // Get the {@link Place} object at the given position the user clicked on
                Place place = places.get(position);
                Intent PlaceDetailsIntent = new Intent(getContext(), PlaceDetailsActivity.class);

                //Send the place informations to the {@link PlaceDetailsActivity}.
                PlaceDetailsIntent.putExtra(PlaceDetailsActivity.PLACE_NAME, place.getPlaceNameId());
                PlaceDetailsIntent.putExtra(PlaceDetailsActivity.PLACE_ADDRESS, place.getPlaceLocationId());
                PlaceDetailsIntent.putExtra(PlaceDetailsActivity.PLACE_DESCRIPTION, place.getPlaceDescriptionId());
                PlaceDetailsIntent.putExtra(PlaceDetailsActivity.PLACE_IMAGE, place.getImageResourceId());

                startActivity(PlaceDetailsIntent);
            }
        });

        return rootView;
    }

}

