package com.example.project.tourguideapp;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class EventsFragment extends Fragment {


    public EventsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tours_list, container, false);
        //Create the array list to store the different places
        final ArrayList<Tours> placesToVisit = new ArrayList<Tours>();

        //add the different places into the array list
        placesToVisit.add(new Tours (getResources().getString(R.string.place_cantabria), getResources().getString(R.string.event_cantabria),-1, R.drawable.chupinazosantander, getResources().getString(R.string.description_semana_grande )));
        placesToVisit.add(new Tours (getResources().getString(R.string.place_castilla_mancha), getResources().getString(R.string.zurra),-1, R.drawable.zurra, getResources().getString(R.string.description_zurra)));
        placesToVisit.add(new Tours (getResources().getString(R.string.place_valencia), getResources().getString(R.string.fallas),-1, R.drawable.fallas, getResources().getString(R.string.description_fallas)));
        placesToVisit.add(new Tours (getResources().getString(R.string.place_andalucia), getResources().getString(R.string.carnaval),-1, R.drawable.carnaval, getResources().getString(R.string.description_carnaval)));
        placesToVisit.add(new Tours (getResources().getString(R.string.place_madrid), getResources().getString(R.string.isidro),-1, R.drawable.isidro, getResources().getString(R.string.description_isidro)));
        placesToVisit.add(new Tours (getResources().getString(R.string.place_andalucia), getResources().getString(R.string.feria),-1, R.drawable.feriaabril, getResources().getString(R.string.description_feria)));
        placesToVisit.add(new Tours (getResources().getString(R.string.place_valencia), getResources().getString(R.string.tomatina),-1, R.drawable.tomatina, getResources().getString(R.string.description_tomatina)));
        placesToVisit.add(new Tours (getResources().getString(R.string.place_valencia), getResources().getString(R.string.hogueras),-1, R.drawable.hoguerassanjuan, getResources().getString(R.string.description_hogueras)));
        placesToVisit.add(new Tours (getResources().getString(R.string.place_asturias), getResources().getString(R.string.sella),-1, R.drawable.sella, getResources().getString(R.string.description_sella)));
        placesToVisit.add(new Tours (getResources().getString(R.string.place_navarra), getResources().getString(R.string.fermines),-1, R.drawable.sanfermines, getResources().getString(R.string.description_fermines)));

        ToursAdapter adapter = new ToursAdapter(getActivity(), placesToVisit, R.color.celebrations);
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
