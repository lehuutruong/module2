package case_study.sercive.util.validate.person_validate.person;

import case_study.sercive.util.exeption.employee_exception.NameException;

import java.util.Scanner;

public class NameValidate {
    private static Scanner scanner=new Scanner(System.in);
    public static String nameValidate(){
        String name;
        while (true) {

            try {
                System.out.println("Enter name employee");
                name = scanner.nextLine();
                if (!name.matches("\\D{5,50}")) {
                    throw new NameException("Your name from 5 to 50 characters");
                }
                break;
            } catch (NameException e) {
                System.out.println(e.getMessage());
            }
        }
        return name;
    }
}
