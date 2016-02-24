package com.khasang.javaquiz.javaquiz.Presenter;

import com.khasang.javaquiz.javaquiz.Model.IModel;
import com.khasang.javaquiz.javaquiz.Model.ModelImpl;
import com.khasang.javaquiz.javaquiz.Presenter.Tests.BaseTest;
import com.khasang.javaquiz.javaquiz.Presenter.Tests.TypeTest;

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
    public BaseTest getTest(TypeTest typeTest) {
        return null;
    }
}
