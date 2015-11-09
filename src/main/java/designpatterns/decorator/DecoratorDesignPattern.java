package designpatterns.decorator;

/**
 * Created by Tomek on 2015-11-09.
 */
public class DecoratorDesignPattern {
    public static void main(String[] args) {
        System.out.println("=========================");
        System.out.println("Decorator Design Pattern");
        System.out.println("\nAbility to Dynamicly add functionality to class.\n");

        Payable employee = Employee.getStandardEmployee("Tommy");
        employee.paySalary();

        Payable engineer = new EngineerEmployee(employee);
        engineer.paySalary();

        Payable seniorEngineer = new SeniorEngineerEmployee(engineer);
        seniorEngineer.paySalary();

        System.out.println("\n OR \n");

        Payable employee2 = new SeniorEngineerEmployee(new EngineerEmployee(Employee.getStandardEmployee("Olek")));
        employee2.paySalary();

        System.out.println("=========================");
    }
}
