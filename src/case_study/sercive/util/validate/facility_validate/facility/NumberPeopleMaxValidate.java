package case_study.sercive.util.validate.facility_validate.facility;

import case_study.sercive.util.exeption.employee_exception.DateOfBirthException;

import java.util.Scanner;

public class NumberPeopleMaxValidate {
    private static Scanner scanner=new Scanner(System.in);
    public static int numberPeopleMaxValidate(){
        int numberPeopleMax;
        while (true) {
            try {
                System.out.println("Enter Number People Maximum");
                numberPeopleMax = Integer.parseInt(scanner.nextLine());
                if (numberPeopleMax < 0||numberPeopleMax>20) {
                    throw new DateOfBirthException("The Number People maximum is not correct ");
                }
                break;
            } catch (DateOfBirthException e) {
                System.out.println(e.getMessage());
            }
        }
        return numberPeopleMax;
    }
}
