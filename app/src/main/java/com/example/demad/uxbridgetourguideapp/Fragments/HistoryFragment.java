package com.example.demad.uxbridgetourguideapp.Fragments;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.demad.uxbridgetourguideapp.Activities.HistoryDetailsActivity;
import com.example.demad.uxbridgetourguideapp.R;

/**
 * Provide UI for the view with Historic Sites
 */
public class HistoryFragment extends Fragment {
    //Create a new instance method/constructor to call in Bottom Navigation
    public static android.support.v4.app.Fragment newInstance() {
        return new HistoryFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        RecyclerView recyclerView = (RecyclerView) inflater.inflate(R.layout.history_recycler, container, false);
        HistoriesAdapter adapter = new HistoriesAdapter(recyclerView.getContext());
        recyclerView.setAdapter(adapter);
        recyclerView.setHasFixedSize(true);
        recyclerView.setNestedScrollingEnabled(false);
//        To Display the Activity to the screen
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        return recyclerView;
    }

    /**
     * ViewHolder class
     */
    public static class ViewHolder extends RecyclerView.ViewHolder {
        //    Resource Ids declaration
        public ImageView image;
        public TextView name;
        public TextView description;

        ViewHolder(LayoutInflater inflater, ViewGroup parent) {
            super(inflater.inflate(R.layout.history_items, parent, false));
            image = itemView.findViewById(R.id.history_image_view);
            name = itemView.findViewById(R.id.hplace_title_text_view);
            description = itemView.findViewById(R.id.hplace_description_text_view);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Context context = v.getContext();
//                    Toast.makeText(context,"Detail screen coming soon",Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(context, HistoryDetailsActivity.class);
                    intent.putExtra(HistoryDetailsActivity.EXTRA_POSITION, getAdapterPosition());
                    context.startActivity(intent);
                }
            });
            Button button = itemView.findViewById(R.id.action_button);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(v.getContext(), R.string.add_to_list, Toast.LENGTH_SHORT).show();
                }
            });
            ImageButton favoriteImageButton = itemView.findViewById(R.id.history_favorite_button);
            favoriteImageButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(v.getContext(), R.string.favorite, Toast.LENGTH_SHORT).show();
                }
            });
            ImageButton shareImageButton = itemView.findViewById(R.id.history_share_button);
            shareImageButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Snackbar.make(v, R.string.share, Snackbar.LENGTH_LONG).show();
                }
            });
        }
    }

    /**
     * Adapter to display recycler view.
     */
    public static class HistoriesAdapter extends RecyclerView.Adapter<ViewHolder> {
        //    Set numbers of Sites Histories in the RecyclerView.
        private static final int LENGTH = 36;
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
            holder.image.setImageDrawable(mhPlaceImages[position % mhPlaceImages.length]);
            holder.name.setText(mhPlaces[position % mhPlaces.length]);
            holder.description.setText(mhPlaceDescriptions[position % mhPlaceDescriptions.length]);
        }

        @Override
        public int getItemCount() {
            return LENGTH;
        }
    }
}


