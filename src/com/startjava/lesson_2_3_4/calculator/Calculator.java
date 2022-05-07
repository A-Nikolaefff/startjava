package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
    public static int calculate(String expression) {
        double number1;
        double number2;
        char sign;
        do {
            String[] inputData = expression.split(" ");
            number1 = Double.parseDouble(inputData[0]);
            number2 = Double.parseDouble(inputData[2]);
            sign = inputData[1].charAt(0);
            if ((number1 <= 0 || number1 % 1 != 0) || (number2 <= 0 || number2 % 1 != 0)) {
                System.out.print("Ошибка! Введите целые положительные числа: ");
                return -1;
            }
        } while ((number1 <= 0 || number1 % 1 != 0) || (number2 <= 0 || number2 % 1 != 0));
        int result =
                switch (sign) {
                    case '+' -> (int) (number1 + number2);
                    case '-' -> (int) (number1 - number2);
                    case '*' -> (int) (number1 * number2);
                    case '/' -> (int) (number1 / number2);
                    case '%' -> (int) number1 % (int) number2;
                    case '^' -> (int) Math.pow(number1, number2);
                    default -> -1;
                };
        if (result == -1) {
            System.out.print("Ошибка! Некорректный знак математической операции! Введите корректное выражение: ");
            return -1;
        }
        return result;
    }
}