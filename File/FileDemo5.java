package File;

import java.io.*;
import java.util.Scanner;
public class FileDemo5 {
    public static void main(String[] args) throws IOException {
        // 模拟用户登录输入密码 超过三次锁定账户并结束 输入成功 计数器归零再结束
        String passWord = "123456";
        Scanner sc = new Scanner(System.in);
        // 利用字节缓冲流进行操作
        File file = new File("G:\\develop\\Idea_cache\\new2\\test1\\src\\File\\PassTry.txt");
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));
        int b = bis.read();
        // int cnt = Integer.parseInt(b);
        int cnt = b - '0';
        bis.close();

        if(cnt>3){
            System.out.println("You have entered for 3 times , please try again later");
            System.exit(0);
        }

            System.out.println("Please enter a password:");
            String enter = sc.nextLine();
            cnt ++ ;

        if(passWord.equals(enter)){
            System.out.println("Your password is correct");
            cnt = 0 ;
        }else{
            System.out.println("Your password is incorect");
        }
        // 写入
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(file));
        bos.write(cnt + '0');
        bos.close();
    }
}
