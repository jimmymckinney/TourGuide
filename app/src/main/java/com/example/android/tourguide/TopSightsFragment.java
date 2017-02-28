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
public class TopSightsFragment extends Fragment {


    public TopSightsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.sight_list, container, false);

        //Create an array of sights
        ArrayList<Sight> sights = new ArrayList<Sight>();
        sights.add(new Sight(R.drawable.top_sights_sakurajima, this.getString(R.string.top_sights_1), this.getString(R.string.top_sights_description_1)));
        sights.add(new Sight(R.drawable.top_sights_senganen, this.getString(R.string.top_sights_2), this.getString(R.string.top_sights_description_2)));
        sights.add(new Sight(R.drawable.top_sights_kagoshima_aquarium, this.getString(R.string.top_sights_3), this.getString(R.string.top_sights_description_3)));
        sights.add(new Sight(R.drawable.top_sights_shiroyama_park, this.getString(R.string.top_sights_4), this.getString(R.string.top_sights_description_4)));


        SightAdapter adapter = new SightAdapter(getActivity(), sights, R.color.category_attractions);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }

}
