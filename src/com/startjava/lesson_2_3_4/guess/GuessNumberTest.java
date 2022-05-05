package com.startjava.lesson_2_3_4.guess;
import java.util.Scanner;

public class GuessNumberTest {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Игра состоит из трех игровых сессий. В каждой сессии у каждого игрока есть только 10 попыток.");
        Player[] players = new Player[3];
        for (int i = 0; i < players.length; i++) {
            System.out.print("Введите имя игрока №" + (i + 1) + ": ");
            players[i] = new Player(scanner.nextLine());
        }
        GuessNumber guessNumber = new GuessNumber(players);
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