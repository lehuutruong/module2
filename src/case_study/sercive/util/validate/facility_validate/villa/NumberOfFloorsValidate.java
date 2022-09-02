package case_study.sercive.util.validate.facility_validate.villa;

import case_study.sercive.util.exeption.employee_exception.DateOfBirthException;

import java.util.Scanner;

public class NumberOfFloorsValidate {
    private static Scanner scanner=new Scanner(System.in);
    public static int numberOfFloorsValidate(){
        int numberOfFloors;
        while (true) {
            try {
                System.out.println("Enter Number Of Floors");
                numberOfFloors = Integer.parseInt(scanner.nextLine());
                if (numberOfFloors < 0 || numberOfFloors > 200) {
                    throw new DateOfBirthException("The Number Of Floors is not correct ");
                }
                break;
            } catch (DateOfBirthException e) {
                System.out.println(e.getMessage());
            }
        }
        return numberOfFloors;
    }
}
