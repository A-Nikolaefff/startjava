public class Calculator {
        private int number1;
        private int number2;
        private char sign;

        public void setNumber1(int number1) {
            this.number1 = number1;
        }

        public void setNumber2(int number2) {
            this.number2 = number2;
        }

        public void setSign(char sign) {
            this.sign = sign;
        }

        public String calculate() {
            int result;
            switch (sign) {
            case ('+'):
                result = number1 + number2;
                break;
            case ('-'):
                result = number1 - number2;
                break;
            case ('*'):
                result = number1 * number2;
            break;
            case ('/'):
                result = number1 / number2;
            break;
            case ('%'):
                result = number1 % number2;
            break;
            case ('^'):
                if (number2 == 0) {
                    result = 1;
                } else {
                    result = number1;
                    for (int i = 1; i < number2; i++) {
                    result *= number1;
                    }
                }
            break;
            default:
                return "Ошибка: неверный знак математической операции";
            }
            return number1 + " " + sign + " " + number2 + " = " + result;
        }  
}