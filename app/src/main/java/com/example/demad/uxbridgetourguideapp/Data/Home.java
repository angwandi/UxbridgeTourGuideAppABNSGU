package com.example.demad.uxbridgetourguideapp.Data;

public class Home {
//    String resource ID for the Home text
    private int mHomeText;
//    String resource for Home period
    private int mHomePeriod;
//    String resource ID for the Home image
    private int mImageResourceId;

//    Create a Home Object
    public Home(int homePeriod,int homeText,  int ImageResourceId){
        mHomeText = homeText;
        mHomePeriod = homePeriod;
        mImageResourceId = ImageResourceId;
    }
//    Get the string resource ID for the Home Text
    public int getHomeText(){
        return mHomeText;
    }
//    Get the string resource ID for the Home Period

    public int getHomePeriod() {
        return mHomePeriod;
    }

    //    Get the Home image resource ID
    public int getImageResourceId(){
        return mImageResourceId;
    }
}
