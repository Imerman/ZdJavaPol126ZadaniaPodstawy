package pl.sdacademy.java.basic.exercises.day2;

public class Task15 {
    public static void main(String[] args) {
        String[] firstArray = {"Ala", "ma", "kota"};
        String[] secondArray = {"Ala", "maa", "kota"};
        System.out.println(areEqual(firstArray, secondArray));
    }

    private static boolean areEqual (String[] firstArray,String[] secondArray){

        if(firstArray.length == secondArray.length){
            for(int i =0; i < firstArray.length; i++){
                String elementFromFirstArray = firstArray[i];
                String elementFromSecondArray = secondArray[i];
                if (elementFromFirstArray == null && elementFromSecondArray == null){
                    continue;
                }
//                if(!elementFromFirstArray.equals(elementFromSecondArray)){
                if (elementFromFirstArray == null || (!elementFromFirstArray.equals(elementFromSecondArray))){
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}


