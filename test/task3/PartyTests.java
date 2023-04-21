package task3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PartyTests {

    @Test
    void testAddContact() {
        Party party = new Party();
        Contact c1 = new Contact("John", "885-1234","got an invitation", "Funny");
        party.addContact(c1);
        assertTrue(party.getContacts().contains(c1));
    }

    @Test
    void testRemoveContact() {
        Party party = new Party();
        Contact c1 = new Contact("John", "885-1234","got an invitation", "Funny");
        party.addContact(c1);
        party.removeContact(c1);
        assertFalse(party.getContacts().contains(c1));
    }
}