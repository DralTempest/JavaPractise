package threadPractice;

public class testRed {
    public static void main(String[] args) {


        RedBagThread rdt1 = new RedBagThread();
        RedBagThread rdt2 = new RedBagThread();
        RedBagThread rdt3 = new RedBagThread();
        RedBagThread rdt4 = new RedBagThread();
        RedBagThread rdt5 = new RedBagThread();

        rdt1.setName("RedBag1");
        rdt2.setName("RedBag2");
        rdt3.setName("RedBag3");
        rdt4.setName("RedBag4");
        rdt5.setName("RedBag5");

        rdt1.start();
        rdt2.start();
        rdt3.start();
        rdt4.start();
        rdt5.start();

        int count =Runtime.getRuntime().availableProcessors();
        System.out.println(count);
    }
}
