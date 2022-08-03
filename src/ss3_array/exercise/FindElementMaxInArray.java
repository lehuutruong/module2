package ss3_array.exercise;


import java.util.Arrays;
import java.util.Scanner;

public class FindElementMaxInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập vào kích cỡ của mảng");
        int size = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập vào kích cỡ của mảng con");
        int number = Integer.parseInt(scanner.nextLine());
        int[][] array = new int[size][number];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < number; j++) {
                System.out.print("nhập vào ptử của mảng con" + "\t");
                array[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }
        System.out.println(Arrays.toString(array));
        int max = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (max < array[i][j]) {
                    max = array[i][j];
                }
            }
        }
        System.out.println("giá trị lớn nhất của mảng hai chiều nhập từ bàn phím là"+max);
    }
}
