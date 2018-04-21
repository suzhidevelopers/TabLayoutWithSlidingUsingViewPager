package com.suzhi.tablayoutwithslidingusingviewpager;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class PagerAdapter extends FragmentStatePagerAdapter {
    private int numOfTabs;
    private String[] tabTitles = new String[]{"CAMERA", "CAPTURED IMAGES", "TIMELINE"};

    PagerAdapter(FragmentManager fm, int numOfTabs) {
        super(fm);
        this.numOfTabs = numOfTabs;
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment;
        switch (position) {
            case 0:
                fragment = new CameraFragment();
                break;
            case 1:
                fragment = new CapturedImagesFragment();
                break;
            case 2:
                fragment = new TimelineFragment();
                break;
            default:
                fragment = null;
        }
        return fragment;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabTitles[position];
    }

    @Override
    public int getCount() {
        return numOfTabs;
    }
}