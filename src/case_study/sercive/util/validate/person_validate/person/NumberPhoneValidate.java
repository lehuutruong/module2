package case_study.sercive.util.validate.person_validate.person;

import case_study.sercive.util.exeption.employee_exception.NumberPhoneException;

import java.util.Scanner;

public class NumberPhoneValidate {
    private static Scanner scanner=new Scanner(System.in);
    public static String numberPhoneValidate(){
        String numberPhone;
        while (true) {
            try {
                System.out.println("Enter number phone");
                numberPhone = scanner.nextLine();
                if (!numberPhone.matches("[(][8][4][)][-][(][0][1-9]\\d{8}[)]")) {
                    throw new NumberPhoneException("The phone number cannot be format");
                }
                break;
            } catch (NumberPhoneException e) {
                System.out.println(e.getMessage());
            }
        }
        return numberPhone;
    }
}
