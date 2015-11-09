package designpatterns.decorator;

/**
 * Created by Tomek on 2015-11-09.
 */
public class Employee implements Payable {
    private String name;
    private Double salary = 2000.0;
    private Double account;

    private Employee(String name) {
        this.name = name;
        this.account = 10000.0;
    }

    public static Employee getStandardEmployee(String name) {
        return new Employee(name);
    }

    public void paySalary() {
        System.out.println("Employee: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Account: " + account);
        account += salary;
        System.out.println("PAID: " + salary);
        System.out.println("Account: " + account);
    }

    public Employee getEmployee() {
        return this;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Double getAccount() {
        return account;
    }

    public void setAccount(Double account) {
        this.account = account;
    }

}
