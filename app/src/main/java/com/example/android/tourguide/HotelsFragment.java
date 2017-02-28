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
public class HotelsFragment extends Fragment {


    public HotelsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.sight_list, container, false);

        //Create an array of sights
        ArrayList<Sight> sights = new ArrayList<Sight>();
        sights.add(new Sight(R.drawable.hotels_jr_kyushu_hotel_kagoshima, this.getString(R.string.hotels_1), this.getString(R.string.hotels_description_1)));
        sights.add(new Sight(R.drawable.hotels_richmond_hotel_kagoshima_kinseicho, this.getString(R.string.hotels_2), this.getString(R.string.hotels_description_2)));
        sights.add(new Sight(R.drawable.hotels_dormy_inn_kagoshima, this.getString(R.string.hotels_3), this.getString(R.string.hotels_description_3)));
        sights.add(new Sight(R.drawable.hotels_hotel_shiroyama, this.getString(R.string.hotels_4), this.getString(R.string.hotels_description_4)));

        SightAdapter adapter = new SightAdapter(getActivity(), sights, R.color.category_accommodations);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }

}
