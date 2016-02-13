package Presenter;

import Presenter.interfaces.Presenter;
import Model.interfaces.Model;

/**
 * Created by Admin on 13.02.2016.
 */
public class PresenterImpl implements Presenter{
    BaseTest test;
    Model model;

    public PresenterImpl() {
    }

    @Override
    public void onClickFAB() {

    }

    @Override
    public BaseTest getTest(TypeTest typeTest) {
        return null;
    }
}
