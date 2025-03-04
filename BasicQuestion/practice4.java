package javatest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
public class practice4 {
    public static void main(String[] args) {
        // 初始化几个字符串集合并遍历打印
        List <String> electronics = Arrays.asList("手机", "笔记本电脑", "平板");
        List <String> clothing = Arrays.asList("T恤", "牛仔裤", "夹克");
        for (int i = 0; i < electronics.size(); i++) {
            System.out.print(electronics.get(i)+" ");
            System.out.print(clothing.get(i)+" ");
            System.out.print("\t");
        }
        System.out.print("\n");
        // 添加字符串并进行打印
        ArrayList <String> blank = new ArrayList <>();
        blank.add("I ");
        blank.add("love ");
        blank.add("china");
        System.out.println(blank);
        System.out.print(blank.get(0));
        System.out.print(blank.get(1));
        System.out.print(blank.get(2));
        // blank.remove(0);
        // System.out.println(blank);
        // 查询集合的大小
        System.out.println(blank.size());

        // 合并集合
        List <String> ListAll = new ArrayList <>(electronics);
        ListAll.addAll(clothing);
        System.out.println(ListAll);
        Iterator it = ListAll.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            System.out.println(str);
        }
    }
}
