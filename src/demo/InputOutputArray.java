package demo;

import java.util.Arrays;
import java.util.Scanner;

public class InputOutputArray {
    public static void main(String[] args) {
        int[][] newArray = {{1, 2}, {1, 3}};
        OutputArray(InputArray(2, 2));

    }

    public static int[][] InputArray(int size, int number) {
        Scanner scanner = new Scanner(System.in);
        int[][] array = new int[size][number];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < number; j++) {
                System.out.printf("array[%d][%d]\t", i, j);
                array[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }
        return array;
    }

    public static void OutputArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]);
            }
        }
    }
}
