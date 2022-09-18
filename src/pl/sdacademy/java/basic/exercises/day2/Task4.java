package pl.sdacademy.java.basic.exercises.day2;

public class Task4 {
    private static final String REPLACEMENT = "-STOP-";
    private static final String REGEX = "[.,]";

    public static void main(String[] args) {

    }
    private static String replaceDotsAndCommas (String input){
        if(StringValidator.isvalid(int)){
//            return input
//                    .replace(".", REPLACEMENT)
//                    .replace(",", REPLACEMENT);
            return input.replaceAll(REGEX, REPLACEMENT);

        }
    }
}
