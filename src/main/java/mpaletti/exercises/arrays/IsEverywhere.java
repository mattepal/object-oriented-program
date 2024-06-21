package mpaletti.exercises.arrays;

public class IsEverywhere {
    public static boolean isEverywhere(int[] v, int value){
        boolean check=true;
        for(int i=0;i<v.length-1;i++){
            if(v[i]!=value && v[i+1]!=value){
                check=false;
                return check;
            }
        }
        return check;
    }
}
