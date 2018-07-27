package com.example.project.tourguideapp;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
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
        placesToVisit.add(new Tours (getResources().getString(R.string.place_murcia), getResources().getString(R.string.salinas_pedro), R.drawable.salinaspedro, R.drawable.salinaspedro, getResources().getString(R.string.description_salinas_pedro)));
        placesToVisit.add(new Tours (getResources().getString(R.string.place_castilla_mancha),getResources().getString(R.string.almagro), R.drawable.almagro, R.drawable.almagro, getResources().getString(R.string.description_almagro)));
        placesToVisit.add(new Tours (getResources().getString(R.string.place_cantabria), getResources().getString(R.string.cabarceno), R.drawable.cabarceno, R.drawable.cabarceno, getResources().getString(R.string.description_cabarceno)));
        placesToVisit.add(new Tours (getResources().getString(R.string.place_cataluña), getResources().getString(R.string.riglos), R.drawable.mallosriglos, R.drawable.mallosriglos, getResources().getString(R.string.description_riglos)));
        placesToVisit.add(new Tours (getResources().getString(R.string.place_canarias), getResources().getString(R.string.orchilla), R.drawable.faroorchilla, R.drawable.faroorchilla, getResources().getString(R.string.description_orchilla)));
        placesToVisit.add(new Tours (getResources().getString(R.string.place_canarias), getResources().getString(R.string.fuencaliente), R.drawable.salinasfuencaliente, R.drawable.salinasfuencaliente, getResources().getString(R.string.description_fuencaliente)));
        placesToVisit.add(new Tours (getResources().getString(R.string.place_canarias), getResources().getString(R.string.timanfaya), R.drawable.timanfaya, R.drawable.timanfaya, getResources().getString(R.string.description_timanfaya)));
        placesToVisit.add(new Tours (getResources().getString(R.string.place_castilla_leon), getResources().getString(R.string.duraton), R.drawable.hocesduraton, R.drawable.hocesduraton, getResources().getString(R.string.description_duraton)));
        placesToVisit.add(new Tours (getResources().getString(R.string.place_galicia), getResources().getString(R.string.canon_sil), R.drawable.canonessil, R.drawable.canonessil, getResources().getString(R.string.description_canon_sil)));
        placesToVisit.add(new Tours (getResources().getString(R.string.place_madrid), getResources().getString(R.string.mendoza), R.drawable.castillomendoza, R.drawable.castillomendoza, getResources().getString(R.string.description_mendoza)));

        ToursAdapter adapter = new ToursAdapter(getActivity(), placesToVisit, R.color.places);
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
