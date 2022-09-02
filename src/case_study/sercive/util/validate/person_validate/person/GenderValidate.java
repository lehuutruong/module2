package case_study.sercive.util.validate.person_validate.person;

import case_study.sercive.util.exeption.employee_exception.GenderException;

import java.util.Scanner;

public class GenderValidate {
    private static Scanner scanner=new Scanner(System.in);
    public static String genderValidate(){
        String gender;
        while (true) {
            try {
                System.out.println("Enter gender");
                gender = scanner.nextLine();
                if (!gender.equals("Male") && !gender.equals("Female")) {
                    throw new GenderException("Male or Female Only");
                }
                break;
            } catch (GenderException e) {
                System.out.println(e.getMessage());
            }
        }
        return gender;
    }
}
