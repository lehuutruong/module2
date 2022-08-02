package ss2_for_in_java.exercise;

public class IsPrimeSmaller100 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 2; i < 100; i++) {
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count += 1;
                }
            }
            if (count == 2) {
                System.out.println(i);
            } else {
                count = 0;
            }
        }
    }
}
