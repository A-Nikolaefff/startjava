public class VariablesTheme {
    public static void main(String[] args) {
        // 1. Создание переменных и вывод их значений на консоль
        System.out.println("1. Создание переменных и вывод их значений на консоль");
        byte numberOfProcessorCores = 8;
        short ramCapacity = 16;
        int ssdCapacity = 475;
        long hhdCapacity = 1862l;
        float baseProcessorFrequency = 2.9f;
        double maxProcessorFrequency = 2.9;
        char operatingSystemType = 'W';
        boolean isLaptop = false;
        System.out.printf("Number of processor cores = %d;\r\nRAM capacity = %d Gb;\r\nSSD capacity = %d Gb;\r\nHHD capacity = %d Gb;\r\n" +
                "Base processor frequency = %.2f Ghz;\r\nMax processor frequency = %.2f Ghz;\r\nOperating system type = %c;\r\nIs laptop = %b;\r\n",
                numberOfProcessorCores, ramCapacity, ssdCapacity, hhdCapacity, baseProcessorFrequency, maxProcessorFrequency, operatingSystemType, isLaptop);
        System.out.println();

        // 2. Расчет стоимости товара со скидкой
        System.out.println("2. Расчет стоимости товара со скидкой");
        int priceOfProductX = 100;
        int priceOfProductY = 200;
        int discount = 11;
        System.out.println("Cумма скидки: " + (priceOfProductX + priceOfProductY) * discount / 100);
        System.out.println("Общая стоимость товаров со скидкой: " + (priceOfProductX + priceOfProductY - ((priceOfProductX + priceOfProductY) * discount / 100)));
        System.out.println();

        // 3. Вывод на консоль слова JAVA
        System.out.println("3. Вывод на консоль слова JAVA");
        System.out.println("   J    a  v     v  a    \r\n   J   a a  v   v  a a   \r\nJ  J  aaaaa  V V  aaaaa  \r\n JJ  a     a  V  a     a ");
        System.out.println();

        // 4. Отображение min и max значений числовых типов данных
        System.out.println("4. Отображение min и max значений числовых типов данных");
        byte byteMaxValue = 127;
        short shortMaxValue = 32_767;
        int intMaxValue = 2_147_483_647;
        long longMaxValue = 9_223_372_036_854_775_807l;
        System.out.println(byteMaxValue + " " + shortMaxValue + " " + intMaxValue + " " + longMaxValue);
        byteMaxValue++;
        shortMaxValue++;
        intMaxValue++;
        longMaxValue++;
        System.out.println("Инкрементируем все переменные:");
        System.out.println(byteMaxValue + " " + shortMaxValue + " " + intMaxValue + " " + longMaxValue);
        byteMaxValue--;
        shortMaxValue--;
        intMaxValue--;
        longMaxValue--;
        System.out.println("Декрементируем все переменные:");
        System.out.println(byteMaxValue + " " + shortMaxValue + " " + intMaxValue + " " + longMaxValue);
        System.out.println();

        // 5. Перестановка значений переменных
        System.out.println("5. Перестановка значений переменных");
        int number1 = 5;
        int number2 = 10;
        System.out.println(number1 + " " + number2);
        int temp = number1;
        number1 = number2;
        number2 = temp;
        System.out.println(number1 + " " + number2);
        System.out.println();

        // 6. Вывод символов и их кодов
        System.out.println("6. Вывод символов и их кодов");
        int n1 = 35;
        int n2 = 38;
        int n3 = 64;
        int n4 = 94;
        int n5 = 95;
        System.out.println(n1 + " - " + (char) n1 + "\r\n" + n2 + " - " + (char) n2 + "\r\n" +
                n3 + " - " + (char) n3 + "\r\n" + n4 + " - " + (char) n4 + "\r\n" + n5 + " - " + (char) n5);
        System.out.println();

        // 7. Произведение и сумма цифр числа
        System.out.println("7. Произведение и сумма цифр числа");
        int num1 = 345;
        int digit3 = num1 % 10;
        int digit2 = num1 / 10 % 10;
        int digit1 = num1 / 100 % 10;
        int product = digit1 * digit2 * digit3;
        int sum = digit1 + digit2 +digit3;
        System.out.println("Product: " + product + "\r\n" + "Sum: " + sum);
        System.out.println();

        // 8. Вывод на консоль ASCII-арт Дюка
        System.out.println("8. Вывод на консоль ASCII-арт Дюка");
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
        System.out.println();

        // 9. Отображение количества сотен, десятков и единиц числа
        System.out.println("9. Отображение количества сотен, десятков и единиц числа");
        int num2 = 123;
        int digit3OfNum2 = num2 % 10;
        int digit2OfNum2 = num2 / 10 % 10;
        int digit1OfNum2 = num2/ 100 % 10;
        System.out.println(digit1OfNum2 + " - количество сотен");
        System.out.println(digit2OfNum2 + " - количество десятков");
        System.out.println(digit3OfNum2 + " - количество единиц");
        System.out.println();

        // 10. Преобразование секунд
        System.out.println("10. Преобразование секунд");
        int time = 86399;
        int hours = time / 3600;
        int minutes = time % 3600 / 60;
        int seconds = time % 3600 % 60;
        System.out.println(hours + ":" + minutes + ":" + seconds);
    }
}