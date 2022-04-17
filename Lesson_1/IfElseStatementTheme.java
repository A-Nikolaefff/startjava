public class IfElseStatementTheme {
    public static void main(String[] args) {
        // 1. ������� ���������� �� ���� Java
        System.out.println("1. ������� ���������� �� ���� Java");
        int age = 26;
        int height = 165;
        boolean male = false;
        String name = "Anastasia";
        if (age > 20) {
            System.out.println("������� ������ 20");
        } else {
            System.out.println("������� ������ ��� ����� 20");
        }

        if (!male) {
            System.out.println("��� �������");
        }

        char firstLetterOfName = name.charAt(0);
        if (firstLetterOfName == 'M') {
            System.out.println("��� ���������� � ����� M");
        } else if (firstLetterOfName == 'I') {
            System.out.println("��� ���������� � ����� I");
        } else {
            System.out.println("��� ���������� �� � ���� I ��� M");
        }
        System.out.println();

        // 2. ����� ������������� � ������������ �����
        System.out.println("2. ����� ������������� � ������������ �����");
        int number1 = 15;
        int number2 = 30;
        if (number1 > number2) {
            System.out.println("������������ ����� " + number1);
        } else if (number1 < number2) {
            System.out.println("������������ ����� " + number2);
        } else {
            System.out.println("����� �����");
        }
        System.out.println();

        // 3. ������ � ������
        System.out.println("3. ������ � ������");
        int number = 4;
        System.out.print("����� " + number + " - ");
        if (number == 0) {
            System.out.print("�������� �����");
        } else {
            if (number % 2 == 0) {
                System.out.print("������, ");
            } else {
                System.out.print("��������, ");
            }
            if (number > 0) {
                System.out.println("�������������");
            } else {
                System.out.println("�������������");
            }
        }
        System.out.println();

        // 4. ����� ���������� ���� � ������
        System.out.println("4. ����� ���������� ���� � ������");
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

        // 5. ����������� �����, ����� ��� ������� �� �� ����
        System.out.println("5. ����������� �����, ����� ��� ������� �� �� ����");
        char symbol = '\u005A'; 
        System.out.print(symbol + " - ");
        if (symbol > 64 && symbol < 91) {
            System.out.println("��������� �����");
        } else if (symbol > 96 && symbol < 123) {
            System.out.println("�������� �����");
        } else if (symbol > 47 && symbol < 58) {
            System.out.println("�����");
        } else {
            System.out.println("�� ����� � �� �����");
        }
        System.out.println();

        // 6. ����������� ����� ������ � ����������� ������ %
        System.out.println("6. ����������� ����� ������ � ����������� ������ %");
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
        System.out.println("����� ������: " + depositAmount);
        System.out.println("����������� �������: " + (int) (interestRate / 100 * depositAmount));
        System.out.println("�������� ����� � ����������: " + depositAmountWithInterest);
        System.out.println();

        // 7. ����������� ������ �� ���������
        System.out.println("7. ����������� ������ �� ���������");
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
        System.out.println(gradeInHistory + " - �������");
        System.out.println(gradeInProgramming + " - ����������������");
        System.out.println(averageGrade + " - ������� ���� ������ �� ���������");
        System.out.println(averagePercent + " - ������� % �� ���������");
        System.out.println();

        // 8. ������ �������
        System.out.println("8. ������ �������");
        int monthlyRent = 5000;
        int monthlyIncome = 15000;
        int monthlyExpense = 9000;
        int annualProfit = 12 * (monthlyIncome - monthlyExpense - monthlyRent);
        if (annualProfit > 0) {
            System.out.println("������� �� ���: +" + annualProfit + "�");
        }
        else {
            System.out.println("������� �� ���: " + annualProfit + "�");
        }
        System.out.println();


    }
}