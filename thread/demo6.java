package thread;

public class demo6 {
    public static void main(String[] args) {
         // 等待唤醒机制

        ProducerClass pc = new ProducerClass();
        ConsumerClass cc = new ConsumerClass();
        Thread t1 = new Thread(pc);
        Thread t2 = new Thread(cc);
        t1.setName("Producer");
        t2.setName("Consumer");
        t1.start();
        t2.start();
    }
}
