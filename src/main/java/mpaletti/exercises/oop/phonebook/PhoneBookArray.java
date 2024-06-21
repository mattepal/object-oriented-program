package mpaletti.exercises.oop.phonebook;

import java.util.Arrays;

public class PhoneBookArray implements  PhoneBook{
    static final int MAX_PERSONS=256;
    person[] phonebook;
    public PhoneBookArray() {
        this.phonebook = new person[MAX_PERSONS];
    }


    @Override
    public boolean addPerson(person p) {
        for (int i=0;i<MAX_PERSONS;i++){
            if( phonebook[i]!=null && phonebook[i].equals(p) ){
                return false;
            }
        }
        for (int i=0;i<MAX_PERSONS;i++){
            if(phonebook[i]==null){
                phonebook[i]=p;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean removePerson(person p) {
        for(int i=0;i<MAX_PERSONS;i++){
            if(phonebook[i]!=null) {
                if (phonebook[i].equals(p)) {
                    phonebook[i] = null;
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public person[] searchByLastname(String lastname) {
        person[] ret=new person[MAX_PERSONS];
        int cnt=0;
        for (int i=0;i<MAX_PERSONS;i++){
            if(phonebook[i]!=null){
                if(phonebook[i].lastname.equals(lastname)){
                    ret[cnt]=phonebook[i];
                    cnt++;
                }
            }
        }
        return Arrays.copyOf(ret,cnt);
    }

    @Override
    public person[] searchByNameAndLastname(String name, String lastname) {
        person[] ret=new person[MAX_PERSONS];
        int cnt=0;
        for (int i=0;i<MAX_PERSONS;i++){
            if(phonebook[i]!=null){
                if(phonebook[i].lastname.equals(lastname) && phonebook[i].name.equals(name)){
                    ret[cnt]=phonebook[i];
                    cnt++;
                }
            }
        }
        return Arrays.copyOf(ret,cnt);
    }
}
