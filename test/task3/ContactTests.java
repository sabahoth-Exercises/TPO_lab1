package task3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class ContactTests {

    @Test
    void testEqualsTrue() {
        Contact c1 = new Contact("John", "555-1234","didn't get an invitation","Strange");
        Contact c2 = new Contact("John", "555-1234","didn't get an invitation","Strange");
        assertTrue(c1.equals(c2));
    }

    @Test
    void testEqualsFalse() {
        Contact c1 = new Contact("John", "555-1234", "didn't get an invitation", "Strange");
        Contact c2 = new Contact("Jane", "555-4321"," got an invitation", "Funny");
        assertFalse(c1.equals(c2));
    }
}

