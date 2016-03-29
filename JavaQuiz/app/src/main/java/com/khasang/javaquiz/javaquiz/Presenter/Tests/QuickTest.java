package com.khasang.javaquiz.javaquiz.Presenter.Tests;

import com.khasang.javaquiz.javaquiz.Model.IModel;

/**
 * Created by ChornyiUA on 02.02.2016.
 */
public class QuickTest extends BaseTest {

    public QuickTest() {
    }

    public QuickTest(IModel model, int questionsAmount) {
        setListOfQuestions(model.getQuestionList(questionsAmount));
    }

}
