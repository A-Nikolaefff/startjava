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
            } else {
                sumOfOddNumbers += i;
            }
            i++;
        } while (i <= 21);
        System.out.println("Сумма четных чисел: " + sumOfEvenNumbers + "\nСумма нечетных чисел: " + sumOfOddNumbers);

        // 2. Вывод чисел между max и min
        System.out.println("\n2. Вывод чисел между max и min");
        int number1 = 10;
        int number2 = 5;
        int number3 = -1;
        int max = number1;
        if (number1 > number2) {
            if (number1 > number3) {
                // переприсваивание не требуется
            } else {
                max = number3;
            }
        } else {
            if (number2 > number3) {
                max = number2;
            } else {
                max = number3;
            }
        }
        int min = number2;
        if (max == number1) {
            if (number2 < number3) {
                // переприсваивание не требуется
            } else {
                min = number3;
            } 
        } else if (max == number2) {
            if (number1 < number3) {
                min = number1;
            } else {
                min = number3;
            } 
        } else {
            if (number1 < number2) {
                min = number1;
            } else {
                // переприсваивание не требуется
            } 
        }
        for (i = max - 1; i > min; i--) {
            System.out.print(i + " ");
        }

        // 3. Вывод реверсивного числа и суммы его цифр
        System.out.println("\n\n3. Вывод реверсивного числа и суммы его цифр");
        int srcNumber = 1234;
        int digit = srcNumber % 10;
        int sumOfDigits = digit;
        int reverseNumber = digit;
        srcNumber /= 10;
        while (srcNumber > 0) {
            digit = srcNumber % 10;
            sumOfDigits += digit;
            reverseNumber = reverseNumber * 10 + digit;
            srcNumber /= 10;
        }
        System.out.println("Реверсивное число: " + reverseNumber + "\nCумма цифр числа: " + sumOfDigits);

        // 4. Вывод чисел на консоль в несколько строк
        System.out.println("\n4. Вывод чисел на консоль в несколько строк");
        for (i = 1; i * 2 - 1 < 24; i ++) {
            System.out.printf("%-2d  ", i * 2 - 1);
            // Условие перехода на новую строку 
            if (i % 5 == 0) {
                System.out.println();
            }
        }
        // Заполнение остатка последней строки нулями
        int numberUnits = (i - 1) % 5;
        if (numberUnits != 0) {
            int zeroUnits = 5 - numberUnits;
            for (int j = 1; j <= zeroUnits; j++) {
                System.out.print(0);
                if (j != zeroUnits) {
                System.out.print("   ");
                }
            }
        }

        // 5. Проверка количества единиц на четность
        System.out.println("\n\n5. Проверка количества единиц на четность");
        srcNumber = 3141591;
        numberUnits = 0;
        while (srcNumber > 0) {
            if (srcNumber % 10 == 1) {
                 numberUnits++;
            }
            srcNumber /= 10;
        }
        System.out.println("Количество единиц в числе: " +  numberUnits);
        if (numberUnits % 2 == 0) {
            System.out.println("Количество единиц четное");
        } else {
            System.out.println("Количество единиц нечетное");
        }

        // 6. Отображение фигур в консоли
        System.out.println("\n6. Отображение фигур в консоли");
        for (i = 0; i < 5; i++) {
            System.out.println("**********");
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
            System.out.printf("%-2d - %c\n", i, (char) i);
        }

        // 8. Проверка, является ли число палиндромом
        System.out.println("\n8. Проверка, является ли число палиндромом");
        srcNumber = 1234321;
        digit = srcNumber % 10;
        reverseNumber = digit;
        int temp = srcNumber / 10;
        while (temp > 0) {
            digit = temp % 10;
            reverseNumber = reverseNumber * 10 + digit;
            temp /= 10;
        }
        if (reverseNumber == srcNumber) {
            System.out.println("Число " + srcNumber + " является палиндромом");
        } else {
            System.out.println("Число " + srcNumber + " не является палиндромом");
        }

        // 9. Определение, является ли число счастливым
        System.out.println("\n9. Определение, является ли число счастливым");
        srcNumber = 123321;
        temp = srcNumber;
        int sumOfFirstDigits = 0;
        int sumOfSecondtDigits = 0;
        int count = 0;
        while (temp > 0) {
            digit = temp % 10;
            if (count < 3) {
                sumOfFirstDigits += digit;
            } else {
                sumOfSecondtDigits += digit;
            }
            temp /= 10;
            count++;
        }
        int firstDigits = srcNumber % 1000;
        int secondDigits = srcNumber / 1000;
        System.out.println(firstDigits + " = " + sumOfFirstDigits);
        System.out.println(secondDigits + " = " + sumOfSecondtDigits);
        if (sumOfFirstDigits == sumOfSecondtDigits) {
            System.out.println("Число " + srcNumber + " является счастливым");
        } else {
            System.out.println("Число " + srcNumber + " не является счастливым");
        }

        // 10. Вывод таблицы умножения Пифагора
        System.out.println("\n10. Вывод таблицы умножения Пифагора");
        for (i = 1; i < 10; i++) {
            for (j = 1; j < 10; j++) {
                int result = i * j;
                if (result == 1) {
                    System.out.print("   ");
                } else {
                    System.out.printf(" %-2d", result);
                } 
                if (j == 1) {
                    System.out.print("|");
                }               
            }
            System.out.println();
            if (i == 1) {
                System.out.println("---+------------------------");
            }
        }
    }
}