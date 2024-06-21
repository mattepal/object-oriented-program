package mpaletti.exercises.oop.phonebook;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

abstract class PhoneBookTestBase {
    PhoneBook pb;

    @Test
    void addPerson() {
        assertTrue(pb.addPerson(new person("Mario", "Rossi", "12345")));
        assertFalse(pb.addPerson(new person("Mario", "Rossi", "12345")));
        assertArrayEquals(new person[]{new person("Mario", "Rossi", "12345")}, pb.searchByLastname("Rossi"));
    }

    @Test
    void removePerson() {
        assertTrue(pb.removePerson(new person("Marco", "Rizzo", "45243")));
        assertFalse(pb.removePerson(new person("Marco", "Rizzo", "45243")));
        assertArrayEquals(new person[]{}, pb.searchByLastname("Rizzo"));
    }

    @Test
    void searchByLastname() {
        assertArrayEquals(new person[]{new person("Nicola", "Bicocchi", "34567")}, pb.searchByLastname("Bicocchi"));
        assertArrayEquals(new person[]{}, pb.searchByLastname("Manzoni"));
    }

    @Test
    void searchByNameAndLastname() {
        assertArrayEquals(new person[]{new person("Nicola", "Bicocchi", "34567")},
                pb.searchByNameAndLastname("Nicola", "Bicocchi"));
        pb.addPerson(new person("Nicola", "Bicocchi", "12346"));
        assertArrayEquals(new person[]{new person("Nicola", "Bicocchi", "34567"), new person("Nicola", "Bicocchi", "12346")},
                pb.searchByNameAndLastname("Nicola", "Bicocchi"));
        assertArrayEquals(new person[]{}, pb.searchByNameAndLastname("Alessandro", "Manzoni"));
    }

}