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

public class ThemesListFragment extends Fragment {
    private static final int FRAGMENT_THEMES_LIST = R.layout.fragment_themes_list;
    private View view;
    private RecyclerView recyclerView;
    private RecyclerView.Adapter rvAdapter;
    private RecyclerView.LayoutManager rvLayoutManager;


    public static ThemesListFragment getInstance(){
        Bundle args = new Bundle();
        ThemesListFragment fragment = new ThemesListFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(FRAGMENT_THEMES_LIST, container, false);

        recyclerView = (RecyclerView)view.findViewById(R.id.recycler_view_themes);
        rvLayoutManager = new LinearLayoutManager(view.getContext());

        recyclerView.setLayoutManager(rvLayoutManager);

        return view;
    }

}
