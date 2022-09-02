package case_study.sercive.util.validate.person_validate.employee;

import case_study.sercive.util.exeption.employee_exception.WageException;

import java.util.Scanner;

public class WageValidate {
    private static Scanner scanner=new Scanner(System.in);
    public static String wageValidate(){
        String wage;
        while (true) {
            try {
                System.out.println("Enter wage");
                wage = scanner.nextLine();
                if (wage.equals("")) {
                    throw new WageException("Wage cannot be blank");
                }
                break;
            } catch (WageException e) {
                System.out.println(e.getMessage());
            }
        }
        return wage;
    }
}
