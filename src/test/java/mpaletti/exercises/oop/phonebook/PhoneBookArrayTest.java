package mpaletti.exercises.oop.phonebook;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PhoneBookArrayTest extends PhoneBookTestBase {
    @BeforeEach
    void setUp() {
        pb = new PhoneBookArray();
        pb.addPerson(new person("Nicola", "Bicocchi", "34567"));
        pb.addPerson(new person("Marco", "Rizzo", "45243"));
        pb.addPerson(new person("Luisa", "Poppi", "24564"));
    }
}