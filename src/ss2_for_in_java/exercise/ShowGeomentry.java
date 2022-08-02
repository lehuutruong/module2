package ss2_for_in_java.exercise;

public class ShowGeomentry {
    public static void main(String[] args) {
        System.out.println("Hình chữ nhật");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.print("\n");

        }
        System.out.println("Hình tam giác vuông");
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
        System.out.println("Hình tam giác vuông ngược");
        for (int i = 6; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
        System.out.println("Hình tam giác cân");
        for (int i = 1; i <= 5; i++) {
            for (int k = 5; k > i; k--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (i * 2) - 1; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
