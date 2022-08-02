package ss2_for_in_java.practice;

import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhập vào số cần thử: ");
        int number = scanner.nextInt();
        if (number < 2) {
            System.out.print(" không phải là số nguyên tố");
        } else {
            boolean check = true;
            for (int i = 2; i < number; i++) {

                if (number % i == 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                System.out.print("là số nguyên tố");

            } else {
                System.out.print("không là số nguyên tố");
            }
        }
    }
}

