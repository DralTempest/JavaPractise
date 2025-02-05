package String;
import java.util.Scanner;
import java.util.StringJoiner;
public class Rome {
    public static void main(String[] args) {
        // 将输入的数字转化成罗马数字
        Scanner sc = new Scanner(System.in);
        while (true) {
            String s = sc.nextLine();
            if(checkString(s)){
                s = stringToRoman(s);
                System.out.println(s);
                break;
            }
            else   System.out.println("Please enter a right number");
        }
    }
    public static boolean checkString(String rome){
        for (int i = 0; i < rome.length(); i++) {
            char c = rome.charAt(i);
            if (c<'0' || c>'9') {
                return false;
            }
        }
        return true;
    }
    public static String stringToRoman(String roman){
        StringBuilder sb = new StringBuilder();
        String[] romeWord = {"","I","II","III","IV","V","VI","VII","VIII","IX"};
        for (int i = 0; i < roman.length(); i++) {
            char c = roman.charAt(i);
            sb.append(romeWord[c-'0']).append(" ");
        }
        return sb.toString();
    }
}
