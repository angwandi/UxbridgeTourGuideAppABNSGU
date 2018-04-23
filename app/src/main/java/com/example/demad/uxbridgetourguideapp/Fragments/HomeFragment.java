package com.example.demad.uxbridgetourguideapp.Fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.demad.uxbridgetourguideapp.Adapter.HomeAdapter;
import com.example.demad.uxbridgetourguideapp.Data.Home;
import com.example.demad.uxbridgetourguideapp.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends android.support.v4.app.Fragment {
    //Create a new instance method/constructor
    public static HomeFragment newInstance() {
        com.example.demad.uxbridgetourguideapp.Fragments.HomeFragment fragment
                = new com.example.demad.uxbridgetourguideapp.Fragments.HomeFragment();
        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.home_list, container, false);
//        Create a list for Home page
        final ArrayList<Home> homes = new ArrayList<Home>();
        homes.add(new Home(R.string.uxbridge_description,R.drawable.uxbridge));
        homes.add(new Home(R.string.uxbridge_description,R.drawable.uxbridge));
        homes.add(new Home(R.string.uxbridge_description,R.drawable.uxbridge));
        homes.add(new Home(R.string.uxbridge_description,R.drawable.uxbridge));
        homes.add(new Home(R.string.uxbridge_description,R.drawable.uxbridge));
//        Create HomeAdapter, whose data source is a list of homes. The
//        adapter knows hot to create list items for each item in the list.
        HomeAdapter adapter = new HomeAdapter(getActivity(),homes,R.color.colorAccent);
//        Find the ListView object in the view hierarchy of the Activity.
//        There should be a ListView with the view ID called home_list, which is declared in the
//        home_list.xml layout file.
        ListView listView = rootView.findViewById(R.id.list_home);
//        Make the ListView use the HomeAdapter I created above, so that the
//        the ListView will display content_main items for each homes in the list.
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getActivity(),"Read the Story here mate!",Toast.LENGTH_SHORT).show();
            }
        });
//        For the pressed states on the list items
        listView.setDrawSelectorOnTop(true);
        return rootView;
    }
}

