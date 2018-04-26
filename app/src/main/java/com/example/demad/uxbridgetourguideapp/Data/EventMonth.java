package com.example.demad.uxbridgetourguideapp.Data;

public class EventMonth {
    /**
     * String resource IDs
     */
    private int emDate;
    private int emTime;
    private int emName;
    private int emLocation;
    private int emOrganiser;
    private int mImageResourceId;

    /**
     * Create an EventMonth object
     */
    public EventMonth(int emdate, int emtime, int emname, int emlocation, int emorganiser, int ImageResourceId) {
        emDate = emdate;
        emTime = emtime;
        emName = emname;
        emLocation = emlocation;
        emOrganiser = emorganiser;
        mImageResourceId = ImageResourceId;
    }

    /*
     * Get all the resource IDS
     * */

    public int getEmDate() {
        return emDate;
    }

    public int getEmName() {
        return emName;
    }

    public int getEmLocation() {
        return emLocation;
    }

    public int getEmTime() {
        return emTime;
    }

    public int getEmOrganiser() {
        return emOrganiser;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }
}
