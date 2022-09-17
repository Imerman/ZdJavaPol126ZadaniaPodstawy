package pl.sdacademy.java.basic.exercises.day1;

public class Task6 {
    public static void main(String[] args) {
        printMultiplicationTable();
        printMultiplicationTable(6, 2, 5);

    }
    private static void printMultiplicationTable(){
        for (int i = 0; i <=4; i++){
            int result = 5 * 1;
            System.out.println("5x " + i + " = " + result);
        }
    }
        private static void printMultiplicationTable(int multiplier, int minMultiplicand, int maxMultiplicand){
        for (; minMultiplicand <= maxMultiplicand; minMultiplicand++){
            int result = multiplier * minMultiplicand;
            System.out.println(multiplier + "*" + minMultiplicand + " = " + result);
            }
        }
}

