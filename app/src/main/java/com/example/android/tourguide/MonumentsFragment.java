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
public class MonumentsFragment extends Fragment {


    public MonumentsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.sight_list, container, false);

        //Create an array of sights
        ArrayList<Sight> sights = new ArrayList<Sight>();
        sights.add(new Sight(R.drawable.monuments_saigo_takamori_statue, this.getString(R.string.monuments_1), this.getString(R.string.monuments_description_1)));
        sights.add(new Sight(R.drawable.monuments_okubo_toshimichi_statue, this.getString(R.string.monuments_2), this.getString(R.string.monuments_description_2)));
        sights.add(new Sight(R.drawable.monuments_sakebi_no_shozo, this.getString(R.string.monuments_3), this.getString(R.string.monuments_description_3)));
        sights.add(new Sight(R.drawable.monuments_takamori_saigo_birthplace_monument, this.getString(R.string.monuments_4), this.getString(R.string.monuments_description_4)));

        SightAdapter adapter = new SightAdapter(getActivity(), sights, R.color.category_attractions);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }

}
