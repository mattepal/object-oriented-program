package mpaletti.exercises.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollatzSequence {
    public static List<Long> collatzSequence(long n){
        if(n<1) {
            return new ArrayList<>();
        }
        List<Long> sequence= new ArrayList<>(List.of(n));
        while(n!=1){
            if(n%2==0){
                n=n/2;
            }
            else {
                n=n*3+1;
            }
            sequence.add(n);
        }
        return sequence;
    }
}
