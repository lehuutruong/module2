package ss11_stack_queue.convert_decimal_to_binary;

import java.util.Stack;

public class MainCotroller {
    public static void main(String[] args) {
        Stack<Integer> integerStack=new Stack<>();
        int n=100;
        while(n!=0){
            integerStack.push(n%2);
            n/=2;
        }
        while (!integerStack.isEmpty()){
            System.out.print(integerStack.pop());
        }
    }
}
