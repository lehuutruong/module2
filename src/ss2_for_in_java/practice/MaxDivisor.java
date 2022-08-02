package ss2_for_in_java.practice;
import java.util.Scanner;
public class MaxDivisor {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a,b;
        System.out.println("nhập vào số a");
        a=scanner.nextInt();
        System.out.println("nhập vào số b");
        b=scanner.nextInt();
        if(a==b){
            System.out.println("ước chung lớn nhất là "+a);
        }
        else if(a>b){
            System.out.println("ước chung lớn nhất là  " +(a-b));
        }
        if(b>a){
            System.out.println("ước chung lớn nhất là  " +(b-a));
        }
    }
}
