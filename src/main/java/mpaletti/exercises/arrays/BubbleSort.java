package mpaletti.exercises.arrays;

import java.util.Arrays;

public class BubbleSort {
    public static int[] bubbleSortCopy(int[] v){
        int[] copy= Arrays.copyOf(v,v.length);
        bubbleSort(copy);
        return copy;
    }
    public static void bubbleSort(int[] v){
        boolean control=true;
        while(control){
            control=false;
            for (int i=0;i<v.length-1;i++){
                if(v[i]>v[i+1]){
                    control=true;
                    int tmp=v[i];
                    v[i]=v[i+1];
                    v[i+1]=tmp;
                }
            }
        }
    }
}
