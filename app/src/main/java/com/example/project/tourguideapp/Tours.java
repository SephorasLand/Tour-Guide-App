package com.example.project.tourguideapp;

public class Tours {
    private String mCommunityName;
    private String mPlaceName;
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;

    //constructor for the activity that do not display an image
    public Tours(String CommunityName,String PlaceName){
        mCommunityName = CommunityName;
        mPlaceName = PlaceName;
    }

    //constructor for the activity that display 2 textviews and 1 imageview
    public Tours(String CommunityName,String Placename, int ImageResource){
        mCommunityName = CommunityName;
        mPlaceName = Placename;
        mImageResourceId = ImageResource;
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
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}
