package examples.pltw.org.collegeapp;

/**
 * Created by jsboygenius on 1/30/18.
 */

public class Sibling extends FamilyMember {
    public String toString()
    {
        return String.format("Sibling: %s %s", getFirstName(), getLastName());
    }

    public Sibling(String firstName, String lastName) {
        super(firstName, lastName);
    }

}
