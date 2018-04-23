package com.example.demad.uxbridgetourguideapp.Data;

//Class Restaurant
public class Restaurants {
    //    String resource ID for the name of the restaurant
    private int rName;
    //    String resource ID for the cuisine type for the restaurant
    private int rCuisine;
    //    String resource ID for the restaurant mobile phone
    private int rMobile;
    //    String resource ID for the restaurant menu
    private int rMenu;
    //    String resource ID for the restaurant opening hours
    private int rOpeningHours;
    //    String resource ID for the restaurant Address
    private int rAddress;
    //    String resource ID for restaurant brief details
    private int rDetails;
    //    Image resource ID for the restaurant
    private int mImageResourceId;

    //    Create a Restaurant Object
    public Restaurants(int rname, int rcuicine, int rmobile, int rmenu, int ropeningHours, int raddress, int rdetails, int ImageResourceID) {
        rName = rname;
        rCuisine = rcuicine;
        rMobile = rmobile;
        rMenu = rmenu;
        rOpeningHours = ropeningHours;
        rAddress = raddress;
        rDetails = rdetails;
        mImageResourceId = ImageResourceID;
    }
    //    Get all the resources ID

    public int getNameResto() {
        return rName;
    }

    public int getCuisine() {
        return rCuisine;
    }

    public int getMobile() {
        return rMobile;
    }

    public int getMenuResto() {
        return rMenu;
    }

    public int getOpeningHours() {
        return rOpeningHours;
    }

    public int getAddress() {
        return rAddress;
    }

    public int getDetails() {
        return rDetails;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }
}
