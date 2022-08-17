package ss13_search_algorithm.exercise.search_ascending_largest_length.controller;

import ss13_search_algorithm.exercise.search_ascending_largest_length.model.SearchAscendingLargestLength;

import java.util.Scanner;

public class MainController {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Mời bạn nhập vào chuỗi");
        String string=scanner.nextLine();
        System.out.println(SearchAscendingLargestLength.searchAscendingLargestLength(string));
    }
}
