package javatest;
import java.util.Scanner;
public class OrderTest {
    public static void main(String[] args) {
        // 创建键盘录入对象
        Scanner sc = new Scanner(System.in);

        // 创建order对象
        Order od = new Order();

        // 创建订单并录入数据
        System.out.println("Enter the Id of your order");
        long id = sc.nextLong();
        od.setOrderId(id);
        System.out.println("Enter the amount of your order");
        double amount = sc.nextLong();
        od.setAmount(amount);

        // 调用折扣方法
        System.out.println("Enter the discount of your order (0,1]");
        double discount = sc.nextDouble();
        od.applyDiscount(discount);

        od.print();
    }
}
