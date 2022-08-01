package ss1_introduction.practice;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year;
        System.out.print("nhập vào năm: ");
        year = scanner.nextInt();
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.print(year + " là năm nhuận ");
        } else {
            System.out.print(year + "không là năm nhuận");
        }
    }


}
