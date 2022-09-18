package pl.sdacademy.java.basic.exercises.day2;

import java.util.Scanner;

public class Task11 {



    public static void main(String[] args) {
       String input = "kajak";
        System.out.println("Input: " + input);
        System.out.println("Result: " + isPalindrome(input));

        input = "java";
        System.out.println("Input: " + input);
        System.out.println("Result: " + isPalindrome(input));

    }

    private static boolean isPalindrome(String input){
        if (StringValidator.isvalid(input)){
            String reversedInput = new StringBuilder(input)
                    .reverse()
                    .toString();
            return input.equalsIgnoreCase(reversedInput);
        }
        return false;
    }

}
