package ss2_for_in_java.practice;

import java.util.Scanner;

public class DesignMenu {
    public static void main(String[] args) {
        int choice = -1;
        Scanner scanner = new Scanner(System.in);
        while (choice != 0) {
            System.out.println("Menu");
            System.out.println("1.Hình vuông");
            System.out.println("2.Hình chữ nhật");
            System.out.println("3.Hình tam giác");
            System.out.println("4.Thoát");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("**********");
                    System.out.println("**********");
                    System.out.println("**********");
                    System.out.println("**********");
                    break;
                case 2:
                    System.out.println("**********");
                    System.out.println("**********");
                    System.out.println("**********");
                    System.out.println("**********");
                    System.out.println("**********");
                    break;
                case 3:
                    System.out.println("*");
                    System.out.println("**");
                    System.out.println("***");
                    System.out.println("****");
                    System.out.println("*****");
                    System.out.println("******");
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("không chọn gì");
            }
        }
    }
}
