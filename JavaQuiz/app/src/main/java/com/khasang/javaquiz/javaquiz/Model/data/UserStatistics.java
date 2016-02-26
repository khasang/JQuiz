package com.khasang.javaquiz.javaquiz.Model.data;

/**
 * Created by pcuser on 26.02.2016.
 */
public class UserStatistics {
    private int passedTestsAmount;
    private int passedQuestionsAmount;
    private int rightAnswersAmount;
    private double averageTime;

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
