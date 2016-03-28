package com.khasang.javaquiz.javaquiz.View.fragments;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.TextView;

import com.khasang.javaquiz.javaquiz.R;

import java.util.List;

public class QuestionFragment extends Fragment {
    private static final int FRAGMENT_QUESTION = R.layout.fragment_question;
    private static final String KEY_POSITION = "position";
    private QuestionRequest listener;

    public interface QuestionRequest {
        public List getQuestion(int questionNumber);
    }

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
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof QuestionRequest) {
            listener = (QuestionRequest) context;
        } else {
            throw new ClassCastException(context.toString());
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(FRAGMENT_QUESTION, container, false);
        List questionEntities = listener.getQuestion(getArguments().getInt(KEY_POSITION, -1));

        TextView question = (TextView) view.findViewById(R.id.question);
        question.setText(questionEntities.get(0).toString());

        RadioButton answer1 = (RadioButton) view.findViewById(R.id.answer1);
        answer1.setText(questionEntities.get(1).toString());

        RadioButton answer2 = (RadioButton) view.findViewById(R.id.answer2);
        answer2.setText(questionEntities.get(2).toString());

        RadioButton answer3 = (RadioButton) view.findViewById(R.id.answer3);
        answer3.setText(questionEntities.get(3).toString());

        RadioButton answer4 = (RadioButton) view.findViewById(R.id.answer4);
        answer4.setText(questionEntities.get(4).toString());

        return view;
    }

}
