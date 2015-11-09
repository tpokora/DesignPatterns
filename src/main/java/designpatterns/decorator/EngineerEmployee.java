package designpatterns.decorator;

/**
 * Created by Tomek on 2015-11-09.
 */
public class EngineerEmployee extends AbstractEmployeeDecorator {

    public EngineerEmployee(Payable employee) {
        super(employee.getEmployee());
        setEngineerSalary();
    }

    private void setEngineerSalary() {
        employee.setSalary(5000.0);
    }

    public void paySalary() {
        employee.paySalary();
    }
}
