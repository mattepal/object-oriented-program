package mpaletti.exercises.oop.basic;

public class ClickCounter {
    int value;

    public ClickCounter(){
        value=0;
    }
    /**
    *return the corrent value
     */
    public int getValue(){
        return value;
    }
    /**
    *increment value
     */
    public void click(){
        value+=1;
    }
    /**
    *decrement value
     */
    public void undo(){
//        if(value>0){
//            value-=1;
//        }
        value=Math.max(value-1,0);
    }
    /**
    *reset value
     */
    public void reset(){
        value=0;
    }
}
