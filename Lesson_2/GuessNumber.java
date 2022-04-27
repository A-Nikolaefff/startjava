import java.util.Scanner;
import java.util.Random;

public class GuessNumber {
    private Player player1;
    private Player player2;
    private Random random = new Random();

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void play() {
        int targetNumber = random.nextInt(100) + 1;
        Scanner scanner = new Scanner(System.in, "Cp866");
        boolean winnerIsExist = false;
        int attemptOfPlayer1;
        while (!winnerIsExist) {
            System.out.print("Игрок " + player1.getName() + ", введите число: ");
            player1.setAttempt(scanner.nextInt());
            if (player1.getAttempt() == targetNumber) {
                winnerIsExist = true;
                System.out.println("Игрок " + player1.getName() + " выиграл!");
                break;
            } else if (player1.getAttempt() < targetNumber) {
                System.out.println("Число " + player1.getAttempt() + " меньше того, что загадал компьютер");
            } else {
                System.out.println("Число " + player1.getAttempt()  + " больше того, что загадал компьютер");
            }
            System.out.print("Игрок " + player2.getName() + ", введите число: ");
            player2.setAttempt(scanner.nextInt());
            if (player2.getAttempt() == targetNumber) {
                winnerIsExist = true;
                System.out.println("Игрок " + player2.getName() + " выиграл!");
                break;
            } else if (player2.getAttempt() < targetNumber) {
                System.out.println("Число " + player2.getAttempt() + " меньше того, что загадал компьютер");
            } else {
                System.out.println("Число " + player2.getAttempt()  + " больше того, что загадал компьютер");
            }
        }
    }
}


