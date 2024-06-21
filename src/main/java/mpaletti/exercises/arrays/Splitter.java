package mpaletti.exercises.arrays;

public class Splitter {
    public static int[] splitter(int input){
        String stringNumber = Integer.toString(input);
        int[] ret= new  int[stringNumber.length()];
        for(int i=stringNumber.length()-1;i>=0;i--){
            ret[i]=input%10;
            input=input/10;
        }
        return ret;
    }
}
