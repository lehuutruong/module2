package case_study.sercive.util.validate.facility_validate.facility;

import case_study.sercive.util.exeption.employee_exception.DateOfBirthException;

import java.util.Scanner;

public class AreaUsableValidate {
    private static Scanner scanner=new Scanner(System.in);
    public static double areaUsableValidate(){
        double areaUsable;
        while (true) {
            try {
                System.out.println("Enter Area Usable");
                areaUsable = Double.parseDouble(scanner.nextLine());
                if (areaUsable < 30 || areaUsable > 1000000000) {
                    throw new DateOfBirthException("The Area usable is not correct ");
                }
                break;
            } catch (DateOfBirthException e) {
                System.out.println(e.getMessage());
            }
        }
        return areaUsable;
    }
}
