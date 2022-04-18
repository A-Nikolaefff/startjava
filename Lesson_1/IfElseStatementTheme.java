public class IfElseStatementTheme {
    public static void main(String[] args) {
        // 1. Перевод псевдокода на язык Java
        System.out.println("1. Перевод псевдокода на язык Java");
        int age = 26;
        int height = 165;
        boolean male = false;
        String name = "Anastasia";
        if (age > 20) {
            System.out.println("Возраст больше 20");
        } else {
            System.out.println("Возраст меньше или равен 20");
        }

        if (!male) {
            System.out.println("Пол женский");
        }

        char firstLetterOfName = name.charAt(0);
        if (firstLetterOfName == 'M') {
            System.out.println("Имя начинается с буквы M");
        } else if (firstLetterOfName == 'I') {
            System.out.println("Имя начинается с буквы I");
        } else {
            System.out.println("Имя начинается не с букв I или M");
        }
        System.out.println();

        // 2. Поиск максимального и минимального числа
        System.out.println("2. Поиск максимального и минимального числа");
        int number1 = 15;
        int number2 = 30;
        if (number1 > number2) {
            System.out.println("Максимальное число " + number1);
        } else if (number1 < number2) {
            System.out.println("Максимальное число " + number2);
        } else {
            System.out.println("Числа равны");
        }
        System.out.println();

        // 3. Работа с числом
        System.out.println("3. Работа с числом");
        int number = 4;
        System.out.print("Число " + number + " - ");
        if (number == 0) {
            System.out.print("является нулем");
        } else {
            if (number % 2 == 0) {
                System.out.print("четное, ");
            } else {
                System.out.print("нечетное, ");
            }
            if (number > 0) {
                System.out.println("положительное");
            } else {
                System.out.println("отрицательное");
            }
        }
        System.out.println();

        // 4. Поиск одинаковых цифр в числах
        System.out.println("4. Поиск одинаковых цифр в числах");
        int x = 123;
        int y = 323;
        if (x / 10 / 10 % 10 == y / 10 / 10 % 10) {
            System.out.println(x / 10 / 10 % 10);
        }
        if (x / 10 % 10 == y / 10 % 10) {
            System.out.println(x / 10 % 10);
        }
        if (x % 10 == y % 10) {
            System.out.println(x % 10);
        }
        System.out.println();

        // 5. Определение буквы, числа или символа по их коду
        System.out.println("5. Определение буквы, числа или символа по их коду");
        char symbol = '\u005A'; 
        System.out.print(symbol + " - ");
        if (symbol > 64 && symbol < 91) {
            System.out.println("прописная буква");
        } else if (symbol > 96 && symbol < 123) {
            System.out.println("строчная буква");
        } else if (symbol > 47 && symbol < 58) {
            System.out.println("число");
        } else {
            System.out.println("не буква и не число");
        }
        System.out.println();

        // 6. Определение суммы вклада и начисленных банком %
        System.out.println("6. Определение суммы вклада и начисленных банком %");
        int depositAmount = 300000;
        double interestRate;
        if (depositAmount < 100000) {
            interestRate = 5;
        } else if (depositAmount <= 300000) {
            interestRate = 7;
        } else {
            interestRate = 10;
        }
        int depositAmountWithInterest = depositAmount + (int) (interestRate / 100 * depositAmount);
        System.out.println("Сумма вклада: " + depositAmount);
        System.out.println("Начисленный процент: " + (int) (interestRate / 100 * depositAmount));
        System.out.println("Итоговая сумма с процентами: " + depositAmountWithInterest);
        System.out.println();

        // 7. Определение оценки по предметам
        System.out.println("7. Определение оценки по предметам");
        int percentInHistory = 59;
        int percentInProgramming = 91;
        int gradeInHistory;
        if (percentInHistory <= 60) {
            gradeInHistory = 2;
        } else if (percentInHistory <= 73) {
            gradeInHistory = 3;
        } else if (percentInHistory <= 91) {
            gradeInHistory = 4;
        } else {
            gradeInHistory = 5;
        }
        int gradeInProgramming;
        if (percentInProgramming <= 60) {
            gradeInProgramming = 2;
        } else if (percentInProgramming <= 73) {
            gradeInProgramming = 3;
        } else if (percentInProgramming <= 91) {
            gradeInProgramming = 4;
        } else {
            gradeInProgramming = 5;
        }
        int averageGrade = (gradeInHistory + gradeInProgramming) / 2;
        int averagePercent = (percentInHistory + percentInProgramming) / 2;
        System.out.println(gradeInHistory + " - История");
        System.out.println(gradeInProgramming + " - Программирование");
        System.out.println(averageGrade + " - средний балл оценок по предметам");
        System.out.println(averagePercent + " - средний % по предметам");
        System.out.println();

        // 8. Расчет прибыли
        System.out.println("8. Расчет прибыли");
        int monthlyRent = 5000;
        int monthlyIncome = 15000;
        int monthlyExpense = 9000;
        int annualProfit = 12 * (monthlyIncome - monthlyExpense - monthlyRent);
        if (annualProfit > 0) {
            System.out.println("прибыль за год: +" + annualProfit + "р");
        }
        else {
            System.out.println("прибыль за год: " + annualProfit + "р");
        }
        System.out.println();

        // 9. Определение существования треугольника
        System.out.println("9. Определение существования треугольника");
        // Фигуры "треугольник" и "прямоугольный треугольник" имеют разные условия существования, у прямогольного они более жесткие (соответствие теореме Пифагора)
        // Судя по тексту задачи, речь идет о определении существования именно прямогоугольного треугольника, хотя и в тексте задачи это явно не отражено
        int a = 3;
        int b = 4;
        int c = 5;
        int hypotenuse;
        int cathetus1;
        int cathetus2;
        if ((a * a == b * b + c * c) || (b * b == a * a + c * c) || (c * c == a * a + b * b)) {
            if (a * a == b * b + c * c) {
                hypotenuse = a;
                cathetus1 = b;
                cathetus2 = c;
            } else if (b * b == a * a + c * c) {
                hypotenuse = b;
                cathetus1 = a;
                cathetus2 = c;
            } else {
                hypotenuse = c;
                cathetus1 = a;
                cathetus2 = b;
            }
            int area = (cathetus1 * cathetus2) / 2;
            System.out.println("Гипотенуза: " + hypotenuse);
            System.out.println("Катет №1: " + cathetus1);
            System.out.println("Катет №2: " + cathetus2);
            System.out.println("Площаль: " + area);
            System.out.println("|\\");
            System.out.println("| \\");
            System.out.println("|  \\");
            System.out.println("|   \\");
            System.out.println("|____\\");
        } else {
            System.out.println("Прямоугольного треугольника с указанными длинами сторон не существует");
        }
        System.out.println();

        // 10. Подсчет количества банкнот
        System.out.println("10. Подсчет количества банкнот");
        int sum = 567;
        int amountOfBanknote50 = sum / 50;
        int amountOfBanknote10 = sum % 50 / 10;
        int amountOfBanknote1 = sum % 50 % 10;
        int reverseAmount = amountOfBanknote50 * 50 + amountOfBanknote10 * 10 + amountOfBanknote1;
        System.out.println("Банкноты номиналом 50 - " + amountOfBanknote50);
        System.out.println("Банкноты номиналом 10 - " + amountOfBanknote10);
        System.out.println("Банкноты номиналом 1 - " + amountOfBanknote1);
        System.out.println("Исходная сумма - " + reverseAmount);
    }
}