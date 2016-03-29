package com.khasang.javaquiz.javaquiz.Model;

import com.khasang.javaquiz.javaquiz.Model.data.Question;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by ChornyiUA on 24.02.2016.
 */
public class ModelImpl implements IModel {
    public static final int QUESTIONS_AMOUNT = 9;
    private Question question;


    @Override
    public List<Question> getQuestionList(int count) {
        List<Question> listOfQuestions = new ArrayList<>();
        List<Integer> questionIDs = new ArrayList<>();
        boolean isThereSameQuestion;
        Random random = new Random();
        while (listOfQuestions.size() < count) {
            int randomQuestionID = random.nextInt(QUESTIONS_AMOUNT) + 1;
            isThereSameQuestion = false;
            for (int i = 0; i < questionIDs.size(); i++) {
                if (randomQuestionID == questionIDs.get(i)) {
                    isThereSameQuestion = true;
                }
            }
            if (!isThereSameQuestion) {
                questionIDs.add(randomQuestionID);
                listOfQuestions.add(Question.findById(Question.class, randomQuestionID));
            }
        }
        return listOfQuestions;
    }
}
