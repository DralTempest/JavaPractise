package javatest;

public class Manager extends EmployeeClass {
    // use extends to simulate class to class
    private int extraSalary;
    public Manager() {}
    public Manager(String name, int salary,String position) {
        super(name,salary,position);
    }

    public int getExtraSalary() {
        return extraSalary;
    }
    public void setExtraSalary(int extraSalary) {
        this.extraSalary = extraSalary;
    }

    @Override
    public void setPosition(String position){
        super.setPosition(position + "6666");
    }
}
