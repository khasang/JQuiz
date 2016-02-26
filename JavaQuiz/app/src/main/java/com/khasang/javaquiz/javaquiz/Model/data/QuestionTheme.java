package com.khasang.javaquiz.javaquiz.Model.data;

import com.orm.SugarRecord;

/**
 * Created by pcuser on 26.02.2016.
 */
public class QuestionTheme extends SugarRecord {
    private int themeName;

    public int getThemeName() {
        return themeName;
    }

    public void setThemeName(int themeName) {
        this.themeName = themeName;
    }

}
