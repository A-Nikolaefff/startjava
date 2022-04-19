import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
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
            boolean active = false;
            while (true) {
                System.out.print("Хотите продолжить вычисления? [yes/no]: ");
                String answer = scanner.nextLine();
                if (answer.equals("no")) {
                    break;
                } else if (answer.equals("yes")) {
                    active = true;
                    break;
                } else {
                System.out.println("Вы ввели неверный ответ.");
                }
            }
            if (!active) {
                break;
            } 
        }
    }
}