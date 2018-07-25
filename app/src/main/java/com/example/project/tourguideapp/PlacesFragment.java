package com.example.project.tourguideapp;


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
public class PlacesFragment extends Fragment {


    public PlacesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tours_list, container, false);
        //Create the array list to store the different places
        final ArrayList<Tours> placesToVisit = new ArrayList<Tours>();

        //add the different places into the array list
        placesToVisit.add(new Tours ("Comunidad de Murcia", "Salinas de San Pedro", R.drawable.salinaspedro));
        placesToVisit.add(new Tours ("Castilla-La Mancha", "Almagro", R.drawable.almagro));
        placesToVisit.add(new Tours ("Cantabria", "Parque de la Naturaleza de Cabárceno", R.drawable.cabarceno));
        placesToVisit.add(new Tours ("Cataluña", "Mallos de Riglos", R.drawable.mallosriglos));
        placesToVisit.add(new Tours ("Islas Canarias", "Faro de Orchilla", R.drawable.faroorchilla));
        placesToVisit.add(new Tours ("Islas Canarias", "Salinas de Fuencaliente", R.drawable.salinasfuencaliente));
        placesToVisit.add(new Tours ("Islas Canarias", "Timanfaya", R.drawable.timanfaya));
        placesToVisit.add(new Tours ("Castilla y León", "Hoces del Duratón", R.drawable.hocesduraton));
        placesToVisit.add(new Tours ("Galicia", "Cañón del Sil", R.drawable.canonessil));
        placesToVisit.add(new Tours ("Comunidad de Madrid", "Castillo de Mendoza", R.drawable.castillomendoza));

        ToursAdapter adapter = new ToursAdapter(getActivity(), placesToVisit, R.color.places);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }

}
