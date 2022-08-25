package ss19_regex.exerise.validate_nameclass;

import java.util.Scanner;

public class ValidateNameClass {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String str;
        while (true) {
            boolean checkPhoneNumber = true;
            System.out.println("Mời bạn nhập vào tên lớp");
            str = scanner.nextLine();
            String regex="[ACP]\\d{4}[GHIKLM]";
            if (str.matches(regex)) {
                System.out.println("Định dạng tên lớp đúng");
                checkPhoneNumber =false;
            } else {
                System.out.println("Định dạng tên lớp sai");
            }
            if (!checkPhoneNumber) {
                break;
            }
        }
    }
}
