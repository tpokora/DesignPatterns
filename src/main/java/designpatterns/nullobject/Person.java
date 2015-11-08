package designpatterns.nullobject;

/**
 * Created by Tomek on 2015-11-08.
 */
public class Person extends AbstractPerson {
    public Person(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
