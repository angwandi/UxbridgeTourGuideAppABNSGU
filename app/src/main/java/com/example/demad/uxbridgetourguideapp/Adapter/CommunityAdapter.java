package com.example.demad.uxbridgetourguideapp.Adapter;

import android.annotation.SuppressLint;
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
    public CommunityAdapter(Context context, ArrayList<Community> communities) {
        super(context, 0, communities);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        @SuppressLint("ViewHolder") View listItemView
                = LayoutInflater.from(getContext()).inflate(R.layout.community_items, parent, false);
//        Get the Community object at this position in the list
        Community currentCommunity = getItem(position);
        TextView comNameTextView = listItemView.findViewById(R.id.com_name_text_view);
        comNameTextView.setText(currentCommunity.getcomName());
        TextView comDetailsTextView = listItemView.findViewById(R.id.com_details_text_view);
        comDetailsTextView.setText(currentCommunity.getcomDetails());
        return listItemView;
    }
}
