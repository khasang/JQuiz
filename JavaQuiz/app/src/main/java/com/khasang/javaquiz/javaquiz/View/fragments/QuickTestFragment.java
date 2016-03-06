package com.khasang.javaquiz.javaquiz.View.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SeekBar;
import android.widget.TextView;

import com.khasang.javaquiz.javaquiz.R;

public class QuickTestFragment extends Fragment {
    private static final int FRAGMENT_QUICK_TEST = R.layout.fragment_quick_test;
    private View view;

    private SeekBar countSeekBar;
    private TextView countTextView;

    private int questionCount;
    final int QUESTION_MIN = 1;
    final int QUESTION_MAX = 100;
    final int QUESTION_DEFAULT = 10;

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

        initSeekBar();

        return view;
    }

    public void initSeekBar(){
        countSeekBar = (SeekBar) view.findViewById(R.id.seekBarQuickTest);
        countTextView = (TextView) view.findViewById(R.id.textViewQuickTestCount);
        countSeekBar.setMax(QUESTION_MAX - QUESTION_MIN);

        countSeekBar.setOnSeekBarChangeListener(
                new SeekBar.OnSeekBarChangeListener() {
                    @Override
                    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                        questionCount = QUESTION_MIN + progress;
                        countTextView.setText(getResources().getString(R.string.settings_label_count) + Integer.toString(questionCount));
                    }

                    @Override
                    public void onStartTrackingTouch(SeekBar seekBar) {

                    }

                    @Override
                    public void onStopTrackingTouch(SeekBar seekBar) {
                        countTextView.setText(getResources().getString(R.string.settings_label_count) + Integer.toString(questionCount));
                    }
                }
        );
    }
}
