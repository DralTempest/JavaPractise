package thread;

public class demo4 {
    public static void main(String[] args) throws InterruptedException {
        /*
        *
        *   插入线程
        *   public static void join()
        *
        * */
        MyThread mt1 = new MyThread();

        mt1.start();
        mt1.join();

        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + i  );
        }
    }
}
