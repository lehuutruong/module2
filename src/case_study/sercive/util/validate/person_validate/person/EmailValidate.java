package case_study.sercive.util.validate.person_validate.person;

import case_study.sercive.util.exeption.employee_exception.EmailException;

import java.util.Scanner;

public class EmailValidate {
    private static Scanner scanner = new Scanner(System.in);

    public static String emailValidate() {
        String email;
        while (true) {
            try {
                System.out.println("Enter email");
                email = scanner.nextLine();
                if (!email.matches("[a-zA-Z0-9._%-]+@[a-z0-9.-]+\\.[a-z]{2,4}")) {
                    throw new EmailException("The email cannot be format");
                }
                break;
            } catch (EmailException e) {
                System.out.println(e.getMessage());
            }

        }
        return email;
    }
}
