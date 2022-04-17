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
        int a = 123;
        int b = 323;
        if (a / 10 / 10 % 10 == b / 10 / 10 % 10) {
            System.out.println(a / 10 / 10 % 10);
        }
        if (a / 10 % 10 == b / 10 % 10) {
            System.out.println(a / 10 % 10);
        }
        if (a % 10 == b % 10) {
            System.out.println(a % 10);
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


    }
}