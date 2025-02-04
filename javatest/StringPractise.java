package javatest;
import java.util.Scanner;
import java.util.StringJoiner;
public class StringPractise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 字符串直接赋值
        String name = "liHua";
        System.out.println(name);
        // 使用new关键字进行操作
        String strLater = new String();
        System.out.println(strLater);

        String strInput = new String("Roxy");
        System.out.println(strInput);

        char[] str = {'R','o','x','y'};
        String strInput2 = new String(str);
        System.out.println(strInput2);

        byte[] strBytes = {'A','l','i','c','e'};
        String strInput3 = new String(strBytes);
        System.out.println(strInput3);


        // 字符串比较
        char[] strChar = {'A','l','i','c','e'};
        char[] strChar2 = {'a','l','i','c','e'};
        String strInput4 = new String(strChar);
        String strInput5 = new String(strChar2);
        boolean result = strInput4.equals(strInput5);
        boolean result2 = strInput4.equalsIgnoreCase(strInput5);
        System.out.println(result);
        System.out.println(result2);

        // 子串查找
        char[] strChar3 = {'2','8','7','8','6','6','6','4','7','2'};
        String strInput6 = new String(strChar3);
        String stringStart = strInput6.substring(0,4);
        String stringEnd = strInput6.substring(7);
        String stringRemake = stringStart + "***" + stringEnd;
        System.out.println(stringRemake);

        // 字符串替换
        String word = sc.nextLine();
        word = word.replace("你好","Ciallo~");
        System.out.println(word);

        // 利用StringBuilder作为容器进行字符串操作

        StringBuilder sb = new StringBuilder();
        StringBuilder sbNew = new StringBuilder(strInput4);
        System.out.println(sbNew.toString());
        String sbReverse = sb.append("12321").reverse().toString(); // 链式编程
        if (sbReverse.equals(sb.toString())) System.out.println(true);
        else System.out.println(false);

        // 利用StringJoiner进行对字符串处理
        StringJoiner sj = new StringJoiner(" ! ","\"","!\"");
        for (int i = 0; i < 6; i++) {
            sj.add("Ciallo");
        }
        System.out.println(sj.toString());
    }
}
