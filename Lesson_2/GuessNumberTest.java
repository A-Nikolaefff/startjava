import java.util.Scanner;

public class GuessNumberTest {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in, "Cp866");
        System.out.print("Введите имя игрока №1: ");
        String player1Name = scanner.nextLine();
        System.out.print("Введите имя игрока №2: ");
        String player2Name = scanner.nextLine();
        Player player1 = new Player(player1Name);
        Player player2 = new Player(player2Name);
        GuessNumber guessnumber = new GuessNumber(player1, player2);
        while (true) {
            guessnumber.play();
            if (!isContinued()) {
                break;
            } 
        }
    }
        private static boolean isContinued() {
        while (true) {
            System.out.print("Хотите продолжить игру? [yes/no]: ");
            String answer = scanner.nextLine();
            if (answer.equals("no")) {
                return false;
            } else if (answer.equals("yes")) {
                return true;
            } else {
            System.out.println("Вы ввели неверный ответ.");
            }
        }
    }
}