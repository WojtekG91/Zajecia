package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

public class Lambda {
    public static void main(String[] args) {
        IntegerMath sum = (a, b) -> a + b;
        IntegerMath multiply = (a, b) -> a * b;
        IntegerMath substract = (a, b) -> a - b;

//        Udemy Arkadiusz Włodarczyk - stosujac wyrazenia lambda mozemy mieć jedno zachowanie na jeden interface

        System.out.println(sum.operate(5, 5));
        System.out.println(multiply.operate(5, 5));
        System.out.println(substract.operate(5, 5));

//        math(5, 5, (a, b) -> a + b);
//        math(5, 5, (a, b) -> a - b);
//        math(5, 5, (a, b) -> a * b);
//        math(6, 5, (a, b) -> a / b);

        List<Integer> elements = new ArrayList<>();
        elements.add(5);
        elements.add(8);
        elements.add(12);
//        System.out.println(map(elements, s ->));
    }

    Function<Integer, Integer> lambdaInterface = new Function<Integer, Integer>() {
        @Override
        public Integer apply(Integer integer) {
            return integer * 10;
        }
    };


    public static Integer math(int a, int b, BiFunction operation) {
        return a + b;
    }

    public static List<Integer> map(List<Integer> list, BiFunction sum) {
        List<Integer> newList = new ArrayList<>();

        for (Integer integer : list) {
//            newList.add(sum.add(integer));
        }
        return newList;

    }


}
