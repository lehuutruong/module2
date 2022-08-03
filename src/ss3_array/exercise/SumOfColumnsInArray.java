package ss3_array.exercise;
import java.util.Scanner;

public class SumOfColumnsInArray {
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
        System.out.println("cột mà bạn muốn tính tổng là cột:");
        int column = Integer.parseInt( scanner.nextLine());
        int sum = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < number; j++) {
                if (j == column) {
                    sum += array[i][column];
                }
            }
        }
        System.out.println("tổng các phần tử ở cột  là:" +sum);

    }
}
