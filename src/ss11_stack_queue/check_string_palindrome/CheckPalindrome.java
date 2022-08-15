package ss11_stack_queue.check_string_palindrome;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class CheckPalindrome {
    private static Queue<Character> queue = new LinkedList<>();
    private static Stack<Character> stack = new Stack<>();


    public static Boolean checkPalindrome(String str) {
        for (int i = 0; i < str.length(); i++) {
            queue.add(str.charAt(i));
            stack.push(str.charAt(i));
        }
        String queueString = "";
        String stackString = "";
        for (int i = 0; i < str.length(); i++) {
            queueString += queue.remove();
            stackString += stack.pop();
        }

        return queueString.toLowerCase().equals(stackString.toLowerCase());
    }
}
