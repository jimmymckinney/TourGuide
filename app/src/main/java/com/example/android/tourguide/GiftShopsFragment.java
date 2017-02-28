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
public class GiftShopsFragment extends Fragment {


    public GiftShopsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.sight_list, container, false);

        //Create an array of sights
        ArrayList<Sight> sights = new ArrayList<Sight>();
        sights.add(new Sight(R.drawable.gift_shops_dolphin_port, this.getString(R.string.gift_shops_1), this.getString(R.string.gift_shops_description_1)));
        sights.add(new Sight(R.drawable.gift_shops_yumeria, this.getString(R.string.gift_shops_2), this.getString(R.string.gift_shops_description_2)));
        sights.add(new Sight(R.drawable.gift_shops_sakurajima_bussankan, this.getString(R.string.gift_shops_3), this.getString(R.string.gift_shops_description_3)));

        SightAdapter adapter = new SightAdapter(getActivity(), sights, R.color.category_shopping);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }

}
