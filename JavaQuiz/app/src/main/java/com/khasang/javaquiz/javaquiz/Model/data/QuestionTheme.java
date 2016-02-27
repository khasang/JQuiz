package com.khasang.javaquiz.javaquiz.Model.data;

import com.orm.SugarRecord;

/**
 * Created by pcuser on 26.02.2016.
 */
public class QuestionTheme extends SugarRecord {
    private String themeName;

    public QuestionTheme() {
    }

    public QuestionTheme(String themeName) {

        this.themeName = themeName;
    }

    public String getThemeName() {

        return themeName;
    }

    public void setThemeName(String themeName) {
        this.themeName = themeName;
    }
}
