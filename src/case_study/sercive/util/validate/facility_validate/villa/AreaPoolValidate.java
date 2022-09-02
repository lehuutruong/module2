package case_study.sercive.util.validate.facility_validate.villa;

import case_study.sercive.util.exeption.employee_exception.DateOfBirthException;

import java.util.Scanner;

public class AreaPoolValidate {
    private static Scanner scanner=new Scanner(System.in);
    public static double areaPoolValidate(){
        double areaPool;
        while (true) {
            try {
                System.out.println("Enter Area Pool");
                areaPool = Double.parseDouble(scanner.nextLine());
                if (areaPool < 30 || areaPool > 1000000000) {
                    throw new DateOfBirthException("The Area Pool is not correct ");
                }
                break;
            } catch (DateOfBirthException e) {
                System.out.println(e.getMessage());
            }
        }
        return areaPool;
    }
}
