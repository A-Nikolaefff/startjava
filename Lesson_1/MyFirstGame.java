public class MyFirstGame {
    public static void main(String[] args) {
        int targetNumber = 67;
        int startRange = 1;
        int endRange = 100;
        int attempt = (startRange + endRange) / 2;
        while (attempt != targetNumber) {
            if (attempt < targetNumber) {
                System.out.println("Число " + attempt + " меньше того, что загадал компьютер");
                startRange = attempt;
            } else {
                System.out.println("Число " + attempt + " больше того, что загадал компьютер");
                endRange = attempt;
            }
            attempt = (startRange + endRange) / 2;
        }
        System.out.println(attempt + " - 'это верный ответ! Вы победили!");
    }
}