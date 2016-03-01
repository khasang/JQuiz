package com.khasang.javaquiz.javaquiz.Model.data;

import com.orm.SugarRecord;

/**
 * Created by ChornyiUA on 02.02.2016.
 */
public class Question extends SugarRecord {
    private String question;
    private String correctAnswers;
    private String answer1;
    private String answer2;
    private String answer3;
    private String answer4;
    private String description;
    private boolean completed;
    private boolean chosen;
    private QuestionDifficulty difficulty;
    private QuestionTheme theme;

    public Question() {
    }

    public Question(String question, String correctAnswers, String answer1, String answer2, String answer3, String answer4, String description, boolean completed, boolean chosen) {
        this.question = question;
        this.correctAnswers = correctAnswers;
        this.answer1 = answer1;
        this.answer2 = answer2;
        this.answer3 = answer3;
        this.answer4 = answer4;
        this.description = description;
        this.completed = completed;
        this.chosen = chosen;
    }

    public QuestionTheme getTheme() {
        return theme;
    }

    public void setTheme(QuestionTheme theme) {
        this.theme = theme;
    }

    public QuestionDifficulty getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(QuestionDifficulty difficulty) {
        this.difficulty = difficulty;
    }

    public String getCorrectAnswers() {
        return correctAnswers;
    }

    public void setCorrectAnswers(String correctAnswers) {
        this.correctAnswers = correctAnswers;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer1() {
        return answer1;
    }

    public void setAnswer1(String answer1) {
        this.answer1 = answer1;
    }

    public String getAnswer2() {
        return answer2;
    }

    public void setAnswer2(String answer2) {
        this.answer2 = answer2;
    }

    public String getAnswer3() {
        return answer3;
    }

    public void setAnswer3(String answer3) {
        this.answer3 = answer3;
    }

    public String getAnswer4() {
        return answer4;
    }

    public void setAnswer4(String answer4) {
        this.answer4 = answer4;
    }


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public boolean isChosen() {
        return chosen;
    }

    public void setChosen(boolean chosen) {
        this.chosen = chosen;
    }
}
