package thread;

public class MyThread2 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(getName() + "Hello world!" + "-----" + i);
        }
        // 出让线程
        Thread.yield();
    }

}
