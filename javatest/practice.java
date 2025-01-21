package javatest;
import java.util.Scanner;
public class practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 变量与基本类型
        // double payMonth = 50*8*5*4;
        // System.out.println(payMonth);
        // 条件语句
        String username = "ROXY";
        String password = "12345";
        String input1 ;
        String input2 ;
        System.out.println("Enter your username: ");
        input1 = sc.nextLine();
        System.out.println("Enter your password: ");
        input2 = sc.nextLine();
        if (input1.equals(username) && input2.equals(password)) {
            System.out.println("You are logged in!");
        }
        else {
            System.out.println("Error: Incorrect username or password!");
        }
    }
}
