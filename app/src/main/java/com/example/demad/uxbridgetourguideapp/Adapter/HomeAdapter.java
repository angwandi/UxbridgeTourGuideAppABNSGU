package com.example.demad.uxbridgetourguideapp.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.demad.uxbridgetourguideapp.Data.Home;
import com.example.demad.uxbridgetourguideapp.R;

import java.util.ArrayList;
//HomeAdapter is an ArrayAdapter that can provide the layout for each list item
//based on a data source, which is a list of Home objects.

public class HomeAdapter extends ArrayAdapter<Home> {
    private int mColorResourceId;
//    Create a new HomeAdapter object
    public HomeAdapter(Context context,ArrayList<Home> homes,int colorResourceId){
        super(context,0,homes);
        mColorResourceId = colorResourceId;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
//        Check if he existing view is being used, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.content_main,parent,false);
        }
//        Get the Home object located at this position in the list
        Home currentHome = getItem(position);
//        Find the TextView in the content main layout with the ID HomeText_text_view
        TextView homeTextTextView = listItemView.findViewById(R.id.homeText_text_view);
        homeTextTextView.setText(currentHome.getHomeText());
//        Find the ImageView in the content main layout with the ID homeImage_image_view
        ImageView imageView = listItemView.findViewById(R.id.homeImage_image_view);
        imageView.setImageResource(currentHome.getImageResourceId());
//        return listItemView
        return listItemView;
    }
}
