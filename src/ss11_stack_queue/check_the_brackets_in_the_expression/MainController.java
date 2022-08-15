package ss11_stack_queue.check_the_brackets_in_the_expression;

import java.util.Scanner;

public class MainController {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter string to check");
        String strings = scan.nextLine();
        System.out.println(CheckBrackets.checkBracket(strings) ? "Well" : "No Well");
    }
}
