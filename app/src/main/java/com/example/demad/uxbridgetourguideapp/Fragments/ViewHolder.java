package com.example.demad.uxbridgetourguideapp.Fragments;

import android.content.Context;
import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.demad.uxbridgetourguideapp.HistoryDetailsActivity;
import com.example.demad.uxbridgetourguideapp.R;

/**
 * ViewHolder class
 */
public class ViewHolder extends RecyclerView.ViewHolder{
//    Resource Ids declaration
    public ImageView image;
    public TextView name;
    public TextView description;
    ViewHolder(LayoutInflater inflater, ViewGroup parent){
    super(inflater.inflate(R.layout.history_items,parent,false));
    image = itemView.findViewById(R.id.history_image_view);
    name = itemView.findViewById(R.id.hplace_title_text_view);
    description = itemView.findViewById(R.id.hplace_description_text_view);
    itemView.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Context context = v.getContext();
            Intent intent = new Intent(context, HistoryDetailsActivity.class);
            intent.putExtra(HistoryDetailsActivity.EXTRA_POSITION,getAdapterPosition());
            context.startActivity(intent);
        }
    });
        Button button = itemView.findViewById(R.id.action_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(v,"Listed",Snackbar.LENGTH_LONG).show();
            }
        });
        ImageButton favorateImageButton = itemView.findViewById(R.id.history_favorite_button);
        favorateImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(v,"Added",Snackbar.LENGTH_LONG).show();
            }
        });
        ImageButton shareImageButton = itemView.findViewById(R.id.history_share_button);
        shareImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(v,"Shared",Snackbar.LENGTH_LONG).show();
            }
        });
    }
}
