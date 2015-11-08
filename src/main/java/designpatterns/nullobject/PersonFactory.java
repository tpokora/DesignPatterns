package designpatterns.nullobject;

/**
 * Created by Tomek on 2015-11-08.
 */
public class PersonFactory {

    public static final String[] persons = { "Tom", "Bob", "Kate" };

    public static AbstractPerson getPerson(String name) {
        for (int i = 0; i < persons.length; i++) {
            if (persons[i].equalsIgnoreCase(name)) {
                return new Person(name);
            }
        }

        // return null
        return new NullPerson();
    }
}
