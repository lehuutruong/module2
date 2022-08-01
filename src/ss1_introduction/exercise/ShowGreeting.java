package ss1_introduction.exercise;

import java.util.Scanner;

public class ShowGreeting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào tên bạn: ");
        String name = scanner.nextLine();
        System.out.println("Heloo: " + name);
    }
}
