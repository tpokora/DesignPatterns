package test.designpatterns.nullobject;

import designpatterns.nullobject.AbstractPerson;
import designpatterns.nullobject.PersonFactory;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

/**
 * Created by Tomek on 2015-11-09.
 */
public class NullObjectTest {

    @Test
    public void nullObjectReturnedAsString() {
        AbstractPerson person = PersonFactory.getPerson("Tommy");

        Assert.assertTrue("Person.getName() returns Person Object is NULL!", person.getName().equals("Person Object is NULL!"));
    }
}
