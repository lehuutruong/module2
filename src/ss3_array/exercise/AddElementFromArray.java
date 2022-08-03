package ss3_array.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class AddElementFromArray {
    public static void main(String[] args) {
        String[] array = new String[10];
        Scanner scanner = new Scanner(System.in);
        int index;
        String number;
        System.out.println("nhập vào phần tử muốn thêm vào"+"\t");
        System.out.println("nhập vào vị trí muốn thay thế"+"\t");
        number = scanner.nextLine();
        index = scanner.nextInt();
        if (index < 0 || index > array.length) {
            System.out.println("không chèn được phần tử vào mảng");
        }
        for (int i = 0; i < array.length; i++) {
            if (index == i) {
                array[i + 1] = array[i];
                array[i] = number;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
