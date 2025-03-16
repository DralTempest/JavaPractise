package thread;

public class demo5 {
    public static void main(String[] args) {
        // 同步代码块 +
        MyThread3 myThread1 = new MyThread3();
        MyThread3 myThread2 = new MyThread3();
        MyThread3 myThread3 = new MyThread3();


        myThread1.start();
        myThread2.start();
        myThread3.start();
    }
}
