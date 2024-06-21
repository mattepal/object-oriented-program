package mpaletti.exercises.oop.phonebook;

import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class PhoneBookListTest extends PhoneBookTestBase {
    @BeforeEach
    void setUp() {
        pb = new PhoneBookList();
        pb.addPerson(new person("Nicola", "Bicocchi", "34567"));
        pb.addPerson(new person("Marco", "Rizzo", "45243"));
        pb.addPerson(new person("Luisa", "Poppi", "24564"));
    }
}