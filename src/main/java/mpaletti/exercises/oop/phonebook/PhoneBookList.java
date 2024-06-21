package mpaletti.exercises.oop.phonebook;

import java.util.ArrayList;
import java.util.Arrays;

public class PhoneBookList implements PhoneBook{
    static final int MAX_PERSONS=256;
    final ArrayList<person> phonebook;
    public PhoneBookList() {
        this.phonebook= new ArrayList<>();
    }

    @Override
    public boolean addPerson(person p) {
    if(phonebook.contains(p)){
        return false;
    }
    if(phonebook.size()<MAX_PERSONS){
        phonebook.add(p);
        return true;
    }
    return false;
    }

    @Override
    public boolean removePerson(person p) {
        return phonebook.remove(p);
    }

    @Override
    public person[] searchByLastname(String lastname) {
       person[] ret= new person[MAX_PERSONS];
       int cnt=0;
        for(person p:phonebook){
            if(p.getLastname().equals(lastname)){
                ret[cnt]=p;
                cnt++;
            }
        }
        return Arrays.copyOf(ret,cnt);
    }

    @Override
    public person[] searchByNameAndLastname(String name, String lastname) {
        person[] ret= new person[MAX_PERSONS];
        int cnt=0;
        for(person p:phonebook){
            if(p.getLastname().equals(lastname) && p.getName().equals(name)){
                ret[cnt]=p;
                cnt++;
            }
        }
        return Arrays.copyOf(ret,cnt);
    }
//    ArrayList
}
