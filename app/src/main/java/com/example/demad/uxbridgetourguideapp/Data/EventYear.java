package com.example.demad.uxbridgetourguideapp.Data;

public class EventYear {
    /**
     * String resource IDs
    * */
    private  int eyDate;
    private int eyTime;
    private  int eyName;
    private int eyLocation;
    private  int eyOrganiser;

    /**
     * Create an EventYear object
     * */
    public EventYear(int eydate, int eytime, int eyname, int eylocation, int eyorganiser){
        eyDate = eydate;
        eyTime = eytime;
        eyName = eyname;
        eyLocation = eylocation;
        eyOrganiser = eyorganiser;
    }

    /*
    * Get all the resource IDS
    * */

    public int getEyDate() {
        return eyDate;
    }

    public int getEyName() {
        return eyName;
    }

    public int getEyLocation() {
        return eyLocation;
    }

    public int getEyTime() {
        return eyTime;
    }

    public int getEyOrganiser() {
        return eyOrganiser;
    }
}
