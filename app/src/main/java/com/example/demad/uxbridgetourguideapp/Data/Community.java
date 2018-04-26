package com.example.demad.uxbridgetourguideapp.Data;

public class Community {
//    String resource IDs
    private int mcomName;
    private int mcomDetails;
//    Create Community Object
    public Community(int comname, int comdetails){
        mcomName = comname;
        mcomDetails = comdetails;
    }
//    Get String resource IDs

    public int getcomName() {
        return mcomName;
    }

    public int getcomDetails() {
        return mcomDetails;
    }
}
