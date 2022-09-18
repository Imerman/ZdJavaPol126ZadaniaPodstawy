package pl.sdacademy.java.basic.exercises.day2;

public class Task5 {
    public static void main(String[] args) {

        String input = "Ala ma kota";
        char character = 'a';
        System.out.println("Quantity of " + character + " in " + input + " : " + countCharsInString(input, character));

    }
    private static int countCharsInString(String input, char character){
        if (StringValidator.isvalid(input) && input.contains(String.valueOf(character))){
            int counter =0;
            for (int i =input.indexOf(character); i < input.length(); i++){

                if (input.charAt(i) == character){
                    counter++;
                }
            }
            return counter;
        }

        return -1;
    }
}
