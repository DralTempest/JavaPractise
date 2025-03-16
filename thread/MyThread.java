package thread;

public class MyThread extends Thread {
    public MyThread() {}
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(getName() +" Hello World!" + "----" + i);
        }
    }
}
