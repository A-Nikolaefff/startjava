package com.startjava.lesson_2_3_4.robot;

public class JaegerTest {
    public static void main(String[] args) {
        Jaeger strikerEureka = new Jaeger("Striker Eureka", "Mark-5", "Australia", 76.2f, 1.85f, 10, 9, 10);
        Jaeger gipsyDanger = new Jaeger("Gipsy Danger", "Mark-3", "US", 79.25f, 1.98f, 8, 6, 7);
        strikerEureka.attack();
        gipsyDanger.defend();
        strikerEureka.move();
        gipsyDanger.move();
        gipsyDanger.attack();
        strikerEureka.defend();
        gipsyDanger.setStrength(11);
        gipsyDanger.setArmor(10);
        System.out.println("Текущее значение силы для " + gipsyDanger.getModelName() + " равно " + gipsyDanger.getStrength() + 
            "\nТекущее значение брони для " + gipsyDanger.getModelName() + " равно " + gipsyDanger.getArmor());
    }
}
