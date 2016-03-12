package com.khasang.javaquiz.javaquiz.Presenter;

import com.khasang.javaquiz.javaquiz.Model.IModel;
import com.khasang.javaquiz.javaquiz.Model.ModelImpl;
import com.khasang.javaquiz.javaquiz.Presenter.Tests.BaseTest;
import com.khasang.javaquiz.javaquiz.Presenter.Tests.QuickTest;
import com.khasang.javaquiz.javaquiz.Presenter.Tests.TypeTest;

import java.util.List;

/**
 * Created by Andy on 18.02.2016.
 */
public class PresenterImpl implements IPresenter {
    private BaseTest test;
    private IModel model;

    public PresenterImpl() {
        model = new ModelImpl();
    }

    @Override
    public void unClick() {
    }

    @Override
    public void createTest(TypeTest typeTest) {
        switch (typeTest) {
            case TYPE_1:
                test = new QuickTest(model);
                break;
            case TYPE_2:
                test = new QuickTest(model);
                break;
            case TYPE_3:
                test = new QuickTest(model);
                break;
            case TYPE_4:
                test = new QuickTest(model);
                break;
        }
    }

    @Override
    public List<String> getCurrentQuestion(int questionNumber) {
        return null;
    }


}
