package com.example.demad.uxbridgetourguideapp.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.demad.uxbridgetourguideapp.Data.Restaurants;
import com.example.demad.uxbridgetourguideapp.R;

import java.util.ArrayList;

public class RestaurantAdapter extends ArrayAdapter<Restaurants>  {
    private int mColorResourceId;
//    Create a new RestaurantAdapter Object.
    public RestaurantAdapter(Context context, ArrayList<Restaurants> restaurants, int colorResourceId){
        super(context,0,restaurants);
        mColorResourceId = colorResourceId;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        //        Check if he existing view is being used, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.restaurant_items,parent,false);
        }
//        Same as of HomeAdapter
        Restaurants currentRestaurant = getItem(position);
//        Find TextViews and ImageView in the content main layout with the ID HomeText_text_view
        TextView rNameTextView = listItemView.findViewById(R.id.rName_text_view);
        rNameTextView.setText(currentRestaurant.getNameResto());
        TextView rCuisineTextView = listItemView.findViewById(R.id.rCuisine_text_view);
        rCuisineTextView.setText(currentRestaurant.getCuisine());
        TextView rMobileTextView = listItemView.findViewById(R.id.rMobile_text_view);
        rMobileTextView.setText(currentRestaurant.getMobile());
        TextView rMenurestoTextView = listItemView.findViewById(R.id.rMenu_text_view);
        rMenurestoTextView.setText(currentRestaurant.getMenuResto());
        TextView rOpeningHoursTextView = listItemView.findViewById(R.id.rOpeningHours_text_view);
        rOpeningHoursTextView.setText(currentRestaurant.getOpeningHours());
        TextView rAddressTextView = listItemView.findViewById(R.id.rAddress_text_view);
        rAddressTextView.setText(currentRestaurant.getAddress());
        TextView rDetailsTextView = listItemView.findViewById(R.id.rDetails_text_view);
        rDetailsTextView.setText(currentRestaurant.getDetails());
        ImageView imageView = listItemView.findViewById(R.id.restaurant_image_view);
        imageView.setImageResource(currentRestaurant.getImageResourceId());
        return listItemView;
    }
}
