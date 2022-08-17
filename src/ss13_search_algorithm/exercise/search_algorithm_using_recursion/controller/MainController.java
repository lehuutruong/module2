package ss13_search_algorithm.exercise.search_algorithm_using_recursion.controller;

import ss13_search_algorithm.exercise.search_algorithm_using_recursion.model.BinarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class MainController {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("mời bạn nhập vào số lượng phần tử của mảng");
        int size = Integer.parseInt(scanner.nextLine());
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.println("mời bạn nhập vào phần tử ");
            array[i] = Integer.parseInt(scanner.nextLine());
        }
        for (int i = 0; i <size; i++) {
            for (int j = 0; j <size ; j++) {
                if(array[j]>array[i]){
                    int temp=array[j];
                    array[j]=array[i];
                    array[i]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println("mời bạn nhập vào giá trị:");
        int value = Integer.parseInt(scanner.nextLine());
        int result = BinarySearch.binarySearch(array, 0, array.length - 1, value);
        System.out.println("Vị trí của giá trị cần tìm là:" + result);

    }
   }
