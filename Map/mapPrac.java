package Map;
import java.util.*;

public class mapPrac {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("one",1);
        map.put("two",2);
        map.put("three",3);

        // 第一种遍历
        Set<String> key = map.keySet();
       for(String key1 : key){
           int value = map.get(key1);
           System.out.println(value+"="+key1);
       }

       // 键值对遍历
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
       for(Map.Entry<String,Integer> entry : entries){
           String key1 = entry.getKey();
           int value = entry.getValue();
           System.out.println(key1+"="+value);
       }
       // lambda表达式
       map.forEach((key3,val)-> System.out.println(key3+"="+val));

       // 迭代器遍历
        Iterator<String> it = map.keySet().iterator();
        while(it.hasNext()){
            String key1 = it.next();
            int value = map.get(key1);
            System.out.println(key1+"="+value);
        }
    }
}
