package methodReferences;

import java.util.Arrays;
import java.util.Comparator;

public class MRDemo1 {
    public static void main(String[] args) {
        // 方法引用，把已经存在的方法作为函数式接口中抽象方法的方法体
        // :: 为方法引用符
        Integer[] arr = {1,2,3,4,5,6,7,8,9,10};

        // 匿名内部类实现
        Arrays.sort(arr,new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        System.out.println(Arrays.toString(arr));

        // lambda表达式实现
        Arrays.sort(arr,(o1,o2) -> o2-o1);
        System.out.println(Arrays.toString(arr));

        // 方法引用实现
        Arrays.sort(arr , MRDemo1 :: ArraySort);
        System.out.println(Arrays.toString(arr));
    }
    public static int ArraySort(int o1 , int o2) {
        return o2 - o1 ;
    }
}
