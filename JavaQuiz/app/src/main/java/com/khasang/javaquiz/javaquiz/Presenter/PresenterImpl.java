package com.khasang.javaquiz.javaquiz.Presenter;

import com.khasang.javaquiz.javaquiz.Model.IModel;
import com.khasang.javaquiz.javaquiz.Model.ModelImpl;
import com.khasang.javaquiz.javaquiz.Model.data.Question;
import com.khasang.javaquiz.javaquiz.Presenter.Tests.BaseTest;
import com.khasang.javaquiz.javaquiz.Presenter.Tests.QuickTest;
import com.khasang.javaquiz.javaquiz.Presenter.Tests.TypeTest;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Andy on 18.02.2016.
 */
public class PresenterImpl implements IPresenter {
    private BaseTest test;
    private IModel model;
    private AnswerOrder answerOrder;

    public PresenterImpl() {
        model = new ModelImpl();
    }

    @Override
    public void onClick() {
    }

    @Override
    public void createTest(TypeTest typeTest, int questionsAmount) {
        switch (typeTest) {
            case TYPE_1:
                test = new QuickTest(model, questionsAmount);
                break;
            case TYPE_2:
                test = new QuickTest(model, questionsAmount);
                break;
            case TYPE_3:
                test = new QuickTest(model, questionsAmount);
                break;
            case TYPE_4:
                test = new QuickTest(model, questionsAmount);
                break;
        }
    }

    @Override
    public List<String> getCurrentQuestion(int questionNumber) {
        answerOrder = new AnswerOrder();
        List<String> questionEntities = new ArrayList<>();
        Question currentQuestion = test.getListOfQuestions().get(questionNumber);

        questionEntities.add(currentQuestion.getQuestion());
        questionEntities.add(answerOrder.getAnswerByIndex(currentQuestion, 0));
        questionEntities.add(answerOrder.getAnswerByIndex(currentQuestion, 1));
        questionEntities.add(answerOrder.getAnswerByIndex(currentQuestion, 2));
        questionEntities.add(answerOrder.getAnswerByIndex(currentQuestion, 3));
        questionEntities.add(currentQuestion.getDescription());

        return questionEntities;
    }


}
