package com.khasang.javaquiz.javaquiz.Presenter;

import com.khasang.javaquiz.javaquiz.Presenter.Tests.BaseTest;
import com.khasang.javaquiz.javaquiz.Presenter.Tests.TypeTest;

import java.util.List;

/**
 * Created by Andy on 18.02.2016.
 */
public interface IPresenter {
    void onClick();

    void createTest(TypeTest typeTest, int questionsAmount);

    List<String> getCurrentQuestion(int questionNumber);
}
