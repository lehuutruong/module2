package ss11_stack_queue.check_the_brackets_in_the_expression;

import java.util.Stack;

public class CheckBrackets {
    private static final Stack<Character> stack = new Stack<>();
        public static boolean checkBracket(String string) {
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == '(') {
                stack.push(string.charAt(i));
            }
            if (string.charAt(i) == ')') {
                if (stack.isEmpty()) {
                    return false;
                } else if (stack.pop() != '(') {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}

