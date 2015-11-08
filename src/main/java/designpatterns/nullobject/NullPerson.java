package designpatterns.nullobject;

/**
 * Created by Tomek on 2015-11-08.
 */
public class NullPerson extends AbstractPerson {

    public NullPerson() {}

    @Override
    public String getName() {
        return "Person Object is NULL!";
    }
}
