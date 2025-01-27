package javatest;

public class EmployeeClass {
    private String name;
    private int salary;
    private String position;

    public EmployeeClass() {
    }
    public EmployeeClass(String name, int salary, String position) {
        this.name = name;
        this.salary = salary;
        this.position = position;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setSalary(int salary){
        this.salary = salary;
    }
    public void setPosition(String position){
        this.position = position;
    }
    public void displayInformation(){
        System.out.println("员工姓名: " + name);
        System.out.println("薪资: " + salary);
        System.out.println("职位: " + position);
    }
}
