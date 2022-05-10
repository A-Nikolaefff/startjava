package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
    public static int calculate(String expression) throws ArithmeticException {
        double number1;
        double number2;
        char sign;
        String[] partsExpression = expression.split(" ");
        number1 = Double.parseDouble(partsExpression[0]);
        number2 = Double.parseDouble(partsExpression[2]);
        sign = partsExpression[1].charAt(0);
        if ((number1 <= 0 || number1 % 1 != 0) || (number2 <= 0 || number2 % 1 != 0)) {
            throw new ArithmeticException("Ошибка! Числа должны быть целые положительные!");
        }
        return switch (sign) {
            case '+' -> (int) (number1 + number2);
            case '-' -> (int) (number1 - number2);
            case '*' -> (int) (number1 * number2);
            case '/' -> (int) (number1 / number2);
            case '%' -> (int) number1 % (int) number2;
            case '^' -> (int) Math.pow(number1, number2);
            default -> throw new ArithmeticException("Ошибка! Некорректный знак математической операции!");
        };
    }
}