package com.example.demad.uxbridgetourguideapp.Fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.demad.uxbridgetourguideapp.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class HistoryFragment extends Fragment {
    //Create a new instance method/constructor
    public static android.support.v4.app.Fragment newInstance() {
        HistoryFragment fragment = new HistoryFragment();
        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        RecyclerView recyclerView = (RecyclerView) inflater.inflate(R.layout.history_list, container, false);

        return recyclerView;
    }
}

