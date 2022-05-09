package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
    public static int calculate(String expression) throws ArithmeticException {
        double number1;
        double number2;
        char sign;
        String[] partExpression = expression.split(" ");
        number1 = Double.parseDouble(partExpression[0]);
        number2 = Double.parseDouble(partExpression[2]);
        sign = partExpression[1].charAt(0);
        if ((number1 <= 0 || number1 % 1 != 0) || (number2 <= 0 || number2 % 1 != 0)) {
            throw new ArithmeticException("Ошибка! Числа должны быть целые положительные!");
        }
        int result =
                switch (sign) {
                    case '+' -> (int) (number1 + number2);
                    case '-' -> (int) (number1 - number2);
                    case '*' -> (int) (number1 * number2);
                    case '/' -> (int) (number1 / number2);
                    case '%' -> (int) number1 % (int) number2;
                    case '^' -> (int) Math.pow(number1, number2);
                    default -> throw new ArithmeticException("Ошибка! Некорректный знак математической операции!");
                };
        return result;
    }
}