package com.startjava.lesson_2_3.guess;
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
        int number;
        while (true) {
            System.out.print("Игрок " + player1.getName() + ", введите число: ");
            player1.setAttempt(scanner.nextInt());
            number = player1.getAttempt();
            if (number == targetNumber) {
                System.out.println("Игрок " + player1.getName() + " выиграл!");
                break;
            } else if (player1.getAttempt() < targetNumber) {
                System.out.println("Число " + number + " меньше того, что загадал компьютер");
            } else {
                System.out.println("Число " + number  + " больше того, что загадал компьютер");
            }

            System.out.print("Игрок " + player2.getName() + ", введите число: ");
            player2.setAttempt(scanner.nextInt());
            number = player2.getAttempt();
            if (number == targetNumber) {
                System.out.println("Игрок " + player2.getName() + " выиграл!");
                break;
            } else if (player2.getAttempt() < targetNumber) {
                System.out.println("Число " + number + " меньше того, что загадал компьютер");
            } else {
                System.out.println("Число " + number  + " больше того, что загадал компьютер");
            }
        }
    }
}


