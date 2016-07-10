package com.khasang.javaquiz.javaquiz.Presenter;

/**
 * Created by Andy on 26.03.2016.
 */

import com.khasang.javaquiz.javaquiz.Model.data.Question;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by Andy on 14.03.2016.
 *
 *  Порядок ответов
 *  В массиве order содержится набор строк "answer1", "answer2", "answer3", "answer4"
 *  который определяет порядок вывода вариантов ответа на экране теста
 */

public class AnswerOrder {
    private String[] order;

    // инициализация порядка ответов
    public AnswerOrder(){
        this(true);
    }

    // инициализация порядка ответов, если isMixed=false то перемешиваться не будет
    public AnswerOrder(boolean isMixed){
        order = new String[4];
        if(!isMixed){
            order[0] = "answer1";
            order[1] = "answer2";
            order[2] = "answer3";
            order[3] = "answer4";
        }else{
            List<String> tempAnswerList = new ArrayList<>();

            tempAnswerList.add("answer1");
            tempAnswerList.add("answer2");
            tempAnswerList.add("answer3");
            tempAnswerList.add("answer4");

            Random random = new Random();
            for (int i = 0; i < 4; i++){
                int j = random.nextInt(4 - i);
                order[i] = tempAnswerList.get(j);
                tempAnswerList.remove(j);
            }
        }
    }

    public String[] getOrder() {
        return order;
    }

    // Возвращает текст ответа на указанной позиции, с учёт перемешивания
    public String getAnswerByIndex(Question question, int i){
        return getAnswerByName(question, getOrder()[i]);
    }

    // Возвращает текст вопроса по его номерной строке("answer1", "answer2", ...)
    private String getAnswerByName(Question question, String answerName){
        switch (answerName){
            case "answer1":
                return question.getAnswer1();
            case "answer2":
                return question.getAnswer2();
            case "answer3":
                return question.getAnswer3();
            case "answer4":
                return question.getAnswer4();
            default:
                return null;
        }
    }

    // В обратную сторону: по выбранному пользователем индексу варианта ответа возвратить исходный индекс
    public int getOriginAnswerIndex(int selectedIndex){
        switch (order[selectedIndex]){
            case "answer1":
                return 0;
            case "answer2":
                return 1;
            case "answer3":
                return 2;
            case "answer4":
                return 3;
            default:
                return 0;
        }
    }
}
