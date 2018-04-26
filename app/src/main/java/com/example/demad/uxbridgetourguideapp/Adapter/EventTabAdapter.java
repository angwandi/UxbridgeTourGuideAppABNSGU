package com.example.demad.uxbridgetourguideapp.Adapter;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.demad.uxbridgetourguideapp.Fragments.EventMonthlyFragment;
import com.example.demad.uxbridgetourguideapp.Fragments.EventYearlyFragment;
import com.example.demad.uxbridgetourguideapp.R;

public class EventTabAdapter extends FragmentPagerAdapter {
    /**
     * Context of the app
     */
    private Context mContext;

    /**
     * Create a new {@link EventTabAdapter} object.
     * @param fm      is the fragment manager that will keep each fragment's state in the adapter
     */
    public EventTabAdapter(Context context,FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    /**
     * Return the {@link Fragment} that should be displayed for the given page number.
     */
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new EventYearlyFragment();
        } else {
            return new EventMonthlyFragment();
        }
    }

    /**
     * Return the total number of pages.
     */
    @Override
    public int getCount() {
        return 2;
    }

    /**
     * Return the proper periodic event per page.
     * mContext to return string resource ID into an actual String
     */
    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.event_yearly);
        } else {
            return mContext.getString(R.string.event_monthly);
        }
    }
}
