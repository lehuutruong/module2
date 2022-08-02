package ss2_for_in_java.practice;

import java.util.Scanner;

public class ProfitApp {
    public static void main(String[] args) {
        double money = 1.0;
        int month = 1;
        double interestRate = 1.0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhập vào số tiền gửi ");
        money=scanner.nextDouble();
        System.out.print("nhập vào tháng gửi ");
        month = scanner.nextInt();
        System.out.print("nhập vào hệ số lãi suất ");
        interestRate=scanner.nextDouble();
        double totalInterset=0;
        for (int i = 0; i < month; i++) {
            totalInterset += money * (( interestRate /100)/12) * month;
            System.out.println(totalInterset);
        }

    }
}
