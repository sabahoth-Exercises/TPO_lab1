package task3;

import java.util.Objects;

public class Contact extends Human{
    private final String phoneNumber;

    public Contact( String name, String phoneNumber,String invited,  String type) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.invited = invited;
        this.type = type;
    }

  /* public String getName() {
        return name;
    }*/

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contact contact = (Contact) o;
        return Objects.equals(phoneNumber, contact.phoneNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(phoneNumber);
    }

    @Override
    public String toString()
    {
        return "\nPerson info:\n\t" +
                "Name:" + name + "\n\t"+
                "Phone number:" + phoneNumber + "\n"+
                "This person " + this.invited + " cause this one is " + this.type;
    }
}
