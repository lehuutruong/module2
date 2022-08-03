package demo;

import java.util.Scanner;

public class DemoTough {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = inputPositive("a");
        int b = inputPositive("b");
        int c = inputPositive("c");
        long factorialA = getFactorial(a);
        long factorialB = getFactorial(b);
        long factorialC = getFactorial(c);
        long sum = factorialA + factorialB + factorialC;
        System.out.printf("%d!+%d!+%d!= %d", a, b, c, sum);
    }

    public static long getFactorial(int n) {
        long factorialA = 1;
        for (int i = 2; i <= n; i++) {
            factorialA *= i;
        }
        return factorialA;
    }

    public static int inputPositive(String target) {
        Scanner scanner = new Scanner(System.in);
        int n;
        boolean isInvalidA;
        System.out.printf("nhập vào số nguyên %s ", target);
        do {
            n = Integer.parseInt(scanner.nextLine());
            isInvalidA = n < 0;
            if (isInvalidA) {
                System.out.printf("%s phải >=0, xin hãy nhập lại \n", target);
            }
        } while (isInvalidA);
        return n;
    }
}
