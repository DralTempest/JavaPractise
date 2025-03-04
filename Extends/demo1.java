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
        printLine(managers.get(0));
    }
    //多态的方式传入对象并在测试类调用静态方法
    public static void printLine(EmployeeClass e){
        System.out.println("-------------");
        e.displayInformation();
        System.out.println("-------------");
    }
}
