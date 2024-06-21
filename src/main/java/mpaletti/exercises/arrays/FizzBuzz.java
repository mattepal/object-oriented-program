package mpaletti.exercises.arrays;


public class FizzBuzz {
    public static String[] fizzBuzz(int start, int end){
        String[] ret=new String[end-start];
        int pnt=0;
        for(int i=start;i<end;i++){
            if(i%3==0 && i%5==0){
                ret[pnt]="FizzBuzz";
            } else if (i%3==0) {
                ret[pnt]="Fizz";
            } else if (i%5==0) {
                ret[pnt]="Buzz";
            }
            else{
                ret[pnt]=Integer.toString(i);
            }
            pnt+=1;
        }
        return ret;
    }
}
