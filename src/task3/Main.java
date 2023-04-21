package task3;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Human inv = new Human("Arthur", "got an invitation","Funny",true);
        Contact arthur = new Contact("Arthur", "555-1234","got an invitation","Funny");
        Contact niceGirl = new Contact( "Nice Girl","555-1234","got an invitation","Funny");
        Contact uninvitedMan = new Contact( "uninvitedMan","555-4321","didn't get an invitation","Strange");
        System.out.println(arthur);
        System.out.println(niceGirl);
        System.out.println(uninvitedMan);
        Party party = new Party();
        party.addContact(arthur);
        party.addContact(niceGirl);
        party.addContact(uninvitedMan);

        List<Contact> partyContacts = party.getContacts();
        for (Contact contact : partyContacts) {
            if (!contact.equals(arthur)) {
                System.out.println(arthur.getName() + " failed against " + contact.getName());
            }
        }
    }
}
