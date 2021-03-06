package com.khasang.javaquiz.javaquiz.Model.data;

import com.orm.SugarRecord;

/**
 * Created by pcuser on 26.02.2016.
 */
public class UserStatistics extends SugarRecord {
    private int passedTestsAmount;
    private int passedQuestionsAmount;
    private int rightAnswersAmount;
    private double averageTime;

    public UserStatistics() {
    }

    public UserStatistics(int passedTestsAmount, int passedQuestionsAmount, int rightAnswersAmount, double averageTime) {

        this.passedTestsAmount = passedTestsAmount;
        this.passedQuestionsAmount = passedQuestionsAmount;
        this.rightAnswersAmount = rightAnswersAmount;
        this.averageTime = averageTime;
    }

    public int getPassedTestsAmount() {
        return passedTestsAmount;
    }

    public void setPassedTestsAmount(int passedTestsAmount) {
        this.passedTestsAmount = passedTestsAmount;
    }

    public int getPassedQuestionsAmount() {
        return passedQuestionsAmount;
    }

    public void setPassedQuestionsAmount(int passedQuestionsAmount) {
        this.passedQuestionsAmount = passedQuestionsAmount;
    }

    public int getRightAnswersAmount() {
        return rightAnswersAmount;
    }

    public void setRightAnswersAmount(int rightAnswersAmount) {
        this.rightAnswersAmount = rightAnswersAmount;
    }

    public double getAverageTime() {
        return averageTime;
    }

    public void setAverageTime(double averageTime) {
        this.averageTime = averageTime;
    }
}
