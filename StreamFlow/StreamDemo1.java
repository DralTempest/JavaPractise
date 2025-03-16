package StreamFlow;

import java.util.*;
import java.util.stream.Collectors;

public class StreamDemo1 {
    public static void main(String[] args) {
        // Stream + lambda表达式
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"12-a","13-b","14-c","15-d");
        // 中间方法 filter() limit() skip() distinct() concat() map()
        list.stream()
                .filter(s -> (!s.equals("12"))) // filter内部可以使用lambda表达式
                .limit(3) // 返回获取到前n个元素的stream流
                .skip(2)         // 跳过n个元素
                .forEach(System.out::println);
        list.stream()
                .map(s -> Integer.parseInt(s.split("-")[0])).forEach(System.out :: println);
        // 终结方法 forEach count toArray() collect()
        ArrayList<String> list2 = new ArrayList<>();
        list.add("1-小明");
        list.add("2-小明");
        list.add("3-小明");
        list2.addAll(list);
        System.out.println(list2);
        long cnt = list2.stream().count();
        System.out.println(cnt);
        String[] result = list2.stream()
                .toArray(value -> new String[value]);
        for(String str : result){
            System.out.println(str);
        }

        // collect()方法
        /*
        *    collectors.toList()
        *
        *    collectors.toSet()
        *
        *    collectors.toMap()
        *
        * */

        List<String> list3 = list2.stream()
                .filter(s -> !(s.split("-")[0].isEmpty())) // filter 接收的返回值是boolean
                .collect(Collectors.toList());
        System.out.println(list3); // 允许数据重复

        Set<String> set = list2.stream()
                .filter(s -> !(s.split("-")[0].isEmpty()))
                .collect(Collectors.toSet());
        System.out.println(set); // 不允许数据重复 无序

        Map<String,Integer> map = list2.stream()
                .collect(
                        Collectors.toMap(
                           s -> (s.split("-")[0]),
                                s -> Integer.parseInt(s.split("-")[0])
                        ));
        System.out.println(map);
    }
}
