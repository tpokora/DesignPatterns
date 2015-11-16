package designpatterns.singleton;

/**
 * Created by Tomek on 2015-11-16.
 */
public class SingletonDesignPattern {
    public static void main(String[] args) throws IllegalAccessException {
        System.out.println("=========================");
        System.out.println("Singleton Design Pattern");
        System.out.println("\nOnly one instance of object.");
        System.out.println("\nCreated 2 objects of the same class.");

        String employeeId = "Tommy";
        BossOffice bossOffice = BossOffice.getInstance();
        BossOffice bossOffice1 = BossOffice.getInstance();

        for(int i = 0; i < 5; i++) {
            System.out.println(bossOffice.askForRise(employeeId));
        }

        System.out.println("BossOffice: employee " + employeeId + ": "+ bossOffice.getEmployeeRequestCount(employeeId));
        System.out.println("BossOffice1: employee " + employeeId + ": "+ bossOffice1.getEmployeeRequestCount(employeeId));

        System.out.println("=========================");
    }
}
