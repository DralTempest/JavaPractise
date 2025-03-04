package BasicQuestion;
import java.util.InputMismatchException;
import java.util.Scanner;
public class exception {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Integer:");
        try{
            int x = sc.nextInt();
            if(x<0){
                throw new RuntimeException();
            }
            System.out.println("The number is "+x);
        } catch (InputMismatchException e) {
            System.out.println("请输入整数");
        } catch (RuntimeException e){
            System.out.println("请输入正数");
        }
    }
}
