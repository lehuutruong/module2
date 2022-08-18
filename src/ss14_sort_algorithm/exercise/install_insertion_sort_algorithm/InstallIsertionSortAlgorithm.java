package ss14_sort_algorithm.exercise.install_insertion_sort_algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class InstallIsertionSortAlgorithm {
    public static void insertionSort(int[] array) {
        int pos, x;
        for (int i = 1; i < array.length; i++) {
            x = array[i];
            pos = i;
            while (pos > 0 && x < array[pos - 1]) {
                array[pos] = array[pos - 1];
                pos--;
            }
            array[pos] = x;
        }
        System.out.println("Mảng sau khi sắp xếp");
        System.out.println(Arrays.toString(array));
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size;

        do {
            System.out.println("Nhập vào kích cỡ mảng");
            size = Integer.parseInt(scan.nextLine());
            if (size < 0) {
                System.out.println("kích cỡ phải >0");
            }
        } while (size < 0);


        int[] array = new int[size];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Nhập vào từng phần tử " + i);
            array[i] = Integer.parseInt(scan.nextLine());
        }

        System.out.println("Mảng trước khi sắp xếp ");
        System.out.println(Arrays.toString(array));

        insertionSort(array);

    }
}
