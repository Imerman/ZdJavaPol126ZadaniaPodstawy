package pl.sdacademy.java.basic.exercises.day2;

public class Task1 {
    private static final char DEFAULT_CHAR = '\u0000';

    public static void main(String[] args) {
        String input = "ala";
        System.out.println("Original word: " +input);
        System.out.println("Last char: " + getLastCharacter(input));

        input = "domek";
        System.out.println("Original word: " +input);
        System.out.println("Last char: " + getLastCharacter(input));

        input = " ";
        System.out.println("Original word: " +input);
        System.out.println("Last char: " + getLastCharacter(input));

    }

    private static char getLastCharacter(String input){
        if (input != null && !input.isBlank()) {

            String trimmedText = input.trim();
            int lastIndex = trimmedText.length() - 1;
            return trimmedText.charAt(lastIndex);
        }
        return DEFAULT_CHAR;
    }
}
