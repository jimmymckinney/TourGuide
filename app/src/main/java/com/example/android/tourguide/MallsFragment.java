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
public class MallsFragment extends Fragment {


    public MallsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.sight_list, container, false);

        //Create an array of sights
        ArrayList<Sight> sights = new ArrayList<Sight>();
        sights.add(new Sight(R.drawable.shopping_centers_amu_plaza, this.getString(R.string.shopping_centers_1), this.getString(R.string.shopping_centers_description_1)));
        sights.add(new Sight(R.drawable.shopping_centers_tenmonkan, this.getString(R.string.shopping_centers_2), this.getString(R.string.shopping_centers_description_2)));
        sights.add(new Sight(R.drawable.shopping_centers_daiei, this.getString(R.string.shopping_centers_3), this.getString(R.string.shopping_centers_description_3)));

        SightAdapter adapter = new SightAdapter(getActivity(), sights, R.color.category_shopping);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }

}
