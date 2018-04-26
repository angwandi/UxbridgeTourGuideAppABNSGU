package com.example.demad.uxbridgetourguideapp.Data;

public class Community {
//    String resource IDs
    private int mcomName;
    private int mcomDetails;
//    Create Community Object
    public Community(int comName, int comDetails){
        mcomName = comName;
        mcomDetails = comDetails;
    }
//    Get String resource IDs

    public int getcomName() {
        return mcomName;
    }

    public int getcomDetails() {
        return mcomDetails;
    }
}
