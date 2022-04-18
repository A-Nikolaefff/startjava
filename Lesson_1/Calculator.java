public class Calculator {
    public static void main(String[] args) {
        int a = 8;
        int b = 2;
        char sign = '^';
        int result = 0;
        if (sign == '+') {
            result = a + b;
        } else if (sign == '-') {
            result = a - b;
        } else if (sign == '*') {
            result = a * b;
        } else if (sign == '/') {
            result = a / b;
        } else if (sign == '%') {
            result = a % b;
        } else if (sign == '^') {
            if (b == 0) {
                result = 1;
            } else {
                result = a;
                for (int i = 1; i < b; i++) {
                    result *= a;
                }
            }
        }
        System.out.println(a + " " + sign + " " + b + " = " + result);
    }
}