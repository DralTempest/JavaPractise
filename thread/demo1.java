package thread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class demo1 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        // 多线程的实现方式
        /*
        *       thread类实现多线程
        *       runnable接口实现
        *       callable接口实现
        *
        * */


        // thread类实现
        /*
        *       自己定义一个类继承thread类
        *       重写run方法
        *       创建子类的对象并且启动线程
        *
        * */
        MyThread mt = new MyThread();
        MyThread mt2 = new MyThread();
        mt.setName("process-1");
        mt2.setName("process-2");
        //mt.start();
        //mt2.start();


        // runnable接口实现

        /*
        *       定义一个类实现runnable接口
        *       重写run方法
        *       创建自己的类的对象
        *       创建Thread对象并传入线程
        *
        * */
        MyRun mr = new MyRun();
        MyRun mr2 = new MyRun();
        Thread t1 = new Thread(mt);
        Thread t2 = new Thread(mt2);
        t1.setName("process-1");
        t2.setName("process-2");
        //t1.start();
        //t2.start();


        // Callable接口和Future接口实现
        /*
        *   创建类实现Callable接口
        *   重写Call方法
        *   创建类对象（表示多线程要执行的任务）
        *   创建FutureTask对象（作用在管理多线程运行的结果）
        *   创建Thread类来进行线程调用
        *
        *  通过FutureTask .get（）方法可以返回线程结果
        * */
        MyCallable mc = new MyCallable();
        FutureTask<Integer> ft = new FutureTask<>(mc);
        Thread t3 = new Thread(ft);
        t3.start();
        System.out.println(ft.get());
    }
}
