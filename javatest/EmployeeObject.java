package javatest;

public class EmployeeObject {
    public static void main(String[] args) {
        // 创建员工对象
        EmployeeClass zhangSan = new EmployeeClass("张三",5000,"软件工程师");
        EmployeeClass liSi = new EmployeeClass("李四",6000,"网络安全工程师");
        EmployeeClass zhaoWu = new EmployeeClass("赵五",7000,"算法工程师");

        // 打印员工列表
        zhangSan.displayInformation();
        liSi.displayInformation();
        zhaoWu.displayInformation();
    }
}
