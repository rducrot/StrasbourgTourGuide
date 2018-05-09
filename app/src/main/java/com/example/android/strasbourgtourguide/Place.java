package com.example.android.strasbourgtourguide;

public class Place {

    private int mPlaceNameId;
    private int mPlaceLocationId;
    private int mPlaceDescriptionId;
    private int mImageResourceId;

    public Place(int placeNameId, int placeLocationId, int placeDescriptionId, int imageResourceId){
        mPlaceNameId = placeNameId;
        mPlaceLocationId = placeLocationId;
        mPlaceDescriptionId = placeDescriptionId;
        mImageResourceId = imageResourceId;
    }

    public int getPlaceNameId(){
        return mPlaceNameId;
    }

    public int getPlaceLocationId(){
        return mPlaceLocationId;
    }

    public int getPlaceDescriptionId(){
        return mPlaceDescriptionId;
    }

    public int getImageResourceId(){
        return mImageResourceId;
    }
}
