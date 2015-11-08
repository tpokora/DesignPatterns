package designpatterns.nullobject;

import java.util.ArrayList;

/**
 * Created by Tomek on 2015-11-08.
 */
public class NullObjectPattern {
    public static void main(String[] args) {
        // Same persons name list as in PersonFactory
        // but additional one person to see NullPersonObject
        final String[] names = { "Tom", "Bob", "Kate", "John" };

        ArrayList<AbstractPerson> persons = new ArrayList<AbstractPerson>();

        for (String name : names) {
            persons.add(PersonFactory.getPerson(name));
        }

        System.out.println("Persons:");
        for (AbstractPerson person : persons) {
            System.out.println(person.getName());
        }
    }
}
