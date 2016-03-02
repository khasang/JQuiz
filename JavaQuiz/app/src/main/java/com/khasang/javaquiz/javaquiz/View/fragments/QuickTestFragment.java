package com.khasang.javaquiz.javaquiz.View.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.khasang.javaquiz.javaquiz.R;

public class QuickTestFragment extends Fragment {
    private static final int FRAGMENT_QUICK_TEST = R.layout.fragment_quick_test;
    private View view;

    public static QuickTestFragment getInstance(){
        Bundle args = new Bundle();
        QuickTestFragment fragment = new QuickTestFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(FRAGMENT_QUICK_TEST, container, false);

        return view;
    }

}
