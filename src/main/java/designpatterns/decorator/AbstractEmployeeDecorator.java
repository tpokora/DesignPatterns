package designpatterns.decorator;

/**
 * Created by Tomek on 2015-11-09.
 */
public abstract class AbstractEmployeeDecorator implements Payable {
    protected Employee employee;

    public AbstractEmployeeDecorator(Employee employee) {
        this.employee = employee;
    }

    public Employee getEmployee() {
        return employee;
    }
}
