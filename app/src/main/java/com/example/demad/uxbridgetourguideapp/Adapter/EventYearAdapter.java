package com.example.demad.uxbridgetourguideapp.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.demad.uxbridgetourguideapp.Data.EventYear;
import com.example.demad.uxbridgetourguideapp.R;

import java.util.ArrayList;

public class EventYearAdapter extends ArrayAdapter<EventYear>{
    //    Create a new EventYearAdapter object
    public EventYearAdapter(Context context,ArrayList<EventYear> eventYears, int colorResourceID){
        super(context,0,eventYears);
        int mColorResourceID;
        mColorResourceID = colorResourceID;
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        //        Check if he existing view is being used, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.event_yearly_items, parent, false);
        }
//        Same procedures as Home Adapter
        EventYear currentEventYear = getItem(position);
//         Find TextViews in the event yearly items layout with the ID HomeText_text_view
        TextView eyDateTextView = listItemView.findViewById(R.id.ey_date_text_view);
        eyDateTextView.setText(currentEventYear.getEyDate());
        TextView eyTimeTextView = listItemView.findViewById(R.id.ey_time_text_view);
        eyTimeTextView.setText(currentEventYear.getEyTime());
        TextView eyNameTextView = listItemView.findViewById(R.id.ey_name_text_view);
        eyNameTextView.setText(currentEventYear.getEyName());
        TextView eyLocationTextView = listItemView.findViewById(R.id.ey_location_text_view);
        eyLocationTextView.setText(currentEventYear.getEyLocation());
        TextView eyOrganiserTextView = listItemView.findViewById(R.id.ey_organiser_text_view);
        eyOrganiserTextView.setText(currentEventYear.getEyOrganiser());
        return listItemView;
    }
}
