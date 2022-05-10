package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        do {
            System.out.print("Введите математическое выражение: ");
            String expression;
            int result = 0;
            boolean isError;
            do {
                isError = false;
                expression = scanner.nextLine();
                try {
                    result = Calculator.calculate(expression);
                } catch (ArithmeticException e) {
                    System.out.print("Введите корректное выражение: ");
                    isError = true;
                }
            } while (isError);
            System.out.println(expression + " = " + result);
        } while (isNext());
    }

    private static boolean isNext() {
        String answer;
        do {
            System.out.print("Хотите продолжить вычисления? [yes/no]: ");
            answer = scanner.nextLine();
            if (answer.equals("no") || answer.equals("yes")) {
                break;
            }
            System.out.println("Вы ввели неверный ответ.");
        } while (!answer.equals("no") && !answer.equals("yes"));
        return answer.equals("yes");
    }
}