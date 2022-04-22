public class IfElseStatementTheme {
    public static void main(String[] args) {
        // 1. Перевод псевдокода на язык Java
        System.out.println("1. Перевод псевдокода на язык Java");
        int age = 26;
        if (age > 20) {
            System.out.println("Возраст больше 20");
        } else {
            System.out.println("Возраст меньше или равен 20");
        }
        boolean male = false;
        if (!male) {
            System.out.println("Пол женский");
        }
        int height = 165;
        if (height < 180) {
            System.out.println("Рост меньше 180см");
        } else {
            System.out.println("Рост больше или равен 180см");
        }
        String name = "Anastasia";
        char firstLetterOfName = name.charAt(0);
        if (firstLetterOfName == 'M') {
            System.out.println("Имя начинается с буквы M");
        } else if (firstLetterOfName == 'I') {
            System.out.println("Имя начинается с буквы I");
        } else {
            System.out.println("Имя начинается не с букв I или M");
        }

        // 2. Поиск максимального и минимального числа
        System.out.println("\n2. Поиск максимального и минимального числа");
        int number1 = 15;
        int number2 = 30;
        if (number1 > number2) {
            System.out.println("Максимальное число: " + number1);
        } else if (number1 < number2) {
            System.out.println("Максимальное число: " + number2);
        } else {
            System.out.println("Числа равны");
        }

        // 3. Работа с числом
        System.out.println("\n3. Работа с числом");
        number1 = 4;
        System.out.print("Число " + number1 + " - ");
        if (number1 == 0) {
            System.out.print("является нулем");
        } else {
            if (number1 % 2 == 0) {
                System.out.print("четное, ");
            } else {
                System.out.print("нечетное, ");
            }
            if (number1 > 0) {
                System.out.println("положительное");
            } else {
                System.out.println("отрицательное");
            }
        }

        // 4. Поиск одинаковых цифр в числах
        System.out.println("\n4. Поиск одинаковых цифр в числах");
        number1 = 123;
        number2 = 323;
        int digit1;
        int digit2;
        int digit3;
        if ((digit1 = number1 / 100) == number2 / 100) {
            System.out.println("Цифры в первом разряде обоих чисел совпадают. Совпадающая цифра: " + digit1);
        }
        if ((digit2 = number1 / 10 % 10) == number2 / 10 % 10) {
            System.out.println("Цифры во втором разряде обоих чисел совпадают. Совпадающая цифра: " + digit2);
        }
        if ((digit3 = number1 % 10) == number2 % 10) {
            System.out.println("Цифры в третьем разряде обоих чисел совпадают. Совпадающая цифра: " + digit3);
        }

        // 5. Определение буквы, числа или символа по их коду
        System.out.println("\n5. Определение буквы, числа или символа по их коду");
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

        // 6. Определение суммы вклада и начисленных банком %
        System.out.println("\n6. Определение суммы вклада и начисленных банком %");
        int depositAmount = 300000;
        double interestRate;
        if (depositAmount < 100000) {
            interestRate = 5;
        } else if (depositAmount <= 300000) {
            interestRate = 7;
        } else {
            interestRate = 10;
        }
        int interest = (int) (interestRate / 100.0 * depositAmount);
        int depositAmountWithInterest = depositAmount + interest;
        System.out.println("Начисленный процент: " + interest + "\nСумма вклада: " + depositAmount + "\nИтоговая сумма с процентами: " + depositAmountWithInterest);

        // 7. Определение оценки по предметам
        System.out.println("\n7. Определение оценки по предметам");
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
        System.out.println("Оценка по истории: " + gradeInHistory + "\nОценка по программированию: " + gradeInProgramming + "\nСредний балл оценок по всем предметам: " + averageGrade + "\nСредний процент по всем предметам: " + averagePercent);

        // 8. Расчет прибыли
        System.out.println("\n8. Расчет прибыли");
        int monthlyRent = 5000;
        int monthlyIncome = 15000;
        int monthlyExpense = 9000;
        int annualProfit = (monthlyIncome - monthlyExpense - monthlyRent) * 12;
        if (annualProfit > 0) {
            System.out.println("Прибыль за год: +" + annualProfit + "руб.");
        } else {
            System.out.println("Прибыль за год: " + annualProfit + "руб.");
        }

        // 9. Определение существования треугольника
        System.out.println("\n9. Определение существования треугольника");
        int a = 3;
        int b = 4;
        int c = 5;
        int hypotenuse = a;
        int cathetus1 = b;
        int cathetus2 = c;
        if (a + b > c || a + c > b || b + c > a) {
            if (a * a == b * b + c * c) {
                // переприсваивания не требуются
            } else if (b * b == a * a + c * c) {
                hypotenuse = b;
                cathetus1 = a;
            } else {
                hypotenuse = c;
                cathetus2 = a;
            }
            int area = (cathetus1 * cathetus2) / 2;
            System.out.println("Гипотенуза: " + hypotenuse + "\nКатет №1: " + cathetus1 + "\nКатет №2: " + cathetus2 + "\nПлощадь: " + area + "\n|\\\n| \\\n|  \\\n|___\\");
        } else {
            System.out.println("Прямоугольного треугольника с указанными длинами сторон не существует");
        }

        // 10. Подсчет количества банкнот
        System.out.println("\n10. Подсчет количества банкнот");
        int sum = 567;
        int amountOfBanknote50 = sum / 50;
        int amountOfBanknote10 = sum % 50 / 10;
        int amountOfBanknote1 = sum % 50;
        int reverseAmount = amountOfBanknote50 * 50 + amountOfBanknote10 * 10 + amountOfBanknote1;
        System.out.println("Банкноты номиналом 50 - " + amountOfBanknote50 + "\nБанкноты номиналом 10 - " + amountOfBanknote10 + "\nБанкноты номиналом 1 - " + amountOfBanknote1 +"\nИсходная сумма - " + reverseAmount);
    }
}