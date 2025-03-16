package threadPractice;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class RedBagThread extends Thread{
    //

    public static int count = 3 ;

    public static BigDecimal money = BigDecimal.valueOf(100);
    public static final BigDecimal MIN = BigDecimal.valueOf(0.01) ;

    @Override
    public void run() {
        synchronized(RedBagThread.class) {
            if(count == 0){
                System.out.println(getName() + "没有抢到红包");
            } else{
                BigDecimal price ;
                // 随机数抢红包
                if(count == 1) {
                    price = money;
                } else{
                    Random r = new Random();
                    BigDecimal bounds = money.subtract(BigDecimal.valueOf(count -1).multiply(MIN));
                    price = BigDecimal.valueOf(r.nextDouble()).multiply(bounds);
                }
                price = price.setScale(2, RoundingMode.HALF_UP);
                money = money.subtract(price);
                count-- ;
                System.out.println(getName() + "抢到了" + price + "元");
            }
        }
    }
}
