package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        do {
            System.out.print("Введите математическое выражение: ");
            String expression;
            int result;
            // При возникновении ошибки метод calculate() вернет значение меньше нуля
            do {
                expression = scanner.nextLine();
                result = Calculator.calculate(expression);
            } while (result < 0);
            System.out.println(expression + " = " + Calculator.calculate(expression));
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