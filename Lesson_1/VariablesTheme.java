public class VariablesTheme {
    public static void main(String[] args) {
        // 1. Создание переменных и вывод их значений на консоль
        System.out.println("1. Создание переменных и вывод их значений на консоль");
        byte numberOfCpuCores = 8;
        short ramCapacity = 16;
        int ssdCapacity = 475;
        long hhdCapacity = 1862l;
        float baseCpuFrequency = 2.9f;
        double maxCpuFrequency = 4.1;
        char osType = 'W';
        boolean isLaptop = false;
        System.out.printf("Number of CPU cores = %d;\nRAM capacity = %d Gb;\nSSD capacity = %d Gb;\nHHD capacity = %d Gb;\nBase CPU frequency = %.2f Ghz;\nMax CPU frequency = %.2f Ghz;\nOS type = %c;\nIs laptop = %b;\n", numberOfCpuCores, ramCapacity, ssdCapacity, hhdCapacity, baseCpuFrequency, maxCpuFrequency, osType, isLaptop);

        // 2. Расчет стоимости товара со скидкой
        System.out.println("\n2. Расчет стоимости товара со скидкой");
        int priceOfProductX = 100;
        int priceOfProductY = 200;
        int discount = 11;
        int discountAmount = (priceOfProductX + priceOfProductY) * discount / 100;
        System.out.println("Сумма скидки: " + discountAmount);
        System.out.println("Общая стоимость товаров со скидкой: " + (priceOfProductX + priceOfProductY - discountAmount));

        // 3. Вывод на консоль слова JAVA
        System.out.println("\n3. Вывод на консоль слова JAVA");
        System.out.println("   J    a  v     v  a    \n   J   a a  v   v  a a   \nJ  J  aaaaa  V V  aaaaa  \n JJ  a     a  V  a     a");

        // 4. Отображение min и max значений числовых типов данных
        System.out.println("\n4. Отображение min и max значений числовых типов данных");
        byte byteMaxValue = 127;
        short shortMaxValue = 32_767;
        int intMaxValue = 2_147_483_647;
        long longMaxValue = 9_223_372_036_854_775_807l;
        System.out.println("byte: " + byteMaxValue + "\nshort: " + shortMaxValue + "\nint: " + intMaxValue + "\nlong: " + longMaxValue);
        System.out.println("Инкрементируем все переменные.");
        System.out.println("byte: " + ++byteMaxValue + "\nshort: " + ++shortMaxValue + "\nint: " + ++intMaxValue + "\nlong: " + ++longMaxValue);
        System.out.println("Декрементируем все переменные.");
        System.out.println("byte: " + --byteMaxValue + "\nshort: " + --shortMaxValue + "\nint: " + --intMaxValue + "\nlong: " + --longMaxValue);

        // 5. Перестановка значений переменных
        System.out.println("\n5. Перестановка значений переменных");
        int number1 = 5;
        int number2 = 10;
        System.out.println(number1 + " " + number2);
        int temp = number1;
        number1 = number2;
        number2 = temp;
        System.out.println(number1 + " " + number2);

        // 6. Вывод символов и их кодов
        System.out.println("\n6. Вывод символов и их кодов");
        int codeChar1 = 35;
        int codeChar2 = 38;
        int codeChar3 = 64;
        int codeChar4 = 94;
        int codeChar5 = 95;
        System.out.println(codeChar1 + " - " + (char) codeChar1 + "\n" + codeChar2 + " - " + (char) codeChar2 + "\n" + codeChar3 + " - " + (char) codeChar3 + "\n" + codeChar4 + " - " + (char) codeChar4 + "\n" + codeChar5 + " - " + (char) codeChar5);

        // 7. Произведение и сумма цифр числа
        System.out.println("\n7. Произведение и сумма цифр числа");
        int srcNum = 345;
        int digit3 = srcNum % 10;
        int digit2 = srcNum / 10 % 10;
        int digit1 = srcNum / 100;
        int product = digit1 * digit2 * digit3;
        int sum = digit1 + digit2 + digit3;
        System.out.println("Product: " + product + "\n" + "Sum: " + sum);

        // 8. Вывод на консоль ASCII-арт Дюка
        System.out.println("\n8. Вывод на консоль ASCII-арт Дюка");
        char space = ' ';
        char underline = '_';
        char slash = '/';
        char backslash = '\\';
        char leftBracket = '(';
        char rightBracket = ')';
        System.out.println("" + space + space + space + space + slash + backslash +  space + space + space + space);
        System.out.println("" + space + space + space + slash + space + space + backslash + space + space + space);
        System.out.println("" + space + space + slash + underline + leftBracket + space + rightBracket + backslash + space + space);
        System.out.println("" + space + slash + space + space + space + space + space + space+ backslash + space);
        System.out.println("" + slash + underline + underline + underline + underline + slash + backslash + underline + underline + backslash);

        // 9. Отображение количества сотен, десятков и единиц числа
        System.out.println("\n9. Отображение количества сотен, десятков и единиц числа");
        srcNum = 123;
        digit3 = srcNum % 10;
        digit2 = srcNum / 10 % 10;
        digit1 = srcNum / 100;
        System.out.println(digit1 + " - количество сотен");
        System.out.println(digit2 + " - количество десятков");
        System.out.println(digit3 + " - количество единиц");

        // 10. Преобразование секунд
        System.out.println("\n10. Преобразование секунд");
        int time = 86399;
        int hours = time / 3600;
        int minutes = time % 3600 / 60;
        int seconds = time % 60;
        System.out.println(hours + ":" + minutes + ":" + seconds);
    }
}