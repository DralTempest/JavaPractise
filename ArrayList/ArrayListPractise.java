package ArrayList;
import javatest.EmployeeClass;
import java.util.ArrayList;
public class ArrayListPractise {
    public static void main(String[] args) {
        ArrayList<EmployeeClass> employeeList = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            EmployeeClass employeeObject = new EmployeeClass();
            employeeObject.setName("Employee " + i);
            employeeObject.setSalary(2000);
            employeeObject.setPosition("Engineering"+i);
            employeeList.add(employeeObject);
        }
        show(employeeList);
        employeeList.remove(0);
        show(employeeList);
    }
    public static void show(ArrayList<EmployeeClass> employeeList) {
        for (int i = 0; i < employeeList.size(); i++) {
            EmployeeClass employeeObject = new EmployeeClass();
            employeeObject = employeeList.get(i);
            employeeObject.displayInformation();
        }
    }
}
