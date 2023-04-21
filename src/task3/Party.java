package task3;

import java.util.ArrayList;
import java.util.List;

public class Party {
    private List<Contact> contacts;

    public Party() {
        contacts = new ArrayList<>();
    }

    public void addContact(Contact contact) {
        contacts.add(contact);
    }

    public void removeContact(Contact contact) {
        contacts.remove(contact);
    }

    public List<Contact> getContacts() {
        return contacts;
    }

}
