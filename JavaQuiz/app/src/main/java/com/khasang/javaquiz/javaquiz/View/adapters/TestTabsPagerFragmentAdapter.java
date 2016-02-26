package com.khasang.javaquiz.javaquiz.View.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.khasang.javaquiz.javaquiz.View.fragments.ThemesListFragment;

public class TestTabsPagerFragmentAdapter extends FragmentPagerAdapter {

    private String[] tabs;

    public TestTabsPagerFragmentAdapter(FragmentManager fm) {
        super(fm);
        tabs = new String[]{
                "Q1",
                "Q2",
                "Q3",
                "Q4",
                "Q5",
                "Q6"
        };
    }

    @Override
    public CharSequence getPageTitle(int position) {
            return tabs[position];
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return ThemesListFragment.getInstance();
            case 1:
                return ThemesListFragment.getInstance();
            case 2:
                return ThemesListFragment.getInstance();
        }
        return null;
    }

    @Override
    public int getCount() {
        return tabs.length;
    }
}