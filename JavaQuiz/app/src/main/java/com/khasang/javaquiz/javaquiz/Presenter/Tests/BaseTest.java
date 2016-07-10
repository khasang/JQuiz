package com.khasang.javaquiz.javaquiz.Presenter.Tests;

import com.khasang.javaquiz.javaquiz.Model.data.Question;

import java.util.List;

/**
 * Created by Andy on 18.02.2016.
 */
public abstract class BaseTest {
    private List<Question> listOfQuestions;

    public List<Question> getListOfQuestions() {
        return listOfQuestions;
    }

    public void setListOfQuestions(List<Question> listOfQuestions) {
        this.listOfQuestions = listOfQuestions;
    }




    boolean checkIfAnswerIsCorrect(int questionNumber, int answerNumber) {
        throw new UnsupportedOperationException();
//        return false;
    }

    double calculateTestTime() {
        throw new UnsupportedOperationException();
//        return 0;
    }
}
