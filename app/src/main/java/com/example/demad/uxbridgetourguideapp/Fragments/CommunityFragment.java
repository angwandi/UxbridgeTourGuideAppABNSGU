package com.example.demad.uxbridgetourguideapp.Fragments;

import android.os.Build;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.RequiresApi;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.demad.uxbridgetourguideapp.Adapter.CommunityAdapter;
import com.example.demad.uxbridgetourguideapp.Data.Community;
import com.example.demad.uxbridgetourguideapp.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class CommunityFragment extends Fragment {
    //    Create a new instance of CommunityFragment
    public static CommunityFragment newInstance() {
        return new CommunityFragment();
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.list, container, false);
//        Create a list for Communities
        final ArrayList<Community> communities = new ArrayList<>();
        communities.add(new Community(R.string.com_name, R.string.com_details));
        communities.add(new Community(R.string.com_name, R.string.com_details));
        communities.add(new Community(R.string.com_name, R.string.com_details));
        communities.add(new Community(R.string.com_name, R.string.com_details));
        communities.add(new Community(R.string.com_name, R.string.com_details));
        communities.add(new Community(R.string.com_name, R.string.com_details));
        communities.add(new Community(R.string.com_name, R.string.com_details));
        communities.add(new Community(R.string.com_name, R.string.com_details));
        communities.add(new Community(R.string.com_name, R.string.com_details));
        communities.add(new Community(R.string.com_name, R.string.com_details));
        communities.add(new Community(R.string.com_name, R.string.com_details));
        communities.add(new Community(R.string.com_name, R.string.com_details));
        communities.add(new Community(R.string.com_name, R.string.com_details));
        communities.add(new Community(R.string.com_name, R.string.com_details));
        communities.add(new Community(R.string.com_name, R.string.com_details));
        CommunityAdapter adapter = new CommunityAdapter(getActivity(), communities);
        ListView listView = rootView.findViewById(R.id.list_all);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getActivity(), "Details screen coming soon", Toast.LENGTH_SHORT).show();
            }
        });
        listView.setNestedScrollingEnabled(true);
        return rootView;
    }
}
