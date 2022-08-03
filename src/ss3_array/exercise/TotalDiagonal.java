package ss3_array.exercise;

import java.util.Scanner;

public class TotalDiagonal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập vào kích cỡ của mảng");
        int size = Integer.parseInt(scanner.nextLine());
        int[][] array = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("nhập vào ptử của mảng con" + "\t");
                array[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }
        int sumOne = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (j == i) {
                    sumOne += array[i][j];
                }
            }
        }
        int sumTwo = 0;
        for (int i = 0; i < size; i++) {
            for (int j = size - 1; j >= 0; j--) {
                if (j == size - 1 - i) {
                    sumTwo += array[i][j];
                }
            }
        }
        System.out.printf(" tổng các đường chéo chính của mảng là là: %d+%d=%d", sumOne, sumTwo, sumOne + sumTwo);
    }
}
