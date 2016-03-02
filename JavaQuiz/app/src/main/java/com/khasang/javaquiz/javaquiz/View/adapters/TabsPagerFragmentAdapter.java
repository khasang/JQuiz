package com.khasang.javaquiz.javaquiz.View.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.khasang.javaquiz.javaquiz.View.fragments.QuickTestFragment;
import com.khasang.javaquiz.javaquiz.View.fragments.ThemesListFragment;

public class TabsPagerFragmentAdapter extends FragmentPagerAdapter {

    private String[] tabs;

    public TabsPagerFragmentAdapter(FragmentManager fm) {
        super(fm);
        tabs = new String[]{
                "Темы",
                "Быстрый тест",
                "Избранное"
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
                return QuickTestFragment.getInstance();
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