public class CyclesTheme {
    public static void main(String[] args) {
        // 1. Подсчет суммы четных и нечетных чисел
        System.out.println("1. Подсчет суммы четных и нечетных чисел");
        int i = -10;
        int sumOfOddNumbers = 0;
        int sumOfEvenNumbers = 0;
        do {
            if (i % 2 == 0) {
                sumOfEvenNumbers += i;
            }
            else {
                sumOfOddNumbers += i;
            }
            i++;
        }
        while (i <= 21);
        System.out.println("Сумма четных чисел: " + sumOfEvenNumbers + "\nСумма нечетных чисел: " + sumOfOddNumbers);

        // 2. Вывод чисел между max и min
        System.out.println("\n2. Вывод чисел между max и min");
        int number1 = 10;
        int number2 = 5;
        int number3 = -1;
        int max = number1 > number2 ? (number1 > number3 ?  number1 : number3) : (number2 > number3 ? number2 : number3);
        int min;
        if (max == number1) {
            min = number2 < number3 ? number2 : number3;
        } else if (max == number2) {
            min = number1 < number3 ? number1 : number3;
        } else {
            min = number1 < number2 ? number1 : number2;
        }
        for (i = min; i <= max; i++) {
            System.out.print(i + " ");
        }

        // 3. Вывод реверсивного числа и суммы его цифр
        System.out.println("\n\n3. Вывод реверсивного числа и суммы его цифр");
        int number = 1234;
        int digit;
        int sumOfDigits = 0;
        int reverseNumber = 0;
        while (number > 0) {
            digit = number % 10;
            sumOfDigits += digit;
            if (reverseNumber == 0) {
                reverseNumber = digit;
            } else {
                reverseNumber = reverseNumber * 10 + digit;
            }
            number /= 10;
        }
        System.out.println("Реверсивное число: " + reverseNumber + "\nCумма цифр числа: " + sumOfDigits);

        // 4. Вывод чисел на консоль в несколько строк
        System.out.println("\n4. Вывод чисел на консоль в несколько строк");
        for (i = 1; i < 25; i += 2) {
            System.out.print(i);
            if (i < 10) { 
                System.out.print("  ");
            } else {
                System.out.print(" ");
            }
            // Условие перхода на новую строку
            if ((i + 1) % 10 == 0) {
                System.out.println();
            }
            // Заполнение остатка последней строки нулями
            if (i == 23) {
                System.out.println("0  0  0");
            }
        }

        // 5. Проверка количества единиц на четность
        System.out.println("\n5. Проверка количества единиц на четность");
        number = 3141591;
        int amountOfNumberOne = 0;
        while (number > 0) {
            if (number % 10 == 1) {
                amountOfNumberOne++;
            }
            number /= 10;
        }
        System.out.println("Количество единиц в числе: " + amountOfNumberOne);
        if (amountOfNumberOne % 2 == 0) {
            System.out.println("Количество единиц четное");
        } else {
            System.out.println("Количество единиц нечетное");
        }

        // 6. Отображение фигур в консоли
        System.out.println("\n6. Отображение фигур в консоли");
        for (i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        i = 5;
        while (i > 0) {
            int j = 0;
            while (j < i) {
                System.out.print("#");
                j++;
            }
            i--;
            System.out.println();
        }
        System.out.println();

        i = 1;
        int j = 0;
        do {
            int k = 0;
            do {
                System.out.print("$");
                k++;
            }
            while (k < i);
            if (j < 2) {
                i++;
            } else {
                i--;
            }
            j++;
            System.out.println();
        }
        while (i != 0);

        // 7. Отображение ASCII-символов
        System.out.println("\n7. Отображение ASCII-символов");
        System.out.println("Dec Char");
        for (i = 1; i < 48; i += 2) {
            System.out.print(" " + i);
            if (i < 10) {
                System.out.print("   ");
            }
            else {
                System.out.print("  ");
            }
            System.out.print((char) i + "\r\n");
        }

        // 8. Проверка, является ли число палиндромом
        System.out.println("\n8. Проверка, является ли число палиндромом");
        number = 1234321;
        reverseNumber = 0;
        int temp = number;
        while (temp > 0) {
            digit = temp % 10;
            if (reverseNumber == 0) {
                reverseNumber = digit;
            } else {
                reverseNumber = reverseNumber * 10 + digit;
            }
            temp /= 10;
        }
        if (reverseNumber == number) {
            System.out.println("Число " + number + " является палиндромом");
        } else {
            System.out.println("Число " + number + " не является палиндромом");
        }

        // 9. Определение, является ли число счастливым
        System.out.println("\n9. Определение, является ли число счастливым");
        number = 123321;
        temp = number;
        int sumOfFirstDigits = 0;
        int sumOfSecondtDigits = 0;
        int firstDigits = 0;
        int secondDigits = 0;
        int count = 0;
        while (temp > 0) {
            digit = temp % 10;
            if (count < 3) {
                sumOfFirstDigits += digit;
                firstDigits = firstDigits + digit * (int) Math.pow(10, count);
            } else {
                sumOfSecondtDigits += digit;
                secondDigits = secondDigits + digit * (int) Math.pow(10, count - 3);
            }
            temp /= 10;
            count++;
        }
        System.out.println(firstDigits + " = " + sumOfFirstDigits);
        System.out.println(secondDigits + " = " + sumOfSecondtDigits);
        if (sumOfFirstDigits == sumOfSecondtDigits) {
            System.out.println("Число " + number + " является счастливым");
        } else {
            System.out.println("Число " + number + " не является счастливым");
        }

        // 10. Вывод таблицы умножения Пифагора
        System.out.println("\n10. Вывод таблицы умножения Пифагора");
        for (i = 1; i < 10; i++) {
            for (j = 1; j < 10; j++) {
                int result = i * j;
                if (result == 1) {
                    System.out.print("    ");
                } else if (result > 9) {
                    System.out.print(" " + result + " ");
                } else {
                    System.out.print("  " + result + " ");
                }
                if (j == 1) {
                    System.out.print("|");
                    }               
            }
            System.out.println();
            if (i == 1) {
                for (int k = 0; k < 36; k++) {
                    if (k == 4) {
                        System.out.print("+");
                    } else {
                        System.out.print("-");
                    }
                }
                System.out.println();
            }
        }
    }
}