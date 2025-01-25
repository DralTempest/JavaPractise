package javatest;
import java.util.Scanner;
public class classLearning {
    public static void main(String[] args) {
        // 创建Scanner对象
        Scanner sc = new Scanner(System.in);

        //创建Person对象
        Person Roxy = new Person();

        System.out.println("Enter the name of your student");
        Roxy.name = sc.nextLine();
        System.out.println("Enter the age of your student");
        Roxy.age = sc.nextInt();

        Roxy.def(Roxy.name, Roxy.age);

        Roxy.print();
        System.out.println("Hello World");
    }
}
