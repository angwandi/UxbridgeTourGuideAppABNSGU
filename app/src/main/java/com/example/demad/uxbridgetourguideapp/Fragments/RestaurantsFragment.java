package com.example.demad.uxbridgetourguideapp.Fragments;

import android.os.Build;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.demad.uxbridgetourguideapp.Adapter.RestaurantAdapter;
import com.example.demad.uxbridgetourguideapp.Data.Restaurants;
import com.example.demad.uxbridgetourguideapp.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class RestaurantsFragment extends Fragment {
    //Create a new instance method/constructor
    public static RestaurantsFragment newInstance() {
        return new RestaurantsFragment();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list, container, false);
//        Create a list of restaurants
        final ArrayList<Restaurants> restaurants = new ArrayList<>();
        restaurants.add(new Restaurants(R.string.r1_name, R.string.r1_cuisine, R.string.r1_mobile, R.string.r1_menu, R.string.r1_opening_hours, R.string.r1_address, R.string.r1_details, R.drawable.italian));
        restaurants.add(new Restaurants(R.string.r2_name, R.string.r2_cuisine, R.string.r2_mobile, R.string.r2_menu, R.string.r2_opening_hours, R.string.r2_address, R.string.r2_details, R.drawable.indian));
        restaurants.add(new Restaurants(R.string.r3_name, R.string.r3_cuisine, R.string.r3_mobile, R.string.r3_menu, R.string.r3_opening_hours, R.string.r3_address, R.string.r3_details, R.drawable.thai));
        restaurants.add(new Restaurants(R.string.r1_name, R.string.r1_cuisine, R.string.r1_mobile, R.string.r1_menu, R.string.r1_opening_hours, R.string.r1_address, R.string.r1_details, R.drawable.italian));
        restaurants.add(new Restaurants(R.string.r2_name, R.string.r2_cuisine, R.string.r2_mobile, R.string.r2_menu, R.string.r2_opening_hours, R.string.r2_address, R.string.r2_details, R.drawable.indian));
        restaurants.add(new Restaurants(R.string.r3_name, R.string.r3_cuisine, R.string.r3_mobile, R.string.r3_menu, R.string.r3_opening_hours, R.string.r3_address, R.string.r3_details, R.drawable.thai));
        restaurants.add(new Restaurants(R.string.r1_name, R.string.r1_cuisine, R.string.r1_mobile, R.string.r1_menu, R.string.r1_opening_hours, R.string.r1_address, R.string.r1_details, R.drawable.italian));
        restaurants.add(new Restaurants(R.string.r2_name, R.string.r2_cuisine, R.string.r2_mobile, R.string.r2_menu, R.string.r2_opening_hours, R.string.r2_address, R.string.r2_details, R.drawable.indian));
        restaurants.add(new Restaurants(R.string.r3_name, R.string.r3_cuisine, R.string.r3_mobile, R.string.r3_menu, R.string.r3_opening_hours, R.string.r3_address, R.string.r3_details, R.drawable.thai));
        restaurants.add(new Restaurants(R.string.r1_name, R.string.r1_cuisine, R.string.r1_mobile, R.string.r1_menu, R.string.r1_opening_hours, R.string.r1_address, R.string.r1_details, R.drawable.italian));
        restaurants.add(new Restaurants(R.string.r2_name, R.string.r2_cuisine, R.string.r2_mobile, R.string.r2_menu, R.string.r2_opening_hours, R.string.r2_address, R.string.r2_details, R.drawable.indian));
        restaurants.add(new Restaurants(R.string.r3_name, R.string.r3_cuisine, R.string.r3_mobile, R.string.r3_menu, R.string.r3_opening_hours, R.string.r3_address, R.string.r3_details, R.drawable.thai));
        restaurants.add(new Restaurants(R.string.r1_name, R.string.r1_cuisine, R.string.r1_mobile, R.string.r1_menu, R.string.r1_opening_hours, R.string.r1_address, R.string.r1_details, R.drawable.italian));
        restaurants.add(new Restaurants(R.string.r2_name, R.string.r2_cuisine, R.string.r2_mobile, R.string.r2_menu, R.string.r2_opening_hours, R.string.r2_address, R.string.r2_details, R.drawable.indian));
        restaurants.add(new Restaurants(R.string.r3_name, R.string.r3_cuisine, R.string.r3_mobile, R.string.r3_menu, R.string.r3_opening_hours, R.string.r3_address, R.string.r3_details, R.drawable.thai));
        restaurants.add(new Restaurants(R.string.r1_name, R.string.r1_cuisine, R.string.r1_mobile, R.string.r1_menu, R.string.r1_opening_hours, R.string.r1_address, R.string.r1_details, R.drawable.italian));
        restaurants.add(new Restaurants(R.string.r2_name, R.string.r2_cuisine, R.string.r2_mobile, R.string.r2_menu, R.string.r2_opening_hours, R.string.r2_address, R.string.r2_details, R.drawable.indian));
        restaurants.add(new Restaurants(R.string.r3_name, R.string.r3_cuisine, R.string.r3_mobile, R.string.r3_menu, R.string.r3_opening_hours, R.string.r3_address, R.string.r3_details, R.drawable.thai));
        restaurants.add(new Restaurants(R.string.r1_name, R.string.r1_cuisine, R.string.r1_mobile, R.string.r1_menu, R.string.r1_opening_hours, R.string.r1_address, R.string.r1_details, R.drawable.italian));
        restaurants.add(new Restaurants(R.string.r2_name, R.string.r2_cuisine, R.string.r2_mobile, R.string.r2_menu, R.string.r2_opening_hours, R.string.r2_address, R.string.r2_details, R.drawable.indian));
        restaurants.add(new Restaurants(R.string.r3_name, R.string.r3_cuisine, R.string.r3_mobile, R.string.r3_menu, R.string.r3_opening_hours, R.string.r3_address, R.string.r3_details, R.drawable.thai));
        restaurants.add(new Restaurants(R.string.r1_name, R.string.r1_cuisine, R.string.r1_mobile, R.string.r1_menu, R.string.r1_opening_hours, R.string.r1_address, R.string.r1_details, R.drawable.italian));
        restaurants.add(new Restaurants(R.string.r2_name, R.string.r2_cuisine, R.string.r2_mobile, R.string.r2_menu, R.string.r2_opening_hours, R.string.r2_address, R.string.r2_details, R.drawable.indian));
        restaurants.add(new Restaurants(R.string.r3_name, R.string.r3_cuisine, R.string.r3_mobile, R.string.r3_menu, R.string.r3_opening_hours, R.string.r3_address, R.string.r3_details, R.drawable.thai));
        //       Following the same procedures as of HomeFragment
        RestaurantAdapter adapter = new RestaurantAdapter(getActivity(), restaurants, R.color.myBottomNavigation);
        ListView listView = rootView.findViewById(R.id.list_all);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getActivity(), "Find a local restaurant!", Toast.LENGTH_SHORT).show();
            }
        });
        //        Pressed status
        listView.setDrawSelectorOnTop(true);
        //        Scrolling behavior
        listView.setNestedScrollingEnabled(true);
        return rootView;
    }
}

