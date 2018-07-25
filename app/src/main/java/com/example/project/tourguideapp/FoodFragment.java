package com.example.project.tourguideapp;


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
        placesToVisit.add(new Tours ("Comunidad Valenciana", "Paella", R.drawable.paella));
        placesToVisit.add(new Tours ("Comunidad de Madrid", "Cocido madrileño", R.drawable.cocido));
        placesToVisit.add(new Tours ("Asturias", "Fabada asturiana", R.drawable.fabada));
        placesToVisit.add(new Tours ("All Spain", "Jamón ibérico", R.drawable.jamon));
        placesToVisit.add(new Tours ("Andalucía", "Gazpacho", R.drawable.gazpacho));
        placesToVisit.add(new Tours ("All Spain", "Tortilla de patatas", R.drawable.tortilla));
        placesToVisit.add(new Tours ("Galicia", "Pulpo", R.drawable.pulpo));
        placesToVisit.add(new Tours ("Andalucía", "Rabo de toro", R.drawable.rabotoro));
        placesToVisit.add(new Tours ("País Vasco", "Merluza en salsa verde", R.drawable.merluza));
        placesToVisit.add(new Tours ("Extremadura", "Migas", R.drawable.migas));

        ToursAdapter adapter = new ToursAdapter(getActivity(), placesToVisit, R.color.food);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }

}
