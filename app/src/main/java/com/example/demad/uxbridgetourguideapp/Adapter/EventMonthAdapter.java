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

import com.example.demad.uxbridgetourguideapp.Data.EventMonth;
import com.example.demad.uxbridgetourguideapp.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.Map;

public class EventMonthAdapter extends ArrayAdapter<EventMonth> {
    public EventMonthAdapter(Context context, ArrayList<EventMonth> eventMonths) {
        super(context, 0, eventMonths);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        //        Check if he existing view is being used, otherwise inflate the view
        @SuppressLint("ViewHolder") View listItemView = LayoutInflater.from(getContext()).inflate(R.layout.event_montly_items, parent, false);
        //        Same procedures as Home Adapter
        EventMonth currentEventMonth = getItem(position);
        TextView emDateTextView = listItemView.findViewById(R.id.em_date_text_view);
        emDateTextView.setText(currentEventMonth.getEmDate());
        TextView emTimeTextView = listItemView.findViewById(R.id.em_time_text_view);
        emTimeTextView.setText(currentEventMonth.getEmTime());
        TextView emNameTextView = listItemView.findViewById(R.id.em_name_text_view);
        emNameTextView.setText(currentEventMonth.getEmName());
        TextView emLocationTextView = listItemView.findViewById(R.id.em_location_text_view);
        emLocationTextView.setText(currentEventMonth.getEmLocation());
        TextView emOrganiserTextView = listItemView.findViewById(R.id.em_organiser_text_view);
        emOrganiserTextView.setText(currentEventMonth.getEmOrganiser());
        //     Getting the reference for Picasso
        ImageView imageView = (ImageView) listItemView.getTag();
        if (imageView == null) {
            imageView = listItemView.findViewById(R.id.em_image_view);
            listItemView.setTag(imageView);
        }
        //        Getting the url passed to the listViewItem
        int url = (getItem(position).getImageResourceId());
        Picasso.get().load(url).into(imageView);
        return listItemView;
    }
}
