package mpaletti.exercises.oop.phonebook;

public interface PhoneBook {
    boolean addPerson(person p);
    boolean removePerson(person p);
    person[] searchByLastname(String lastname);
    person[] searchByNameAndLastname(String name,String lastname);

}
