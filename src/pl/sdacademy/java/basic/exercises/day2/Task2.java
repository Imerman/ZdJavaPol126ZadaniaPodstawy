package pl.sdacademy.java.basic.exercises.day2;

public class Task2 {
    public static void main(String[] args) {
        String input = "programowanie";
        String prefix = "pro";
        System.out.println("Prefix: " +prefix);
        System.out.println("Result: " + ifWordContainPrefix(input, prefix));

        prefix = "ala";
        System.out.println("Prefix: " +prefix);
        System.out.println("Result: " + ifWordContainPrefix(input, prefix));

    }
    private static boolean ifWordContainPrefix(String input, String prefix){
        if (StringValidator.isvalid(input)) {
            return input.startsWith(prefix);
        }
        return false;
    }

    private static boolean ifWordContainSuffix(String input, String suffix){
        if (StringValidator.isvalid(input)) {
            return input.endsWith(suffix);
        }
        return false;
    }
}
