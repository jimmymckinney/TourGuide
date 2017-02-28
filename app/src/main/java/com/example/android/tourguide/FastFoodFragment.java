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
public class FastFoodFragment extends Fragment {


    public FastFoodFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.sight_list, container, false);

        //Create an array of sights
        ArrayList<Sight> sights = new ArrayList<Sight>();
        sights.add(new Sight(R.drawable.fast_food_yoshinoya_tokai, this.getString(R.string.fast_food_1), this.getString(R.string.fast_food_description_1)));
        sights.add(new Sight(R.drawable.fast_food_coco_ichibanya, this.getString(R.string.fast_food_2), this.getString(R.string.fast_food_description_2)));
        sights.add(new Sight(R.drawable.fast_food_mos_burger, this.getString(R.string.fast_food_3), this.getString(R.string.fast_food_description_3)));
        sights.add(new Sight(R.drawable.fast_food_mcdonalds, this.getString(R.string.fast_food_4), this.getString(R.string.fast_food_description_4)));

        SightAdapter adapter = new SightAdapter(getActivity(), sights, R.color.category_dining);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }

}
