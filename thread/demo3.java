package thread;

public class demo3 {
    public static void main(String[] args) {
        /*
        *   final void setDaemon() 守护线程
        *   在关联的线程结束之后，守护线程会陆续结束
        *
        * */
        MyThread mt1 = new MyThread();
        MyThread2 mt2 = new MyThread2();
        mt2.setDaemon(true);
        //mt1.start();
        //mt2.start();
        /*
        *
        *   pubic static void yield()
        *   出让线程
        *   出让CPU执行权使得线程调用均匀
        *
        * */
        MyThread2 mt3 = new MyThread2();
        MyThread2 mt4 = new MyThread2();
        mt3.start();
        mt4.start();
    }
}
