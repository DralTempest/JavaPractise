package String;
// import java.util.Scanner;
import java.util.StringJoiner;
public class StringToNumber {
    public static void main(String[] args) {
       String numberString = "123456";
       char[] chars  = numberString.toCharArray();
       int number = 0;
       for (int i = 0; i < chars.length; i++) {
           number = number*10 + chars[i]-'0';
       }
        System.out.println(number);

       // 寻找最后一个单词
        String word = "   hello! world my friend!    ";
        String[] wordArray = word.trim().split(" ");
        System.out.println(wordArray[wordArray.length-1]);
    }
}
