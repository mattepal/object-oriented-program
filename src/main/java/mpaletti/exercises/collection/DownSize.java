package mpaletti.exercises.collection;

import java.util.*;
public class DownSize {
    public static void downsize(List<String> list, int n){
    for(  int index=1;index<= list.size();index++) {
        if(index%n==0){
            list.remove(index);
        }
    }
    }

}
