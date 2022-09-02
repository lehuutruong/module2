package case_study.sercive.util.validate.facility_validate.facility;

import case_study.sercive.util.exeption.employee_exception.NameException;

import java.util.Scanner;

public class NameServiceValidate {
    private static Scanner scanner=new Scanner(System.in);
    public static String nameServiceValidate(){
        String nameService;
        while (true) {

            try {
                System.out.println("Enter name service");
                nameService = scanner.nextLine();
                if (!nameService.matches("[a-zA-ZâăôơêđĐưậặộợệụấắốớếứầằồờềùẫẵỗỡễữẩẳổởểử\\\\s]{5,50}")) {
                    throw new NameException("Your name from 5 to 50 characters");
                }
                break;
            } catch (NameException e) {
                System.out.println(e.getMessage());
            }
        }
        return nameService;
    }
}
