package mpaletti.exercises.arrays;


import  java.util.random.RandomGenerator;
import java.util.Arrays;

public class FillArray {
    public static double[] fillArray(int size, double value, boolean addNoise){
        double[] dst=new double[size];
        Arrays.fill(dst,value);
        if(addNoise){
            RandomGenerator rand = RandomGenerator.getDefault();
            for(int i=0;i<dst.length;i++){
                dst[i]+=rand.nextDouble(-value*5/100,value*5/100);
            }
        }
        return dst;
    }
}