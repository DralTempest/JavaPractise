package thread;

public class ConsumerClass extends Thread{

    @Override
    public void run() {

        while(true){
            synchronized(desk.lock){
                if(desk.foodCount == 0){
                    break;
                } else{
                    if (!desk.foodFlag) { // 没有食物就进入等待
                        try {
                            desk.lock.wait();
                            System.out.println("waiting for food");
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }else{
                        desk.foodCount--;
                        System.out.println(Thread.currentThread().getName()+ " eats food and " + desk.foodCount + " foods left");
                        desk.lock.notifyAll();
                        desk.foodFlag = false;
                    }

                }
            }
        }
    }
}
