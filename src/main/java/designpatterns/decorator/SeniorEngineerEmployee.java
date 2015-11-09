package designpatterns.decorator;

/**
 * Created by Tomek on 2015-11-09.
 */
public class SeniorEngineerEmployee extends AbstractEmployeeDecorator {

    public SeniorEngineerEmployee(Payable employee) {
        super(employee.getEmployee());
        setSeniorEngineerSalary();
    }

    private void setSeniorEngineerSalary() {
        employee.setSalary(8000.0);
    }

    public void paySalary() {
        employee.paySalary();
    }
}
