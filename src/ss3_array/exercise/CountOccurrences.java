package ss3_array.exercise;
import java.util.Scanner;
public class CountOccurrences {
    public static void main(String[] args) {
        String stringA = new String("abcdef");
        Scanner scanner = new Scanner(System.in);
        System.out.println("mời bạn nhập vào ký tự");
        char character = scanner.nextLine().charAt(0);
        int count = 0;
        for (int i = 0; i < stringA.length(); i++) {
            if (stringA.charAt(i) == character){
                count++;
            }

        }
        System.out.println("số kí tự xuất hiện trong chuỗi là: "+count);
    }

}

