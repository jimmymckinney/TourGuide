package com.example.android.tourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class RestaurantsFragment extends Fragment {


    public RestaurantsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.sight_list, container, false);

        //Create an array of sights
        ArrayList<Sight> sights = new ArrayList<Sight>();
        sights.add(new Sight(R.drawable.restaurants_kagomma_furusato_yataimura, this.getString(R.string.restaurant_1), this.getString(R.string.restaurant_description_1)));
        sights.add(new Sight(R.drawable.restaurants_tontoro_ramen, this.getString(R.string.restaurant_2), this.getString(R.string.restaurant_description_2)));
        sights.add(new Sight(R.drawable.restaurants_ajimori, this.getString(R.string.restaurant_3), this.getString(R.string.restaurant_description_3)));
        sights.add(new Sight(R.drawable.restaurants_kawakyu, this.getString(R.string.restaurant_4), this.getString(R.string.restaurant_description_4)));

        SightAdapter adapter = new SightAdapter(getActivity(), sights, R.color.category_dining);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }

}
