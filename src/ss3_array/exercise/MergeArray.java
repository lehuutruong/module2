package ss3_array.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class MergeArray {
    public static void main(String[] args) {
        int[] arrayOne = {1, 2, 3};
        int[] arrayTwo = {4, 5, 6};
        int[] newArray = new int[arrayOne.length + arrayTwo.length];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < newArray.length; i++) {
            for (int j = 0; j < arrayOne.length; j++) {
                newArray[j] = arrayOne[j];
            }
            for (int j = 0; j < arrayTwo.length; j++) {
                newArray[j + arrayOne.length] = arrayTwo[j];
            }

        }
        System.out.println(Arrays.toString(newArray));
    }
}
