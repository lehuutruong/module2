package ss19_regex.exerise.validate_phone_number;

import java.util.Scanner;

public class ValidatePhoneNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str;
        while (true) {
            boolean checkPhoneNumber = true;
            System.out.println("Mời bạn nhập vào số điện thoại");
             str = scanner.nextLine();
            String regex = "[(][8][4][)][-][(][0][1-9]\\d{8}[)]";
            if (str.matches(regex)) {
                System.out.println("Định dạng số điện thoại đúng");
                checkPhoneNumber =false;
            } else {
                System.out.println("Định dạng số điện thoại sai");
            }
            if (!checkPhoneNumber) {
                break;
            }
        }
    }
}
