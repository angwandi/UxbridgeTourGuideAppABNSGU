package com.example.demad.uxbridgetourguideapp.Fragments;

import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.demad.uxbridgetourguideapp.Adapter.EventYearAdapter;
import com.example.demad.uxbridgetourguideapp.Data.EventYear;
import com.example.demad.uxbridgetourguideapp.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class EventYearlyFragment extends Fragment {
    public EventYearlyFragment() {
        // Required empty public constructor
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list, container, false);
        /*
         * Create a list of event yearly
         * */
        final ArrayList<EventYear> eventYears = new ArrayList<>();
        eventYears.add(new EventYear(R.string.ey_date, R.string.ey_time, R.string.ey_name, R.string.ey_location, R.string.ey_organiser));
        eventYears.add(new EventYear(R.string.ey_date, R.string.ey_time, R.string.ey_name, R.string.ey_location, R.string.ey_organiser));
        eventYears.add(new EventYear(R.string.eyswim_date, R.string.eyswim_time, R.string.eyswim_name, R.string.eyswim_location, R.string.eyswim_organiser));
        eventYears.add(new EventYear(R.string.eyswim_date, R.string.eyswim_time, R.string.eyswim_name, R.string.eyswim_location, R.string.eyswim_organiser));
        eventYears.add(new EventYear(R.string.ey_date, R.string.ey_time, R.string.ey_name, R.string.ey_location, R.string.ey_organiser));
        eventYears.add(new EventYear(R.string.ey_date, R.string.ey_time, R.string.ey_name, R.string.ey_location, R.string.ey_organiser));
        eventYears.add(new EventYear(R.string.eyswim_date, R.string.eyswim_time, R.string.eyswim_name, R.string.eyswim_location, R.string.eyswim_organiser));
        eventYears.add(new EventYear(R.string.eyswim_date, R.string.eyswim_time, R.string.eyswim_name, R.string.eyswim_location, R.string.eyswim_organiser));
        eventYears.add(new EventYear(R.string.ey_date, R.string.ey_time, R.string.ey_name, R.string.ey_location, R.string.ey_organiser));
        eventYears.add(new EventYear(R.string.ey_date, R.string.ey_time, R.string.ey_name, R.string.ey_location, R.string.ey_organiser));
        eventYears.add(new EventYear(R.string.eyswim_date, R.string.eyswim_time, R.string.eyswim_name, R.string.eyswim_location, R.string.eyswim_organiser));
        eventYears.add(new EventYear(R.string.eyswim_date, R.string.eyswim_time, R.string.eyswim_name, R.string.eyswim_location, R.string.eyswim_organiser));
        eventYears.add(new EventYear(R.string.ey_date, R.string.ey_time, R.string.ey_name, R.string.ey_location, R.string.ey_organiser));
        eventYears.add(new EventYear(R.string.ey_date, R.string.ey_time, R.string.ey_name, R.string.ey_location, R.string.ey_organiser));
        eventYears.add(new EventYear(R.string.eyswim_date, R.string.eyswim_time, R.string.eyswim_name, R.string.eyswim_location, R.string.eyswim_organiser));
        eventYears.add(new EventYear(R.string.eyswim_date, R.string.eyswim_time, R.string.eyswim_name, R.string.eyswim_location, R.string.eyswim_organiser));
        eventYears.add(new EventYear(R.string.ey_date, R.string.ey_time, R.string.ey_name, R.string.ey_location, R.string.ey_organiser));
        eventYears.add(new EventYear(R.string.ey_date, R.string.ey_time, R.string.ey_name, R.string.ey_location, R.string.ey_organiser));
        eventYears.add(new EventYear(R.string.eyswim_date, R.string.eyswim_time, R.string.eyswim_name, R.string.eyswim_location, R.string.eyswim_organiser));
        eventYears.add(new EventYear(R.string.eyswim_date, R.string.eyswim_time, R.string.eyswim_name, R.string.eyswim_location, R.string.eyswim_organiser));
        eventYears.add(new EventYear(R.string.ey_date, R.string.ey_time, R.string.ey_name, R.string.ey_location, R.string.ey_organiser));
        eventYears.add(new EventYear(R.string.ey_date, R.string.ey_time, R.string.ey_name, R.string.ey_location, R.string.ey_organiser));
        eventYears.add(new EventYear(R.string.eyswim_date, R.string.eyswim_time, R.string.eyswim_name, R.string.eyswim_location, R.string.eyswim_organiser));
        eventYears.add(new EventYear(R.string.eyswim_date, R.string.eyswim_time, R.string.eyswim_name, R.string.eyswim_location, R.string.eyswim_organiser));
        eventYears.add(new EventYear(R.string.ey_date, R.string.ey_time, R.string.ey_name, R.string.ey_location, R.string.ey_organiser));
        eventYears.add(new EventYear(R.string.ey_date, R.string.ey_time, R.string.ey_name, R.string.ey_location, R.string.ey_organiser));
        eventYears.add(new EventYear(R.string.eyswim_date, R.string.eyswim_time, R.string.eyswim_name, R.string.eyswim_location, R.string.eyswim_organiser));
        eventYears.add(new EventYear(R.string.eyswim_date, R.string.eyswim_time, R.string.eyswim_name, R.string.eyswim_location, R.string.eyswim_organiser));
        eventYears.add(new EventYear(R.string.ey_date, R.string.ey_time, R.string.ey_name, R.string.ey_location, R.string.ey_organiser));
        eventYears.add(new EventYear(R.string.ey_date, R.string.ey_time, R.string.ey_name, R.string.ey_location, R.string.ey_organiser));
        eventYears.add(new EventYear(R.string.eyswim_date, R.string.eyswim_time, R.string.eyswim_name, R.string.eyswim_location, R.string.eyswim_organiser));
        eventYears.add(new EventYear(R.string.eyswim_date, R.string.eyswim_time, R.string.eyswim_name, R.string.eyswim_location, R.string.eyswim_organiser));
        //        Following the same procedure as of HomeFragment for Documentation
        EventYearAdapter adapter = new EventYearAdapter(getActivity(), eventYears, R.color.myBottomNavigation);
        ListView listView = rootView.findViewById(R.id.list_all);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getActivity(), "Will display details after next update!", Toast.LENGTH_SHORT).show();
            }
        });
        //For the pressed states on the list item view
        listView.setDrawSelectorOnTop(true);
        //        ListView scrolling behavior
        listView.setNestedScrollingEnabled(true);
        return rootView;
    }
}
