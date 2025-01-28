package javatest;

public class Order {
    // 属性
    private long orderId;
    private double amount;

    // 空参构造和初始化构造
    public Order(){}
    public Order(long orderId, double amount){
        this.orderId = orderId;
        this.amount = amount;
    }

    // 获取
    public long getOrderId() {
        return orderId;
    }
    public double getAmount(){
        return amount;
    }
    // 设置
    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }
    public void setAmount(double amount){
        this.amount = amount;
    }

    // 折扣
    public double applyDiscount(double discount){
        amount = 1.0 *amount * discount;
       return 1.0*amount * discount;
    }

    // 显示订单信息
    public void print(){
        System.out.println("Order Id: " + orderId);
        System.out.println("Amount(after discount): " + amount);
    }
}
