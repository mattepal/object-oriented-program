package mpaletti.exercises.oop.reverse;

import java.util.Arrays;

public class ReverserSlow implements Reverser {

    @Override
    public String reverse(String s) {
        char[] ret=new char[s.length()];
        for(int i=0;i<s.length();i++){
            ret[s.length()-1-i] = s.charAt(i);
        }
        return String.valueOf(ret);
    }
}
