package pl.sdacademy.java.basic.exercises.day1;

import java.util.Scanner;

public class Task2 {
    private static final float PI = 3.14f;
    public static void main(String[] args) {
        float radius = getDiameterFromUser() / 2;
        System.out.println("radius value: " + radius);
        float circumference = calculateCircumferenceOfACircle(radius);
        float area = calculateAreaOfACircle(radius);
        System.out.println("Circumference: " + circumference);
        System.out.println("Area: " + area);

    }
    private static float getDiameterFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Insert Diameter: ");
//        float diameter = scanner.nextFloat();
//        return diameter;
        return scanner.nextFloat();
    }

    private static float calculateCircumferenceOfACircle (float radius){
//        2 * pi * r;
//        return 2 * PI * radius;
        return 2 * (float) Math.PI * radius;
    }

    private static float calculateAreaOfACircle(float radius){
//        return PI *radius * radius;
        return (float) ( Math.PI * Math.pow(radius, 2));
    }
}
