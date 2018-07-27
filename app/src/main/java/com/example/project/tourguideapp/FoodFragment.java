package com.example.project.tourguideapp;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class FoodFragment extends Fragment {


    public FoodFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tours_list, container, false);
        //Create the array list to store the different places
        final ArrayList<Tours> placesToVisit = new ArrayList<Tours>();

        //add the different places into the array list
        placesToVisit.add(new Tours (getResources().getString(R.string.place_valencia), getResources().getString(R.string.paella), R.drawable.paella, R.drawable.paella, getResources().getString(R.string.description_paella)));
        placesToVisit.add(new Tours (getResources().getString(R.string.place_madrid), getResources().getString(R.string.cocido_madrileno), R.drawable.cocido, R.drawable.cocido, getResources().getString(R.string.description_cocido_madrileno)));
        placesToVisit.add(new Tours (getResources().getString(R.string.place_asturias), getResources().getString(R.string.fabada), R.drawable.fabada, R.drawable.fabada, getResources().getString(R.string.description_fabada)));
        placesToVisit.add(new Tours (getResources().getString(R.string.all_spain), getResources().getString(R.string.jamon),R.drawable.jamon, R.drawable.jamon, getResources().getString(R.string.description_jamon)));
        placesToVisit.add(new Tours (getResources().getString(R.string.place_andalucia), getResources().getString(R.string.gazpacho),R.drawable.gazpacho, R.drawable.gazpacho, getResources().getString(R.string.description_gazpacho)));
        placesToVisit.add(new Tours (getResources().getString(R.string.all_spain), getResources().getString(R.string.tortilla),R.drawable.tortilla, R.drawable.tortilla, getResources().getString(R.string.description_tortilla)));
        placesToVisit.add(new Tours (getResources().getString(R.string.place_galicia), getResources().getString(R.string.pulpo),R.drawable.pulpo, R.drawable.pulpo, getResources().getString(R.string.description_pulpo)));
        placesToVisit.add(new Tours (getResources().getString(R.string.place_andalucia), getResources().getString(R.string.rabo_toro),R.drawable.rabotoro, R.drawable.rabotoro, getResources().getString(R.string.description_rabo_toro)));
        placesToVisit.add(new Tours (getResources().getString(R.string.place_pais_vasco), getResources().getString(R.string.merluza),R.drawable.merluza, R.drawable.merluza, getResources().getString(R.string.description_merluza)));
        placesToVisit.add(new Tours (getResources().getString(R.string.place_extemadura), getResources().getString(R.string.migas),R.drawable.migas, R.drawable.migas, getResources().getString(R.string.description_migas)));

        ToursAdapter adapter = new ToursAdapter(getActivity(), placesToVisit, R.color.food);
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
