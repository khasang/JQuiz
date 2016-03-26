package com.khasang.javaquiz.javaquiz.View.fragments;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import com.khasang.javaquiz.javaquiz.R;

public class QuestionFragment extends Fragment {
    private static final int FRAGMENT_QUESTION = R.layout.fragment_question;
    private static final String KEY_POSITION = "position";

    public static QuestionFragment getInstance(int position) {
        Bundle args = new Bundle();
        QuestionFragment fragment = new QuestionFragment();

        args.putInt(KEY_POSITION, position);

        fragment.setArguments(args);
        return fragment;
    }

    public static String getTitle(int position) {
        return String.valueOf(position + 1);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(FRAGMENT_QUESTION, container, false);

        // TODO: set text of current question/answers
        // TODO: save answer number of current question
        TextView sampleText = (TextView) view.findViewById(R.id.question);
        int position = getArguments().getInt(KEY_POSITION, -1);
        sampleText.setText("Question " + getTitle(position));

        return view;
    }

}
