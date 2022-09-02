package case_study.sercive.util.validate.facility_validate.room;

import case_study.sercive.util.exeption.employee_exception.NameException;

import java.util.Scanner;

public class FreeServiceValidate {
    private static Scanner scanner=new Scanner(System.in);
    public static String freeServiceValidate(){
        String freeService;
        while (true) {
            try {
                System.out.println("Enter free service");
                freeService = scanner.nextLine();
                if (!freeService.matches("\\D{5,50}")) {
                    throw new NameException("Your name from 5 to 50 characters");
                }
                break;
            } catch (NameException e) {
                System.out.println(e.getMessage());
            }
        }
        return freeService;
    }
}
