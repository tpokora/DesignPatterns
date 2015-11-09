package test.designpatterns.decorator;

import designpatterns.decorator.Employee;
import designpatterns.decorator.EngineerEmployee;
import designpatterns.decorator.Payable;
import designpatterns.decorator.SeniorEngineerEmployee;
import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Tomek on 2015-11-09.
 */
public class DecoratorTest {

    private Payable employee;

    @Before
    public void createEmployeeBefore() {
        employee = Employee.getStandardEmployee("Employee");
        Assert.assertEquals("Employee salary is 2000", 2000.0, employee.getEmployee().getSalary());
    }

    @Test
    public void checkAccountAfterPay() {
        employee.paySalary();
        Assert.assertEquals("Employee Account before raise 10000", 12000.0, employee.getEmployee().getAccount());
    }

    @Test
    public void checkIfEmployeeHasEngineerSalary() {
        Payable engineer = new EngineerEmployee(employee);
        Assert.assertEquals("Employee Engineer salary now 5000", 5000.0, engineer.getEmployee().getSalary());
    }

    @Test public void checkIfEmployeeHasSeniorEngineerSalary() {
        Payable seniorEngineer = new SeniorEngineerEmployee(new EngineerEmployee(employee));
        Assert.assertEquals("Employee Senior Engineer salary now 8000", 8000.0, seniorEngineer.getEmployee().getSalary());
    }
}
