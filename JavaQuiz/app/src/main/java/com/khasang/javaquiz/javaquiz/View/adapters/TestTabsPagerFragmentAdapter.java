package com.khasang.javaquiz.javaquiz.View.adapters;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.khasang.javaquiz.javaquiz.View.fragments.QuestionFragment;
import com.khasang.javaquiz.javaquiz.View.fragments.ThemesListFragment;

public class TestTabsPagerFragmentAdapter extends FragmentStatePagerAdapter {
    private final Context context;
    private int pageAmount;

    public TestTabsPagerFragmentAdapter(Context context, FragmentManager fm) {
        super(fm);
        this.context = context;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return String.valueOf(position + 1);
    }

    @Override
    public Fragment getItem(int position) {
        return QuestionFragment.getInstance(position);
    }

    @Override
    public int getCount() {
        return pageAmount;
    }

    public void setPageAmount(int pageAmount) {
        this.pageAmount = pageAmount;
    }
}