package com.startjava.lesson_2_3_4.guess;
import java.util.Arrays;

public class Player {
    private String name;
    private int attempt;
    private int[] attempts = new int[10];
    private int countOfAttempts = 0;
    private int countOfWins = 0;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAttempt() {
        return attempt;
    }

    public void setAttempt(int attempt) {
        this.attempt = attempt;
        if (attempt > 0 && attempt <= 100) {
            attempts[countOfAttempts] = attempt;
            countOfAttempts++;
        }
    }

    public int getCountOfAttempts() {
        return countOfAttempts;
    }

    public int getCountOfWins() {
        return countOfWins;
    }

    public void incrementCountOfWins() {
        this.countOfWins = ++countOfWins;
    }

    public void printAttempts() {
        System.out.println("Попытки игрока " + getName() + ": " + Arrays.toString(Arrays.copyOf(attempts, countOfAttempts)).replaceAll("[\\[\\]]", ""));
    }

    public void clearAttempts() {
        if (countOfAttempts != 0) {
            Arrays.fill(attempts, 0, countOfAttempts, 0);
            countOfAttempts = 0;
        }
    }
}