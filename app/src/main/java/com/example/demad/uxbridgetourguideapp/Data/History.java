package com.example.demad.uxbridgetourguideapp.Data;

public class History {
//    String resource IDs
    private int mHPlace;
    private  int mHPlaceDescription;
    private int mImageResourceId;

//    Create History Object

    public History(int hplace, int hplaceDescription, int ImageResourceId){
        mHPlace = hplace;
        mHPlaceDescription = hplaceDescription;
        mImageResourceId = ImageResourceId;
    }

//    Get the String resource IDs

    public int getHPlace() {
        return mHPlace;
    }

    public int getHPlaceDescription() {
        return mHPlaceDescription;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }
}
