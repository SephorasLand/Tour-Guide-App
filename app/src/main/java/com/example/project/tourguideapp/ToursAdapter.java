package com.example.project.tourguideapp;

import android.app.Activity;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ToursAdapter extends ArrayAdapter<Tours> {

    //resource id for the color of the background
    private int mColorResourceId;

    public ToursAdapter(Activity context, ArrayList<Tours> placesToVisit, int colorResourceId){
        super(context, 0, placesToVisit);
        mColorResourceId = colorResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //check if an existing view is being reused. If not, create a new one
        View listItemView = convertView;
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        //get the Tours object position
        Tours currentTour = getItem(position);

        //find the text view of the list_item.xml layout for the place_text_view
        TextView placeTextView = (TextView) listItemView.findViewById(R.id.place_text_view);
        //get the name of the place and set it in the place text view
        placeTextView.setText(currentTour.getmPlaceName());

        //find the text view of the list_item.xml layout for the place_text_view
        TextView communityTextView = (TextView) listItemView.findViewById(R.id.community_text_view);
        //get the name of the place and set it in the place text view
        communityTextView.setText(currentTour.getmCommunityName());

        //find the ImageView of the list_item.xml layout for the image
        ImageView resourceImageView = (ImageView) listItemView.findViewById(R.id.image);

        if(currentTour.hasImage()){
            //get the resource and set it in the image view
            resourceImageView.setImageResource(currentTour.getImageResourceId());
            resourceImageView.setVisibility(View.VISIBLE);
        }else{
            resourceImageView.setVisibility(View.GONE);
        }

        //set the color for the list item
        View textContainer = listItemView.findViewById(R.id.text_container);
        //find the color that the resources id maps to
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        //set the background color  of the text container View
        textContainer.setBackgroundColor(color);


        return listItemView;

    }
}
