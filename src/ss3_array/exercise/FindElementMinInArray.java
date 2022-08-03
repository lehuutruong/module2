package ss3_array.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class FindElementMinInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập vào kích  mảng");
        int size =Integer.parseInt(scanner.nextLine());

        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.print("nhập vào từng phần tử của mảng" + "\t");
            array[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println(Arrays.toString(array));
        int min = array[0];
        for (int value : array) {
            if (min > value) {
                min = value;
            }

        }
        System.out.println("giá trị nhỏ nhất của mảng 1 chiều nhập từ bàn phím  là:" +min);
    }
}
