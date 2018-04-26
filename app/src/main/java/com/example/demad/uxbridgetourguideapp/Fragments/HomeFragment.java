package com.example.demad.uxbridgetourguideapp.Fragments;

import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
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

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list, container, false);
//        Create a list for Home page
        final ArrayList<Home> homes = new ArrayList<Home>();
        homes.add(new Home(R.string.period_MiddleAges, R.string.text_MiddleAges, R.drawable.middleages));
        homes.add(new Home(R.string.period_SixteenthCentury, R.string.text_SixteenthCentury, R.drawable.ux_16));
        homes.add(new Home(R.string.period_SeventeenthCentury, R.string.text_SeventeenthCentury, R.drawable.ux_17));
        homes.add(new Home(R.string.period_EighteenthCentury, R.string.text_EighteenthCentury, R.drawable.ux_18));
        homes.add(new Home(R.string.period_NineteenthCentury, R.string.text_NineteenthCentury, R.drawable.ux_19));
        homes.add(new Home(R.string.period_TwentiethCentury, R.string.text_TwentiethCentury, R.drawable.ux_20));
        homes.add(new Home(R.string.period_MiddleAges, R.string.text_MiddleAges, R.drawable.middleages));
        homes.add(new Home(R.string.period_SixteenthCentury, R.string.text_SixteenthCentury, R.drawable.ux_16));
        homes.add(new Home(R.string.period_SeventeenthCentury, R.string.text_SeventeenthCentury, R.drawable.ux_17));
        homes.add(new Home(R.string.period_EighteenthCentury, R.string.text_EighteenthCentury, R.drawable.ux_18));
        homes.add(new Home(R.string.period_NineteenthCentury, R.string.text_NineteenthCentury, R.drawable.ux_19));
        homes.add(new Home(R.string.period_TwentiethCentury, R.string.text_TwentiethCentury, R.drawable.ux_20));
        homes.add(new Home(R.string.period_MiddleAges, R.string.text_MiddleAges, R.drawable.middleages));
        homes.add(new Home(R.string.period_SixteenthCentury, R.string.text_SixteenthCentury, R.drawable.ux_16));
        homes.add(new Home(R.string.period_SeventeenthCentury, R.string.text_SeventeenthCentury, R.drawable.ux_17));
        homes.add(new Home(R.string.period_EighteenthCentury, R.string.text_EighteenthCentury, R.drawable.ux_18));
        homes.add(new Home(R.string.period_NineteenthCentury, R.string.text_NineteenthCentury, R.drawable.ux_19));
        homes.add(new Home(R.string.period_TwentiethCentury, R.string.text_TwentiethCentury, R.drawable.ux_20));
        homes.add(new Home(R.string.period_MiddleAges, R.string.text_MiddleAges, R.drawable.middleages));
        homes.add(new Home(R.string.period_SixteenthCentury, R.string.text_SixteenthCentury, R.drawable.ux_16));
        homes.add(new Home(R.string.period_SeventeenthCentury, R.string.text_SeventeenthCentury, R.drawable.ux_17));
        homes.add(new Home(R.string.period_EighteenthCentury, R.string.text_EighteenthCentury, R.drawable.ux_18));
        homes.add(new Home(R.string.period_NineteenthCentury, R.string.text_NineteenthCentury, R.drawable.ux_19));
        homes.add(new Home(R.string.period_TwentiethCentury, R.string.text_TwentiethCentury, R.drawable.ux_20));
        homes.add(new Home(R.string.period_MiddleAges, R.string.text_MiddleAges, R.drawable.middleages));
        homes.add(new Home(R.string.period_SixteenthCentury, R.string.text_SixteenthCentury, R.drawable.ux_16));
        homes.add(new Home(R.string.period_SeventeenthCentury, R.string.text_SeventeenthCentury, R.drawable.ux_17));
        homes.add(new Home(R.string.period_EighteenthCentury, R.string.text_EighteenthCentury, R.drawable.ux_18));
        homes.add(new Home(R.string.period_NineteenthCentury, R.string.text_NineteenthCentury, R.drawable.ux_19));
        homes.add(new Home(R.string.period_TwentiethCentury, R.string.text_TwentiethCentury, R.drawable.ux_20));
        //        Create HomeAdapter, whose data source is a list of homes. The
        //        adapter knows hot to create list items for each item in the list.
        HomeAdapter adapter = new HomeAdapter(getActivity(), homes, R.color.colorAccent);
        //        Find the ListView object in the view hierarchy of the Activity.
        //        There should be a ListView with the view ID called home_list, which is declared in the
        //        home_list.xml layout file.
        ListView listView = rootView.findViewById(R.id.list_all);
        //        Make the ListView use the HomeAdapter I created above, so that the
        //        the ListView will display content_main items for each homes in the list.
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getActivity(), "Details Screen Coming Soon!", Toast.LENGTH_SHORT).show();
            }
        });
        //        For the pressed states on the list items
        listView.setDrawSelectorOnTop(true);
        //        ListView scrolling behavior
        listView.setNestedScrollingEnabled(true);
        return rootView;
    }
}

