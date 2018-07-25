package com.example.project.tourguideapp;


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
        placesToVisit.add(new Tours ("Cantabria", "La Semana Grande de Santander"));
        placesToVisit.add(new Tours ("Castilla-La Mancha", "Zurra/Pandorga"));
        placesToVisit.add(new Tours ("Comunidad Valenciana", "Fallas"));
        placesToVisit.add(new Tours ("Andalucía", "Carnaval"));
        placesToVisit.add(new Tours ("Comunidad de Madrid", "San Isidro"));
        placesToVisit.add(new Tours ("Andalucía", "Feria de Abril"));
        placesToVisit.add(new Tours ("Comunidad Valenciana", "La Tomatina"));
        placesToVisit.add(new Tours ("Comunidad Valenciana", "Hogueras de San Juan"));
        placesToVisit.add(new Tours ("Asturias", "Descenso del Sella"));
        placesToVisit.add(new Tours ("Navarra", "Los Sanfermines"));

        ToursAdapter adapter = new ToursAdapter(getActivity(), placesToVisit, R.color.celebrations);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }

}
