package com.example.project.tourguideapp;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.TextView;

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
        View rootView = inflater.inflate(R.layout.tours_list, container, false);
        //Create the array list to store the different places
        final ArrayList<Tours> placesToVisit = new ArrayList<Tours>();

        //add the different places into the array list
        placesToVisit.add(new Tours (getResources().getString(R.string.place_pais_vasco), getResources().getString(R.string.berasategui), -1, R.drawable.berasategui, getResources().getString(R.string.description_berasategui)));
        placesToVisit.add(new Tours (getResources().getString(R.string.place_cataluña), getResources().getString(R.string.roca), -1, R.drawable.cellerdesanroca, getResources().getString(R.string.description_roca)));
        placesToVisit.add(new Tours (getResources().getString(R.string.place_pais_vasco), getResources().getString(R.string.azurmendi), -1, R.drawable.azurmendi, getResources().getString(R.string.description_azurmendi)));
        placesToVisit.add(new Tours (getResources().getString(R.string.place_baleares), getResources().getString(R.string.calo), -1, R.drawable.escalorestaurant, getResources().getString(R.string.description_calo)));
        placesToVisit.add(new Tours (getResources().getString(R.string.place_cataluña), getResources().getString(R.string.disfrutar), -1, R.drawable.disfrutar, getResources().getString(R.string.description_disfrutar)));
        placesToVisit.add(new Tours (getResources().getString(R.string.place_rioja), getResources().getString(R.string.bodega), -1, R.drawable.viejabodega, getResources().getString(R.string.description_bodega)));
        placesToVisit.add(new Tours (getResources().getString(R.string.place_cataluña), getResources().getString(R.string.uma), -1, R.drawable.uma, getResources().getString(R.string.description_uma)));
        placesToVisit.add(new Tours (getResources().getString(R.string.place_madrid), getResources().getString(R.string.dstage), -1, R.drawable.dstage, getResources().getString(R.string.description_dstage)));
        placesToVisit.add(new Tours (getResources().getString(R.string.place_madrid), getResources().getString(R.string.diverxo), -1, R.drawable.diverxo, getResources().getString(R.string.description_diverxo)));
        placesToVisit.add(new Tours (getResources().getString(R.string.place_andalucia), getResources().getString(R.string.recomiendo), -1, R.drawable.recomiendo, getResources().getString(R.string.description_recomiendo)));

        ToursAdapter adapter = new ToursAdapter(getActivity(), placesToVisit, R.color.restaurants);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getActivity(), GalleryActivity.class);
                intent.putExtra("data", placesToVisit.get(position).getData());
                startActivity(intent);
            }
        });

        return rootView;
    }

}
