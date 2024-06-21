package mpaletti.exercises.arrays;

public class Fibonacci {
    public static long[] fibonacci(int n){
        long[] ret=new long[n];
        for(int i=0;i<n;i++){
            if(i==0){
               ret[i]=i;
            } else if (i==1) {
                ret[i]=i;
            } else{
                ret[i]=ret[i-2]+ret[i-1];
            }
        }
        return ret;
    }
}
