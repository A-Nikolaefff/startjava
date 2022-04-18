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
        System.out.println("Сумма четных чисел: " + sumOfEvenNumbers);
        System.out.println("Сумма нечетных чисел: " + sumOfOddNumbers);
        System.out.println();

        // 2. Вывод чисел между max и min
        System.out.println("2. Вывод чисел между max и min");
        int n1 = 10;
        int n2 = 5;
        int n3 = -1;
        int[] array = new int[] {n1, n2, n3};
        int max = array[0];
        int min = array[0];
        for (int i1 = 1; i1 < 3; i1++) {
            if (array[i1] > max) {
                max = array[i1];
            }
            if (array[i1] < min) {
                min = array[i1];
            } 
        }
        for (int i2 = min; i2 <= max; i2++) {
            System.out.print(i2 + " ");
            if (i2 == max) {
                System.out.println();
            }
        }
        System.out.println();


        // 3. Вывод реверсивного числа и суммы его цифр
        System.out.println("3. Вывод реверсивного числа и суммы его цифр");
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
        System.out.println("Реверсивное число: " + reverseNumber);
        System.out.println("Cумма цифр числа: " + sumOfDigits);
        System.out.println();

        // 4. Вывод чисел на консоль в несколько строк
        System.out.println("4. Вывод чисел на консоль в несколько строк");
        for (int i3 = 1; i3 < 25; i3 += 2) {
            System.out.print(i3);
            if (i3 < 10) { 
                System.out.print("  ");
            } else {
                System.out.print(" ");
            }
            // Условие перхода на новую строку
            if ((i3 + 1) % 10 == 0) {
                System.out.println();
            }
            // Заполнение остатка последней строки нулями
            if (i3 == 23) {
                System.out.println("0  0  0");
            }
        }
        System.out.println();

        // 5. Проверка количества единиц на четность
        System.out.println("5. Проверка количества единиц на четность");
        int number1 = 3141591;
        int amountOfNumberOne = 0;
        while (number1 > 0) {
            if (number1 % 10 == 1) {
                amountOfNumberOne++;
            }
            number1 /= 10;
        }
        System.out.println("Количество единиц в числе: " + amountOfNumberOne);
        if (amountOfNumberOne % 2 == 0) {
            System.out.println("Количество единиц четное");
        } else {
            System.out.println("Количество единиц нечетное");
        }
        System.out.println();

        // 6. Отображение фигур в консоли
        System.out.println("6. Отображение фигур в консоли");
        for (int i4 = 0; i4 < 5; i4++) {
            for (int j4 = 0; j4 < 10; j4++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        int i5 = 5;
        while (i5 > 0) {
            int j5 = 0;
            while (j5 < i5) {
                System.out.print("#");
                j5++;
            }
            i5--;
            System.out.println();
        }
        System.out.println();

        int i6 = 1;
        int j6 = 0;
        do {
            int k6 = 0;
            do {
                System.out.print("$");
                k6++;
            }
            while (k6 < i6);
            if (j6 < 2) {
                i6++;
            } else {
                i6--;
            }
            j6++;
            System.out.println();
        }
        while (i6 != 0);
        System.out.println();

        // 7. Отображение ASCII-символов
        System.out.println("7. Отображение ASCII-символов");
        System.out.println("Dec Char");
        for (int i7 = 1; i7 < 48; i7 += 2) {
            System.out.print(" " + i7);
            if (i7 < 10) {
                System.out.print("   ");
            }
            else {
                System.out.print("  ");
            }
            System.out.print((char) i7 + "\r\n");
        }
        System.out.println();

        // 8. Проверка, является ли число палиндромом
        System.out.println("8. Проверка, является ли число палиндромом");
        int number2 = 1234321;
        int temp2 = number2;
        int digit2;
        int reverseNumber2 = 0;
        while (temp2 > 0) {
            digit2 = temp2 % 10;
            if (reverseNumber2 == 0) {
                reverseNumber2 = digit2;
            } else {
                reverseNumber2 = reverseNumber2 * 10 + digit2;
            }
            temp2 /= 10;
        }
        if (reverseNumber2 == number2) {
            System.out.println("Число " + number2 + " является палиндромом");
        } else {
            System.out.println("Число " + number2 + " не является палиндромом");
        }
        System.out.println();

        // 9. Определение, является ли число счастливым
        System.out.println("9. Определение, является ли число счастливым");
        int number3 = 123321;
        int temp3 = number3;
        int digit3;
        int sumOfFirstDigits = 0;
        int sumOfSecondtDigits = 0;
        int firstDigits = 0;
        int secondDigits = 0;
        int count = 0;
        while (temp3 > 0) {
            digit3 = temp3 % 10;
            if (count < 3) {
                sumOfFirstDigits += digit3;
                firstDigits = firstDigits + digit3 * (int) Math.pow(10, count);
            } else {
                sumOfSecondtDigits += digit3;
                secondDigits = secondDigits + digit3 * (int) Math.pow(10, count - 3);
            }
            temp3 /= 10;
            count++;
        }
        System.out.println(firstDigits + " = " + sumOfFirstDigits);
        System.out.println(secondDigits + " = " + sumOfSecondtDigits);
        if (sumOfFirstDigits == sumOfSecondtDigits) {
            System.out.println("Число " + number3 + " является счастливым");
        } else {
            System.out.println("Число " + number3 + " не является счастливым");
        }
        System.out.println();

        // 10. Вывод таблицы умножения Пифагора
        System.out.println("10. Вывод таблицы умножения Пифагора");
        for (int i8 = 1; i8 < 10; i8++) {
            for (int j8 = 1; j8 < 10; j8++) {
                int result = i8 * j8;
                if (result == 1) {
                    System.out.print("    ");
                } else if (result > 9) {
                    System.out.print(" " + result + " ");
                } else {
                    System.out.print("  " + result + " ");
                }
                if (j8 == 1) {
                    System.out.print("|");
                    }               
            }
            System.out.println();
            if (i8 == 1) {
                for (int k8 = 0; k8 < 36; k8++) {
                    if (k8 == 4) {
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