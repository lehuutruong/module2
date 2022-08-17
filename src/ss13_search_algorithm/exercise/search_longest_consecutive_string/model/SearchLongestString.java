package ss13_search_algorithm.exercise.search_longest_consecutive_string.model;

import java.util.LinkedList;

public class SearchLongestString {
    public static void findMaxArray(String str) {
        LinkedList<Character> max = new LinkedList<>();
        for (int i = 0; i < str.length(); i++) {
            LinkedList<Character> list = new LinkedList<>();
            list.add(str.charAt(i));
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(j) > list.getLast()) {
                    list.add(str.charAt(j));
                } else {
                    break;
                }
            }
            if (list.size() > max.size()) {
                max.clear();
                max.addAll(list);
            }
            list.clear();
        }
        for (Character linkedList : max) {
            System.out.print(linkedList);
        }
    }
}
