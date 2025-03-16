package thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import static java.lang.Thread.sleep;

public class MyThread3 extends Thread {

    static int ticket = 0 ;
    static Object lock = new Object();
    static Lock lock1 = new ReentrantLock();
    @Override
    public void run() {
        /*
        while (true) {

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            synchronized(lock){
                if(ticket < 100){
                    ticket++;
                    System.out.println( getName() + " got " + ticket + " times ");

                } else{
                    break;
                }
            }*/

        /*
        *   通过Lock锁自行打开和关闭同步代码块的访问
        * */
        while (true) {
            lock1.lock();
            try {
                if(ticket < 1000){
                    Thread.sleep(10);
                    ticket++;
                    System.out.println( getName() + " got " + ticket + " ticket");
                } else {
                    break;
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            } finally {
                lock1.unlock();
            }

        }
    }
}

