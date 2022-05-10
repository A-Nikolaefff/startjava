package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class GuessNumber {
    private static Scanner scanner = new Scanner(System.in);
    private Player[] players;
    private Random random = new Random();
    private int targetNumber;

    public GuessNumber(Player[] players) {
        this.players = Arrays.copyOf(players, players.length);
    }

    public void play() {
        for (int i = 0; i < 3; i++) {
            System.out.println("Начинается игровая сессия №" + (i + 1));
            for (Player player : players) {
                player.clearAttempts();
            }
            targetNumber = random.nextInt(100) + 1;
            castLots();
            makeMoves();
            for (Player player : players) {
                String attempts = Arrays.toString(Arrays.copyOf(player.getAttempts(), player.getCountOfAttempts()));
                System.out.println("Попытки игрока " + player.getName() + ": " +
                        attempts.replaceAll("[\\[\\]]", ""));
            }
        }
        determineWinner();
    }

    private void castLots() {
        System.out.println("Бросаем жребий...");
        for (int i = 0; i < players.length; i++) {
            int index = random.nextInt(i + 1);
            Player temp = players[index];
            players[index] = players[i];
            players[i] = temp;
        }
        System.out.println("Порядок хода игроков:\nПервый - " + players[0].getName() +
                "\nВторой - " + players[1].getName() + "\nТретий - " + players[2].getName());
    }

    private void makeMoves() {
        int numberOfActivePlayers = players.length;
        while (numberOfActivePlayers != 0) {
            for (Player player : players) {
                System.out.print("Игрок " + player.getName() + ", введите число: ");
                player.addAttempt(scanner.nextInt());
                if (checkAttempt(player)) {
                    System.out.println("Игрок " + player.getName() + " победил в текущей игровой сессии!");
                    player.incrementCountOfWins();
                    return;
                } else if (player.getCountOfAttempts() == 10) {
                    numberOfActivePlayers--;
                    System.out.println("У игрока " + player.getName() + " закончились попытки.");
                }
                if (numberOfActivePlayers == 0) {
                    System.out.println("У всех игроков закончились попытки.");
                    return;
                }
            }
        }
    }

    private boolean checkAttempt(Player player) {
        int number = player.getLastAttempt();
        if (number == targetNumber) {
            return true;
        }
        String message = player.getLastAttempt() < targetNumber ? " меньше" : " больше";
        System.out.println("Число " + number + message + " того, что загадал компьютер");
        return false;
    }

    private void determineWinner() {
        // Определение максимального числа побед среди игроков
        int maxCountOfWins = 0;
        for (Player player : players) {
            if (player.getCountOfWins() > maxCountOfWins) {
                maxCountOfWins = player.getCountOfWins();
            }
        }
        // Создание и заполнение массива победителей
        Player[] winners = new Player[players.length];
        int countOfWinners = 0;
        for (int i = 0; i < players.length; i++) {
            if (players[i].getCountOfWins() == maxCountOfWins) {
                winners[countOfWinners++] = players[i];
            }
        }
        if (countOfWinners == 1) {
            System.out.println("Игрок " + winners[0].getName() + " - победитель по результатам трёх игр!");
        } else {
            System.out.print("Ничья. У игроков ");
            for (int i = 0; i < winners.length; i++) {
                System.out.print(winners[i].getName());
                if (i != winners.length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println(" равное число побед.");
        }
    }
}


