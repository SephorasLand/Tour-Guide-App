package com.example.project.tourguideapp;

import java.util.ArrayList;

public class Tours {
    private String mCommunityName;
    private String mPlaceName;
    private int mImageResourceId;
    private String mDescription;
    private int mGalleryImageId;


    //we use one constructor to define the parameters we are going to use in our listView and in our GalleryActivity
    public Tours(String communityName, String placename, int imageResourceId, int galleryImageId, String description){
        mCommunityName = communityName;
        mPlaceName = placename;
        mImageResourceId = imageResourceId;
        mGalleryImageId = galleryImageId;
        mDescription = description;
    }

    //methods
    //get the name of the Autonomous Community
    public String getmCommunityName(){
        return mCommunityName;
    }
    //get the name of the place
    public String getmPlaceName(){
        return mPlaceName;
    }
    //get the image
    public int getImageResourceId() {
        return mImageResourceId;
    }
    //returns if the activity has a class
    public boolean hasImage(){
        return mImageResourceId != -1;
    }

    public ArrayList<String> getData() {
        ArrayList<String> result = new ArrayList<String>();
        result.add(mCommunityName);
        result.add(mPlaceName);
        result.add(mDescription);
        result.add(String.valueOf(mGalleryImageId));
        return result;
    }
}
