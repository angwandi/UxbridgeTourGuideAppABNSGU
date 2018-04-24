package com.example.demad.uxbridgetourguideapp.Fragments;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.example.demad.uxbridgetourguideapp.R;

/**
 * Adapter to display recycler view.
 */
public class HistoriesAdapter extends RecyclerView.Adapter<ViewHolder> {
    //    Set numbers of Sites Histories in the RecyclerView.
    private static final int LENGTH = 18;
    private final String[] mhPlaces;
    private final String[] mhPlaceDescriptions;
    private final Drawable[] mhPlaceImages;

    HistoriesAdapter(Context context) {
        Resources resources = context.getResources();
        mhPlaces = resources.getStringArray(R.array.h_places);
        mhPlaceDescriptions = resources.getStringArray(R.array.h_places_descriptions);
        TypedArray h = resources.obtainTypedArray(R.array.h_places_images);
        mhPlaceImages = new Drawable[h.length()];
        for (int i = 0; i < mhPlaceImages.length; i++) {
            mhPlaceImages[i] = h.getDrawable(i);
        }
        h.recycle();
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()), parent);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.image.setImageDrawable(mhPlaceImages[position%mhPlaceImages.length]);
        holder.name.setText(mhPlaces[position%mhPlaces.length]);
        holder.description.setText(mhPlaceDescriptions[position%mhPlaceDescriptions.length]);
    }

    @Override
    public int getItemCount() {
        return LENGTH;
    }
}
