package com.khasang.javaquiz.javaquiz.Presenter;

import com.khasang.javaquiz.javaquiz.Presenter.Tests.BaseTest;
import com.khasang.javaquiz.javaquiz.Presenter.Tests.TypeTest;

/**
 * Created by Andy on 18.02.2016.
 */
public interface IPresenter {
    void unClick();
    BaseTest getTest(TypeTest typeTest);
}
