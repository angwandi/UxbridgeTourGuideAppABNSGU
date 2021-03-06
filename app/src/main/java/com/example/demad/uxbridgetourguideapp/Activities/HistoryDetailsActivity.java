package com.example.demad.uxbridgetourguideapp.Activities;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.demad.uxbridgetourguideapp.R;

public class HistoryDetailsActivity extends AppCompatActivity {
    public static final String EXTRA_POSITION = "position";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history_details);
        setSupportActionBar((Toolbar) findViewById(R.id.toolbar));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
//        Set Collapsing Toolbar layout to the screen
        CollapsingToolbarLayout collapsingToolbar =
                findViewById(R.id.collapsing_toolbar);
//        Set title of Detail page
        int postion = getIntent().getIntExtra(EXTRA_POSITION, 0);
        Resources resources = getResources();
        String[] hPlaces = resources.getStringArray(R.array.h_places);
        collapsingToolbar.setTitle(hPlaces[postion % hPlaces.length]);
        String[] hplaceDescriptions = resources.getStringArray(R.array.h_places_descriptions);
        TextView hplace_detail = findViewById(R.id.place_detail);
        hplace_detail.setText(hplaceDescriptions[postion % hplaceDescriptions.length]);
        String[] hplaceLocations = resources.getStringArray(R.array.h_place_location);
        TextView hplaceLocation = findViewById(R.id.place_location);
        hplaceLocation.setText(hplaceLocations[postion % hplaceLocations.length]);
        TypedArray hplaceImages = resources.obtainTypedArray(R.array.h_places_images);
        ImageView hplaceImage = findViewById(R.id.image);
        hplaceImage.setImageDrawable(hplaceImages.getDrawable(postion % hplaceImages.length()));
        hplaceImages.recycle();
    }
}
