package com.example.demad.uxbridgetourguideapp.Fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.demad.uxbridgetourguideapp.Adapter.EventTabAdapter;
import com.example.demad.uxbridgetourguideapp.R;

/**
 * A simple {@link android.support.v4.app.Fragment} subclass.
 */
public class EventsFragment extends android.support.v4.app.Fragment {
    //Create a new instance method/constructor
    public static EventsFragment newInstance() {
        return new EventsFragment();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView;
        rootView= inflater.inflate(R.layout.event_tabs, container, false);
        // Find the view pager that will allow the user to swipe between events child fragments
        ViewPager viewPager = rootView.findViewById(R.id.viewpager);
        //Create an adapter that knows which fragment should be shown on each page
        EventTabAdapter adapter = new EventTabAdapter(getContext(), getChildFragmentManager());
        // Set the adapter onto the view pager
        viewPager.setAdapter(adapter);
        // Find the tab layout that shows the tabs
        TabLayout tabLayout = rootView.findViewById(R.id.tabs);
        // Connect the tab layout with the view pager. This will
        //   1. Update the tab layout when the view pager is swiped
        //   2. Update the view pager when a tab is selected
        //   3. Set the tab layout's tab names with the view pager's adapter's titles
        //      by calling onPageTitle()
        tabLayout.setupWithViewPager(viewPager);
        return rootView;
    }
}
