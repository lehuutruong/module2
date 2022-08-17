package ss13_search_algorithm.exercise.search_longest_consecutive_string.controller;

import ss13_search_algorithm.exercise.search_longest_consecutive_string.model.SearchLongestString;
import java.util.Scanner;

public class MainController {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào chuỗi cần tìm");
        String randomString = scanner.nextLine();
        System.out.println("Chuỗi có độ dài lớn nhất: ");
        SearchLongestString.findMaxArray(randomString);
    }

   
}
