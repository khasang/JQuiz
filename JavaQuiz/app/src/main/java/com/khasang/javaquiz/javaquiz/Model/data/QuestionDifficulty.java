package com.khasang.javaquiz.javaquiz.Model.data;

import com.orm.SugarRecord;

/**
 * Created by pcuser on 26.02.2016.
 */
public class QuestionDifficulty extends SugarRecord {
    private int difficulty;

    public int getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(int difficulty) {
        this.difficulty = difficulty;
    }

}
