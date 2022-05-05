/*
Согласно условия задачи со *, необходимо делать проверку, того что пользователь использует для вычислений целые положительные числа.
В связи с этим тип исходных чисел изменен на double, так как проверка является ли число типа int целым не имеет смысла (всегда целое).
*/
package com.startjava.lesson_2_3_4.calculator;
import java.util.Scanner;

public class CalculatorTest {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        do {
            System.out.print("Введите математическое выражение: ");
            double number1;
            double number2;
            char sign;
            do {
                String[] inputData = scanner.nextLine().split(" ");
                number1 = Double.parseDouble(inputData[0]);
                number2 = Double.parseDouble(inputData[2]);
                sign = inputData[1].charAt(0);
                if ((number1 <= 0 || number1 % 1 != 0) || (number2 <= 0 || number2 % 1 != 0)) {
                    System.out.print("Ошибка! Введите целые положительные числа: ");
                }
            } while ((number1 <= 0 || number1 % 1 != 0) || (number2 <= 0 || number2 % 1 != 0));
            System.out.println(Calculator.calculate((int) number1, sign, (int) number2));
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