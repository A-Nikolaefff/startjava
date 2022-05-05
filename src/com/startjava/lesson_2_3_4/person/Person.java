package com.startjava.lesson_2_3_4.person;

public class Person {
    private boolean sex = true;
    private String name = "Jack";
    private int weight = 90;
    private int height = 185;
    private int age = 45;

    public void walk() {
        System.out.println(name + " is walking.");
    }

    public void run() {
        System.out.println(name + " is running.");
    }

    public void sit() {
        System.out.println(name + " is siting.");
    }

    public void speak() {
        System.out.println(name + " is speaking.");
    }

    public void learnJava() {
        System.out.println(name + " is learning Java.");
    }
}