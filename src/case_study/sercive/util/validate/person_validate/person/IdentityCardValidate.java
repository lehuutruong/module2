package case_study.sercive.util.validate.person_validate.person;

import case_study.sercive.util.exeption.employee_exception.IdentityCardException;

import java.util.Scanner;

public class IdentityCardValidate {
    private static Scanner scanner=new Scanner(System.in);
    public static String identityCard(){
        String identityCardValidate;
        while (true) {
            try {
                System.out.println("Enter identityCard");
                identityCardValidate = scanner.nextLine();
                if (!identityCardValidate.matches("[0-9]{9}")) {
                    throw new IdentityCardException("Identity cad has only nine numbers");
                }
                break;
            } catch (IdentityCardException e) {
                System.out.println(e.getMessage());
            }
        }
        return identityCardValidate;
    }
}
