package thread;

public class demo2 {
    public static void main(String[] args) {
        // setPriority()  getPriority()
        MyRun myRun1 = new MyRun();
        MyRun myRun2 = new MyRun();
        Thread t1 = new Thread(myRun1);
        Thread t2 = new Thread(myRun2);
        Thread t = Thread.currentThread();
        t1.setPriority(10);
        t2.setPriority(2);
        System.out.println(t.getName() + ": "+ t.getPriority());
        t1.start();
        t2.start();
    }
}
