package pl.sdacademy.java.basic.exercises.day1;

import java.util.Scanner;

public class Task4 {
    public static final float MaxBMI = 18.5F;
    public static final float MinBMI = 24.9F;
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        float mass = getMass();
        float height = getHeight();
        float bmi = calculateBMI(mass, height);
        System.out.println("Your BMI: " + calculateBMI(mass, height) );
        displayBMIresult(bmi);

    }

    private static float getMass(){

        System.out.println("Type your body mass: ");
        return scanner.nextFloat();
    }

    private static float getHeight(){

        System.out.println("Type your body mass: ");
        return scanner.nextFloat();
    }
    private static float calculateBMI(float mass, float height){
        float heightInmeter = height / 100F;
        return mass / (heightInmeter * heightInmeter);
    }
    private static void displayBMIresult (float bmi){
        if (bmi > MinBMI || bmi < MaxBMI){
            System.out.println("BMI Correct");
                    } else {
            System.out.println("BMI Incorrect");
        }
    }
}
