package ss3_array.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveElementFromArray {
    public static void main(String[] args) {
        String[] array = {"một", "hai", "ba", "bốn", "năm"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập vào phần tử cần xóa");
        String input_element = scanner.nextLine();
        String[] newArray = new String[array.length - 1];
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(input_element)) {
                array[i] = array[i + 1];
                for (int j = i; j < array.length - 1; j++) {
                    array[j] = array[j + 1];
                }
                array[array.length - 1] = "";
                for (int j = 0; j < newArray.length; j++) {
                    if (array[i].length() == 0) {
                        continue;
                    }
                    newArray[j] = array[j];
                }
                break;
            }

        }
        System.out.println(Arrays.toString(newArray));


    }
}
