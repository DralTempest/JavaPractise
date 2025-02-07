package Extends;
import java.util.ArrayList;
import javatest.EmployeeClass;
import javatest.Manager;

public class demo1 {
    public static void main(String[] args) {
        ArrayList<Manager> managers = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            Manager manager = new Manager();
            manager.setName("branch" + i);
            manager.setSalary(10000 + i);
            manager.setPosition("Manager" + i);
            manager.setExtraSalary(2000 + i);
            managers.add(manager);
        }
        for (Manager manager : managers) {
            manager.displayInformation();
        }
        Manager manager = new Manager("luck",20000,"Manager");
        managers.add(manager);
        managers.get(3).displayInformation();

    }
}
