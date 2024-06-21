package mpaletti.exercises.arrays;

import java.util.Arrays;

public class MoveZeroEnd {
    public static int[] moveZerosEnd(int[] v){
        int[] zeroEnd= new int[v.length];
        Arrays.fill(zeroEnd,0);
        int cnt=0;
        for (int i=0;i<v.length;i++){
            if(v[i]!=0){
             zeroEnd[cnt]=v[i];
             cnt+=1;
            }
        }
        return zeroEnd;
    }
}
