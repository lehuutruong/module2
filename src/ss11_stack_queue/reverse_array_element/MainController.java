package ss11_stack_queue.reverse_array_element;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class MainController {
    public static void main(String[] args) {
        Stack<Integer> integerStack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("mời bạn nhập vào số lượng phần từ");
        int n = Integer.parseInt(scanner.nextLine());
        while (n < 0) {
            System.out.println("nhập vào số lượng phần tử");
            n = Integer.parseInt(scanner.nextLine());
            if (n < 0) {
                System.out.println("nhập lại");
            }
        }
       int [] array=new int[n];
        for (int i = 0; i <array.length ; i++) {
            System.out.println("mời nhập vào từng phần tử");
            array[i]=Integer.parseInt(scanner.nextLine());
        }
        System.out.println(Arrays.toString(array));
        for (int i = 0; i <array.length ; i++) {
            integerStack.push(array[i]);
        }
        for (int i = 0; i <array.length ; i++) {
           array[i]= integerStack.pop();
        }
        System.out.println(Arrays.toString(array));
        Stack<String>stringStack=new Stack<>();
        String string="em ăn cơm chưa";
        String stringOne="";
        for (int i = 0; i <string.length() ; i++) {
            stringStack.push(String.valueOf(string.charAt(i)));
        }
        for (int i = 0; i <string.length() ; i++) {
            stringOne+=stringStack.pop();
        }
        System.out.println(stringOne);
    }
}