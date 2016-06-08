package com.khasang.javaquiz.javaquiz.Model;

import com.khasang.javaquiz.javaquiz.Model.data.Question;

import java.util.List;

/**
 * Created by ChornyiUA on 24.02.2016.
 */
public interface IModel {

    List<Question> getQuestionList(int count);
}
