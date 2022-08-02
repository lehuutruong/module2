package ss2_for_in_java.exercise;

import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        System.out.println("bạn muốn xuất ra bao nhiêu số nguyeen tố đầu tiên");
        number = scanner.nextInt();
        int count = 0;
        int countSnt = 0;
        for (int i = 2; i < 1000; i++) {
            if (countSnt < number) {
                for (int j = 1; j <= i; j++) {
                    if (i % j == 0) {
                        count += 1;

                    }
                }
                if (count == 2) {
                    System.out.println(i);
                    countSnt++;
                } else {
                    count = 0;
                }
            }
        }

    }

}


