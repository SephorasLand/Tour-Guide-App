package com.example.project.tourguideapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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
        placesToVisit.add(new Tours ("País Vasco", "Martín Berasategui"));
        placesToVisit.add(new Tours ("Cataluña", "El Celler de Can Roca"));
        placesToVisit.add(new Tours ("País Vasco", "Azurmendi"));
        placesToVisit.add(new Tours ("Islas Baleares", "Es Caló Restaurant"));
        placesToVisit.add(new Tours ("Cataluña", "Disfrutar"));
        placesToVisit.add(new Tours ("La Rioja", "La Vieja Bodega"));
        placesToVisit.add(new Tours ("Cataluña", "UMA"));
        placesToVisit.add(new Tours ("Comunidad de Madrid", "Dstage"));
        placesToVisit.add(new Tours ("Comunidad de Madrid", "Diverxo"));
        placesToVisit.add(new Tours ("Andalucía", "ReComiendo"));

        ToursAdapter adapter = new ToursAdapter(getActivity(), placesToVisit, R.color.restaurants);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }

}
