package test.designpatterns.singleton;

import designpatterns.singleton.BossOffice;
import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by Tomek on 2015-11-16.
 */
public class SingletonTest {

    private BossOffice bossOffice = BossOffice.getInstance();
    private BossOffice bossOffice1 = BossOffice.getInstance();
    private String employeeId = "Tommy";
    private int requestAmount = 4;

    @Test
    public void checkIfSecondObjectHasTheSameRequestCount() throws IllegalAccessException {
        for(int i = 0; i < requestAmount; i++) {
            bossOffice.askForRise(employeeId);
        }

        Assert.assertEquals("BossOffice1 object should return same amont ass bossOffice.",
                bossOffice.getEmployeeRequestCount(employeeId),
                bossOffice1.getEmployeeRequestCount(employeeId));
    }
}
