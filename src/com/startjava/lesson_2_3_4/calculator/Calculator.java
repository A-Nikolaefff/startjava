package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
    public static String calculate(int number1, char sign, int number2) {
        int result =
                switch (sign) {
                    case '+' -> number1 + number2;
                    case '-' -> number1 - number2;
                    case '*' -> number1 * number2;
                    case '/' -> number1 / number2;
                    case '%' -> number1 % number2;
                    case '^' -> (int) Math.pow(number1, number2);
                    default -> -1;
                };
        if (result == -1) {
            return "Ошибка! Некорректный знак математической операции!";
        }
        return number1 + " " + sign + " " + number2 + " = " + result;
    }
}