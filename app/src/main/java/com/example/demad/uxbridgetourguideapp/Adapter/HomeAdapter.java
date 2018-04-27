package com.example.demad.uxbridgetourguideapp.Adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.demad.uxbridgetourguideapp.Data.Home;
import com.example.demad.uxbridgetourguideapp.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
//HomeAdapter is an ArrayAdapter that can provide the layout for each list item
//based on a data source, which is a list of Home objects.

public class HomeAdapter extends ArrayAdapter<Home> {
    //    Create a new HomeAdapter object
    public HomeAdapter(Context context, ArrayList<Home> homes) {
        super(context, 0, homes);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
//        Check if he existing view is being used, otherwise inflate the view
        @SuppressLint("ViewHolder") View listItemView = LayoutInflater.from(getContext()).inflate(R.layout.content_main, parent, false);
//        Get the Home object located at this position in the list
        Home currentHome = getItem(position);
//        Find the TextView in the content main layout with the ID HomeText_text_view
        TextView homeTextTextView = listItemView.findViewById(R.id.homeText_text_view);
        homeTextTextView.setText(currentHome.getHomeText());
//        Find the TextView in the content main layout with the ID homePeriod_text_view
        TextView homePeriodTextView = listItemView.findViewById(R.id.homePeriod_text_view);
        homePeriodTextView.setText(currentHome.getHomePeriod());
//     Getting the reference for Picasso
        ImageView imageView = (ImageView) listItemView.getTag();
        if (imageView == null) {
            imageView = listItemView.findViewById(R.id.homeImage_image_view);
            listItemView.setTag(imageView);
        }
        //        Getting the url passed to the listViewItem
        int url = (getItem(position).getImageResourceId());
        Picasso.get().load(url).into(imageView);
//        return listItemView
        return listItemView;
    }
}
