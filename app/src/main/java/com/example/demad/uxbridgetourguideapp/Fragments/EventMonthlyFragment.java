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

import com.example.demad.uxbridgetourguideapp.Adapter.EventMonthAdapter;
import com.example.demad.uxbridgetourguideapp.Data.EventMonth;
import com.example.demad.uxbridgetourguideapp.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class EventMonthlyFragment extends Fragment {
    public EventMonthlyFragment() {
        // Required empty public constructor
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.event_montly_list,container,false);
        /*
         * Create a list of event yearly
         * */
        final ArrayList<EventMonth> eventMonths = new ArrayList<>();
        eventMonths.add(new EventMonth(R.string.em_date,R.string.em_time,R.string.em_name,R.string.em_location,R.string.em_organiser,R.drawable.uxbridge_wood));
        eventMonths.add(new EventMonth(R.string.em_date,R.string.em_time,R.string.em_name,R.string.em_location,R.string.em_organiser,R.drawable.uxbridge));
        eventMonths.add(new EventMonth(R.string.em_date,R.string.em_time,R.string.em_name,R.string.em_location,R.string.em_organiser,R.drawable.ux_20));
        eventMonths.add(new EventMonth(R.string.em_date,R.string.em_time,R.string.em_name,R.string.em_location,R.string.em_organiser,R.drawable.middleages));
        eventMonths.add(new EventMonth(R.string.em_date,R.string.em_time,R.string.em_name,R.string.em_location,R.string.em_organiser,R.drawable.uxbridge_wood));
        eventMonths.add(new EventMonth(R.string.em_date,R.string.em_time,R.string.em_name,R.string.em_location,R.string.em_organiser,R.drawable.uxbridge));
        eventMonths.add(new EventMonth(R.string.em_date,R.string.em_time,R.string.em_name,R.string.em_location,R.string.em_organiser,R.drawable.ux_20));
        eventMonths.add(new EventMonth(R.string.em_date,R.string.em_time,R.string.em_name,R.string.em_location,R.string.em_organiser,R.drawable.middleages));
        eventMonths.add(new EventMonth(R.string.em_date,R.string.em_time,R.string.em_name,R.string.em_location,R.string.em_organiser,R.drawable.uxbridge_wood));
        eventMonths.add(new EventMonth(R.string.em_date,R.string.em_time,R.string.em_name,R.string.em_location,R.string.em_organiser,R.drawable.uxbridge));
        eventMonths.add(new EventMonth(R.string.em_date,R.string.em_time,R.string.em_name,R.string.em_location,R.string.em_organiser,R.drawable.ux_20));
        eventMonths.add(new EventMonth(R.string.em_date,R.string.em_time,R.string.em_name,R.string.em_location,R.string.em_organiser,R.drawable.middleages));
        eventMonths.add(new EventMonth(R.string.em_date,R.string.em_time,R.string.em_name,R.string.em_location,R.string.em_organiser,R.drawable.uxbridge_wood));
        eventMonths.add(new EventMonth(R.string.em_date,R.string.em_time,R.string.em_name,R.string.em_location,R.string.em_organiser,R.drawable.uxbridge));
        eventMonths.add(new EventMonth(R.string.em_date,R.string.em_time,R.string.em_name,R.string.em_location,R.string.em_organiser,R.drawable.ux_20));
        eventMonths.add(new EventMonth(R.string.em_date,R.string.em_time,R.string.em_name,R.string.em_location,R.string.em_organiser,R.drawable.middleages));
        eventMonths.add(new EventMonth(R.string.em_date,R.string.em_time,R.string.em_name,R.string.em_location,R.string.em_organiser,R.drawable.uxbridge_wood));
        eventMonths.add(new EventMonth(R.string.em_date,R.string.em_time,R.string.em_name,R.string.em_location,R.string.em_organiser,R.drawable.uxbridge));
        eventMonths.add(new EventMonth(R.string.em_date,R.string.em_time,R.string.em_name,R.string.em_location,R.string.em_organiser,R.drawable.ux_20));
        eventMonths.add(new EventMonth(R.string.em_date,R.string.em_time,R.string.em_name,R.string.em_location,R.string.em_organiser,R.drawable.middleages));
        eventMonths.add(new EventMonth(R.string.em_date,R.string.em_time,R.string.em_name,R.string.em_location,R.string.em_organiser,R.drawable.uxbridge_wood));
        eventMonths.add(new EventMonth(R.string.em_date,R.string.em_time,R.string.em_name,R.string.em_location,R.string.em_organiser,R.drawable.uxbridge));
        eventMonths.add(new EventMonth(R.string.em_date,R.string.em_time,R.string.em_name,R.string.em_location,R.string.em_organiser,R.drawable.ux_20));
        eventMonths.add(new EventMonth(R.string.em_date,R.string.em_time,R.string.em_name,R.string.em_location,R.string.em_organiser,R.drawable.middleages));

        EventMonthAdapter adapter = new EventMonthAdapter(getActivity(),eventMonths,R.color.myBottomNavigation);
        ListView listView = rootView.findViewById(R.id.list_event_monthly);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getActivity(),"Update to come!",Toast.LENGTH_SHORT).show();
            }
        });
        //For the pressed states on the list item view
        listView.setDrawSelectorOnTop(true);
        listView.setNestedScrollingEnabled(true);
        return rootView;
    }
}
