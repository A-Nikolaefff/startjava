package com.startjava.lesson_2_3.calculator;
import java.util.Scanner;

public class CalculatorTest {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.print("Введите первое число: ");
            int number1 = scanner.nextInt();
            System.out.print("Введите знак математической операции: ");
            char sign = scanner.next().charAt(0);
            System.out.print("Введите второе число: ");
            int number2 = scanner.nextInt();
            Calculator calculator = new Calculator();
            calculator.setNumber1(number1);
            calculator.setNumber2(number2);
            calculator.setSign(sign);
            System.out.println(calculator.calculate());
            scanner.nextLine();
            if (!isContinued()) {
                break;
            } 
        }
    }

    private static boolean isContinued() {
        while (true) {
            System.out.print("Хотите продолжить вычисления? [yes/no]: ");
            String answer = scanner.nextLine();
            if (answer.equals("no")) {
                return false;
            } else if (answer.equals("yes")) {
                return true;
            } else {
            System.out.println("Вы ввели неверный ответ.");
            }
        }
    }
}