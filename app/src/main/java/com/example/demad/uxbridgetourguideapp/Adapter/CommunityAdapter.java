package com.example.demad.uxbridgetourguideapp.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.demad.uxbridgetourguideapp.Data.Community;
import com.example.demad.uxbridgetourguideapp.R;

import java.util.ArrayList;

public class CommunityAdapter extends ArrayAdapter<Community> {
    public CommunityAdapter(Context context, ArrayList<Community> communities, int colorResourceId) {
        super(context, 0, communities);
        int mColorResourceId;
        mColorResourceId = colorResourceId;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        //        Check if he existing view is being used, otherwise inflate the view
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.community_items, parent, false);
        }
//        Get the Community object at this position in the list
        Community currentCommunity = getItem(position);
        TextView comNameTextView = listItemView.findViewById(R.id.com_name_text_view);
        comNameTextView.setText(currentCommunity.getcomName());
        TextView comDetailsTextView = listItemView.findViewById(R.id.com_details_text_view);
        comDetailsTextView.setText(currentCommunity.getcomDetails());
        return listItemView;
    }
}
