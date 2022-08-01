package ss1_introduction.exercise;

import java.util.Scanner;

public class CurencyConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double vnd, usd;
        System.out.print("mời bạn nhập vào số tiền usd:");
        usd = scanner.nextDouble();
        vnd = usd * 23000;
        System.out.print("số tiền việt được chuyển ra là: " + vnd);

    }
}
