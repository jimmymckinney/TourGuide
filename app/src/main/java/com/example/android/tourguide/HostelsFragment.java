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
public class HostelsFragment extends Fragment {


    public HostelsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.sight_list, container, false);

        //Create an array of sights
        ArrayList<Sight> sights = new ArrayList<Sight>();
        sights.add(new Sight(R.drawable.hostels_green_guest_house, this.getString(R.string.hostels_1), this.getString(R.string.hostels_description_1)));
        sights.add(new Sight(R.drawable.hostels_kagoshima_little_asia_guest_house, this.getString(R.string.hostels_2), this.getString(R.string.hostels_description_2)));
        sights.add(new Sight(R.drawable.hostels_hotel_and_residence_nanshukan, this.getString(R.string.hostels_3), this.getString(R.string.hostels_description_3)));

        SightAdapter adapter = new SightAdapter(getActivity(), sights, R.color.category_accommodations);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }

}
