package case_study.sercive.util.validate.facility_validate.facility;

import case_study.sercive.util.exeption.employee_exception.DateOfBirthException;

import java.util.Scanner;

public class CostsRentalValidate {
    private static Scanner scanner=new Scanner(System.in);
    public static double costsRentalValidate(){
        double costsRental;
        while (true) {
            try {
                System.out.println("Enter Cost Rental");
                costsRental = Double.parseDouble(scanner.nextLine());
                if (costsRental < 0) {
                    throw new DateOfBirthException("The Cost Rentla is not correct ");
                }
                break;
            } catch (DateOfBirthException e) {
                System.out.println(e.getMessage());
            }
        }
        return costsRental;
    }
}
