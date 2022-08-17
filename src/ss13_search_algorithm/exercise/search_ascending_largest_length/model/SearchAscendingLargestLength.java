package ss13_search_algorithm.exercise.search_ascending_largest_length.model;

public class SearchAscendingLargestLength {
    public static String searchAscendingLargestLength(String string) {
        String newString = "";
        String result = "";

        for (int i = 0; i < string.length() - 1; i++) {
            newString += string.charAt(i);
            for (int j = i + 1; j < string.length(); j++) {
                if (string.charAt(j) > string.charAt(i)) {
                    newString += string.charAt(j);
                    i = j;
                }
            }
            if (newString.length() > result.length()) {
                return newString;
            }
            return result;
        }
        return newString;
    }
}

