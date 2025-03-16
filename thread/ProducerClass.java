package thread;

public class ProducerClass extends Thread{

    @Override
    public void run() {

        while(true){
            synchronized(desk.lock){
                if(desk.foodCount == 0) {
                    desk.foodFlag = false;
                    break;
                }
                else{
                    if(desk.foodFlag){ // 有食物就进入等待
                        try {
                            desk.lock.wait(); //生产者等待
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    } else{
                            System.out.println(Thread.currentThread().getName() +" makes food!");
                            desk.foodFlag = true;
                            desk.lock.notifyAll();
                        }
                    }
                }
            }
        }
    }

