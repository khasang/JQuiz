package com.khasang.javaquiz.javaquiz.Presenter.Tests;

import com.khasang.javaquiz.javaquiz.Model.IModel;
import com.khasang.javaquiz.javaquiz.Model.data.Question;

import java.util.List;

/**
 * Created by ChornyiUA on 02.02.2016.
 */
public class QuickTest extends BaseTest {

    public QuickTest() {
    }

    public QuickTest(IModel model) { // + количествоо вопросов во вход?
        super.listOfQuestions = model.getListQuestion(5);
    }

}
