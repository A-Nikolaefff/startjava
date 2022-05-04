import java.util.Scanner;

public class GuessNumberTest {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in, "Cp866");
        System.out.print("Введите имя игрока №1: ");
        Player player1 = new Player(scanner.nextLine());
        System.out.print("Введите имя игрока №2: ");
        Player player2 = new Player(scanner.nextLine());
        GuessNumber guessNumber = new GuessNumber(player1, player2);
        do {
            guessNumber.play();
        } while (isNext());
    }

    private static boolean isNext() {
        String answer;
        do {
            System.out.print("Хотите продолжить игру? [yes/no]: ");
            answer = scanner.nextLine();
            if (answer.equals("no") || answer.equals("yes")) {
                break;
            } 
            System.out.println("Вы ввели неверный ответ.");
        } while (!answer.equals("no") && !answer.equals("yes"));
        return answer.equals("yes");
    }
}